package com.micol.web.reply.mapper;

import java.util.List;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	
	//댓글 등록, 삭제
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
	//댓글보기 글번호검색
	List<ReplyVO> getRelyAll(int bNo);

}
