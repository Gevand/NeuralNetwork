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
public class OutputLayer extends Layer {
    public OutputLayer initLayer(OutputLayer input) {
        for (int i = 0; i < input.getNeuronCount(); i++) {
            Neuron n = new Neuron();
            n.getOutputs().add(n.initNeuron());
            input.getNeurons().add(n);
        }
        return input;
    }

    public void print(OutputLayer input) {
        System.out.println("+++++++++ Output Layer +++++++++");
        int n = 1;
        for (Neuron neuron : input.getNeurons()) {
            System.out.println("Neuron #" + n + ":");
            System.out.println("Output Weights: ");
            System.out.println(Arrays.deepToString(neuron.getOutputs().toArray()));
            n++;
        }
    }
}
