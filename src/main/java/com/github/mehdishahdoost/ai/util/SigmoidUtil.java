package com.github.mehdishahdoost.ai.util;

public class SigmoidUtil {

    public static double sigmoid(double in) {
        return 1 / (1 + Math.exp(-in));
    }

}
