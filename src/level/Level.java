package level;
import java.awt.image.TileObserver;

import gfx.Screen;

public class Level {
	
	public int height;
	public int width;
	private byte[] tiles;
	
	public Level()
	{
		
	}
	
	public Level(int h, int w)
	{
		height = h;
		width = w;
		tiles = new byte[h * w];
		generateLevel();
	}
	
	public void renderTiles(Screen screen, int xOffset, int yOffset)
	{
		if(xOffset<=0)
		{
			xOffset = 0;
		}
		if(xOffset>(width*8 - screen.width))
		{
			xOffset = (width*8 - screen.width);
		}
		if(yOffset<=0)
		{
			yOffset = 0;
		}
		if(yOffset>(height*8 - screen.height))
		{
			yOffset = (height*8 - screen.height);
		}
		
		//screen.setOffset(xOffset, yOffset);
		
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
			{
				//getTile(x,y).render(screen, this, x*8, y*8);
			}
		}
		
	}

	private void generateLevel()
	{
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;j++)
			{
				//tiles[j+i*width] = Tile.GRASS.getID();
			}
		}
	}
	
	/*private Tile getTile(int x, int y)
	{
		if(x<0||x>width||y<0||y>height)
		{
			return Tile.VOID;
		}
		return Tile.tiles[tiles[x+y*width]];
	}*/

}
