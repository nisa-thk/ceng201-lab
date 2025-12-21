package Ceng201HW_Assigments;

public class DischargeRecord {
	  int patientId;
	    long dischargeTime;
	    public DischargeRecord(int patientId, long dischargeTime) {
	        this.patientId = patientId;
	        this.dischargeTime = System.currentTimeMillis();
	    }
	    @Override
	    public String toString(){
	        return "DischargeRecord{id=" + patientId + ", dischargeTime=" + dischargeTime + "}";
	    }
}
