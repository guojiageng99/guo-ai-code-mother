package com.guo.guoaicodemother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class GuoAiCodeMotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuoAiCodeMotherApplication.class, args);
	}

}
