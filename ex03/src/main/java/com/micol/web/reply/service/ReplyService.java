package com.micol.web.reply.service;

import java.util.List;

public interface ReplyService {
	//��� ���, ����
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
	//��� ����(�� ��ȣ�� ��ȸ)
	List<ReplyVO> getRelyAll(int bNo);
}
