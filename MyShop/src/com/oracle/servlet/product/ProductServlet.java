package com.oracle.servlet.product;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.entity.shop_category;
import com.oracle.entity.shop_product;
import com.oracle.service.CategoryService;
import com.oracle.service.ProductService;

/**
 * Servlet implementation class Product
 */
@WebServlet("/manager/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;utf-8");
		ProductService prod = new ProductService();
		List<shop_product> li =null;
		//当前页 
		int cpage=1; //当前页
		int count = 5; //每页显示条数
		//获得指定页面
		String cp =request.getParameter("cp");
		try {
			int arr[] =prod.totalPage();
			
			request.setAttribute("tsum",arr[0]);//总tiao数
			request.setAttribute("totalpages",arr[1]);//总页数
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(cp!=null) {
			//如果不为空转 
			cpage=Integer.parseInt(cp);
		}
		try {
			li = prod.showAll(cpage,count);
			System.out.println(li.get(0));
			request.setAttribute("cp",cpage);
			request.setAttribute("Prod", li);
			request.getRequestDispatcher("/manager/product_list.jsp").forward(request,response);
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
