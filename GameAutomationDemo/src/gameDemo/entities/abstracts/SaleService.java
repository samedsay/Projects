package gameDemo.entities.abstracts;

import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);

	void campaignSale(Gamer gamer, Game game, Campaign campaign);

}
