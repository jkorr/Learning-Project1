package com.daenils.moisei.entity;

import com.daenils.moisei.graphics.Screen;
import com.daenils.moisei.graphics.Sprite;
import com.daenils.moisei.entity.Entity;
import com.daenils.moisei.input.Keyboard;

public class Paddle extends Entity {

	private Keyboard input;
	
	public Paddle(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		sprite = Sprite.paddle;
	}
	
	public void update() {
		int ya = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		
		y += 3 * ya;
//		System.out.println(ya);
	}
	
	public void render(Screen screen) {
		screen.renderSprite(x, y, sprite);
	}

}
