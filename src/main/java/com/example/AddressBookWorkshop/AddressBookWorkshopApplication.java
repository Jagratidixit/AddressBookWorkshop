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
//		# Fetch contact by ID
//curl -X GET http://localhost:8080/api/addressbook/1
//
//		# Add new contact
//curl -X POST http://localhost:8080/api/addressbook -H "Content-Type: application/json" -d '{"name": "John Doe", "phoneNumber": "9876543210", "email": "john@example.com"}'
//
//		# Update contact
//curl -X PUT http://localhost:8080/api/addressbook/1 -H "Content-Type: application/json" -d '{"name": "John Updated", "phoneNumber": "1234567890", "email": "updated@example.com"}'
//
//		# Delete contact
//curl -X DELETE http://localhost:8080/api/addressbook/1

//# Register a new user
//curl -X POST http://localhost:8080/api/auth/register -H "Content-Type: application/json" -d '{"username": "JohnDoe", "email": "john@example.com", "password": "password123"}'
//
//		# Login to get JWT Token
//curl -X POST http://localhost:8080/api/auth/login -H "Content-Type: application/json" -d '{"email": "john@example.com", "password": "password123"}'




