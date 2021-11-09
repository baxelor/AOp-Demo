package com.axelor.apps.contact.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.contact.StudentContactRepo;
import com.axelor.apps.contact.db.repo.StudentRepository;

public class ContactModule extends AxelorModule{
	@Override
	protected void configure() {
		
		bind(StudentRepository.class).to(StudentContactRepo.class);
	}
	
}

