/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author GBalayan
 */
public class Neuron {

    private ArrayList<Double> weights = new ArrayList<Double>();
    private ArrayList<Double> outputs = new ArrayList<Double>();

    public double initNeuron() {
        double randomNumber = 0;
        Random rand = new Random();
        randomNumber = rand.nextDouble();
        return randomNumber;
    }
    public void setWeights(ArrayList<Double> input)
    {
        weights = input;
    }
    public void setOutputs(ArrayList<Double> input)
    {
        outputs = input;
    }
    public ArrayList<Double> getWeights()
    {
        return weights;
    }
    public ArrayList<Double> getOutputs()
    {
        return outputs;
    }

}
