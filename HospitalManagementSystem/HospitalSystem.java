import java.util.HashMap;

public class HospitalSystem {
    private PatientList admittedPatients;
    private TreatmentQueue waitingPatients;
    private DischargeStack processedDischarges;
    private HashMap<Integer, Patient> patientLookUp;
    // Constructor
    public HospitalSystem(){
        admittedPatients = new PatientList();
        waitingPatients = new TreatmentQueue();
        processedDischarges = new DischargeStack();
        patientLookUp = new HashMap<>();
    }
    // Adds a new patient
    public void addPatient(Patient patient){
        admittedPatients.addPatient(patient);
        patientLookUp.put(patient.id,patient);
    }
    // Adds a treatment request
    public void addTreatmentRequest(TreatmentRequest request){
        waitingPatients.enqueue(request);
    }
    //OVERLOADING: Adds a treatment request using patient ID and priority
    public void addTreatmentRequest(int patientId,boolean priority) {
        TreatmentRequest r = new TreatmentRequest(patientId, System.currentTimeMillis(),priority);
        addTreatmentRequest(r);
    }
    // Adds a discharge record
    public void addDischargeRecord(DischargeRecord record){
        processedDischarges.push(record);
    }
    // Processes the next treatment request
    public void processTreatmentRequest(){
        TreatmentRequest request = waitingPatients.dequeue();

        if (request == null) {
            System.out.println("No treatment requests.");
            return;
        }
        // Finds the corresponding patient using the lookup map
        Patient patient = patientLookUp.get(request.patientId);

        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }
        // Creates a discharge record for the treated patient
        DischargeRecord record = new DischargeRecord(patient.id, System.currentTimeMillis());

        processedDischarges.push(record);
        admittedPatients.removePatient(patient.id);
        patientLookUp.remove(patient.id);

        System.out.println("Patient treated and discharged: " + patient.name + " , Priority: " + request.priority);
    }
    // Sorts admitted patients by severity
    public void sortPatientsBySeverity() {
        admittedPatients.sortBySeverity();
    }
    // Prints the current system of admitted system
    public void printSystemState() {
        System.out.println("\nCURRENT SYSTEM STATE:");

        admittedPatients.printList();
        waitingPatients.printQueue();
        processedDischarges.printStack();

    }
}