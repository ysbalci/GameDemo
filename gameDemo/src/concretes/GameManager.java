package concretes;

import abstracts.GameService;
import entity.Games;

public class GameManager implements GameService {

    @Override
    public void update(Games game) {
        System.out.println("This game informations has been updated");
    }
}
