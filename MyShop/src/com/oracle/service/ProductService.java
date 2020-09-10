package com.oracle.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.dao.ProductDao;
import com.oracle.entity.shop_category;
import com.oracle.entity.shop_product;

public class ProductService implements com.oracle.interf.service.ProductService{
	ProductDao prod =new ProductDao();
	@Override
	public List<shop_product> showAll(int cpage,int count) throws SQLException {
		// TODO Auto-generated method stub
		return prod.showAll(cpage,count);
	}

	@Override
	public shop_product showOne(int pid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(shop_product shop) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int pid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alter(shop_product shop) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] totalPage() throws SQLException {
		// TODO Auto-generated method stub
		return prod.totalPage();
	}

	@Override
	public List<shop_product> showAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
