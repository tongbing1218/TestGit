package com.project.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.bean.CutPageBean;
import com.project.service.IEmployeeService;
import com.project.service.impl.EmployeeServiceImpl;
import com.project.util.DateChange;

/**
 * Servlet implementation class FindByItemServlet
 */
@WebServlet("/mm/findByItem")
public class FindByItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IEmployeeService service = new EmployeeServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindByItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              //�õ�������
		String name = request.getParameter("eName");
		int pageNo = Integer.parseInt(request.getParameter("page"));
		Date startDate = DateChange.getDate(request.getParameter("startDate"));
		Date endDate = DateChange.getDate(request.getParameter("endDate"));
	
		//����ҵ�񷽷����õ���ҳ����
		CutPageBean bean = service.findBuItem(pageNo,name, startDate, endDate);
		//����ҳ����ת��Ϊjson��������ͻ���
		ObjectMapper om = new ObjectMapper();
		om.writeValue(response.getWriter(), bean);
//		Gson gson = new GsonBuilder().create();
//		gson.toJson(bean,response.getWriter());
	}

}
