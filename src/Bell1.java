import java.util.ArrayList;
import java.util.List;

public class Bell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> cars = new ArrayList<>();
		//Car newCar = new Car(); //move inside for loop
		for(int i=0; i<6; i++) //for(int i=0; i<5; i++) -> i<6
		{
			Car newCar = new Car();//Here!
			newCar.length = i;
			newCar.color = newCar.colors[i];
			cars.add(newCar);
		}
		for(Car car : cars) 
		{
			car.show();
		}
	}
	//public class Car -> add 'static'
	public static class Car {
		String[] colors = new String[] {"green", "orange", "red", "pink", "yellow", "white"};
		public Car() {}
		public Car (int length, String color) {
			this.length = length;
			this.color = color;
		}
		private int length = 0;
		private String color = "black";
		public void show() 
		{
			System.out.println(length + " " +color);
		}
		public int getLength() {return length;}
		public void setLength(int length) {this.length = length;}
		public String getColor() {return color;}
		public void setColor(String color) {this.color = color;}
	}

}
