package adapters;

import abstracts.UserCheckService;
import entity.Users;
import verification.CheckInfo;

public class VerificationSerivceAdapter implements UserCheckService {

    @Override
    public boolean checkUser(Users user) {
        CheckInfo checkInfo = new CheckInfo();
        return checkInfo.verify(user.getFirstName(), user.getNationalIdentity());
    }
}
