package org.jasmine.ecommerce;

import org.jasmine.ecommerce.dao.SalesDao;
import org.jasmine.ecommerce.entity.Sales;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Timestamp;

@SpringBootApplication
//@SpringBootApplication(
//		scanBasePackages = {"org.jasmine.util","org.jasmine.ecommerce"}
//)
public class EcommerceApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(SalesDao salesDao) {
		return  runner -> {
			createSales(salesDao);
		};
	}

	private void createSales(SalesDao salesDao) {
		//create object
		//public Sales(int customer_id, Timestamp sales_date_time, String recepient_addeess, String recepient_phone, String recepient_remark, boolean is_showed) {

		Timestamp time = new Timestamp(System.currentTimeMillis());
		Sales sale1 = new Sales(2, time,"rue de boudlevar","0138148","evian water",true);
		//save object

//		salesDao.save(sale1);
//		System.out.println("saved sales , generated id: "+ sale1.getSales_id());
	}


}
