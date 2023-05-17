public class Therapist extends Doctor {
    String name = this.spec;

    public static void treatT() {
        System.out.println("The therapist treats..." + Patient.name);
    }
}
