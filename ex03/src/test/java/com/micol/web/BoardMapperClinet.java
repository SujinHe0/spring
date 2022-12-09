package com.micol.web;

import org.apache.ibatis.session.SqlSession;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperClinet {
	
	@Autowired BoardMapper mapper;
	
	@Test
	public void insertBrd() {
		BoardVO vo = new BoardVO();
		vo.setTitle("하이");
		vo.setContent("덜덜");
		vo.setWriter("ㅎㅎ");
		int r =  mapper.insertBrd(vo);
		System.out.println(r + "건이 등록되었습니다.");
	}
	
}
