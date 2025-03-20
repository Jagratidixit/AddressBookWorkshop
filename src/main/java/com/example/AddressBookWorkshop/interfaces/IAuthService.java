package com.example.AddressBookWorkshop.interfaces;

import com.example.AddressBookWorkshop.dto.UserDTO;
import com.example.AddressBookWorkshop.model.User;

public interface IAuthService {
    User registerUser(UserDTO userDTO);
    String loginUser(UserDTO userDTO);
}
