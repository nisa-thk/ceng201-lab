package overridingDemo;
public class MainDish extends Food {
	private boolean spicy;
	
	public MainDish(String name,double price,boolean spicy) {
		super(name, price);
		this.spicy = spicy;
	}
	@Override
	public void describe(){
		super.describe(); //super describe aslında alttaki infoyla aynı
		System.out.println("Main dish: " + getInfo());
		if(spicy) {
		   System.out.println("This dish is spicy");
	    }else {
	    	System.out.println("not spicy");
	    }
    }
}
