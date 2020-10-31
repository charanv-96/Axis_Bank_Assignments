package com.manipal.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Line {

	private Point point1;
	private Point point2;

	@Autowired
	public Point getPoint1() {
		return point1;
	}

	@Autowired
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	@Autowired
	public Point getPoint2() {
		return point2;
	}

	@Autowired
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	@Autowired
	public Line(Point point1, Point point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}

	@Autowired
	public Line() {

	}

}
