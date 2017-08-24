package com.project.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页实体类
 * 
 * @author SYSTEM
 *
 */
public class CutPageBean<T> {
	/** 当前也需要显示的数据 */
	private List<T> list = new ArrayList<T>();
	/** 总记录数 */
	private int count;
	/** 总页数 */
	private int totalPage;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "CutPageBean [list=" + list + ", count=" + count + ", totalPage=" + totalPage + "]";
	}

}
