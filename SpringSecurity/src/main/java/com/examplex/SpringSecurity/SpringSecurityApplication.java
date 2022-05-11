package com.examplex.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		System.out.println("inicio");
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		System.out.println(b.encode("admin"));

		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
