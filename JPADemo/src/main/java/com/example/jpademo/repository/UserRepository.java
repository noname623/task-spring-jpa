package com.example.jpademo.repository;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    void updateById(Long id);
    List<UserDto> findByAgeLessThan(Integer age);
    List<UserDto> findByEmail(String email);
}