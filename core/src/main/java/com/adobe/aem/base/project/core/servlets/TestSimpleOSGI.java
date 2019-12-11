package com.adobe.aem.base.project.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.adobe.aem.base.project.core.SimpleOSGI;

@Component(service = Servlet.class, 
property = { "sling.servlet.paths=" + "/bin/baseproject/simpleosgi" 
})

public class TestSimpleOSGI extends SlingSafeMethodsServlet {
	private static final long serialVersionUID = 1L;
	
	@Reference
	private SimpleOSGI simple;
	
	public void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException{
		response.setHeader("Content-type", "text/html");
		response.getWriter().print(simple.printHelloWorld());
		response.getWriter().close();
	}
}
