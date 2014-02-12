package com.daenils.moisei.graphics;

public class Screen {

	public int width, height;
	public int[] pixels;

	private Background bg0 = new Background("/textures/backgrounds/bg0.png");

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}

	public void render() {
		renderBackground(bg0);


		// for (int y = 0; y < height; y++)
		// for (int x = 0; x < width; x++) {
		// pixels[x + y * width] = 0xffff00;
		// }
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++)
			pixels[i] = 0;
	}

	public void renderBackground(Background background) {
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				pixels[x + y * width] = background.pixels[x + y * width];
	}

	public void renderSprite(int xp, int yp, Sprite sprite) {
		for (int y = 0; y < sprite.height; y++) {
			int ya = y + yp;
			for (int x = 0; x < sprite.width; x++) {
				int xa = x + xp;
				int col = 0xffff00ff;
				if (sprite.pixels[x + y * sprite.width] != col)
				pixels[xa + ya * width] = sprite.pixels[x + y * sprite.width];
			}
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
