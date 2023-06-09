package com.mywebapp.webapp;

import com.mywebapp.webapp.config.ContentCalendarProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		try {
			ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		} catch (Exception e) {
			e.printStackTrace();
		}


		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}


}
