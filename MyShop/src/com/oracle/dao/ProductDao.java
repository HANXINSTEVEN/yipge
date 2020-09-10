package com.oracle.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.oracle.entity.shop_cart;
import com.oracle.entity.shop_product;

import cn.lds.C3P0.C3P0Utils;

public class ProductDao implements com.oracle.interf.dao.ProductDao{

	@Override
	public List<shop_product> showAll() throws SQLException {
		// TODO Auto-generated method stub
		return showAll();
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

	public  int[] totalPage() throws SQLException {
		int arr[]= {0,1};
		
		String sql ="select count(*) from shop_product";
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		Long no= (Long) runner.query(sql, new ScalarHandler());
		arr[0]=no.intValue();
		if(no.intValue()%5!=0) {
			arr[1]=no.intValue()/5+1;
		}else {
			arr[1]=no.intValue()/5;
		}
		return arr;
	}

	public List<shop_product> showAll(int cpage, int count) throws SQLException {
		int cp =0;
		if(cpage==1) {
			cp=0;
		}else {
			cp=(cpage-1)*5;
		}
		String sql ="select * from shop_product limit ?,?";
		QueryRunner runner =new QueryRunner(C3P0Utils.getDataSource());
	
		return runner.query( sql,new BeanListHandler<shop_product> (shop_product.class),cp,count);
	}

}
