package com.loharchive.lordlog.admin.contact;

import com.loharchive.lordlog.common.enums.ContactType;
import com.loharchive.lordlog.notification.MailService;
import jakarta.mail.MessagingException;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.InternalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private MailService mailService;

    public ContactRegisterDto createContact(ContactRegisterDto contactRegisterDto){
        log.debug("dto {}", contactRegisterDto.getType());
        String title = "[로드 아카이브] " + contactRegisterDto.getType().toString();
        Contact contactResult = contactRepository.save(contactRegisterDto.toEntity());
        try{
            mailService.sendToAdminMail(title, contactRegisterDto.getContents(), contactRegisterDto.getType());
        }catch(MailException | MessagingException e ){
            log.error("메일 전송 실패" + e.getMessage());
            throw new InternalException("메일 전송중 오류 발생");
        }


        return ContactRegisterDto.fromEntity(contactResult);
    }

    public List<ContactRegisterDto> listAllContacts(){

        return contactRepository.findAll()
                .stream()
                .map(Contact-> ContactRegisterDto.fromEntity(Contact))
                .collect(Collectors.toList());
    }

}
