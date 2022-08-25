package com.cg.accesscontrol;

public class StaticBox {
	
	//Instance Variable
	double dblwidth;
	double dblength;
	double dbldepth;
	
	//Static Variable
	static int count;

	public StaticBox(double dblwidth, double dblength, double dbldepth) {
		super();
		this.dblwidth = dblwidth;
		this.dblength = dblength;
		this.dbldepth = dbldepth;
	}

	public StaticBox() {
		super();
		int cnt=0; // 
		cnt++;
		System.out.println(cnt);
		count++;
	}

	public double getDblwidth() {
		return dblwidth;
	}

	public void setDblwidth(double dblwidth) {
		this.dblwidth = dblwidth;
	}

	public double getDblength() {
		return dblength;
	}

	public void setDblength(double dblength) {
		this.dblength = dblength;
	}

	public double getDbldepth() {
		return dbldepth;
	}

	public void setDbldepth(double dbldepth) {
		this.dbldepth = dbldepth;
	}
	
	double calcVolume() {
		
		return dblwidth*dblength*dbldepth;
	}

	public static void main(String[] args) {
		
		StaticBox obj = new StaticBox();
		System.out.println(obj.calcVolume()); // 0
		StaticBox obj1 = new StaticBox(10,20,30);
		System.out.println(obj1.calcVolume()); // 6000
		System.out.println(StaticBox.count);
		
	}

}
