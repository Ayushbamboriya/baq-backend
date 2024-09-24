package com.baq.landinpage.Service;

import com.baq.landinpage.Model.EmailRequest;
import com.baq.landinpage.Repo.EmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    EmailRepo emailRepo;

    public ResponseEntity<String> saveEmail(EmailRequest email){
        String message = "Email saved successfully!";
        try{
            emailRepo.save(email);
        }
        catch(Exception e ){
            throw e;
        }
        return ResponseEntity.ok().body(message);
    }
}
