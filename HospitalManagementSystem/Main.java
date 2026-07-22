// Main class for hospital system
public class Main{
    public static void main(String[] args){

        /*PatientList list = new PatientList();

        Patient A = new Patient(101, "Ali Yılmaz",3,28);
        Patient B = new Patient(102,"Zeynep Ceren Kaya",5,25 );
        Patient C = new Patient(103,"Mehmet Demiryürek",2,34);
        Patient D = new Patient(104,"Elif Şahin",4,61);
        Patient E = new Patient(105,"Can Özkan",1,19);

        list.addPatient(A);
        list.addPatient(B);
        list.addPatient(C);
        list.addPatient(D);
        list.addPatient(E);

        list.removePatient(104);
        list.printList();
        System.out.println("Found Patient: "+((list.findPatient(102)).name));*/

        /*TreatmentQueue queue = new TreatmentQueue();

        TreatmentRequest A = new TreatmentRequest(201, 10,true);
        TreatmentRequest B = new TreatmentRequest(202, 12,false);
        TreatmentRequest C = new TreatmentRequest(203, 15,true);
        TreatmentRequest D = new TreatmentRequest(204, 18,false);
        TreatmentRequest E = new TreatmentRequest(205, 20,false);
        TreatmentRequest F = new TreatmentRequest(206, 22,true);
        TreatmentRequest G = new TreatmentRequest(207, 25,false);
        TreatmentRequest H = new TreatmentRequest(208, 30,false);

        queue.enqueue(A);
        queue.enqueue(B);
        queue.enqueue(C);
        queue.enqueue(D);
        queue.enqueue(E);
        queue.enqueue(F);
        queue.enqueue(G);
        queue.enqueue(H);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
        System.out.println("There are "+queue.size()+" patients in the queue."); */

        /*DischargeStack stack = new DischargeStack();

        stack.push(new DischargeRecord(101, System.currentTimeMillis()));
        stack.push(new DischargeRecord(102, System.currentTimeMillis() + 1000));
        stack.push(new DischargeRecord(103, System.currentTimeMillis() + 2000));
        stack.push(new DischargeRecord(104, System.currentTimeMillis() + 3000));
        stack.push(new DischargeRecord(105, System.currentTimeMillis() + 4000));

        stack.pop();
        stack.pop();

        stack.printStack();*/

        HospitalSystem system = new HospitalSystem();

        // Add 10 patients to the system
        system.addPatient(new Patient(1, "Alican Yılmaz", 5, 30));
        system.addPatient(new Patient(2, "Ayşe Demir", 2, 25));
        system.addPatient(new Patient(3, "Mehmet Kaya", 4, 60));
        system.addPatient(new Patient(4, "Elif Şahin", 1, 40));
        system.addPatient(new Patient(5, "Can Özkan", 3, 20));
        system.addPatient(new Patient(6, "Zeynep Sude Acar", 5, 55));
        system.addPatient(new Patient(7, "Mert Koç", 2, 35));
        system.addPatient(new Patient(8, "Selin Arslan", 4, 28));
        system.addPatient(new Patient(9, "Burak Emre Yıldız", 1, 45));
        system.addPatient(new Patient(10, "Ece Polat", 3, 32));

        // 5 normal and 3 priority treatment requests
        system.addTreatmentRequest(1, false);
        system.addTreatmentRequest(2, false);
        system.addTreatmentRequest(3, false);
        system.addTreatmentRequest(4, false);
        system.addTreatmentRequest(5, false);
        system.addTreatmentRequest(6, true);
        system.addTreatmentRequest(7, true);
        system.addTreatmentRequest(8, true);

        // Add 2 discharge records
        system.addDischargeRecord(new DischargeRecord(9, System.currentTimeMillis()));
        system.addDischargeRecord(new DischargeRecord(10, System.currentTimeMillis()));

        // Process 4 treatment requests
        system.processTreatmentRequest();
        system.processTreatmentRequest();
        system.processTreatmentRequest();
        system.processTreatmentRequest();

        // Print the final system state
        system.printSystemState();
    }
}

