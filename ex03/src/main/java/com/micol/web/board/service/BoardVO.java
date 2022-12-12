package com.micol.web.board.service;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class BoardVO {
	String bNo;
	String title;
	String content;
	String writer;
	String regDate;
	String updateDate;
}
