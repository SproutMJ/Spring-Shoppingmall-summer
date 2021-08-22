package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/admin/*")
public class AdminCheckFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		boolean isRedirect = false;
		String requestURI = request.getRequestURI();
		
		if(requestURI.equals("/admin")) {
			
			long userRole;
			
			if(request.getSession().getAttribute("userRole") != null) {
				userRole = (long) request.getSession().getAttribute("userRole");
			}else {
				userRole = 0;
			}
			
			if(userRole == 0) {
				isRedirect = true;
			}
		}
		
		if(isRedirect) {
			response.sendRedirect("/");
		}else {
			chain.doFilter(req, res);
		}
	}

}
