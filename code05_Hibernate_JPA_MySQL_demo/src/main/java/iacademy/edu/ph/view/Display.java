package iacademy.edu.ph.view;

import iacademy.edu.ph.model.*;
public class Display {

	public static void print(Payroll payroll) {
		System.out.println("Employee ID: " + payroll.getEmpId());
		System.out.println("Last Name: " + payroll.getLastName());
		System.out.println("First Name: " + payroll.getFirstName());
		System.out.println("Hours Worked: " + payroll.getHoursWorked());
		System.out.println("Rate per Hour: Php" + payroll.getRatePerHour());
		System.out.println("Basic Pay: " + payroll.getBasicPay());
		System.out.println("Overtime Pay: " + payroll.getOvertimePay());
		System.out.println("Gross Pay: " + payroll.getGrossPay());
		System.out.println("\tWithHolding Tax: " + payroll.getWithHoldingTax());
		System.out.println("\tSSS: " + payroll.getSSS());
		System.out.println("\tHDMF: " + payroll.getHDMF());
		System.out.println("NET PAY: Php" + payroll.getNetPay());
	}
}
