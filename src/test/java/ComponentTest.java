import com.cc.webstore.action.MainWebController;
import com.cc.webstore.config.WebStoreConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenc on 2017/5/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebStoreConfig.class)
public class ComponentTest {

    @Autowired
    private MainWebController controller;

    @Test
    public void controllerNotNull(){
        assert (controller != null);
    }
}
