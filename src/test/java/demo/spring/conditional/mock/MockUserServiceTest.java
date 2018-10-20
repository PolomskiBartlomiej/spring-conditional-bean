package demo.spring.conditional.mock;

import demo.spring.conditional.user.UserService;
import demo.spring.conditional.user.model.User;
import lombok.var;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {"mock.service = true"})
public class MockUserServiceTest {

    @Autowired
    UserService classUnderTest;

    @Test
    public void getMocksUser() {
        //given:
        var id = UUID.randomUUID();
        //when:
        var result = classUnderTest.getUser(id);
        //then:
        assertThat(result, is(new User(id,"Mock")));
    }
}