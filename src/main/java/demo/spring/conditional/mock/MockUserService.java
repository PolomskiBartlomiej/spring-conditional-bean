package demo.spring.conditional.mock;

import demo.spring.conditional.user.UserService;
import demo.spring.conditional.user.model.User;

import java.util.UUID;

class MockUserService implements UserService {

    @Override
    public User getUser(UUID uuid){
        System.out.println("MOCK user");
        return new User(uuid,"Mock");
    }
}
