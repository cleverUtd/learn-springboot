import com.zclau.Bootstrap;
import com.zclau.bean.User;
import com.zclau.dao.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Created by liuzicong on 5/4/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Bootstrap.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllUsers() {
        List<User> users = userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    @Rollback
    public void findByName() {
        User user = new User();
        user.setName("zclau");
        user.setEmail("349856491@qq.com");
        userMapper.insertUser(user);

        User u = userMapper.findByName("zclau");
        Assert.assertEquals("349856491@qq.com", u.getEmail());
    }
}
