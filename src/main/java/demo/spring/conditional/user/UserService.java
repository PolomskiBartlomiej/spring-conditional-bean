package demo.spring.conditional.user;

import demo.spring.conditional.user.model.User;

import java.util.UUID;

public interface UserService {
    User getUser(UUID uuid);
}
