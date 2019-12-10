package com.adobe.aem.base.project.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;      
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, 
property = { 
		"sling.servlet.paths=" + "/bin/baseproject/parameterservlet",
		"sling.servlet.extensions=" + "json"
})

public class TestParameterServlet extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		String suffix = request.getRequestPathInfo().getSuffix();
		String[] split = StringUtils.split(suffix,'/');
		
		response.setHeader("Content-Type", "text/html");
		response.getWriter().print(split[0] + " " + split[1]);
		response.getWriter().close();

	}

}
