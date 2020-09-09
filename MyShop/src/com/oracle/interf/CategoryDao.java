package com.oracle.interf;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_category;

public interface CategoryDao {
	/**
	 * 显示全部分类
	 * @param cpage 当前页
	 * @param count 每页显示条数
	 * @return
	 * @throws SQLException
	 */
	
	public List<shop_category>CategoryAll(int cpage, int count) throws SQLException;
	/**
	 * 添加分类
	 * @param cate
	 * @throws SQLException
	 */
	public void CategoryAdd(shop_category cate) throws SQLException;
	/**
	 * 修改分类
	 * @param cate
	 * @throws SQLException
	 */
	public void CategoryUpdate(shop_category cate) throws SQLException;
	/**
	 * del分类
	 * @param cid
	 * @throws SQLException
	 */
	public void CategoryDel(int cid) throws SQLException;
}
