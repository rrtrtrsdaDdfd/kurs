package com.example.kurs.controller;

import com.example.kurs.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void saveUsers(@RequestParam  MultipartFile file) throws IOException {
        userService.saveUsers(file);
    }

    @GetMapping
    public List<Integer> getAverageAmountByDataAndMss() {
        return userService.findAverageAmountByDataAndMss();
    }

}
