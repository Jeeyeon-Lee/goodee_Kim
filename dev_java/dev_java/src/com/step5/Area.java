package com.step5;

class Rectangle{
	//가로 * 세로
	double area(int width, int height) {
		return width*height;
	}
}
class Circle{
	final double PI = 3.14;
	//반지름*반지름*3.14
	double area(double r) {
		return r*r*PI;
	}
}

public class Area {
	final double PI = 3.14;
	//반지름*반지름*3.14
	double area(double r) {
		return r*r*PI;
	}
	//가로 * 세로
	double area(int width, int height) {
		return width*height;
	}
	public static void main(String[] args) {
		Area a = new Area();
		a.area(3.5);//원의 면적을 구한다
		a.area(3,5);//사각형의 면적

	}

}
