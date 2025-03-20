package com.example.AddressBookWorkshop.dto;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> {
    private String message;
    private T data;
}

