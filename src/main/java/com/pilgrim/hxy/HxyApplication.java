package com.pilgrim.hxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pilgrim.hxy.mapper")
public class HxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HxyApplication.class, args);
	}

}

