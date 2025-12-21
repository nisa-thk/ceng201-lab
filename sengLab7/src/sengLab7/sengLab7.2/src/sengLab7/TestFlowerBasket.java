package sengLab7;

public class TestFlowerBasket {
	public static void main (String [] args) {
		Flower f = new Flower("pink","Rose", 1.5);
		Boquet b = new Boquet("Valentine's Day",f ,13);
		System.out.println("Cost of the bouqet is: " + b.getCost());
	}
}
