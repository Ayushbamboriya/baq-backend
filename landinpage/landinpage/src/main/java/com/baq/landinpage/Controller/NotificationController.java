package com.baq.landinpage.Controller;

import com.baq.landinpage.Model.EmailRequest;
import com.baq.landinpage.Repo.EmailRepo;
import com.baq.landinpage.Service.NotificationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NotificationController {

    @Autowired
    NotificationService notificationService;
    
    @Autowired
    EmailRepo emailRepo;
    @GetMapping("/notify")
    public List<EmailRequest> getemail() {
    	return emailRepo.findAll();
    }

    @PostMapping("/notify")
    public ResponseEntity<?> notifyUser(@RequestBody EmailRequest emailRequest) {
        try{
            return notificationService.saveEmail(emailRequest);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error while saving the email");
        }
    }

}
