package sdainalproject.meetup.service;

import org.springframework.stereotype.Service;
import sdainalproject.meetup.dao.UserModel;
import sdainalproject.meetup.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    public Optional<UserModel> findById(Long id) {
        return userRepository.findById(id);
    }

    public UserModel save(UserModel mogel ) {
        return userRepository.save(mogel);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
