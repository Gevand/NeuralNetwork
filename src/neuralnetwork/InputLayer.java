/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import java.util.Arrays;

/**
 *
 * @author GBalayan
 */
public class InputLayer extends Layer {

    public InputLayer initLayer(InputLayer input) {
        for (int i = 0; i < input.getNeuronCount(); i++) {
            Neuron n = new Neuron();
            n.getWeights().add(n.initNeuron());
            input.getNeurons().add(n);
        }
        return input;
    }

    public void print(InputLayer input) {
        System.out.println("+++++++++ Input Layer +++++++++");
        int n = 1;
        for (Neuron neuron : input.getNeurons()) {
            System.out.println("Neuron #" + n + ":");
            System.out.println("Input Weights: ");
            System.out.println(Arrays.deepToString(neuron.getWeights().toArray()));
            n++;
        }
    }

}
