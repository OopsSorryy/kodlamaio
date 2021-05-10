package Abstracts;

import Entities.Game;


public interface GameSaleService {
    void buyGame(Game game);
    void returnGame(Game game);

}
