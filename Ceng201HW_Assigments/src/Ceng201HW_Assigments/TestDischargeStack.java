package Ceng201HW_Assigments;

public class TestDischargeStack {
	  public static void main(String[] args){
	      DischargeStack stack = new DischargeStack();
	      //Add 5 discharge records
	      stack.push(new DischargeRecord(362584205, System.currentTimeMillis()));
	      stack.push(new DischargeRecord(362584298, System.currentTimeMillis()));
	      stack.push(new DischargeRecord(362584216, System.currentTimeMillis()));
	      stack.push(new DischargeRecord(362584395, System.currentTimeMillis()));
	      stack.push(new DischargeRecord(362581854, System.currentTimeMillis()));
	      stack.printStack();
	      System.out.println("----------------------");
	      //Pop 2 of them
	      DischargeRecord p1 = stack.pop();
	      System.out.println("Popped: " + p1);
	      DischargeRecord p2 = stack.pop();
	      System.out.println("Popped: " + p2);
	      System.out.println("---------------------");
	      //Print the remaining stack
	      stack.printStack();
	  }
}
