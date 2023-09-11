package com.example.kurs.repository;

import com.example.kurs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "SELECT AVG(amount) AS amount_o " +
            "FROM user_table " +
            "GROUP BY data, mss " +
            "ORDER BY amount_o ASC, data DESC", nativeQuery = true)
    List<Integer> findAverageAmountByDataAndMss();

}



