package com.daenils.moisei.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.daenils.moisei.Game;

public class Background {

	private String path;
	private int width;
	private int height;

	protected int[] pixels;

	public Background(String path) {
		this.path = path;
		this.width = Game.width; // temp values
		this.height = Game.height; // temp values
		load();
	}

	public void update() {

	}


	private void load() {
		pixels = new int[width * height];
		try {
			BufferedImage image = ImageIO.read(Background.class
					.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
