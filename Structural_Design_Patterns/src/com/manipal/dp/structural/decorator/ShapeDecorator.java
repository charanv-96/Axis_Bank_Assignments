package com.manipal.dp.structural.decorator;

public abstract class ShapeDecorator implements Shape {
	
	Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		
		this.decoratedShape = decoratedShape;

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		decoratedShape.draw();
		
	}

}
