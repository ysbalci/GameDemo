package concretes;

import abstracts.SalesService;
import entity.Games;
import entity.Users;

public class SalesManager implements SalesService {
    @Override
    public void sale(Users user, Games game) {
        if(game.getDiscount()>0){
            System.out.println(user.getFirstName() + " purchased " +game.getGameName()   +"\t price is: "+ game.getPriceAfterDiscount() );
        }else {
            System.out.println(user.getFirstName() + " purchased " +game.getGameName()   +"\t price is: "+ game.getPrice() );
        }

    }
}
