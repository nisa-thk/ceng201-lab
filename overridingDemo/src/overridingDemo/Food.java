package overridingDemo;
public class Food {
protected String name;
protected double price;
	
	public Food(String name, double price){
		this.name = name;
		this.price = price;
	}
	public String getInfo(){
		return "Name: " + name + " Price: " + price +
				"TL";
	}
	public void describe() {
		System.out.println("This food is: " + getInfo());
	}
}
