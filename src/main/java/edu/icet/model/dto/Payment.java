package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Payment {

    private String id;
    private double amount;
    private LocalDate date;
    private String name;
}
