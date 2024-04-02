package concretes;

import abstracts.UserCheckService;
import entity.Users;
import verification.CheckInfo;

public class UserCheckManager implements UserCheckService {

    @Override
    public boolean checkUser(Users user) {
        return true;
    }
}
