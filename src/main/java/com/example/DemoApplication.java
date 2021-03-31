package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;

import javax.annotation.PostConstruct;
import java.beans.IntrospectionException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IntrospectionException {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	PlatformTransactionManager transactionManager;

	@Autowired
	JpaTransactionManager jpaTransactionManager;

	@Autowired
	TransactionDefinition transactionDefinition;

	@PostConstruct
	public void viewTransactionManager(){
		System.out.println(transactionManager.getClass().getName());
		System.out.println(jpaTransactionManager.getClass().getName());
		System.out.println(jpaTransactionManager.getTransaction(transactionDefinition).getClass().getName());
	}

}
