package com.manipal.dp.structural.decorator;

//1. convert blue shape decorator to general color decorator -> for border
//2. create another decorator FillColorShapeDecorator
//3. use enum


public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = new Circle();
		shape.draw();
		
		Shape blueCircle = new BlueShapeDecorator(shape);
		blueCircle.draw();
		
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
		blueRectangle.draw();
		
	}

}
