package com.example.AddressBookWorkshop.service;
import com.example.AddressBookWorkshop.model.Contact;
import com.example.AddressBookWorkshop.repository.AddressBookRepository;
import com.example.AddressBookWorkshop.interfaces.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    private AddressBookRepository repository;

    @Override
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Contact addContact(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public Contact updateContact(Long id, Contact contact) {
        return repository.findById(id).map(existing -> {
            existing.setName(contact.getName());
            existing.setPhone(contact.getPhone());
            existing.setEmail(contact.getEmail());
            return repository.save(existing);
        }).orElse(null);
    }

    @Override
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}

