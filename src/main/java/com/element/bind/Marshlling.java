package com.element.bind;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshlling {
	
  public static	void main(String args[]) throws Exception {
	  
	  Employee emp = new Employee();
	  emp.setEmpId(101);
	  emp.setName("Pradeep");
	  emp.setSalary(20222);
	  emp.setAddress("Aurangabad");
	  
	  JAXBContext context = JAXBContext.newInstance(Employee.class);
	  
	  Marshaller marsh = context.createMarshaller();
	  marsh.marshal(emp, System.out);
	  
  }

}
