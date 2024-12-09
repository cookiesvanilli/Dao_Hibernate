package com.example.Dao;

import org.springframework.boot.SpringApplication;

public class TestDaoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DaoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
