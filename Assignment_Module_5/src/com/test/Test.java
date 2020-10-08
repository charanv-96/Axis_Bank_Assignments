package com.test;

import com.shape.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s = new Square(4);

		s.calcArea();
		s.calcPeri();

		Rectangle r = new Rectangle(2, 4);

		r.calcArea();
		r.calcPeri();

	}

}
