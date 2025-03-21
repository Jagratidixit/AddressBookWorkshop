package com.example.AddressBookWorkshop.repository;

import com.example.AddressBookWorkshop.model.AddressBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookEntry, Long> {
}
