package com.axxelor.apps.conatct.controller;

import org.quartz.xml.ValidationException;

import com.axelor.apps.contact.db.DemoO2O;

public class StudentController {
	
	
	public void testValidate(DemoO2O demoO2O) throws ValidationException {
		if(demoO2O.getName().equals("o2o_code2")){
			throw new ValidationException("Invalid sale order, confirm date is before order date.");
		}
	}

}
