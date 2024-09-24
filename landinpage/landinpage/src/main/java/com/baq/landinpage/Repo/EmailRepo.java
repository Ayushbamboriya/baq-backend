package com.baq.landinpage.Repo;


import com.baq.landinpage.Model.EmailRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EnableJpaRepositories
public interface EmailRepo extends JpaRepository<EmailRequest,Integer> {

}
