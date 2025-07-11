package iacademy.edu.ph.service;

import org.springframework.stereotype.Service;
import iacademy.edu.ph.model.*;

@Service
public class PayrollService {
	
	public void computePayRoll(Payroll payroll) {
		
		payroll.setBasicPay((payroll.getHoursWorked() <= 40) ? payroll.getHoursWorked() * payroll.getRatePerHour() : 40 * payroll.getRatePerHour());
		payroll.setOvertimePay((payroll.getHoursWorked() > 40) ? (payroll.getHoursWorked() - 40) * 1.5 * payroll.getRatePerHour() : 0);
		
		payroll.setGrossPay(payroll.getBasicPay() + payroll.getOvertimePay());
		payroll.setWithHoldingTax(payroll.getGrossPay() * .1);
		
		payroll.setNetPay(payroll.getGrossPay() - payroll.getWithHoldingTax() - payroll.getHDMF() - payroll.getSSS());
	}
}
