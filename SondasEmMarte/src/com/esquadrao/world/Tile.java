package com.esquadrao.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.esquadrao.main.Testesondas;
import com.esquadrao.world.Camera;
import com.esquadrao.main.Testesondas;;

public class Tile {
	
	public static BufferedImage TILE_FLOOR = Testesondas.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage TILE_WALL = Testesondas.spritesheet.getSprite(16,0,16,16);
	
	private BufferedImage sprite;
	private int x,y;
	
	public Tile(int x,int y,BufferedImage sprite){
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}

	public void render(Graphics g){
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
	}
	
}