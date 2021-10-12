package example.shopinglist.repositories;

import example.shopinglist.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndEmail(String username, String email);

    User findByUsernameAndPassword(String username, String password);
}
