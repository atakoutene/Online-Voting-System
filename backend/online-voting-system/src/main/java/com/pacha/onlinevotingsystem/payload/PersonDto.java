package com.pacha.onlinevotingsystem.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private long perId;

    private String registrationNumber;

    private String email;

    private  String name;

    private Date dob;

    private String role;

    private  boolean muted;

    private boolean voted;

    private boolean liked;

    private boolean disliked;
}
