package com.in28minutes.spring.learningspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learningspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learningspringframework.game.GameRunner;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {

		// MarioGame game=new MarioGame();
		// SuperContraGame game=new SuperContraGame();
		// PacManGame game=new PacManGame();
		// GamingConsole game=new MarioGame();
		// GameRunner runner=new Ga meRunner(game);

		ConfigurableApplicationContext context = SpringApplication.run(LearningSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());

	}

}
