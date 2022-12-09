package ex04;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@AllArgsConstructor //기본생성자는 없음
@NoArgsConstructor //기본생성자도 함께사용할때 사용


@Component // <bean id~어쩌고랑같다
@Log4j
public class SamsungTV implements TV {
	//삼성티비와 의존관계.. 인터페이스로 선언 : 의존관계 주입
	
//	@Setter (onMethod_ = {@Autowired} )
	@Autowired
	Speaker speaker;

	//롬복으로 넣어서,, property나,, con어쩌고로도 다 의존성주입가능
//	//기본생성자로 의존관계
//	public SamsungTV() {}
//	
//	public SamsungTV(Speaker speaker) { //만약에 인수가 두개면.. con어쩌고 두개넣어야함.
//		super();
//		this.speaker = speaker; 
//	}
//	//의존넣을때 셋을 이용해넣기
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
	
//	Logger log = LogManager.getLogger(SamsungTV.class);
	
	@Override
	public void on() {
		log.info("삼성티비 ON");
		speaker.volumeup();
	}


}
