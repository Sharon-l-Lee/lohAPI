package com.loharchive.lordlog.notification;


import com.loharchive.lordlog.common.enums.MailStatus;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String to_address;
    private String from_address;
    private String subject;
    private String content;
    @Enumerated(EnumType.STRING)
    private MailStatus status;
    private String error_message;

    @CreationTimestamp
    private LocalDateTime send_time;
}
