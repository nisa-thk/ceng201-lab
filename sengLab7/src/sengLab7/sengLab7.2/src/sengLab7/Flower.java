package sengLab7;

public class Flower {
	 private String name;
	 private String color;
	 private double unitPrice;
	 
	 public Flower(String color, String name, double unitPrice) {
		 this.color = color;
		 this.name = name;
		 this.unitPrice = unitPrice;
	 }
	 
	 public String getColor() {
		 return  color;
	 }
	 public void setColor(String colour) {
		 this.color = color;		 
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public double getUnitPrice() {
		 return unitPrice;
	 }
	 public void setUnitPrice(double unitPrice) {
		 this.unitPrice = unitPrice;
	 }
}
