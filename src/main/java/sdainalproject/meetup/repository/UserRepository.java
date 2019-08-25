package sdainalproject.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdainalproject.meetup.dao.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
