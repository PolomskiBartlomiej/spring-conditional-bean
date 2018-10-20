package demo.spring.conditional.user;

import demo.spring.conditional.user.model.User;
import lombok.var;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.UUID;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class DefaultUserServiceTest {

    @Mock
    private UserRepository repository;

    private DefaultUserService classUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
        classUnderTest = new DefaultUserService(repository);
    }

    @Test
    public void getUser() {
        //given:
        var id = UUID.randomUUID();
        var user = new User(id,"Bartek");
        //when:
        when(repository.findUser(any())).thenReturn(user);
        //then:
        assertThat(classUnderTest.getUser(id), is(user));
    }
}