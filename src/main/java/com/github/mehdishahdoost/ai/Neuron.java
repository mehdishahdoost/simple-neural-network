package com.github.mehdishahdoost.ai;

import com.github.mehdishahdoost.ai.util.SigmoidUtil;
import java.util.Random;

/**
 * This Neuron class is a two-input neuron.
 */
public class Neuron {

    Random random = new Random();

    private double oldBias = random.nextDouble(-1, 1);
    private double bias = random.nextDouble(-1, 1);
    private double oldWeight1 = random.nextDouble(-1, 1);
    private double weight1 = random.nextDouble(-1, 1);
    private double oldWeight2 = random.nextDouble(-1, 1);
    private double weight2 = random.nextDouble(-1, 1);

    public double compute(double input1, double input2) {
        double preActivation = (input1 * weight1) + (input2 * weight2) + bias;
        return SigmoidUtil.sigmoid(preActivation);
    }

    public void mutate() {
        int propertyToChange = random.nextInt(1, 3);
        double changeFactor = random.nextDouble(-1, 1);

        if (propertyToChange == 1) {
            bias += changeFactor;
        } else if (propertyToChange == 2) {
            weight1 += changeFactor;
        } else if (propertyToChange == 3) {
            weight2 += changeFactor;
        }

    }

    public void remember() {
        oldBias = bias;
        oldWeight1 = weight1;
        oldWeight2 = weight2;
    }

    public void forget() {
        bias = oldBias;
        weight1 = oldWeight1;
        weight2 = oldWeight2;
    }

}
