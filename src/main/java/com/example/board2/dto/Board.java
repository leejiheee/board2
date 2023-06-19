package com.example.board2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
	private int num;
	private String name;
	private String pwd;
	private String email;
	private String subject;
	private String content;
	private String ipAddr; //등록한 사람 ip주소
	private String created; //게시물 생성날짜
	private String hitCount; //조회수
}
