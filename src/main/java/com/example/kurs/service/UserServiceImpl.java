package com.example.kurs.service;

import com.example.kurs.CsvParser.CsvParser;
import com.example.kurs.DTO.AddUserDTO;
import com.example.kurs.entity.User;
import com.example.kurs.exception.MssException;
import com.example.kurs.mapper.UserMapper;
import com.example.kurs.repository.UserRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final CsvParser csvParser;
    private final MssException mssException;


    @Override
    public void saveUsers(MultipartFile fileCsv) throws IOException {
        Reader reader = new InputStreamReader(fileCsv.getInputStream());
        CSVReader csvReader = new CSVReaderBuilder(reader).build();
        List<AddUserDTO> userDTOList = csvParser.parserCSV(csvReader);
        if (!mssException.mssException(userDTOList)) {
            throw new MssException();
        }
        userDTOList.stream()
                .map(UserMapper.INSTANCE::dtoToUser)
                .forEach(userRepository::save);


    }

    @Override
    public List<Integer> findAverageAmountByDataAndMss() {
        return userRepository.findAverageAmountByDataAndMss();
    }


}
