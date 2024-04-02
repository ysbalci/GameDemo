package abstracts;

import entity.Users;

public interface UserService {
    void add(Users user);
    void delete(Users user);
    void update(Users user);
}
