package iacademy.edu.ph.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iacademy.edu.ph.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO daoObj;
	
	public PaymentDAO getDaoObj() {
		System.out.println("PaymentDAO:getDaoObj Executed.");
		return daoObj;
	}
	
	public void setDaoObj(PaymentDAO daoObj) {
		this.daoObj = daoObj;
	}
}
