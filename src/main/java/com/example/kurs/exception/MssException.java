package com.example.kurs.exception;

import com.example.kurs.DTO.AddUserDTO;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
@Component
public class MssException extends RuntimeException {
    public static List<Integer> userWithBadMss;

    public boolean mssException(List<AddUserDTO> userDTOList) {
         userWithBadMss = IntStream.range(0, userDTOList.size())
                .filter(i -> {
                    AddUserDTO userDTO = userDTOList.get(i);
                    return userDTO.getMss() == null || !userDTO.getMss().matches("\\d{4}");
                })
                .boxed()
                .toList();
        return userWithBadMss.size() == 0;

    }
}
