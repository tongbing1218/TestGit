package com.project.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳʵ����
 * 
 * @author SYSTEM
 *
 */
public class CutPageBean<T> {
	/** ��ǰҲ��Ҫ��ʾ������ */
	private List<T> list = new ArrayList<T>();
	/** �ܼ�¼�� */
	private int count;
	/** ��ҳ�� */
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
