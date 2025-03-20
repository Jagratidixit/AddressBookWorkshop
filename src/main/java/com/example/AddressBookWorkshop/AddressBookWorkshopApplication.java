package com.example.AddressBookWorkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookWorkshopApplication.class, args);
	}

}



//# Fetch all contacts
//curl -X GET http://localhost:8080/api/addressbook
//
//		# Get contact by ID
//curl -X GET http://localhost:8080/api/addressbook/1
//
//		# Add a new contact
//curl -X POST http://localhost:8080/api/addressbook \
//		-H "Content-Type: application/json" \
//		-d '{"name": "John Doe", "phoneNumber": "9876543210", "email": "john@example.com"}'
//
//		# Update a contact
//curl -X PUT http://localhost:8080/api/addressbook/1 \
//		-H "Content-Type: application/json" \
//		-d '{"name": "John Smith", "phoneNumber": "1234567890", "email": "johnsmith@example.com"}'
//
//		# Delete a contact
//curl -X DELETE http://localhost:8080/api/addressbook/1


