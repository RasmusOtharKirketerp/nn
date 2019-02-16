package nn;

import java.io.IOException;

public class NNMain
	{

		public static void main(String[] args) throws IOException
			{
				NNLayer firstLayer = new NNLayer();
				firstLayer.initLayer(28 * 28);

				BitMapLoader bmp = new BitMapLoader("2.bmp");
				bmp.loadBMPImage();

			}

	}
