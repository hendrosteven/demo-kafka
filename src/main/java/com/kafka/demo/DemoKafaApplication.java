package com.kafka.demo;

import com.kafka.demo.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoKafaApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(DemoKafaApplication.class, args);
	}

	@Autowired
	Sender sender;

	@Override
	public void run(String... strings) throws Exception {
		sender.send("myOtherTopic","Hello Apa kabar");
	}
}
