package coffeeshop.coffeeshop.repositories;

import coffeeshop.coffeeshop.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndEmail(String username, String email);

    User findByUsernameAndPassword(String username, String password);

    @Query("select u from User as u")
    List<User> getAllUsers();

}
