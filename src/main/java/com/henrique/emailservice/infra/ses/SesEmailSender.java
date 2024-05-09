package com.henrique.emailservice.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.henrique.emailservice.adapters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;

public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
