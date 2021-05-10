package Concentre;


import Abstracts.BasePlayerManager;
import Abstracts.PlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager {

    private PlayerCheckService playerCheckService;

    public PlayerManager(PlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void registerPlayer(Player player) {
        if (playerCheckService.checkIfRealPlayer(player)){
            System.out.println("Valid Person, Succesfully Registered...");
        }
        else
            System.out.println("Not a valid Person... Please try again");


    }

    @Override
    public void updateInfoPlayer(Player player) {
        System.out.println("Your information has updated...");

    }

    @Override
    public void deleteAccountPlayer(Player player) {
        System.out.println("If you have a problem please contact us...");

    }
}
