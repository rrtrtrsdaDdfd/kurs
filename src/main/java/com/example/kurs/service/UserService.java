package com.example.kurs.service;

import com.example.kurs.DTO.AddUserDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public interface UserService {
    void saveUsers(MultipartFile FileCsv) throws IOException;

    List<Integer> findAverageAmountByDataAndMss();


}
