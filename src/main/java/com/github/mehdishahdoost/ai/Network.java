package com.github.mehdishahdoost.ai;

import java.util.Arrays;
import java.util.List;

public class Network {

    private List<Neuron> neuronList = Arrays.asList(new Neuron(), new Neuron(), new Neuron(),
                                                    new Neuron(), new Neuron(), new Neuron());

    // Feedforward
    public double predicate(Integer input1, Integer input2) {
        return neuronList.get(5).compute(
            neuronList.get(4).compute(
                neuronList.get(2).compute(input1, input2),
                neuronList.get(1).compute(input1, input2)
            ),
            neuronList.get(3).compute(
                neuronList.get(1).compute(input1, input2),
                neuronList.get(0).compute(input1, input2)
            )
        );
    }
}
