package concretes;

import abstracts.CampaignService;
import entity.Games;

public class CampaignManager implements CampaignService {
    @Override
    public void discount(Double discount, Games game) {
        game.setDiscount(discount);
        System.out.println(game.getGameName() +" price updated.." + " \t new price is : " + game.getPriceAfterDiscount());
    }
}
