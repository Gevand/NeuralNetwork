/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author GBalayan
 */
public class HiddenLayer extends Layer {
    public ArrayList<HiddenLayer> initLayer(HiddenLayer input, InputLayer inputLayer, OutputLayer outputLayer, ArrayList<HiddenLayer> hiddenLayers)
    {
        
        for(int i = 0; i < hiddenLayers.size(); i++)
        {
            for(int j = 0; j < hiddenLayers.get(i).getNeuronCount(); j++)
            {
                Neuron n = new Neuron();
                int inputCount = 0;
                int outputCount = 0;
                //middel hidden layers
                if(i > 0 && i < hiddenLayers.size() - 1)
                {
                    //input comes from the previous hidden layer
                    inputCount = hiddenLayers.get(i - 1).getNeuronCount();
                    //output comes from the next hidden layer
                    outputCount = hiddenLayers.get(i + 1).getNeuronCount();
                }
                //first hidden layers
                else if(i == 0)
                {
                    //if we are the first one, number of inputs is equal to the the input layer count
                    inputCount = inputLayer.getNeuronCount();
                    //if we have more than 1, output count is the next hidden layer's neuron count
                    if(hiddenLayers.size() > 1)
                    {
                        outputCount = hiddenLayers.get(i + 1).getNeuronCount();
                    }
                    else
                    {
                        outputCount = hiddenLayers.get(i).getNeuronCount();
                    }
                }
                //last hidden layer
                else
                {
                    inputCount = hiddenLayers.get(i - 1).getNeuronCount();
                    outputCount = hiddenLayers.get(i).getNeuronCount();
                }
                for(int k = 0; k < inputCount; k++)
                {
                    n.getWeights().add(n.initNeuron());
                }
                for(int k = 0; k < outputCount; k++)
                {
                    n.getOutputs().add(n.initNeuron());
                }
                hiddenLayers.get(i).getNeurons().add(n);
                
               
            }
        }
        return hiddenLayers;
    }
    
    public void print(ArrayList<HiddenLayer> input)
    {
        System.out.println("+++++++++ Hidden Layer +++++++++");
		int h = 1;
		for (HiddenLayer hiddenLayer : input) {
			System.out.println("Hidden Layer #" + h);
			int n = 1;
			for (Neuron neuron : hiddenLayer.getNeurons()) {
				System.out.println("Neuron #" + n);
				System.out.println("Input Weights:");
				System.out.println(Arrays.deepToString( neuron.getWeights().toArray() ));
				System.out.println("Output Weights:");
				System.out.println(Arrays.deepToString( neuron.getOutputs().toArray() ));
				n++;
			}
			h++;
		}
    }
}
