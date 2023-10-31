package com.study.payservice;

import com.study.payservice.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PayServiceApplication implements CommandLineRunner {

	private final PayService payService;

	@Autowired
	public PayServiceApplication(PayService payService) {
		this.payService = payService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PayServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Resultado: R$" + this.payService.finalPrice(500, "SP"));
	}
}
