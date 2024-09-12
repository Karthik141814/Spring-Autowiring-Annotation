package in.karthik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.karthik.AppConfig;
import in.karthik.practice.ReportService;


public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
	ReportService 	service= ctxt.getBean(ReportService.class);
	service.generateReport();
	
	}

}
