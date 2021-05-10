package MerniseServiceAdapter;

import Abstracts.PlayerCheckService;
import Entities.Player;
import MerniseServiceReference.VRNKPSPublicSoap;




public class MerniseServiceAdapter implements PlayerCheckService {
    @Override
    public boolean checkIfRealPlayer(Player player) {

        VRNKPSPublicSoap client = new VRNKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(player.getNationalityId(),player.getFirstName().toUpperCase(),
                    player.getLastName().toUpperCase(),player.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
