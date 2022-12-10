package com.micol.web;

import java.util.List;

import org.apache.ibatis.session.SqlSession;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperClinet {
	
	@Autowired BoardMapper mapper;
	
//	@Test
	public void insertBrd() {
		BoardVO vo = new BoardVO();
		vo.setTitle("����");
		vo.setContent("����");
		vo.setWriter("����");
		int r =  mapper.insertBrd(vo);
		System.out.println(r + "���� ��ϵǾ����ϴ�.");
	}
	@Test 
	public void getBrdAll() {
		BoardVO vo = new BoardVO();
		List<BoardVO> list = mapper.getBrdAll(vo);
		list.forEach(brd -> log.info(brd));
	}
	
}
