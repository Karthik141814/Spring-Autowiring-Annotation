package in.karthik.practice;

import org.springframework.stereotype.Repository;

@Repository("oracledao")
public class OracleDBReportDao implements ReportDao{
	
@Override
	public void getData() {
	
		System.out.println("Getting the Data from the Oracle DB...");
		
	}

}
