package com.example.jpademo.repository;

import com.example.jpademo.model.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    Home findByAddress(String address);
}
