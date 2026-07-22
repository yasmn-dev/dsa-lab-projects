public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority;

    public TreatmentRequest(int patientId,long arrivalTime,boolean priority){
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }
}