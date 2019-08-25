package sdainalproject.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sdainalproject.meetup.dao.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
