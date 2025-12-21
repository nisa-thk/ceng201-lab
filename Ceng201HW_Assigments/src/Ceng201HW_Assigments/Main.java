package Ceng201HW_Assigments;

public class Main {

	public static void main(String[] args) {
	      //TASK1
	      PatientList list = new PatientList();
	      // Add 5 patient to list
	      list.addPatient(new Patient(1234556677,"Şakir",10,4));
	      list.addPatient(new Patient(1234567908,"Boncuk",4,38));
	      list.addPatient(new Patient(1234856670,"Nisa",1,20));
	      list.addPatient(new Patient(1234556471,"Sena",8,65));
	      list.addPatient(new Patient(1234556629,"Furkan",3,45));
	      System.out.println("Started list:");
	      list.printList();

	      list.removePatient(1234556471);
	      System.out.println("\nAfter removed patient new list is:");
	      list.printList();

	      Patient found = list.findPatient(1234556677);
	      System.out.println("\nFounded patient is:" + found );

	      System.out.println("The final list is:");
	      list.printList();
	      System.out.println("--------------------------------");


	      //TASK2
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

	      //TASK3
	      TreatmentQueue queue = new TreatmentQueue();
	      queue.enqueue(new TreatmentRequest(1235802320, 1500, true)); //priority
	      queue.enqueue(new TreatmentRequest(1235802321, 1790, true)); //priority
	      queue.enqueue(new TreatmentRequest(1235802323, 1400, false)); //normal
	      queue.enqueue(new TreatmentRequest(1235802322, 1800, false)); //normal
	      queue.enqueue(new TreatmentRequest(1235802319, 1560, false)); //normal
	      queue.enqueue(new TreatmentRequest(1235802334, 1280, true)); //priority
	      queue.enqueue(new TreatmentRequest(1235802395, 1370, true)); //priority
	      queue.enqueue(new TreatmentRequest(1235802370, 1900, false)); //normal

	      System.out.println("The queue is:"); //Print the first queue
	      queue.printQueue();

	      System.out.println("Dequeued queue is: " + queue.dequeue());
	      System.out.println("Again dequeued queue is:" + queue.dequeue());
	      System.out.println("Again dequeued queue is:" + queue.dequeue());

	      System.out.println("The remaining queue size is: " + queue.size()); //Show the last queues size
	      queue.printQueue();

	      //TASK4
	      HospitalSystem system = new HospitalSystem();
	      system.addPatient(new Patient(1234, "Asım ", 3, 25));
	      system.addPatient(new Patient(6789, "Aslıhan", 9, 75));
	      system.addPatient(new Patient(1123, "Şakir ", 2, 30));
	      system.addPatient(new Patient(1276, "Boncuk", 4, 22));
	      system.addPatient(new Patient(1895, "Elif ", 5, 28));
	      system.addPatient(new Patient(1835, "Nur", 2, 35));
	      system.addPatient(new Patient(3459, "Sena", 4, 19));
	      system.addPatient(new Patient(6895, "Aleyna", 3, 59));
	      system.addPatient(new Patient(1295, "İlayda", 4, 13));
	      system.addPatient(new Patient(5095, "Nisa", 1, 4));

	      //add 5 normal & 3 priority treatment request
	      system.addTreatmentRequest(1, 1500, false);
	      system.addTreatmentRequest(3, 1600, false);
	      system.addTreatmentRequest(5, 1700, false);
	      system.addTreatmentRequest(6, 1800, false);
	      system.addTreatmentRequest(7, 1900, false);
	      system.addTreatmentRequest(2, 2000, true);
	      system.addTreatmentRequest(4, 2100, true);
	      system.addTreatmentRequest(8, 2200, true);

	      //add 2 discharge methods
	      system.addDischargeRecord(123464, System.currentTimeMillis());
	      system.addDischargeRecord(379754, System.currentTimeMillis());

	      // register 4 treatment request with priority
	      system.processTreatmentRequest();
	      system.processTreatmentRequest();
	      system.processTreatmentRequest();
	      system.processTreatmentRequest();

	      //print the last system situation
	      system.printSystemState();

	      //sort the patients for severity
	      system.sortPatientsForPriority();
		
	}
}
