package com.project.bean;

import java.sql.Date;
/**
 * 员工类
 * @author SYSTEM
 *
 */
public class EmployeeBean {
     /**编号*/
	private int id;
	/**姓名*/
	private String eName;
	/**生日*/
	private Date birthday;
	/**工资*/
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
