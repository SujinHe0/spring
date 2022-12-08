package com.micol.web.board;

import lombok.Data;

@Data
public class BoardVO {
	String bNo;
	String title;
	String content;
	String writer;
	String regDate;
	String updateDate;
}
