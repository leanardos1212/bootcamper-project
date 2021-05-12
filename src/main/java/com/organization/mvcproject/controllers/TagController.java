package com.organization.mvcproject.controllers;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class TagController extends SimpleTagSupport {
	
	   public void doTag() throws JspException, IOException {
		      JspWriter out = getJspContext().getOut();
		      out.println("Hello Custom Tag!");
		   }

}
