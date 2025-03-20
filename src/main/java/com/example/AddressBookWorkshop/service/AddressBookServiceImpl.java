package com.example.AddressBookWorkshop.service;
import com.example.AddressBookWorkshop.dto.AddressBookDTO;
import com.example.AddressBookWorkshop.interfaces.IAddressBookService;
import com.example.AddressBookWorkshop.model.AddressBookEntry;
import com.example.AddressBookWorkshop.repository.AddressBookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {

    @Autowired
    private AddressBookRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AddressBookEntry> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public AddressBookEntry getContactById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    @Override
    public AddressBookEntry addContact(AddressBookDTO dto) {
        AddressBookEntry entry = modelMapper.map(dto, AddressBookEntry.class);
        return repository.save(entry);
    }

    @Override
    public AddressBookEntry updateContact(Long id, AddressBookDTO dto) {
        AddressBookEntry existing = getContactById(id);
        modelMapper.map(dto, existing);
        return repository.save(existing);
    }

    @Override
    public void deleteContact(Long id) {
        if (!repository.existsById(id)) throw new RuntimeException("Contact not found");
        repository.deleteById(id);
    }
}
