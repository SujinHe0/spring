package com.micol.web;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.reply.mapper.ReplyMapper;
import com.micol.web.reply.service.ReplyVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyMapperClient {

	@Autowired ReplyMapper mapper;
	
//	@Test
	public void insertRep() {
		ReplyVO vo = new ReplyVO();
		vo.setBNo("11");
		vo.setReply("���");
		vo.setReplyer("�ۼ���");
		int r = mapper.insertReply(vo);
		log.info(r + "���� ��ϵǾ����ϴ�.");
	}
	
	@Test
	public void selectRep() {
		ReplyVO vo =  new ReplyVO();
		List<ReplyVO> list =  mapper.getRelyAll(5);
		list.forEach(reply -> log.info(reply));
	}
	
//	@Test
	public void deleteRep() {
		int r = mapper.deleteReply(15);
		log.info(r + "���� �����Ǿ����ϴ�.");
	}
	
}
