package Concentre;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

    private Game game;

    public CampaignManager(Game game) {
        this.game = game;
    }

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Campaign for " + game.getGameName());
        double a = ((game.getUnitPrice()) - (game.getUnitPrice() * campaign.getDiscountRate() / 100));

        System.out.println("Campaign has done");

    }

    @Override
    public void updateCampaign(Campaign campaign) {

        System.out.println("Campaing has updated.." + campaign.getCampaignName());

    }

    @Override
    public void deleteCampaign(Campaign campaign) {

        System.out.println("Campaign deleted..." + campaign.getCampaignName());

    }
}
