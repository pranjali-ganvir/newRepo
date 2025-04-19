package practiseCoreJava;
public class Encapsulation {
private String name="Heerp";
private int monNo;
private double salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMonNo() {
	return monNo;
}
public void setMonNo(int monNo) {
	this.monNo = monNo;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public static void main(String[] args) {
	Encapsulation e = new Encapsulation();
	e.setMonNo(777777);
	e.setName("Salman");
	e.setSalary(677990);
	System.out.println(e.getName());
	System.out.println(e.getSalary());
	System.out.println(e.getMonNo());
}
}