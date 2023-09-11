package com.example.kurs.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ErrorDto {
    private int code;
    private List<Integer> errorLines;
}
