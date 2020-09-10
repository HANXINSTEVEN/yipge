package com.oracle.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.dao.CartDao;
import com.oracle.entity.shop_cart;

public class CartService implements com.oracle.interf.service.CartService{
	CartDao ca =new CartDao();
	@Override
	public List<shop_cart> cartAll(int cpage, int count) throws SQLException {
		
		
		
		return  ca.cartAll(cpage,count);
	}

	@Override
	public void cartAdd(shop_cart cate) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cartUpdate(shop_cart cate) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cartDel(int cid) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int[] totalPage() throws SQLException {
		// TODO Auto-generated method stub
		return ca.totalPage() ;
	}

}
