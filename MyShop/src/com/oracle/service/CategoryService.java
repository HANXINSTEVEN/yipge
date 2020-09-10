package com.oracle.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.dao.CategoryDao;
import com.oracle.entity.shop_category;

public class CategoryService implements com.oracle.interf.service.CategoryService{
	CategoryDao cate =new CategoryDao();
	@Override
	public List<shop_category> CategoryAll(int cpage, int count) throws SQLException {
		// TODO Auto-generated method stub
		return cate.CategoryAll(cpage,count);
	}

	@Override
	public void CategoryAdd(shop_category cate) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CategoryUpdate(shop_category cate) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CategoryDel(int cid) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int[] totalPage() throws SQLException {
		// TODO Auto-generated method stub
		return cate.totalPage();
	}

}
