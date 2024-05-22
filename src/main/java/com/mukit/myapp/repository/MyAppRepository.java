package com.mukit.myapp.repository;

import com.mukit.myapp.entity.MyAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyAppRepository extends JpaRepository<MyAppUser, Long> {
    MyAppUser findByUsername(String username);
}
