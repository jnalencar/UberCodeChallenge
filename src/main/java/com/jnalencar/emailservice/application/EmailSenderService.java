package com.jnalencar.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import com.jnalencar.emailservice.adapters.EmailSenderGateway;
import com.jnalencar.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase{

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
    
}