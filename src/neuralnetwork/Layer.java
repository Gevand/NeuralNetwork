/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import java.util.ArrayList;

/**
 *
 * @author GBalayan
 */
public class Layer {

    private ArrayList<Neuron> neurons = new ArrayList<Neuron>();
    private int neuronCount;
    public ArrayList<Neuron> getNeurons()
    {
        return neurons;
    }
    public void setNeurons(ArrayList<Neuron> inputs)
    {
        neurons = inputs;
    }
    public int getNeuronCount()
    {
        return neuronCount;
    }
    public void setNeuronCount(int input)
    {
        neuronCount = input;
    }
    
}
