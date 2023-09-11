package com.example.kurs.CsvParser;

import com.example.kurs.DTO.AddUserDTO;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class CsvParser {

    public List<AddUserDTO> parserCSV(CSVReader csvReader) {
        List<AddUserDTO> UsersDTO = new CsvToBeanBuilder(csvReader)
                .withType(AddUserDTO.class)
                .build()
                .parse();
        return UsersDTO;
    }
}
