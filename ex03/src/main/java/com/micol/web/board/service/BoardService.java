package com.micol.web.board.service;

import java.util.List;

public interface BoardService {
	// ��ü��ȸ, ���ǳ־
	List<BoardVO> getBrdAll(BoardVO vo);

	// �ܰ���ȸ
	BoardVO getBrd(String bno);

	// �Ǽ���ȸ, ��ü��ȸ�� ���� ��������
	int count(BoardVO vo);

	// ��ϼ�������
	int insertBrd(BoardVO vo);

	int deleteBrd(String bno);

	int updateBrd(BoardVO vo);

}
