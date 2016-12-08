import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 08.12.2016.
 */
public class Clinic {

    private final List<Client> clients = new ArrayList();

    public void addClient(final int position , Client client){
        clients.add(position , client);
    }


    public void printClient(){
        for (Client client: clients
             ) {
            System.out.println(client);

        }
    }
}
