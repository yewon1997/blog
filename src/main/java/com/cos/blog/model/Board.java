package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity     //table 화 시킴 ==>User class를 통해 자동으로 mysql에 table 생성

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Board {

    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //프로젝트에서 연결된 DB의 넘버링 전략을 따라감
    private int id; //sequence, auto_increment
    //비워도 자동 입력

    @Column(nullable = false, length = 100)
    private String title;

    @Lob
    private String content;


    @ColumnDefault("0")
    private String count; //조회수

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "board", fetch= FetchType.EAGER)  //reply의 Board board 값을 대입
    //mappedBy 연관관계의 주인이 아니다. (난 Fk)가 아니에요
    private List<Reply> reply;

    @CreationTimestamp  //시간이 자동으로 입력
    private Timestamp createDate;
}