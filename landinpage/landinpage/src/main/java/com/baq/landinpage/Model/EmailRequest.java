package com.baq.landinpage.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})

public class EmailRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key field

    @Column(nullable = false, unique = true)
    private String email;

    public EmailRequest() {}

    public EmailRequest(String email) {
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail_address() {
        return email;
    }

    public void setEmail_address(String email_address) {
        this.email = email_address;
    }
}
