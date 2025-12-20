package overridingDemo;

public class Dessert extends Food {
	private boolean containsSugar;
	public Dessert(String name, double price, boolean containsSugar){
		super(name,price);
		this.containsSugar = containsSugar;
	}
	@Override
	public void describe(){
	  super.describe();
	  if(containsSugar) {
	     System.out.println("The dessert contains sugar");
	  }else {
		System.out.println("not contains sugar");
	  }
    }
}
