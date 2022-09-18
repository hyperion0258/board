package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {

    @Id // PK를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA가 읽어서 처리해줌
    private Integer id;

    private String title;

    private String content;
}
