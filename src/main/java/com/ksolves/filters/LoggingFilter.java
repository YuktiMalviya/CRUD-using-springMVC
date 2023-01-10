package com.ksolves.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter{

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String remoteAddr = request.getRemoteAddr();
		ServletContext servletContext = request.getServletContext();
		System.out.println("context path"+servletContext.getContextPath());
		System.out.println("remote addr"+remoteAddr);

		chain.doFilter(request, response);
	}

}
