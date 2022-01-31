package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class  Reply {

    @Id//primary key
    @GeneratedValue(strategy =  GenerationType.IDENTITY)    //프로젝트에서 연결된 DB의 넘버링 전략을 따라감
    private int id; //sequence, auto_increment
    //비워도 자동 입력

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne
    @JoinColumn(name="boardId")
    private Board board;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;


    @CreationTimestamp  //시간이 자동으로 입력
    private Timestamp createDate;
}
