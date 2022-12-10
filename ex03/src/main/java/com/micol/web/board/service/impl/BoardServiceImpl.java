package com.micol.web.board.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;
import com.micol.web.common.Paging;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired BoardMapper mapper;
	
	@Override
	public BoardVO getBrd(String bno) {
		return mapper.getBrd(bno);
	}

	@Override
	public int count(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.count(vo);
	}

	@Override
	public int insertBrd(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.insertBrd(vo);
	}

	@Override
	public int deleteBrd(String bno) {
		// TODO Auto-generated method stub
		return mapper.deleteBrd(bno);
	}

	@Override
	public int updateBrd(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateBrd(vo);
	}

	@Override
	public List<BoardVO> getBrdAll(BoardVO vo, Paging paging) {
		// TODO Auto-generated method stub
		return mapper.getBrdAll(vo);
	}

}
