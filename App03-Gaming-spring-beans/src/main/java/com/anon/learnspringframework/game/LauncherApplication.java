package com.anon.learnspringframework.game;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anon.learnspringframework.game.GameRunner;
import com.anon.learnspringframework.game.GamingConsole;
import com.anon.learnspringframework.game.MarioGame;
import com.anon.learnspringframework.game.PacmanGame;
import com.anon.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anon.learnspringframework.game.GameRunner;
import com.anon.learnspringframework.game.GamingConsole;
import com.anon.learnspringframework.game.PacmanGame;


@Configuration
@ComponentScan("com.anon.learnspringframework.game")
public class LauncherApplication {
	

	public static void main(String[] args) {
		
		try(var context	= new AnnotationConfigApplicationContext(LauncherApplication.class)){
			
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}