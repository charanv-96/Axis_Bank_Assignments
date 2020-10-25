package com.manipal.dp.structural.decorator;

public class BlueShapeDecorator extends ShapeDecorator{

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		
		this.decoratedShape.draw();
		setBlueBorder(decoratedShape);
		
	}
	
	public void setBlueBorder(Shape decoratedShape) {
		System.out.println("Shape Border color : Blue");
	}
	

}
