package com.willthepc.workshopmongo.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CommentDto {
    private String text;
    private Date date;
    private AuthorDto author;


}
