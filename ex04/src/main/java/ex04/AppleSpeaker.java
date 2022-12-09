package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component //의존성 부여
@Log4j
public class AppleSpeaker implements Speaker{

	@Override
	public void volumeup() {
		log.info("애플 스피커 볼륨업");
	}

}
