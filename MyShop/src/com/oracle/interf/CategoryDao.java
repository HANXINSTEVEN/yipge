package com.oracle.interf;

import java.sql.SQLException;
import java.util.List;

import com.oracle.entity.shop_category;

public interface CategoryDao {
	/**
	 * ��ʾȫ������
	 * @param cpage ��ǰҳ
	 * @param count ÿҳ��ʾ����
	 * @return
	 * @throws SQLException
	 */
	
	public List<shop_category>CategoryAll(int cpage, int count) throws SQLException;
	/**
	 * ��ӷ���
	 * @param cate
	 * @throws SQLException
	 */
	public void CategoryAdd(shop_category cate) throws SQLException;
	/**
	 * �޸ķ���
	 * @param cate
	 * @throws SQLException
	 */
	public void CategoryUpdate(shop_category cate) throws SQLException;
	/**
	 * del����
	 * @param cid
	 * @throws SQLException
	 */
	public void CategoryDel(int cid) throws SQLException;
}
