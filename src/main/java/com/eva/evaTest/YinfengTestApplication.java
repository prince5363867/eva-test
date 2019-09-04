package com.eva.evaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class )
public class YinfengTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(YinfengTestApplication.class, args) ;
	}

}
