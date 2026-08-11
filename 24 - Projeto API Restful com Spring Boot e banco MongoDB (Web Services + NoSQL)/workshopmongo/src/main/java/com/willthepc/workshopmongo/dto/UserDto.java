package com.willthepc.workshopmongo.dto;

import com.willthepc.workshopmongo.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;

    public UserDto() {
    }

    public UserDto(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }
}
