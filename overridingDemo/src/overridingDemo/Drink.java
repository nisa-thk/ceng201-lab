package overridingDemo;

public class Drink extends Food{
	private boolean cold;
	public Drink(String name, double price, boolean cold){
		super(name, price);
		this.cold = cold;
	}
	@Override
	public void describe(){
		System.out.println("The drink is : " + getInfo());
		if(cold) {
			System.out.println("it's cold");
		}else {
			System.out.println("it's not cold");
		}
	}
}
