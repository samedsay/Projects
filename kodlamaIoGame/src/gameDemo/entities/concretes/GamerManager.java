package gameDemo.entities.concretes;

import gameDemo.entities.Gamer;
import gameDemo.entities.abstracts.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " added successfully!");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " updated successfully!");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " deleted successfully!");
	}

}
