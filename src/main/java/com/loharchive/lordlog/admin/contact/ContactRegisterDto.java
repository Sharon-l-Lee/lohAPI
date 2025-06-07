package com.loharchive.lordlog.admin.contact;

import com.loharchive.lordlog.common.enums.ContactType;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;


@Getter
@Setter
@Slf4j
public class ContactRegisterDto {

    private Long id;
    private String title;
    private ContactType type;
    private String contents;
    private String file_id;
    private Timestamp create_datetime;

    public Contact toEntity() {
        log.debug("type {}", this.type);
        return Contact.builder()
                .title(this.title)
                .contents(this.contents)
                .type(this.type)
                .file_id(this.file_id)
                .build();

    }

    public static ContactRegisterDto fromEntity(Contact contact){
        ContactRegisterDto regDto = new ContactRegisterDto();
        regDto.setId(contact.getId());
        regDto.setTitle(contact.getTitle());
        regDto.setType(contact.getType());
        regDto.setContents(contact.getContents());
        regDto.setFile_id(contact.getFile_id());
        regDto.setCreate_datetime(contact.getCreate_datetime());
        return regDto;

    }
}
