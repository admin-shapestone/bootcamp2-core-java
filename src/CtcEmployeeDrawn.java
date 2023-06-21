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

		for (int i = 0; i < employee.length -1; i++) {
			System.out.println(employee[i].getName());
			System.out.println(employee[i].getId());
			System.out.println(employee[i].getAge());
			System.out.println(employee[i].getGender());
			System.out.println(employee[i].getPhoneNumber());
			System.out.println(employee[i].getAddress());
			System.out.println("......................................................");
		}
			for (int j = 0; j < company.length -1; j++) {
				System.out.println(company[j].getCompanyName());
				System.out.println(company[j].getAmountReceived());
				System.out.println(company[j].getEmailId());
				System.out.println(company[j].getSlno());
				System.out.println(company[j].getDateOfReleving());
				System.out.println(company[j].getCtcTimeOfReleving());
				System.out.println("......................................................");
				
				
			}
		

	}

}