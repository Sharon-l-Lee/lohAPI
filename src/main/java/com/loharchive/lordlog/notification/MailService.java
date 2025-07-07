package com.loharchive.lordlog.notification;

import com.loharchive.lordlog.common.enums.ContactType;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MailService {


    private final JavaMailSender mailSender;
    @Value("${mail.admin-address}")
    private String adminAddress;

    public void sendMail(String subject, String content, String to_address) throws MessagingException {
        MimeMessage mimeMailMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);

        mimeMessageHelper.setTo(to_address);

        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);

        mailSender.send(mimeMailMessage);

    }

    /**
     * Contact 문의 메일. to_address는 admin으로 고정
     * */
    public void sendToAdminMail(String subject, String content, ContactType contactType) throws MessagingException {
        MimeMessage mimeMailMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);

        mimeMessageHelper.setTo(adminAddress);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);

        mailSender.send(mimeMailMessage);

    }
}
