package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private String name;
    private LocalDate dob;
    private String email;
    private String id;
    private String contactNo;
    private String address;
    private double BMI;
    private double registrationFee;
    private double Subscription;
}
