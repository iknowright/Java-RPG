package sprite;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Sprite {
  public String path;
  public int width;
  public int height;

  public int[] pixels;

  // constructor
  public Sprite(String path) {
    BufferedImage image = null;
    try {
      image = ImageIO.read(Sprite.class.getResourceAsStream(path));
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (image == null) {
      System.out.println("Image is null!");
      return;
    }
    // initialize
    this.path = path;
    this.height = image.getHeight();
    this.width = image.getWidth();

    // get rgb
    // pixels contains all hex number which represents the color 
    pixels = image.getRGB(0, 0, width, height, null, 0, width);
    for(int i=2000;i<3000;i++){
      System.out.println("The "+i+" pixel is: "+ String.format("0x%08X", pixels[i]));
    }
  }
}
