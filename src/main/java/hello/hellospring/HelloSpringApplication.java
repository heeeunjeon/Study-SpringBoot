package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		// 이 메인 메소드를 실행하면 HelloSpringApplication.class를 run(실행)함
		// 저 함수를 띄우면서 내장된 톰캣 웹서버를 자체적으로 띄우면서 스프링부트가 같이 올라감

	}

}
