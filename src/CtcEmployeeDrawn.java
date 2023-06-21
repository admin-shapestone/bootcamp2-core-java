import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shapestone.employeedetails.DriverCompany;
import com.shapestone.employeedetails.Employee;

public class CtcEmployeeDrawn {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Employee[] employee = mapper.readValue(new File("employee.json"), Employee[].class);
		DriverCompany[] company = mapper.readValue(new File("company.json"), DriverCompany[].class);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
  System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n","name","Id","Age","Gender","Phone Number","Address");
		for (int i = 0; i < employee.length; i++) {
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf(
					"|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n",employee[i].getName(),employee[i].getId(),employee[i].getAge(),employee[i].getGender(),
					employee[i].getPhoneNumber(),employee[i].getAddress());
		
		}
		
		System.out.println(
				
				
				);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%n","companyname","amountreceived","emailid","slno","dateofreleving","ctctimeofreleving");
		  for (int j = 0; j < company.length; j++) {
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");	
		  System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%n",company[j].getCompanyName(),company[j].getAmountReceived(),company[j].getEmailId(),company[j].getSlno(),
					company[j].getDateOfReleving(),company[j].getCtcTimeOfReleving());
		  
		  }
		 
		

	}

}