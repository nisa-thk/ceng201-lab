package Ceng201HW_Assigments;

public class TestPatientList {
	public static void main(String [] args){
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
	}
}
