package com.nagesh.springdata.hibernateinheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nagesh.springdata.hibernateinheritance.entities.Check;
import com.nagesh.springdata.hibernateinheritance.entities.CreditCard;
import com.nagesh.springdata.hibernateinheritance.repos.PaymentRepository;

@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPayment() {

		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(1000d);
		cc.setCardnumber("1234567890");
		repository.save(cc);

	}

	@Test
	public void createCheckPayment() {

		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setChecknumber("25445775354");
		repository.save(ch);

	}
}
