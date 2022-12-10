package com.micol.web.board.service;

import java.util.List;

import com.micol.web.common.Paging;

public interface BoardService {
	//전체 게시물 조회
	List<BoardVO> getBrdAll(BoardVO vo, Paging paging);

	// 글번호로 게시물 조회
	BoardVO getBrd(String bno);

	//전체 글 갯수
	int count(BoardVO vo);

	// 등록 삭제 수정
	int insertBrd(BoardVO vo);

	int deleteBrd(String bno);

	int updateBrd(BoardVO vo);

}
