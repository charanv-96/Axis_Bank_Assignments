package com.shape;

public class Rectangle implements Polygon {

	private float length;
	private float breadth;

	public Rectangle() {
	};

	public Rectangle(float length, float breadth) {

		this.breadth = breadth;
		this.length = length;

	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

		float area = length * breadth;

		System.out.println(area);

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub

		float perimeter = 2 * (length + breadth);

		System.out.println(perimeter);
	}

}