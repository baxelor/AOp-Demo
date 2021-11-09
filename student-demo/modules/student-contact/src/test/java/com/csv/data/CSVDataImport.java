package com.csv.data;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.axelor.apps.contact.db.repo.CircleRepository;
import com.axelor.apps.contact.db.repo.DemoM2MRepository;
import com.axelor.apps.contact.db.repo.DemoO2MRepository;
import com.axelor.apps.contact.db.repo.DemoO2ORepository;
import com.axelor.apps.contact.db.repo.DepartmentsRepository;
import com.axelor.apps.contact.db.repo.StudentRepository;
import com.axelor.data.ImportTask;
import com.axelor.data.Importer;
import com.axelor.data.csv.CSVImporter;
import com.axelor.inject.Beans;
import com.axelor.test.GuiceModules;
import com.axelor.test.GuiceRunner;

@RunWith(GuiceRunner.class)
@GuiceModules(DataModule.class)
public class CSVDataImport {

//	@Test
//	public void testImport()  throws IOException{
//		Importer importer = new CSVImporter("data/csv-config.xml", "data/csv");
//		importer.run();
//		Beans.get(StudentRepository.class).all().fetch().stream()
//		.forEach(student->System.err.println(student.getFullName()+"\t" +student.getTitle()+"\t"+
//		student.getCircles() +"\t"+student.getDepartments()+"\t"+student.getDemoO2M()+"\t"+student.getDemoO2O()+"\t"+ student.getDemoM2M()));
//		
//	}

//	@Test
//	public void testMulti() throws IOException {
//		Importer importer = new CSVImporter("data/csv-multi-config.xml");
//		importer.run(new ImportTask() {
//			@Override
//			public void configure() throws IOException {
//				input("[sale.order]", new File("data/csv-multi/so1.csv"));
//				input("[sale.order]", new File("data/csv-multi/so2.csv"));
//			}
//		});
//	}

	@Test
	public void testCsvMultiImoprter() throws IOException {
		Importer importer = new CSVImporter("data/csv-multi-config.xml");
		importer.run(new ImportTask() {
			@Override
			public void configure() throws IOException {
				input("[test.multi]", new File("data/csv-multi/csv-multi-demo.csv"));
			}
		});

	}
}
