package com.mukit.myapp.repository;

import com.mukit.myapp.entity.AlphaAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlphaAppRepository extends JpaRepository<AlphaAppUser, Long> {
    AlphaAppUser findByUsername(String username);
}
