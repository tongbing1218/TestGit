package com.project.bean;

import java.sql.Date;
/**
 * Ա����
 * @author SYSTEM
 *
 */
public class EmployeeBean {
     /**���*/
	private int id;
	/**����*/
	private String eName;
	/**����*/
	private Date birthday;
	/**����*/
	private double money;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", eName=" + eName + ", birthday=" + birthday + ", money=" + money + "]";
	}
	
}
