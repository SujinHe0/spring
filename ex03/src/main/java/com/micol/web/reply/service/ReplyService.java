package com.micol.web.reply.service;

import java.util.List;

public interface ReplyService {
	//댓글 등록, 삭제
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
	//댓글 보기(글 번호로 조회)
	List<ReplyVO> getRelyAll(int bNo);
}
