package Abstracts;

import Entities.Player;

public interface PlayerService {
    void registerPlayer(Player player);
    void updateInfoPlayer(Player player);
    void deleteAccountPlayer(Player player);


}
