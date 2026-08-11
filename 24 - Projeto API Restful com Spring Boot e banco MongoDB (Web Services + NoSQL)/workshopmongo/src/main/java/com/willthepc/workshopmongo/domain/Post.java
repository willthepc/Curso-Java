package com.willthepc.workshopmongo.domain;

import com.willthepc.workshopmongo.dto.AuthorDto;
import com.willthepc.workshopmongo.dto.CommentDto;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Document
@Getter
@Setter
@EqualsAndHashCode
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDto author;
    private List<CommentDto> comments = new ArrayList<>();

    public Post(String id, Date date, String title,  String body, AuthorDto author) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.body = body;
        this.author = author;
    }
}
