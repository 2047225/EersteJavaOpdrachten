package hoofdstuk2;//Voorbeeld 2.2

import java.awt.*;
import java.applet.*;

public class Opdracht2dot2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daniel", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Musch", 50, 80 );
    }
}