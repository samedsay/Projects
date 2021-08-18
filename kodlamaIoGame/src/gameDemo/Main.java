package gameDemo;

import java.time.LocalDate;

import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;
import gameDemo.entities.concretes.CampaignManager;
import gameDemo.entities.concretes.GameManager;
import gameDemo.entities.concretes.GamerCheckerManager;
import gameDemo.entities.concretes.GamerManager;
import gameDemo.entities.concretes.SaleManager;

public class Main {

	public static void main(String[] args) {

		Game game = new Game(1, "Call of Duty", 40, 25);
		Gamer gamer = new Gamer(1, "Samed", "Say", LocalDate.of(2000, 1, 1));
		Campaign campaign = new Campaign(1, "Summer Deal", 50, LocalDate.of(2021, 8, 8), LocalDate.of(2021, 8, 12));

		
		GameManager gameManager = new GameManager();
		GamerCheckerManager gamerCheckerManager = new GamerCheckerManager();
		GamerManager gamerManager = new GamerManager(gamerCheckerManager);
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		saleManager.sale(gamer, game);
		saleManager.campaignSale(gamer, game, campaign);
		
		
		

	}

}
