package game.entities;

import game.InputHandler;
import gfx.Screen;
import level.Level;

public class Player extends Mob{

	private InputHandler input;
	public Player(Level level, int x, int y, InputHandler input) {
		super(level, "Player", x, y, 1);
		this.input = input;
	}
	
	public boolean hasCollided(int xa, int ya) {
		return false;
	}
	
	public void tick() {
		int xa = 0;
		int ya = 0;
		
		if(input.up.getPressed())	y--;
		if(input.down.getPressed())	y++;
		if(input.right.getPressed())x++;
		if(input.left.getPressed())	x--;
		
		if(xa != 0 || ya != 0) {
			move(xa, ya);
			isMoving = true;
		}
		else {
			isMoving = false;
		}
	}
	
	public void render(Screen screen) {
		
		
	}

}
