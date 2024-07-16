package com.panhacode.demojwt.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class LoginResponse {
    private String token;

    private long expiresIn;
}