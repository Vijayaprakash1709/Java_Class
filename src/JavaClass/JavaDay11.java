package JavaClass;
import java.util.*;

	//--------------------Single Inheritance-----------------

//class Parent {
//	void Car(){
//		System.out.println("Car is running");
//	}
//	void Tv(){
//		System.out.println("Tv is working");
//	}
//}
//class Child extends Parent{
//	void Phone(){
//		System.out.println("Phone");
//	}
//}
//public class JavaDay11 {
//
//	public static void main(String[] args) {
//		Child c=new Child();
//		c.Phone();
//		c.Tv();
//		c.Car();
//		
//	}
//
//}

	//--------------Multilevel Inheritance---------------

//class GrandFather{
//	void Cycle() {
//		System.out.println("Cycle Method");
//	}
//	void Telephone() {
//		System.out.println("Telephone ");
//	}
//}
//
//class Parent extends GrandFather{
//	void Bike(){
//		System.out.println("Bike is running");
//	}
//	void Mobile(){
//		System.out.println("Mobile is working");
//	}
//	void Land(){
//		System.out.println(" 2 Land");
//	}
//}
//class Child extends Parent{
//	void Car(){
//		System.out.println("Car");
//	}
//	void Apple() {
//		System.out.println("Iphone");
//	}
//}
//public class JavaDay11 {
//
//	public static void main(String[] args) {
//		Child c=new Child();
//		c.Cycle();
//		c.Telephone();
//		c.Bike();
//		c.Land();
//		c.Apple();
//		c.Car();
//		
//	}
//
//}

	//-----------------Heirarchical Inheritance-----------



//class Parent{
//	void Amount(){
//		System.out.print("Amount ");
//	}
//	void Home(){
//		System.out.print("Home ");
//	}
//	void Land(){
//		System.out.print("2_Land ");
//	}
//}
//class Brother extends Parent{
//	void Car(){
//		System.out.print("Car ");
//	}
//	void Bike() {
//		System.out.print("Bike ");
//	}
//}
//class Sister extends Parent{
//	void Cycle(){
//		System.out.print("Cycle ");
//	}
//	void Laptop() {
//		System.out.print("Laptop ");
//	}
//}
//public class JavaDay11 {
//
//	public static void main(String[] args) {
//		System.out.println("Sister Inherited Objects :");
//		Sister s=new Sister();
//		s.Laptop();
//		s.Cycle();
//		s.Land();
//		s.Amount();
//		s.Home();
//		System.out.println();
//		System.out.println("Brother Inherited Objects :");
//		Brother b=new Brother();
//		b.Car();
//		b.Bike();
//		b.Land();
//		b.Amount();
//		b.Home();
//		
//	}
//
//}

	//---------------------

class gb{
	void property() {
		System.out.println("Property");
	}
}
class Parent extends gb{
	void Amount(){
		System.out.print("Amount ");
	}
	void Home(){
		System.out.print("Home ");
	}
	void Land(){
		System.out.print("2_Land ");
	}
}
class Brother extends Parent{
	void Car(){
		System.out.print("Car ");
	}
	void Bike() {
		System.out.print("Bike ");
	}
}
class Sister extends Parent{
	void Cycle(){
		System.out.print("Cycle ");
	}
	void Laptop() {
		System.out.print("Laptop ");
	}
}

public class JavaDay11 {

	public static void main(String[] args) {
		System.out.println("Sister Inherited Objects :");
		Sister s=new Sister();
		s.Laptop();
		s.Cycle();
		s.Land();
		s.Amount();
		s.Home();
		s.property();
		System.out.println();
		System.out.println("Brother Inherited Objects :");
		Brother b=new Brother();
		b.Car();
		b.Bike();
		b.Land();
		b.Amount();
		b.Home();
		b.property();
		
	}

}

