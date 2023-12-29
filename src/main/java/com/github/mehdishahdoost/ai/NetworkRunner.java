package com.github.mehdishahdoost.ai;

public class NetworkRunner {
    public static void main(String[] args) {
        Network network = new Network();
        double prediction = network.predicate(116, 67);
        System.out.println(prediction);
    }
}
