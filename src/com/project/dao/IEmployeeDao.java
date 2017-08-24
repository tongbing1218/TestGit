package com.project.dao;

import java.sql.Date;

import com.project.bean.CutPageBean;
import com.project.bean.EmployeeBean;

/**
 * 员工持久层接口
 * @author SYSTEM
 *
 */
public interface IEmployeeDao {

	/**
	 * 每页显示的个数
	 */
	public int PAGESIZE = 3;
	/**
	 * 动态条件查询
	 * @param pageNo 页码
	 * @param name 员工姓名	
	 * @param startDate 生日起始日期
	 * @param endDate 生日结束日期
	 * @return 分页对象
	 */
	public CutPageBean<EmployeeBean> findByItem(int pageNo,String name,
			Date startDate,Date endDate);
}
