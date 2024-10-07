package org.example.ishonproject.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private Integer userId;
    private String firstname;
    private String lastname;

}
