package com.cos.blog.test;

import lombok.*;

//@Getter
//@Setter
//Data = Getter + Setter
@Data
//@AllArgsConstructor
@NoArgsConstructor
// @RequiredArgsConstructor        //final 사용시 적용
public class Member {

    private int id;
    private String username;
    private String password;
    private String email;

    @Builder        //객체 생성시, 연속되는 시퀀스를 적용하기 위해
    public Member(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}


