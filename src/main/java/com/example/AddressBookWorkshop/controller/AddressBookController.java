package com.example.AddressBookWorkshop.controller;
import com.example.AddressBookWorkshop.dto.ResponseDTO;
import com.example.AddressBookWorkshop.model.Contact;
import com.example.AddressBookWorkshop.interfaces.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @GetMapping
    public ResponseEntity<ResponseDTO<List<Contact>>> getAllContacts() {
        List<Contact> contacts = service.getAllContacts();
        return ResponseEntity.ok(new ResponseDTO<>("Fetched all contacts", contacts));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO<Contact>> getContactById(@PathVariable Long id) {
        Contact contact = service.getContactById(id);
        return ResponseEntity.ok(new ResponseDTO<>("Fetched contact by ID", contact));
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<Contact>> addContact(@RequestBody Contact contact) {
        Contact savedContact = service.addContact(contact);
        return ResponseEntity.ok(new ResponseDTO<>("Contact added successfully", savedContact));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDTO<Contact>> updateContact(@PathVariable Long id, @RequestBody Contact contact) {
        Contact updatedContact = service.updateContact(id, contact);
        return ResponseEntity.ok(new ResponseDTO<>("Contact updated successfully", updatedContact));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO<String>> deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
        return ResponseEntity.ok(new ResponseDTO<>("Contact deleted successfully", "Deleted ID: " + id));
    }
}

