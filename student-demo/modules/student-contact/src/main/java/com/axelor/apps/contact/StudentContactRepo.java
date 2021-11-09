package com.axelor.apps.contact;

import java.util.Map;

import com.axelor.apps.contact.db.Student;
import com.axelor.apps.contact.db.repo.StudentRepository;

public class StudentContactRepo extends StudentRepository{
	
	@Override
	  public Map<String, Object> populate(Map<String, Object> json, Map<String, Object> context) {
	    if (!context.containsKey("json-enhance")) {
	      return json;
	    }
	    try {
	      Long id = (Long) json.get("id");
	      Student contact = find(id);
	      json.put("address", contact.getAddress().get(0));
	      json.put("hasImage", contact.getImage() != null);
	    } catch (Exception e) {
	    }

	    return json;
}
}
