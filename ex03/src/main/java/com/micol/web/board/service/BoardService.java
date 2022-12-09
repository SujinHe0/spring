package com.micol.web.board.service;

import java.util.List;

public interface BoardService {
	// 전체조회, 조건넣어서
	List<BoardVO> getBrdAll(BoardVO vo);

	// 단건조회
	BoardVO getBrd(String bno);

	// 건수조회, 전체조회랑 같은 조건으로
	int count(BoardVO vo);

	// 등록수정삭제
	int insertBrd(BoardVO vo);

	int deleteBrd(String bno);

	int updateBrd(BoardVO vo);

}
