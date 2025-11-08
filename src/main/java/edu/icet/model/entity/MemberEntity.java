package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MemberEntity {

    @Id
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
