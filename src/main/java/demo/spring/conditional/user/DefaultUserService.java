package demo.spring.conditional.user;

import demo.spring.conditional.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository repository;

    @Override
    public User getUser(UUID uuid) {
       return repository.findUser(uuid);
    }
}
