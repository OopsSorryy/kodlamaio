import Abstracts.BasePlayerManager;
import Abstracts.CampaignService;
import Abstracts.GameSaleService;
import Concentre.CampaignManager;
import Concentre.GameSaleManager;
import Concentre.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import MerniseServiceAdapter.MerniseServiceAdapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        BasePlayerManager playerManager = new PlayerManager(new MerniseServiceAdapter());

        playerManager.registerPlayer(new Player(1,"Yunus Emre","ÖZCAN",
                LocalDate.of(1999,1,1),"10271273980"));
        playerManager.deleteAccountPlayer(new Player(1,"YunusEmre","ÖZCAN",
                LocalDate.of(1999,1,1),"10271273980"));
        playerManager.updateInfoPlayer(new Player(1,"Yunus Emre","ÖZCAN",
                LocalDate.of(1999,1,1),"10271273980"));

        System.out.println("...........................................................................................");

        GameSaleService gameSaleService = new GameSaleManager(new Player(1,"Yunus Emre","ÖZCAN",
                LocalDate.of(1999,1,1),"10271273980"));

        gameSaleService.buyGame(new Game(2,"RDR2",70));
        gameSaleService.returnGame(new Game(2,"RDR2",70));

        System.out.println("...........................................................................................");


        CampaignService campaignService = new CampaignManager(new Game(2,"RDR2",70));
        campaignService.addCampaign(new Campaign(3,"SuperDiscount",30));
        campaignService.deleteCampaign(new Campaign(3,"SuperDiscount",30));
        campaignService.updateCampaign(new Campaign(3,"SuperDiscount",30));







    }
}
