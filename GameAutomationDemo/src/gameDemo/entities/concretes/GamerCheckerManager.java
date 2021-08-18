package gameDemo.entities.concretes;

import gameDemo.entities.Gamer;
import gameDemo.entities.abstracts.GamerCheckService;

public class GamerCheckerManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
