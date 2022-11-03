package chat.repository;

import chat.model.User;

public interface UserRepository extends iCrudRepository<String, User>{

    // add more methods specific to User Repo

    User findByUsernameAndPassword(String username,String password);
}
