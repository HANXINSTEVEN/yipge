package com.oracle.interf.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_product;

public interface ProductService {
	public List<shop_product> showAll()throws SQLException;

	/**
	 * ����id����Ʒ
	 * @param pid
	 * @return
	 * @throws SQLException
	 * @author ��
	 */
	public shop_product showOne(int pid)throws SQLException;
	
	/**
	 * ������Ʒ�ķ���
	 * @param shop
	 * @return
	 * @throws SQLException
	 */
	public int add(shop_product shop)throws SQLException;
	/**
	 * ɾ����Ʒ�ķ���
	 * @param pid
	 * @return
	 * @throws SQLException
	 * @author ��
	 */
	public int delete(int pid)throws SQLException; 
	/**
	 * �޸���Ʒ�ķ���
	 * @param shop
	 * @return
	 * @throws SQLException
	 * @author ��
	 */
	public int alter(shop_product shop)throws SQLException;

	List<shop_product> showAll(int cpage, int count) throws SQLException;
}
