package com.adobe.aem.base.project.core.impl;

import com.adobe.aem.base.project.core.SimpleOSGI;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;


@Component
@Service
public class SimpleOSGIImpl implements SimpleOSGI {

	@Override
	public String printHelloWorld() {
		return "Hello World";
	}

}
