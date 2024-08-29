package io.bitcrafter.helloworldservice.neuralnetwork

class Neuron(private val weights: FloatArray, private val bias: Float, val activation: (Float) -> Float) {
    fun forward(inputs: FloatArray): Float {
        val sum = inputs.foldIndexed(0.0f) { i, acc, input ->
            acc + (input * weights[i])
        }
        return activation(sum + bias)
    }
}