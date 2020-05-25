import java.util.Timer;

/**
 * @author necho.duan
 * @title: RobotTest
 * @projectName 23_env_config_proxy
 * @description:
 * @date 2020/5/19 18:02
 */
public class RobotTest {

    public static void main(String[] args) {
        Timer  timer = new Timer();
        ScreenTask screenTask = new ScreenTask();
        timer.schedule(screenTask,10000L,8000L);
    }




}
