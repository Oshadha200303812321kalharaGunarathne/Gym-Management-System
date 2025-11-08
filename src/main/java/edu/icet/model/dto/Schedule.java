package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Schedule {
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
}
