package gameDemo.entities.concretes;

import gameDemo.entities.Gamer;
import gameDemo.entities.abstracts.GamerService;

public class GamerManager implements GamerService {

	private GamerCheckerManager gamerCheckerManager;

	public GamerManager(GamerCheckerManager gamerCheckerManager) {
		super();
		this.gamerCheckerManager = gamerCheckerManager;
	}

	@Override
	public void add(Gamer gamer) {
		try {
			if (gamerCheckerManager.checkIfRealPerson(gamer)) {
				System.out.println(gamer.getFirstName() + " added successfully!");
			} else {
				System.out.println("Not a valid user!");
			}
		} catch (Exception e) {
			System.out.println("Not a valid user!");
		}

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
