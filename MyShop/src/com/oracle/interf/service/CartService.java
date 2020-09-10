package com.oracle.interf.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_cart;



public interface CartService {
	/**
	 * ��ʾȫ������
	 * @param cpage ��ǰҳ
	 * @param count ÿҳ��ʾ����
	 * @return
	 * @throws SQLException
	 */
	
	public List<shop_cart>cartAll(int cpage, int count) throws SQLException;
	/**
	 * ��ӷ���
	 * @param cate
	 * @throws SQLException
	 * @author cj
	 */
	public void cartAdd(shop_cart cate) throws SQLException;
	/**
	 * �޸ķ���
	 * @param cate
	 * @throws SQLException
	 */
	public void cartUpdate(shop_cart cate) throws SQLException;
	/**
	 * del����
	 * @param cid
	 * @throws SQLException
	 */
	public void cartDel(int cid) throws SQLException;
}
