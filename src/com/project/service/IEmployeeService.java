package com.project.service;

import java.sql.Date;

import com.project.bean.CutPageBean;
import com.project.bean.EmployeeBean;

/**
 * Ա��ҵ��ӿ�
 * @author SYSTEM
 *
 */
public interface IEmployeeService {

	public  CutPageBean<EmployeeBean> findBuItem(int pageNo,String name,
			Date startDate,Date endDate);
	
}
