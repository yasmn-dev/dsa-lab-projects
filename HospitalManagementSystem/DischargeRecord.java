public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId, long dischargeTime){
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }

    public String toString() {
        return "Patient ID: " + patientId + ", Discharge Time: " + new java.util.Date(dischargeTime);
    }
}
