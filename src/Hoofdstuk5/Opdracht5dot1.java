package Hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class Opdracht5dot1 extends Applet {

    Color Black;
    Color background;
    Color coloritems;

    int lengte
    int hoogte

    public void init() {
        Black = Color.BLACK;
        background = Color.WHITE;
        coloritems = Color.MAGENTA;

        lengte = 200;
        hoogte = 85;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(10,10,210,10);
        g.drawString("Lijn",100,25);

        g.drawRect(10,40,lengte,hoogte);
        g.drawString("Rechthoek",85,140);

        g.drawRoundRect(10,150,lengte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",55,250);

        g.setColor(Color.MAGENTA);
        g.fillRect(230,40,lengte,hoogte);
        g.setColor(Color.black);
        g.drawOval(230,40,lengte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",250,140);

        g.setColor(Color.MAGENTA);
        g.fillOval(230,150,lengte,hoogte);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",290,250);

        g.drawOval(450,40,lengte,hoogte);
        g.setColor(Color.MAGENTA);
        g.fillArc(450,40,lengte,hoogte,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",465,140);

        g.drawOval(510,150,85,85);
        g.drawString("Cirkel",535,250);
    }
}