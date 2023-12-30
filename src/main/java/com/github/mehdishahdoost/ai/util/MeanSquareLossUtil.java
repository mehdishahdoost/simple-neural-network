package com.github.mehdishahdoost.ai.util;

import java.util.List;

public class MeanSquareLossUtil {

    public static Double meanSquareLoss(List<Double> answers, List<Double> predictedAnswers) {
        double sumSquare = 0;
        for (int i = 0; i < answers.size(); i++) {
            double error = answers.get(i) - predictedAnswers.get(i);
            sumSquare += (error * error);
        }
        return sumSquare / answers.size();
    }

}
