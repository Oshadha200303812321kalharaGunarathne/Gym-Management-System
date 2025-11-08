package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class TrainerEntity {

    @Id
    private String id;
    private String name;
    private String address;
    private LocalDate dob;
    private String email;
    private double salary;
    private String phoneNumber;
    private String qulification;

}
