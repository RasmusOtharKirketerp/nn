package nn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BitMapLoader
	{

		private int[][] bitmapArray = new int[28][28];
		String BMPFileName;

		public BitMapLoader(String BMPFileName)
			{
				super();
				this.BMPFileName = BMPFileName;
			}

		public int getValue(int x, int y)
			{
				return bitmapArray[x][y];
			}

		public double getActivationValue(int x, int y)
			{
				return (this.getValue(x, y) / 100.0);

			}

		public void loadBMPImage() throws IOException
			{
				BufferedImage image = ImageIO.read(getClass().getResource(BMPFileName));

				for (int xPixel = 0; xPixel < image.getWidth(); xPixel++)
					{
						for (int yPixel = 0; yPixel < image.getHeight(); yPixel++)
							{
								int color = image.getRGB(xPixel, yPixel);
//								System.out.println(" " + color);

								if (color == Color.white.getRGB())
									{
										bitmapArray[xPixel][yPixel] = 0; // ?
//										System.out.println(" " + "white");
									}
								if (color == Color.gray.getRGB())
									{
										bitmapArray[xPixel][yPixel] = 50;
//										System.out.println(" " + "gray");
									}
								if (color == Color.darkGray.getRGB())
									{
										bitmapArray[xPixel][yPixel] = 75;
//										System.out.println(" " + "darkgray");
									}
								if (color == Color.black.getRGB())
									{
										bitmapArray[xPixel][yPixel] = 100;
//										System.out.println(" " + "black");
									}
							}
					}
				System.out.println("Black     : " + Color.BLACK.getRGB());
				System.out.println("Dark Gray : " + Color.DARK_GRAY.getRGB());
				System.out.println("Gray      : " + Color.gray.getRGB());
				System.out.println("White     : " + Color.white.getRGB());

				System.out.println("type : " + image.getType());
				System.out.println("color model  : " + image.getColorModel());
			}
	}
