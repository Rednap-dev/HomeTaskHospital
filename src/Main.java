import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        int p = Patient.plan;
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        System.out.println("Choose patient:");
        System.out.println("1-Vlad, 2- Andrew,");
        int n = sca.nextInt();
        System.out.println("Choose treats plan: 1-Surgeon treats, 2- Dentist treats, 3- Therapist treats");
        p = sc.nextInt();
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        if (n == 1) {
            Patient.name = "Владислав";
            System.out.println();
            sca.close();
        }
        if (n == 2) {
            Patient.name = "Андрей";
            sca.close();
        }
        if (p == 1) {
            Surgeon.treatS();
            sc.close();

        }
        if (p == 2) {
            Dentist.treatD();
            sc.close();

        }
        if (p == 3) {
            Therapist.treatT();
            sc.close();
        }
    }
}
