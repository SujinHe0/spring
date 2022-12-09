package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
//@Component
//빈등록 어노테이션
///불림당해서 사용할 때.. 객체로 불려서 사용될때?
//컨테이너에 등록할 때 
public class BoardServiceImpl implements BoardService{

	@Override
	public int boardInsert() {
		log.info("보드 등록완료");
		return 0;
	}

}
