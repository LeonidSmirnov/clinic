/**
 * Created by Asus on 08.12.2016.
 */
public class ClinicRunner {

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.addClient(0 , new Client("Brow" , new Cat("Dggi")) );
        clinic.addClient(1, new Client("Nick" , new Dog(new Animal("Sparki"))));

        clinic.printClient();
    }

}
