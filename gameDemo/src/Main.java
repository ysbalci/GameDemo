import adapters.VerificationSerivceAdapter;
import concretes.CampaignManager;
import concretes.SalesManager;
import concretes.UsersManager;
import entity.Games;
import entity.Users;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Games game = new Games(1,"CsGo",1000.0);
        Users user = new Users(1,"xxxxx","Oyuncu1","Oyuncu1",2000,"12345628901");

        UsersManager usersManager = new UsersManager(new VerificationSerivceAdapter());
        usersManager.add(user);
       // CampaignManager campaignManager = new CampaignManager();
       // campaignManager.discount(10.00,game);
        SalesManager salesManager = new SalesManager();
        salesManager.sale(user,game);



        }
    }
