package com.mukit.myapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ALPHA_APP_USER")
public class AlphaAppUser {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HOME_ADDRESS")
    private String homeAddress;
}
