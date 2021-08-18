package gameDemo.entities.concretes;

import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;
import gameDemo.entities.abstracts.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " has been sold to " + gamer.getFirstName() 
		+ " for " + game.getUnitPrice());
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getName() + " has been sold to " + gamer.getFirstName() 
		+ " for " + (game.getUnitPrice() - (game.getUnitPrice() * campaign.getCampaignDiscount() / 100.0)));
	}

}
