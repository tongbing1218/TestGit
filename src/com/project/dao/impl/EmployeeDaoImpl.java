package com.project.dao.impl;

import java.sql.Date;
import java.sql.SQLException;

import com.project.base.BaseDao;
import com.project.bean.CutPageBean;
import com.project.bean.EmployeeBean;
import com.project.dao.IEmployeeDao;

/**
 * 员工持久接口实现类
 * 
 * @author SYSTEM
 *
 */
public class EmployeeDaoImpl extends BaseDao implements IEmployeeDao {

	@Override
	public CutPageBean<EmployeeBean> findByItem(int pageNo, String name, Date startDate, Date endDate) {

		CutPageBean<EmployeeBean> cutBean = new CutPageBean<EmployeeBean>();

		this.setConnection();
		String sql = "select * from t_employee where 1=1 ";
		String itemSql = "";

		if (name != null && name.length() != 0) {
			itemSql += " and eName like '%" + name + "%'";
		}
		if (startDate != null) {
			itemSql += " and birthday >= '" + startDate + "'";
		}
		if (endDate != null) {
			itemSql += " and birthday <= '" + endDate + "'";
		}

		try {
			// 封装当前页数据
			ps = con.prepareStatement(sql + itemSql + " limit ?,?");

			ps.setInt(1, (pageNo - 1) * PAGESIZE);
			ps.setInt(2, PAGESIZE);
			rs = ps.executeQuery();

			while (rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.seteName(rs.getString("eName"));
				bean.setBirthday(rs.getDate("birthday"));
				bean.setMoney(rs.getInt("money"));
				cutBean.getList().add(bean);
			}
			// 封装总记录数
			ps = con.prepareStatement("select count(*) c from t_employee where 1=1 " + itemSql);

			rs = ps.executeQuery();

			if (rs.next()) {
				cutBean.setCount(rs.getInt("c"));
			}
			// 封装总页数
			if (cutBean.getCount() % PAGESIZE == 0) {
				cutBean.setTotalPage(cutBean.getCount() / PAGESIZE);
			} else {
				cutBean.setTotalPage(cutBean.getCount() / PAGESIZE + 1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeConnection();
		}
		return cutBean;
	}
public static void main(String[] args) {
	IEmployeeDao dao = new EmployeeDaoImpl();
	CutPageBean cutBean = dao.findByItem(1, "", Date.valueOf("1989-1-1"), Date.valueOf("1990-1-1"));
	System.out.println(cutBean);
}
}
