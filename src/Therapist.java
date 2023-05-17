import java.util.Scanner;

public class Therapist extends Doctor {
    String name = this.spec;

    public static void treatT() {
        System.out.println("The therapist treats..." + Patient.name);
    }

    public static void plan() {
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        int p = Patient.plan;
        System.out.println("Choose patient:");
        System.out.println("1-Vlad, 2- Andrew,");
        int n = sca.nextInt();
        System.out.println("Choose treats plan: 1-Surgeon treats, 2- Dentist treats, 3- Therapist treats");
        p = sc.nextInt();
        if (n == 1) {
            Patient.name = "Владислав";
            System.out.println();
            sca.close();
        }
        if (n == 2) {
            Patient.name = "Андрей";
            sca.close();
        }
        sca.close();
        if (p == 1) {
            Surgeon.treatS();
            sc.close();
        }
        if (p == 2) {
            Dentist.treatD();
            sc.close();

        } else {
            Therapist.treatT();
            sc.close();
        }
    }
}
