package com.micol.web.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;

@Component
public class BoardServiceImpl implements BoardService{

	@Autowired BoardMapper mapper;
	
	@Override
	public List<BoardVO> getBrdAll(BoardVO vo) {
		return mapper.getBrdAll(vo);
	}

	@Override
	public BoardVO getBrd(String bno) {
		return null;
	}

	@Override
	public int count(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertBrd(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBrd(String bno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBrd(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
