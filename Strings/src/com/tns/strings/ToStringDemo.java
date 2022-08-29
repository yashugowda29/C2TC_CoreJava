package com.tns.strings;

class Box {
	double height;
	double depth;
	double width;
	
	public Box(double height, double depth, double width) {
		
		this.height = height;
		this.depth = depth;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Box [height=" + height + ", depth=" + depth + ", width=" + width + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		
		Box b = new Box(10,20,30);
		String str = "String:" + b;
		System.out.println(b);
		System.out.println(str);
//		System.out.println(b.width);
//		System.out.println(b.depth);
//		System.out.println(b.height);

	}

}
