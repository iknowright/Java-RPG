package level;
import java.awt.image.TileObserver;

import gfx.Screen;
import level.tiles.Tile;


public class Level {
	
	public int height;
	public int width;
	private byte[] tiles;
	
	public Level(int height, int width)
	{
		tiles = new byte[height * width];
		this.height = height;
		this.width = width;
		this.generateLevel();
	}
	
	public void renderTiles(Screen screen, double xOffset, double yOffset){
		if(xOffset<=0)	xOffset = 0;
		if(xOffset>((width<<3) - screen.width))	xOffset = ((width<<3) - screen.width);
		if(yOffset<=0)	yOffset = 0;
		if(yOffset>((height<<3) - screen.height))	yOffset = ((height<<3) - screen.height);
		
		
		screen.setOffset(xOffset, yOffset);
		
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
			{
				getTile(x,y).render(screen, this, x<<3, y<<3);
			}
		}
		
	}

	private void generateLevel()
	{
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;j++)
			{
				if(j * i % 10 < 5) {
					tiles[j+i*width] = Tile.GRASS.getID();
				}
				else {
					tiles[j+i*width] = Tile.STONE.getID();
				}
			}
		}
	}
	
	private Tile getTile(int x, int y)
	{
		if(x<0||x>width||y<0||y>height)	return Tile.VOID;		
		return Tile.tiles[tiles[x+y*width]];
	}

	public void tick() {
		
	}
}
