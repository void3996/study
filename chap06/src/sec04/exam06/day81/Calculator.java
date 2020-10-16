package sec04.exam06.day81;
//메소드 오버로딩
public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	//메소드 오버로딩이 필요한 이유는 매개값을 다양하게 받아 처리할 수 있도록 하기 위함
}
