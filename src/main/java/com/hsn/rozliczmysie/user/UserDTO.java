package com.hsn.rozliczmysie.user;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;
}
