package com.github.mehdishahdoost.ai;

import com.github.mehdishahdoost.ai.util.SigmoidUtil;

/**
 * This Neuron class is a two-input neuron.
 */
public class Neuron {

    private double bias;
    private double weight1;
    private double weight2;

    public double compute(double input1, double input2) {
        double preActivation = (input1 * weight1) + (input2 * weight2) + bias;
        return SigmoidUtil.sigmoid(preActivation);
    }
}
