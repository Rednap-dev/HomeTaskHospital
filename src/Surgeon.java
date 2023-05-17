public class Surgeon extends Doctor {
    String name = this.spec;

    public static void treatS() {
        System.out.println("The surgeon treats..." + Patient.name);
    }
}
