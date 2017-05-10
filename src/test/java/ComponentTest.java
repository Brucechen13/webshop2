import com.cc.webstore.action.DetailController;
import com.cc.webstore.action.MainWebController;
import com.cc.webstore.config.WebStoreInitiliatizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.sql.DataSource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by chenc on 2017/5/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebStoreInitiliatizer.class)
public class ComponentTest {

    @Test
    public void dataSourceNotNull(){
    }

    @Test
    public void testMainController() throws Exception{
        DetailController controller = new DetailController();
        MockMvc mvc = MockMvcBuilders.standaloneSetup(controller).build();
        mvc.perform(get("/detail")).andExpect(MockMvcResultMatchers.view().name("index"));
    }
}
