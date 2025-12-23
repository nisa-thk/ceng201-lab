package Ceng201HW_Assigments;
import java.util.*;
public class HospitalSystem {
/*
 * HospitalSystem class, with basic data structures within the hospital:
 *  Manages patient admission, treatment and discharge procedures.
 * Data structures used:
 * - PatientList : Linked list holds active patients
 * - TreatmentQueue : The queue holds patients waiting for treatment
 * - DischargeStack : Stack holds discharged patients
 * - HashMap: Patient ID -> Patient mapping for quick access*/
	PatientList list = new PatientList(); //For admitted patient
    TreatmentQueue queue = new TreatmentQueue(); //For waiting normal and priority patients
    DischargeStack stack = new DischargeStack(); //For processed discharges
    HashMap<Integer,Patient > patientHashMap = new HashMap<>(); //Quick accsess by Hashmap

    public void addPatient(Patient p){
        list.addPatient(p); //Add to the linked list
        patientHashMap.put(p.Id,p); // Add HahMap to O(1) time
    }
    public void addTreatmentRequest(int patientId, long arrivalTime, boolean priority){
        TreatmentRequest request = new TreatmentRequest(patientId, arrivalTime,priority);
        queue.enqueue(request);
        System.out.println("Treatment request added:  patientId=" + patientId+ ", time=" +arrivalTime +request);
    }
    //Adding a discharge record
    public void addDischargeRecord(int patientId, long dischargedTime){
        DischargeRecord record = new DischargeRecord(patientId,dischargedTime);
        stack.push(record);
        System.out.println("Add to the discharge record: " + record);
    }
   //It receives a treatment request from the queue and processes it.
    //    At the end of the process, a discharge record is created.
    public void processTreatmentRequest(){
        TreatmentRequest req = queue.dequeue();
        if(req != null){
            System.out.println("Processing treatment for patient Id: " + req.patientId);
            //create discharge paper and add to stack
            long dischargedTime = System.currentTimeMillis();
            addDischargeRecord(req.patientId,dischargedTime); //create discharge paper and add to stack
        }else{
            System.out.println("No treatment requests in the queue");
        }
    }
    public void sortPatientsForPriority(){
		// Collect all patients from the HashMap into a list
        List <Patient> patients = new ArrayList<>(patientHashMap.values());
		 // Apply QuickSort algorithm to sort patients by severity
        quickSort(patients, 0, patients.size() -1);
		// Print the sorted list of patients
        System.out.println("Patients sorted by severity:");
        for(Patient p: patients){
            System.out.println(p);
        }
    }
    //Quick sort algorithm
    // Recursively divides the list into partitions and sorts each side
    private void quickSort(List<Patient> patients, int low, int high){
       if(low < high){
		   //Partition the list and get the pivot index
           int p = partition(patients, low, high);
           quickSort(patients, low, p-1); // left side
           quickSort(patients, p+1, high); //right side
       }
    }
    //partition method
	/* Chooses the last element as pivot and rearranges the list
    Elements greater than pivot go to the left, smaller ones to the right*/
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


