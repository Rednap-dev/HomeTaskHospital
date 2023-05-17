public class Dentist extends Doctor {
    String name = this.spec;

    public static void treatD() {
        System.out.println("The dentist treats..." + Patient.name);
    }
}
