package com.in28minutes.spring.learningspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
	  
		public void up()
		{
			System.out.println("PacManGameup");
		}
		
		public void down()
		{
			System.out.println("PacManGamedown");
		}
		
		public void left()
		{
			System.out.println("PacManGameleft");
		}
		
		public void right()
		{
			System.out.println("PacManGameright");
		}
	}
