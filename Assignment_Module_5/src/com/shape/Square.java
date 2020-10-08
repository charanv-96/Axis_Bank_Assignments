package com.shape;

public class Square implements Polygon {

	private float side;

	public Square() {
	};

	public Square(float side) {
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

		float area = side * side;

		System.out.println(area);

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub

		float perimeter = 4 * side;

		System.out.println(perimeter);

	}

}
