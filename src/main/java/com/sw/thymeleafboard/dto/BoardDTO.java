package com.sw.thymeleafboard.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "board")
@Getter
@Setter
public class BoardDTO {

    @Id
    private int boardId;       // 게시판 아이디
    private String title;      // 제목
    private String content;    // 내용
    private LocalDate createdDate;  // 작성일
    private String author;     // 작성자
    private int viewCount;     // 조회수
}
