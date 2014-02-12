package com.daenils.moisei.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/* This method loads the graphics for the non-background stuff (similarly like Background.java) such as the paddles or the ball. Since I'm not planning on having too many
 * assets, I won't make separate spritesheets neither in the code nor in the files. The few amount of assets I actually need for this project will probably be stored in separate
 * image files which will be processed as sprites here in this class. Those sprites can be than used in the Player method(s?) and with the ball.
 */

public class Sprite { 
	protected int width, height;
	private String path;
	protected int[] pixels;
	private boolean solid;
	
	// GAME ASSETS:
	public static Sprite paddle = new Sprite("/textures/paddle1.png", 10, 35);
	public static Sprite ball = new Sprite("/textures/ball.png", 10, 10);
	
	public Sprite(String path, int w, int h) {
		this.path = path;
		this.width = w;
		this.height = h;
		load();
		
	}
	
	public void update() {
		
	}

	private void load() {
		pixels = new int[width * height];
		try {
			BufferedImage image = ImageIO.read(Sprite.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
