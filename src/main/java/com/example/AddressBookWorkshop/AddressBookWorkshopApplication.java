package com.example.AddressBookWorkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookWorkshopApplication.class, args);
	}

}

//UC2
//# Fetch all contacts
//curl -X GET http://localhost:8080/api/addressbook
//
//		# Fetch a contact by ID
//curl -X GET http://localhost:8080/api/addressbook/1
//
//		# Add a new contact
//curl -X POST http://localhost:8080/api/addressbook -H "Content-Type: application/json" -d '{"name":"John Doe","phone":"1234567890","email":"john@example.com"}'
//
//		# Update a contact
//curl -X PUT http://localhost:8080/api/addressbook/1 -H "Content-Type: application/json" -d '{"name":"Jane Doe","phone":"9876543210","email":"jane@example.com"}'
//
//		# Delete a contact
//curl -X DELETE http://localhost:8080/api/addressbook/1

