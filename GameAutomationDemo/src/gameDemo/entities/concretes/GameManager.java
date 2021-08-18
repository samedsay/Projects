package gameDemo.entities.concretes;

import gameDemo.entities.Game;
import gameDemo.entities.abstracts.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " added successfully!");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " updated successfully!");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName() + " deleted successfully!");

	}

}
