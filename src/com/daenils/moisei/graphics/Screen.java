package com.daenils.moisei.graphics;

public class Screen {
	
	public int width, height;
	public int[] pixels;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void render() {
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++) {
				pixels[x + y * width] = 0xffff00; 
			}
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
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
}
