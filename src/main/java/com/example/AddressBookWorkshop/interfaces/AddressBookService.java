package com.example.AddressBookWorkshop.interfaces;

import com.example.AddressBookWorkshop.dto.AddressBookDTO;
import com.example.AddressBookWorkshop.model.AddressBookEntry;

import java.util.List;

public interface AddressBookService {
    List<AddressBookEntry> getAllContacts();
    AddressBookEntry getContactById(Long id);
    AddressBookEntry addContact(AddressBookDTO dto);
    AddressBookEntry updateContact(Long id, AddressBookDTO dto);
    void deleteContact(Long id);
}
