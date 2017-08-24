package com.project.dao;

import java.sql.Date;

import com.project.bean.CutPageBean;
import com.project.bean.EmployeeBean;

/**
 * Ա���־ò�ӿ�
 * @author SYSTEM
 *
 */
public interface IEmployeeDao {

	/**
	 * ÿҳ��ʾ�ĸ���
	 */
	public int PAGESIZE = 3;
	/**
	 * ��̬������ѯ
	 * @param pageNo ҳ��
	 * @param name Ա������	
	 * @param startDate ������ʼ����
	 * @param endDate ���ս�������
	 * @return ��ҳ����
	 */
	public CutPageBean<EmployeeBean> findByItem(int pageNo,String name,
			Date startDate,Date endDate);
}
