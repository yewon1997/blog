package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity     //table 화 시킴 ==>User class를 통해 자동으로 mysql에 table 생성

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class User {

    @Id//primary key
    @GeneratedValue(strategy =  GenerationType.IDENTITY)    //프로젝트에서 연결된 DB의 넘버링 전략을 따라감
    private int id; //sequence, auto_increment
    //비워도 자동 입력

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @ColumnDefault("'user'")
    private String role; //Enum을 써서 도메인 제작 가능 (어떤 범위 내 )   //admin, user, manage,

    @CreationTimestamp  //시간이 자동으로 입력
    private Timestamp createDate;
    //비워도 자동 입력
}
