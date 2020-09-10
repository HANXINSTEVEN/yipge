package com.oracle.interf.dao;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_product;

/**
 * ��Ʒ��Dao�ӿ�
 * @author Administrator
 *
 */




public interface ProductDao {
	/**
	 * �鿴������Ʒ��Ϣ
	 * @return
	 * @throws SQLException
	 * @author ��
	 */
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
	
	


}

