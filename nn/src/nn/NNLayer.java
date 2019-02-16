package nn;

import java.util.ArrayList;

public class NNLayer
	{

		private ArrayList<Neuron> layers = new ArrayList<Neuron>();

		public void initLayer(int size)
			{
				layers.removeAll(layers);
				for (int i = 1; i <= size; i++)
					{
						Neuron newNeuron = new Neuron(0);
						layers.add(newNeuron);
						System.out.println("Added..." + i);
					}
				System.out.println("Layer created : " + layers.size());
			}

	}
