package com.axelor.apps.contact;

import java.util.Map;

import com.axelor.apps.demo.db.Contact;
import com.axelor.apps.demo.db.repo.ContactRepository;

public class ContactRepo extends ContactRepository{
	
	@Override
	  public Map<String, Object> populate(Map<String, Object> json, Map<String, Object> context) {
//	    if (!context.containsKey("json-enhance")) {
//	    	System.out.println("hgyff");
//	      return json;
//	    }
	    try {
	      Long id = (Long) json.get("id");
	      Contact contact = find(id);
	      json.put("hasImage", contact.getImage() != null);
	    } catch (Exception e) {
	    }

	    return json;
}
	
}
