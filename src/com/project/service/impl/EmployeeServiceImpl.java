package com.project.service.impl;

import java.sql.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.bean.CutPageBean;
import com.project.bean.EmployeeBean;
import com.project.dao.IEmployeeDao;
import com.project.dao.impl.EmployeeDaoImpl;
import com.project.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService{

	private IEmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public CutPageBean<EmployeeBean> findBuItem(int pageNo, String name, Date startDate, Date endDate) {
		
		return dao.findByItem(pageNo, name, startDate, endDate);
	}

	public static void main(String[] args) {
		IEmployeeService service = new EmployeeServiceImpl();
		CutPageBean bean = service.findBuItem(1, "", null, null);
		Gson gson = new GsonBuilder().create();
		gson.toJson(bean, System.out);
	}
}
