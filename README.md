# simple-neural-network

Neural networks are inspired by the human brain structure, the basic idea being that a group of objects called neurons are combined into a network. Each neuron receives one or more inputs and a single output based on internal computation. 
Neural networks are therefore a specialized kind of directed graph.

Many neural networks distinguish between three layers of nodes: input, hidden, and output. The input layer has neurons that accept the raw input; the hidden layers modify that input; and the output layer produces the final result.
The process of moving data forward through the network is called **feedforward**.



### What is MSE (mean squared error), loss function or error function

The network needs a function that compares its predictions against the known good answers. This function is known as the error, or loss function. A common loss function is the mean squared error function.

Mean squared error (MSE) measures the amount of error in statistical models. . When a model has no error, the MSE equals zero. As model error increases, its value increases.


### Activation function  (sigmoid function)

The activation function is used to bring the output within an expected range. This is usually a kind of proportional compression function. The sigmoid function is common.

What an activation function like sigmoid does is bring the output value within -1 and 1



### Backpropagation

What makes the neural network powerful is its capacity to learn based on input. 
This happens by using a training data set with known results, comparing the predictions against it, 
then using that comparison to adjust the weights and biases in the neurons.


