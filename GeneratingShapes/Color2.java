import javax.swing.*;
import java.awt.*;

public class Color2 extends JFrame {

    int checker = (int) (Math.random() * 24);
    Color color;

    public static final Color VERY_LIGHT_RED = new Color(255, 102, 102);
    public static final Color LIGHT_BROWN = new Color(153, 102, 0);
    public static final Color BROWN = new Color(102, 51, 0);
    public static final Color DARK_BROWN = new Color(51, 0, 0);
    public static final Color PURPLE = new Color(102, 0, 153);
    public static final Color GOLD = new Color(255, 204, 51);
    public static final Color LIGHT_ORANGE = new Color(255, 153, 0);
    public static final Color DARK_GREEN = new Color(0, 102, 0);
    public static final Color VERY_LIGHT_GREEN = new Color(102, 255, 102);
    public static final Color VERY_DARK_BLUE = new Color(0, 0, 153);
    public static final Color VERY_LIGHT_BLUE = new Color(51, 204, 255);
    public static final Color LIGHT_BLUE = new Color(51, 153, 255);

    Color mix;

    Color setColor(int red, int green, int blue) {
        mix = new Color(red, green, blue);
        return mix;
    }


    Color getColor() {

        switch (checker) {
            case 0:
                color = (Color.CYAN);
                break;
            case 1:
                color = (Color.RED);
                break;
            case 2:
                color = (Color.BLUE);
                break;
            case 3:
                color = (Color.ORANGE);
                break;
            case 4:
                color = (Color.GREEN);
                break;
            case 5:
                color = (Color.BLACK);
                break;
            case 6:
                color = (Color.DARK_GRAY);
                break;
            case 7:
                color = (Color.MAGENTA);
                break;
            case 8:
                color = (Color.YELLOW);
                break;
            case 9:
                color = (Color.PINK);
                break;
            case 10:
                color = (Color.LIGHT_GRAY);
                break;
            case 11:
                color = (Color.GRAY);
                break;
            case 12:
                color = (VERY_LIGHT_RED);
                break;
            case 13:
                color = (LIGHT_BROWN);
                break;
            case 14:
                color = (LIGHT_BLUE);
                break;
            case 15:
                color = (DARK_BROWN);
                break;
            case 16:
                color = (DARK_GREEN);
                break;
            case 17:
                color = (BROWN);
                break;
            case 18:
                color = (PURPLE);
                break;
            case 19:
                color = (GOLD);
                break;
            case 20:
                color = (VERY_DARK_BLUE);
                break;
            case 21:
                color = (LIGHT_ORANGE);
                break;
            case 22:
                color = (VERY_LIGHT_BLUE);
                break;
            case 23:
                color = (VERY_LIGHT_GREEN);
                break;

        }

        return color;
    }

}
