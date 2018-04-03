package com.harium.graph.common;

import com.harium.graph.Node;
import com.harium.graph.WeightEdge;

public class IntegerEdge extends WeightEdge<Integer> implements Comparable<IntegerEdge> {

	public IntegerEdge(Node<Integer> origin, Node<Integer> destination) {
		super(origin, destination);
	}
	
	public IntegerEdge(Node<Integer> origin, Node<Integer> destination, int weight) {
		super(origin, destination);
		this.weight = weight;
	}

	@Override
	public int compareTo(IntegerEdge edge) {
		return weight-edge.weight;
	}
		
}
