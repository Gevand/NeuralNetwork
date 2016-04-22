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
public class NeuralNetwork {

    public InputLayer inLayer;
    public OutputLayer outLayer;
    public HiddenLayer hiddenLayer;
    public ArrayList<HiddenLayer> listOfHiddenLayer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //build a Neural Network (input layer, hidden layers and output layer)
        NeuralNetwork n = new NeuralNetwork();
        n.inLayer = new InputLayer();
        n.inLayer.setNeuronCount(2);
        n.inLayer.initLayer(n.inLayer);
        n.inLayer.print(n.inLayer);

        n.outLayer = new OutputLayer();
        n.outLayer.setNeuronCount(1);
        n.outLayer.initLayer(n.outLayer);
        n.outLayer.print(n.outLayer);

        n.listOfHiddenLayer = new ArrayList<HiddenLayer>();
        for (int i = 0; i < 1; i++) {
            HiddenLayer hiddenLayer = new HiddenLayer();
            hiddenLayer.setNeuronCount(3);
            n.listOfHiddenLayer.add(hiddenLayer);
        }
        n.hiddenLayer = new HiddenLayer();
        n.listOfHiddenLayer = n.hiddenLayer.initLayer(n.hiddenLayer, n.inLayer, n.outLayer, n.listOfHiddenLayer);
        n.hiddenLayer.print(n.listOfHiddenLayer);
        //train the neural network
        
        
    }

}
