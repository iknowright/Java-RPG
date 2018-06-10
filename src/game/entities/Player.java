package game.entities;

import game.InputHandler;
import gfx.Colours;
import gfx.Screen;
import level.Level;

public class Player extends Mob{

	private InputHandler input;
	private int colour = Colours.get(-1, 111, 145, 543);
	
	public Player(Level level, int x, int y, InputHandler input) {
		super(level, "Player", x, y, 1);
		this.input = input;
	}
	
	
	
	public void tick() {
		
		int xa = 0;
		int ya = 0;
		// player moves
		if(input.up.getPressed())	ya--;
		if(input.down.getPressed())	ya++;
		if(input.right.getPressed())xa++;
		if(input.left.getPressed())	xa--;
		
		if(xa != 0 || ya != 0) {
			//System.out.println("condition is good!");
			move(xa, ya);
			isMoving = true;
		}
		else {
			//System.out.println("condition is not good!");
			isMoving = false;
		}
	}
	
	public void render(Screen screen) {
		int xTile = 0;
		int yTile = 28;
		
		int modifier = 8 * scale;
		int xOffset = x - modifier / 2;
		int yOffset = y - modifier / 2 - 4;
		
		screen.render(xOffset, yOffset, xTile + yTile * 32, colour);
		screen.render(xOffset + modifier, yOffset, xTile + (xTile+1)+yTile * 32, colour);
		screen.render(xOffset, yOffset + modifier, xTile + (yTile+1) * 32, colour);
		screen.render(xOffset + modifier, yOffset + modifier, (xTile+1) + (yTile+1) * 32, colour);		
	}
	
	public boolean hasCollided(int xa,int ya) {
		// the four corners of the player's collidor box
		int xMin=0;
		int xMax=10;
		int yMin=0;
		int yMax=18;
		// check 4 edges of the box
		for(int i=xMin;i<=xMax;i++) {
			if(isSolidTile(xa,ya,i,yMin))
				return true;
		}
		
		for(int i=xMin;i<=xMax;i++) {
			if(isSolidTile(xa,ya,i,yMax))
				return true;
		}
		
		for(int i=yMin;i<=yMax;i++) {
			if(isSolidTile(xa,ya,xMin,i))
				return true;
		}
		
		for(int i=yMin;i<=yMax;i++) {
			if(isSolidTile(xa,ya,xMax,i))
				return true;
		}
		return false;
	}

}
