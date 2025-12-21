package Ceng201HW_Assigments;

public class TreatmentRequest {
	 int patientId;
	 long arrivalTime;
	 boolean priority; //For determine the priority
	 public TreatmentRequest(int patientId, long arrivalTime, boolean priority) {
	    this.patientId = patientId;
	    this.arrivalTime = System.currentTimeMillis();
	    this.priority = priority;
	}
	@Override
	public String toString(){
	    return "Request{id: " + patientId + ", arrival time: " +", priority: " + priority + "}";
	 }
}
