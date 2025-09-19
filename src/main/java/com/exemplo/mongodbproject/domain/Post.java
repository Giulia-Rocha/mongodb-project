package com.exemplo.mongodbproject.domain;

import com.exemplo.mongodbproject.dto.AuthorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;
import java.util.Date;
@Document
@Data
@AllArgsConstructor
public class Post implements Serializable {
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;


}
