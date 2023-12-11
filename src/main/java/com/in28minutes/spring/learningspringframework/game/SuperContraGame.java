package com.in28minutes.spring.learningspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
  
	public void up()
	{
		System.out.println("SuperContraGameup");
	}
	
	public void down()
	{
		System.out.println("SuperContraGamedown");
	}
	
	public void left()
	{
		System.out.println("SuperContraGameleft");
	}
	
	public void right()
	{
		System.out.println("SuperContraGameright");
	}
}
