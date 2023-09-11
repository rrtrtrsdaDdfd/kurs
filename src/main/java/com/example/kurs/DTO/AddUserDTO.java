package com.example.kurs.DTO;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AddUserDTO {
    @CsvBindByPosition(position = 0)
    private String name;
    @CsvBindByPosition(position = 1)
    private int amount;
    @CsvBindByPosition(position = 2)
    @CsvDate("dd.MM.yyyy")
    private LocalDate data;
    @CsvBindByPosition(position = 3)
    private String mss;

}
