package in.karthik.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class ReportService {

	@Autowired
	@Qualifier("Mysqldao")
	public ReportDao dao;//Field Injection
	
	public void generateReport() {
		
		dao.getData();
		System.out.println("Report Generated");
	}
	
}
