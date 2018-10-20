package demo.spring.conditional.user;

import demo.spring.conditional.user.model.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
 class UserRepository {

     User findUser(UUID uuid) {
        return new User(uuid,"Bartek");
    }
}
