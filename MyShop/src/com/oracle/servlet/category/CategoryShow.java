package com.oracle.servlet.category;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.dao.CartDao;
import com.oracle.dao.Userdao;
import com.oracle.entity.Shop_User;
import com.oracle.entity.shop_category;
import com.oracle.service.CategoryService;


/**
 * Servlet implementation class CategoryShow
 */
@WebServlet("/manager/CategoryShow")
public class CategoryShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;utf-8");
		CategoryService cate = new CategoryService();
		List<shop_category> li =null;
		//��ǰҳ 
		int cpage=1; //��ǰҳ
		int count = 5; //ÿҳ��ʾ����
		//���ָ��ҳ��
		String cp =request.getParameter("cp");
		try {
			int arr[] =cate.totalPage();
			
			request.setAttribute("tsum",arr[0]);//��tiao��
			request.setAttribute("totalpages",arr[1]);//��ҳ��
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(cp!=null) {
			//�����Ϊ��ת 
			cpage=Integer.parseInt(cp);
		}
		try {
			li = cate.CategoryAll(cpage,count);
			request.setAttribute("cp",cpage);
			request.setAttribute("Categoryli", li);
			request.getRequestDispatcher("/manager/category_list.jsp").forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
