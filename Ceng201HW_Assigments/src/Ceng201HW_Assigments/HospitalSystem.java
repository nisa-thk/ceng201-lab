package Ceng201HW_Assigments;
import java.util.*;
public class HospitalSystem {
	PatientList list = new PatientList(); //For admitted patient
    TreatmentQueue queue = new TreatmentQueue(); //For waiting normal and priority patients
    DischargeStack stack = new DischargeStack(); //For processed discharges
    HashMap<Integer,Patient > patientHashMap = new HashMap<>(); //Fat accsess by Hashmap

    public void addPatient(Patient p){
        list.addPatient(p); //Add to the linked list
        patientHashMap.put(p.Id,p); // Add HahMap to O(1) time
    }
    public void addTreatmentRequest(int patientId, long arrivalTime, boolean priority){
        queue.enqueue(new TreatmentRequest(1235820947, 2580, true));
    }
    public void addDischargeRecord(int patientId, long dischargedTime){
        stack.push(new DischargeRecord(patientId,System.currentTimeMillis()));
    }
    //Patient remove from dequeue(tedavi kuyrugundan) to stack(taburcu kuyruguna eklenecek)
    public void processTreatmentRequest(){
        TreatmentRequest req = queue.dequeue();
        if(req != null){
            System.out.println("Processing treatment for patient Id: " + req.patientId);
            //create discharge paper and add to stack
            long dischargedTime = System.currentTimeMillis();
            addDischargeRecord(req.patientId,dischargedTime);
        }else{
            System.out.println("No treatment requests in the queue");
        }
    }
    public void sortPatientsForPriority(){
        List <Patient> patients = new ArrayList<>(patientHashMap.values());
        quickSort(patients, 0, patients.size() -1);
        System.out.println("Patients sorted by severity:");
        for(Patient p: patients){
            System.out.println(p);
        }
    }
    //Quick sort algorithm
    private void quickSort(List<Patient> patients, int low, int high){
       if(low < high){
           int p = partition(patients, low, high);
           quickSort(patients, low, p-1); // left side
           quickSort(patients, p+1, high); //right side
       }
    }
    //partition method
    private int partition(List<Patient> patients , int low, int high){
        int pivot = patients.get(high).severity; //pivot son eleman
        int i = low - 1;
        for(int j = low; j< high; j++){
            if (patients.get(j).severity > pivot) { // sort from biggest to lowest
                i++;
                Collections.swap(patients, i, j);
            }
        }
        Collections.swap(patients, i + 1, high);
        return i + 1;
    }

    public void printSystemState(){
        System.out.println("-------HOSPITAL SYSTEM STATE-------");
        System.out.println("Patients:");
        PatientList pl = new PatientList();
        pl.printList();
        TreatmentQueue q = new TreatmentQueue();

        System.out.println("Treatment Queue: ");
        q.printQueue();

        DischargeStack s = new DischargeStack();
        System.out.println("Discharge Stack:");
        s.printStack();
    }
	

}
