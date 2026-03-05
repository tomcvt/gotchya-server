package com.tomcvt.gotchya.server;

import org.springframework.boot.SpringApplication;

public class TestGotchyaServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(GotchyaServerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
