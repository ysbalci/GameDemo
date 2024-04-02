package verification;

public class CheckInfo {
    public boolean verify(String name, String nationalIdentity){
        if(!name.isEmpty() && nationalIdentity.length()==11){
            return true;
        }else {

            return false;
        }
    }
}
