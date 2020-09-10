package com.oracle.interf.dao;

import java.sql.SQLException;
import java.util.List;
import com.oracle.entity.Shop_User;

public interface UserDao {
	public interface UserService {
		/**
		 * ��̨����û���Ϣ
		 * @param sh
		 * @return
		 * @throws SQLException
		 */
		public int userAdd(Shop_User sh) throws SQLException; 


		/**
		 * ��ʾ�����û���Ϣ
		 * @param cpage
		 * @param count
		 * @return
		 * @throws SQLException
		 */
		public List<Shop_User> Userall(int cpage, int count) throws SQLException;

		/**
		 * ��lu
		 * @param us 
		 * @return
		 * @throws SQLException
		 */
		public Shop_User login(Shop_User us) throws SQLException;	
		/**
		 * ע��
		 * @param us
		 */
		public void register(Shop_User us) throws SQLException;
			



		}

	int userAdd(Shop_User sh) throws SQLException;
}
