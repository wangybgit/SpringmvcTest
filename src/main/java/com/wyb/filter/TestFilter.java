package com.wyb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import com.wyb.uitls.Requests;


public class TestFilter  implements Filter{

	@Override
	public void destroy() {
		System.out.println("filter销毁");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter业务处理");
//		HttpSession session = Requests.getRequest().getSession();
//		Object user = session.getAttribute("user");
//		if(user==null){
//			request.getRequestDispatcher("/testController/login").forward(request, response);
//		}
        chain.doFilter(request, response);  //让目标资源执行，放行

		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter初始化");
	}

}
