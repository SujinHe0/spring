package com.micol.web.reply.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.micol.web.reply.mapper.ReplyMapper;
import com.micol.web.reply.service.ReplyService;
import com.micol.web.reply.service.ReplyVO;

public class ReplyServiceImpl implements ReplyService{

	@Autowired ReplyMapper mapper;
	
	@Override
	public int insertReply(ReplyVO vo) {
		// TODO Auto-generated method stub
		return mapper.insertReply(vo);
	}


	@Override
	public int deleteReply(int rno) {
		// TODO Auto-generated method stub
		return mapper.deleteReply(rno);
	}

	@Override
	public List<ReplyVO> getRelyAll(int bNo) {
		// TODO Auto-generated method stub
		return mapper.getRelyAll(bNo);
	}




}
