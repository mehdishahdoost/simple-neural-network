package com.github.mehdishahdoost.ai;

import com.github.mehdishahdoost.ai.util.MeanSquareLossUtil;
import java.util.ArrayList;
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

    public void train(List<List<Integer>> data, List<Double> answers) {
        Double bestEpochLoss = null;
        for (int epoch = 0; epoch < 1000; epoch++) {
            Neuron neuron = neuronList.get(epoch % 6);
            neuron.mutate();
            List<Double> predictions = new ArrayList<Double>();
            for (int i = 0; i < data.size(); i++) {
                predictions.add(i, predicate(data.get(i).get(0), data.get(i).get(1)));
            }
            Double epochLoss = MeanSquareLossUtil.meanSquareLoss(answers, predictions);
            if (bestEpochLoss == null) {
                bestEpochLoss = epochLoss;
                neuron.remember();
            } else {
                if (epochLoss < bestEpochLoss) {
                    bestEpochLoss = epochLoss;
                    neuron.remember();
                } else {
                    neuron.forget();
                }
            }

        }
    }

}
