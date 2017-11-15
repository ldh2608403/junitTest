import com.SampleController;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = SampleController.class)
public class TestJunit {
    @Autowired
    UserService userService;

    @Test
    public void test()
    {
        String username=userService.getUserName();
        System.out.println(username);
    }
}
