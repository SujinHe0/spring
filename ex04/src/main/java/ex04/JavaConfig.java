package ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration //이걸 설정파일로 쓰세용
public class JavaConfig {

	@Bean //자바로 컨테이너 빈 등록 @component 대신
	@Scope("prototype") //빈에 직접 싱글톤 등록과..같다
	@Lazy //호출될때 로딩하도록 함 (자주쓰지않는 필요할때만 사용해도되는 애들 걸어줌)
	public BoardService boardservice() {
		return new BoardServiceImpl();
	}
}
