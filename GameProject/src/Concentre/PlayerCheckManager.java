package Concentre;

import Abstracts.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {
    @Override
    public boolean checkIfRealPlayer(Player player) {
        return false;
    }
}
