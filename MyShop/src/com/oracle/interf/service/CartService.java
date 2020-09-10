package com.oracle.interf.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_cart;



public interface CartService {
	/**
	 * 显示全部分类
	 * @param cpage 当前页
	 * @param count 每页显示条数
	 * @return
	 * @throws SQLException
	 */
	
	public List<shop_cart>cartAll(int cpage, int count) throws SQLException;
	/**
	 * 添加分类
	 * @param cate
	 * @throws SQLException
	 * @author cj
	 */
	public void cartAdd(shop_cart cate) throws SQLException;
	/**
	 * 修改分类
	 * @param cate
	 * @throws SQLException
	 */
	public void cartUpdate(shop_cart cate) throws SQLException;
	/**
	 * del分类
	 * @param cid
	 * @throws SQLException
	 */
	public void cartDel(int cid) throws SQLException;
}
