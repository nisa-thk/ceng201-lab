package Ceng201HW_Assigments;
impoert java.util.Date;
public class TreatmentRequest {
	 int patientId;
	 long arrivalTime;
	 boolean priority; //For determine the priority
	 public TreatmentRequest(int patientId, long arrivalTime, boolean priority) {
	    this.patientId = patientId;
	    this.arrivalTime = arrivalTime;
	    this.priority = priority;
	}
	@Override
	public String toString(){
		Date date = new Date(arrivalTime);
	    return "Request{id: " + patientId + ", arrival time: " + date +", priority: " + priority + "}";
	 }
}

