package com.example.jpademo.repository;

import com.example.jpademo.model.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    Security findByPost(Security post);
}
