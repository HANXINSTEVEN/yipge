package com.oracle.interf.dao;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_product;

/**
 * 商品的Dao接口
 * @author Administrator
 *
 */




public interface ProductDao {
	/**
	 * 查看所有商品信息
	 * @return
	 * @throws SQLException
	 * @author 刘
	 */
	public List<shop_product> showAll()throws SQLException;

	/**
	 * 根据id查商品
	 * @param pid
	 * @return
	 * @throws SQLException
	 * @author 刘
	 */
	public shop_product showOne(int pid)throws SQLException;
	
	/**
	 * 增加商品的方法
	 * @param shop
	 * @return
	 * @throws SQLException
	 */
	public int add(shop_product shop)throws SQLException;
	/**
	 * 删除商品的方法
	 * @param pid
	 * @return
	 * @throws SQLException
	 * @author 刘
	 */
	public int delete(int pid)throws SQLException; 
	/**
	 * 修改商品的方法
	 * @param shop
	 * @return
	 * @throws SQLException
	 * @author 刘
	 */
	public int alter(shop_product shop)throws SQLException;
	
	


}

