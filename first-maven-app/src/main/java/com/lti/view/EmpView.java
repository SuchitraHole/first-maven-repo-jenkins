 package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(2);
		e.setEmpName("sharma");
		System.out.println(e.getEmpId()+e.getEmpName());
	}
}
