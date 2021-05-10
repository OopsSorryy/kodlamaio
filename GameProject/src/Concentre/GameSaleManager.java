package Concentre;

import Abstracts.GameSaleService;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService {

    private Player player;

    public GameSaleManager(Player player) {
        this.player = player;
    }

    @Override
    public void buyGame(Game game) {
        System.out.println(player.getFirstName() + " Bought Succesfully " + game.getGameName() +
        " The game is now in your library");
    }

    @Override
    public void returnGame(Game game) {
        System.out.println(player.getFirstName() + " Returned Succesfully " + game.getGameName());

    }
}
