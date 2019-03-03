package nn;

import java.util.concurrent.ThreadLocalRandom;

public class Neuron
	{
		double activationValue;
		private int numOfWeightsToPreviousLayer;
		private double[] weight = new double[numOfWeightsToPreviousLayer];

		private void initWeights()
			{

				for (int i = 0; i < weight.length; i++)
					{
						weight[i] = ThreadLocalRandom.current().nextDouble(0, 1);
					}
				System.out.println("numOfWeightsToPreviousLayer : " + numOfWeightsToPreviousLayer);

			}

		public double getActivationValue()
			{
				return activationValue;
			}

		public void setActivationValue(double activationValue)
			{
				this.activationValue = activationValue;
			}

		public Neuron(double activationValue, int inNumOfWeightsToPreviousLayer)
			{
				super();
				this.numOfWeightsToPreviousLayer = inNumOfWeightsToPreviousLayer;
				this.activationValue = activationValue;
//				System.out.println("Neuron created...");
				initWeights();
			}

	}
