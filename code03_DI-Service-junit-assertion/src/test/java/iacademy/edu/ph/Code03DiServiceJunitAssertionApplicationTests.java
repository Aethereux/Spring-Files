package iacademy.edu.ph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import iacademy.edu.ph.services.PaymentServiceImpl;

@SpringBootTest
class Code03DiServiceJunitAssertionApplicationTests {

	@Autowired
	private PaymentServiceImpl service;
	
	@Test
	void testDependencyInjection() {
//		if (service != null)
//			System.out.println("Service object is not null");		
//		else 
//			System.err.println("Service Object is NULL");
//		
		Assertions.assertNotNull(service, "service object is null");
		
		System.out.println("Service Object is not null");
		service.getDaoObj();
	}

}
