package com.github.mehdishahdoost.ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkRunner {
    public static void main(String[] args) {
        Network network = new Network();


        List<List<Integer>> data = new ArrayList<>();
        data.add(Arrays.asList(115, 66));
        data.add(Arrays.asList(175, 78));
        data.add(Arrays.asList(205, 72));
        data.add(Arrays.asList(120, 67));
        List<Double> answers = Arrays.asList(1.0,0.0,0.0,1.0);

        network.train(data, answers);


        double prediction = network.predicate(167, 73);
        System.out.println(prediction);
    }
}
