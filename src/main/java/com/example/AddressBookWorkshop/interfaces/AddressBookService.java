package com.example.AddressBookWorkshop.interfaces;
import com.example.AddressBookWorkshop.model.Contact;
import java.util.List;

public interface AddressBookService {
    List<Contact> getAllContacts();
    Contact getContactById(Long id);
    Contact addContact(Contact contact);
    Contact updateContact(Long id, Contact contact);
    void deleteContact(Long id);
}

