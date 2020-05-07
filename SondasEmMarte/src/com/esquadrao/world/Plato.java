package com.esquadrao.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

import com.esquadrao.main.Testesondas;
import com.esquadrao.main.Testesondas;
import com.esquadrao.world.Camera;
import com.esquadrao.world.Tile;

public class Plato {

	public static Tile[] tiles;
	public static int WIDTH,HEIGHT;
	public static final int TILE_SIZE = 16;
	Scanner scan = new Scanner(System.in);
	
	public void definir_tamanho(){
		System.out.println("Digite a largura do platô: ");
		WIDTH = scan.nextInt();
		System.out.println("Digite a Altura do platô: ");
		HEIGHT = scan.nextInt();
	}
	
	public Plato() {
		definir_tamanho();
		tiles = new Tile[WIDTH*HEIGHT];
		for(int xx = 0; xx < WIDTH; xx++) {
			for(int yy = 0; yy < HEIGHT; yy++) {
				if(yy == HEIGHT - 1 || xx == WIDTH - 1 || xx == 0 || yy == 0) {
					tiles[xx+yy*WIDTH] = new WallTile(xx*16,yy*16,Tile.TILE_WALL);
					
				}else {
					tiles[xx+yy*WIDTH] = new FloorTile(xx*16,yy*16,Tile.TILE_FLOOR);
				}
			}
		}
	}
	
	public static boolean isFree(int xnext,int ynext){
		
		int x1 = xnext / TILE_SIZE;
		int y1 = ynext / TILE_SIZE;
		
		int x2 = (xnext+TILE_SIZE-1) / TILE_SIZE;
		int y2 = ynext / TILE_SIZE;
		
		int x3 = xnext / TILE_SIZE;
		int y3 = (ynext+TILE_SIZE-1) / TILE_SIZE;
		
		int x4 = (xnext+TILE_SIZE-1) / TILE_SIZE;
		int y4 = (ynext+TILE_SIZE-1) / TILE_SIZE;
		
		return !((tiles[x1 + (y1*Plato.WIDTH)] instanceof WallTile) ||
				(tiles[x2 + (y2*Plato.WIDTH)] instanceof WallTile) ||
				(tiles[x3 + (y3*Plato.WIDTH)] instanceof WallTile) ||
				(tiles[x4 + (y4*Plato.WIDTH)] instanceof WallTile));
	}
	
	public static void restartGame(){
		return;
	}
	
	public void render(Graphics g){
		int xstart = Camera.x >> 4;
		int ystart = Camera.y >> 4;
		
		int xfinal = xstart + (Testesondas.WIDTH >> 4);
		int yfinal = ystart + (Testesondas.HEIGHT >> 4);
		
		for(int xx = xstart; xx <= xfinal; xx++) {
			for(int yy = ystart; yy <= yfinal; yy++) {
				if(xx < 0 || yy < 0 || xx >= WIDTH || yy >= HEIGHT)
					continue;
				Tile tile = tiles[xx + (yy*WIDTH)];
				tile.render(g);
			}
		}
	}
}