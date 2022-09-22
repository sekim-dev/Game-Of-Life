import javax.swing.*;

public class CicleLife extends JFrame {

    public CicleLife() {
        Timer timer = new Timer(100, new Rules());

        timer.start();
    }


}