package com.manipal.spring_core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.bean.Line;
import com.manipal.bean.Triangle;

public class ShapeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new FileSystemXmlApplicationContext("src\\main\\java\\beans.xml");

		Line line = container.getBean("line", Line.class);

		System.out.println(line.getPoint1().getX() + "," + line.getPoint1().getY() + "\t" + line.getPoint2().getX() + "," + line.getPoint2().getY());

		Triangle triangle = container.getBean("triangle", Triangle.class);

		System.out.println(triangle.getPoint1().getX() + "," + triangle.getPoint1().getY() + "\t" + triangle.getPoint2().getX() + "," + triangle.getPoint2().getY()+ "\t" + triangle.getPoint3().getX() + "," + triangle.getPoint3().getY());

	}

}
