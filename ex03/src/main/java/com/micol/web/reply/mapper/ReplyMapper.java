package com.micol.web.reply.mapper;

import java.util.List;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	
	//��� ���, ����
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
	//��ۺ��� �۹�ȣ�˻�
	List<ReplyVO> getRelyAll(int bNo);

}
