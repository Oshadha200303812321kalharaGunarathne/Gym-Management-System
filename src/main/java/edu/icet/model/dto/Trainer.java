package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Trainer {
    private String id;
    private String name;
    private String address;
    private LocalDate dob;
    private String email;
    private double salary;
    private String phoneNumber;
    private String qulification;

}
