package com.example.AddressBookWorkshop.service;

import com.example.AddressBookWorkshop.dto.UserDTO;
import com.example.AddressBookWorkshop.model.User;
import com.example.AddressBookWorkshop.repository.UserRepository;
import com.example.AddressBookWorkshop.interfaces.IAuthService;
import com.example.AddressBookWorkshop.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public User registerUser(UserDTO userDTO) {
        if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            throw new RuntimeException("User already exists!");
        }
        User user = new User();
        user.setUsername(userDTO.getUsername()); // Add this line
        user.setEmail(userDTO.getEmail().toLowerCase());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        return userRepository.save(user);
    }


    @Override
    public String loginUser(UserDTO userDTO) {
        Optional<User> storedUser = userRepository.findByEmail(userDTO.getEmail());

        if (storedUser.isPresent()) {
            boolean passwordMatches = passwordEncoder.matches(userDTO.getPassword(), storedUser.get().getPassword());
            System.out.println("Password Match: " + passwordMatches); // Debug log

            if (passwordMatches) {
                return jwtUtil.generateToken(storedUser.get().getEmail());
            }
        }
        throw new RuntimeException("Invalid email or password!");
    }

}
