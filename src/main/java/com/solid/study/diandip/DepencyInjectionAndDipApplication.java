package com.solid.study.diandip;

import com.solid.study.diandip.sell.SellService;
import com.solid.study.diandip.sell.model.Sell;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class DepencyInjectionAndDipApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DepencyInjectionAndDipApplication.class, args);

		SellService sellService = applicationContext.getBean(SellService.class);

		Sell sell = new Sell();
		sell.setProduct("Air Jordan 1 Lost and Found");
		sell.setUnitPrice(new BigDecimal(2300));
		sell.setQuantity(1);

		sellService.registrySell(sell, "5288070665211509");
	}

}
