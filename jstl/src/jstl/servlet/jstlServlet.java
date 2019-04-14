package jstl.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.util.EntityResolver2Wrapper;

import Student.student;

/**
 * Servlet implementation class jstlServlet
 */
@WebServlet("/jstlServlet")
public class jstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public jstlServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		student student=new student(123,"zs",21);
		request.setAttribute("student", student);
		Map<String, String> map=new HashMap<>();
		map.put("cn", "中国");
		map.put("an", "美国");
		request.setAttribute("map", map);
		
		String[] ss=new String[]{"aaa","bbb","ccc"};
		request.setAttribute("ss", ss);
		
		student student1=new student();
		student student2=new student();
		student1.setSno(1);
		student1.setName("zs");
		student2.setSno(2);
		student2.setName("ls");
		List<student> students=new ArrayList<>();
		students.add(student1);
		students.add(student2);
		request.setAttribute("students", students);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
