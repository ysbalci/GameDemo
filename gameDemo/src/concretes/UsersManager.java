package concretes;

import abstracts.UserCheckService;
import abstracts.UserService;
import entity.Users;

public class UsersManager implements UserService {

    private UserCheckService userCheckService;

    public UsersManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(Users user) {
        if (userCheckService.checkUser(user)){
            System.out.println( "Account successfully registered:\t" +user.getFirstName());
        }else {
            System.out.println("Account couldn't registered, please check your information");
        }

    }

    @Override
    public void delete(Users user) {
        System.out.println(user.getFirstName() + "Account successfully deleted");
    }

    @Override
    public void update(Users user) {
    System.out.println(user.getFirstName() +  "Account successfully updated");
    }
}
