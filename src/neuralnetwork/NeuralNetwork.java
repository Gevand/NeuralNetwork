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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputLayer n = new InputLayer();
        n.setNeuronCount(2);
        n.initLayer(n);
        n.print(n);

        OutputLayer n2 = new OutputLayer();
        n2.setNeuronCount(1);
        n2.initLayer(n2);
        n2.print(n2);

        ArrayList<HiddenLayer> listOfHiddenLayer = new ArrayList<HiddenLayer>();
        for (int i = 0; i < 1; i++) {
            HiddenLayer hiddenLayer = new HiddenLayer();
            hiddenLayer.setNeuronCount(3);
            listOfHiddenLayer.add(hiddenLayer);
        }
        HiddenLayer h = new HiddenLayer();
        listOfHiddenLayer = h.initLayer(h, n, n2, listOfHiddenLayer);
        
        h.print(listOfHiddenLayer);
    }

}
