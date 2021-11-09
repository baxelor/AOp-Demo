package com.axelor.apps.contact;

import com.axelor.app.AxelorModule;
import com.axelor.apps.demo.db.repo.ContactRepository;

public class ContactModule extends AxelorModule{
		@Override
		protected void configure() {
			bind(ContactRepository.class).to(ContactRepo.class);
		}

}
