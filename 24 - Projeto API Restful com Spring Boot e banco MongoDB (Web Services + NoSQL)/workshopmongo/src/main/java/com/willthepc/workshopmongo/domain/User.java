package com.willthepc.workshopmongo.domain;

import lombok.*;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    @Getter
    @Setter
    @NoArgsConstructor
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @Document(collection = "user")
    public class User implements Serializable {
        private static final long serialVersionUID = 1L;

        @EqualsAndHashCode.Include
        @Id
        private String id;
        private String name;
        private String email;

        @DBRef(lazy = true)
        private List<Post> post = new ArrayList<>();

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
