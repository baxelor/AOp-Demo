package com.axelor.apps.data.test;

import java.util.Map;

import org.quartz.xml.ValidationException;

import com.axelor.apps.contact.db.DemoO2O;
import com.axxelor.apps.conatct.controller.StudentController;
import com.google.inject.Inject;



public class ValidateTestMethod {

	@Inject StudentController suc;
	public Object validatetor(Object bean, Map<String, Object> context) throws ValidationException {
		assert bean instanceof DemoO2O;
		DemoO2O demoO2o = (DemoO2O) bean;
		suc.testValidate(demoO2o);		
		return bean;
		
	}

}
