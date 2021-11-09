package com.axelor.apps.data.test;

import java.time.LocalDate;
import java.util.Map;

import com.axelor.apps.contact.db.Student;

public class testMethod {
	
	public void getdate(Map<String, Object> context) {
		Student student = new Student();
		student.setTestDate(LocalDate.now());
		context.put("dummyDate", student);
		System.err.println(context);
	}
	
	public Object createDate(Object bean, Map<String, Object>values) {
		assert bean instanceof Student;
		assert values.get("dummyDate") instanceof Student;
		Student s1 = (Student) bean;
		Student s2 = (Student) values.get("dummyDate");
		s1.setTestDate(s2.getTestDate());
		
		System.err.println(s1);
		return s1;
		
	}

}
