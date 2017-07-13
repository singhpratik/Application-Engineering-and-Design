package Business;

import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Roles.Roles;
import Business.Roles.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author Pratik
 */
public class EcoSystem extends Organisation {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for(Network network : networkList) {
        }

        return true;
    }

}