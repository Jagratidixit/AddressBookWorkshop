package com.example.AddressBookWorkshop.controller;

import com.example.AddressBookWorkshop.dto.AddressBookDTO;
import com.example.AddressBookWorkshop.interfaces.IAddressBookService;
import com.example.AddressBookWorkshop.model.AddressBookEntry;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping
    public ResponseEntity<List<AddressBookEntry>> getAllContacts() {
        return ResponseEntity.ok(addressBookService.getAllContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookEntry> getContactById(@PathVariable Long id) {
        return ResponseEntity.ok(addressBookService.getContactById(id));
    }

    @PostMapping
    public ResponseEntity<AddressBookEntry> addContact(@Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(addressBookService.addContact(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookEntry> updateContact(@PathVariable Long id, @Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(addressBookService.updateContact(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable Long id) {
        addressBookService.deleteContact(id);
        return ResponseEntity.ok("Contact deleted successfully");
    }
}
