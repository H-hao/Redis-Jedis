package cn.hh.study.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于测试spring-boot是否能成功部署，此 main 类应该在 src/main 下
 * @author a
 * 
 */
@RestController
@EnableAutoConfiguration
public class SpringBootTest {

	@RequestMapping("/spring-boot/test")
	String name() {
		return "my name is Hh";
	}

	// 测试 spring boot 的部署
	// 在项目的根目录下运行命令：mvc spring-boot:run
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest.class, args);
	}

}
