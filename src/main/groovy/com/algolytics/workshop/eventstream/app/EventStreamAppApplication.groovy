package com.algolytics.workshop.eventstream.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = 'com.algolytics.workshop.eventstream')
class EventStreamAppApplication {

	static void main(String[] args) {
		SpringApplication.run EventStreamAppApplication, args
	}
}
