package in.karthik.practice;


import org.springframework.stereotype.Repository;

@Repository("Mysqldao")

public class MySqlDBReportDao implements ReportDao {

	@Override
	public void getData() {
		
		System.out.println("Getting the Data From My Sql DB....");
		
	}
 
}
