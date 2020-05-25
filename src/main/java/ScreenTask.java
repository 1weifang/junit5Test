import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

/**
 * @author necho.duan
 * @title: ScreenTask
 * @projectName 23_env_config_proxy
 * @description:
 * @date 2020/5/19 18:47
 */
public class ScreenTask extends TimerTask {

    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_PRINTSCREEN);
            Thread.sleep(1000l);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
