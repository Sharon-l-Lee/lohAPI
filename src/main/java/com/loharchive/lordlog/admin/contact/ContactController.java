package com.loharchive.lordlog.admin.contact;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<ContactRegisterDto> createContact(@RequestBody ContactRegisterDto contact) {
        ContactRegisterDto result = contactService.createContact(contact);
        return ResponseEntity.ok(result);
    }

    @GetMapping
    public List<ContactRegisterDto> contactList(){
        return contactService.listAllContacts();
    }

}
