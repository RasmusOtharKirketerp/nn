package nn;

import java.util.ArrayList;

public class NNLayer
	{

		private ArrayList<Neuron> layers = new ArrayList<Neuron>();

		public void initLayer(int size, int inNumOfWeightsToPreviousLayer)
			{
				layers.removeAll(layers);
				for (int i = 1; i <= size; i++)
					{
						Neuron newNeuron = new Neuron(0, inNumOfWeightsToPreviousLayer);
						layers.add(newNeuron);
						System.out.println("Added..." + i);
					}
				System.out.println("Layer created : " + layers.size());
			}

		public void setActivationForNeuron(int pos, double newValue)
			{
				layers.get(pos).setActivationValue(newValue);

			}

	}
