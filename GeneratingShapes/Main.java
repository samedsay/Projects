import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Main extends JFrame {

    static int number = 0;
    static int input, input2;

    public static final int RefWidth = 800;
    public static final int RefHeight = 800;

    private static FileWriter fwriter;

    public static void main(String[] args) throws IOException {

        Main window = new Main();
        SwingUtilities.updateComponentTreeUI(window);
        window.setSize(800, 800);
        window.setResizable(true);
        window.setVisible(true);

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        if (input == 1) {
            window.movingThread().start();
            try {
                fwriter = new FileWriter("./src/shapes.txt");
            } catch (IOException ex) {
                System.err.println(ex);
            }
        } else if (input == 2)
            window.readingThread().start();

    }

    private ArrayList<ShapeClass> shapeArray = new ArrayList<>();
    private ArrayList<ShapeClass> shapeArray2 = new ArrayList<>();

    public Main() {

        setTitle("Hello, world!");
        setResizable(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g) {

        double xRatio = (double) getWidth() / RefWidth;
        double yRatio = (double) getHeight() / RefHeight;

        super.paint(g);

        if (input == 1) {
            synchronized (shapeArray) {

                for (ShapeClass line : shapeArray) {

                    if (line.type == 0) {

                        g.setColor(line.color.getColor());
                        g.fillRect((int) (line.getX() * xRatio), (int) (line.getY() * yRatio), (int) (line.getWidth() * xRatio), (int) (line.getHeight() * yRatio));

                    } else if (line.type == 1) {
                        g.setColor(line.color.getColor());
                        g.fillRoundRect((int) (line.getX() * xRatio), (int) (line.getY() * yRatio), (int) (line.getWidth() * xRatio), (int) (line.getHeight() * yRatio), 20, 30);
                    } else {
                        g.setColor(line.color.getColor());
                        g.fillOval((int) (line.getX() * xRatio), (int) (line.getY() * yRatio), (int) (line.getWidth() * xRatio), (int) (line.getHeight() * yRatio));

                    }

                }
            }
        } else if (input == 2) {
            synchronized (shapeArray2) {
                for (ShapeClass line : shapeArray2) {

                    if (line.type == 0) {
                        g.setColor(line.color.mix);
                        g.fillRect((int) (line.getX() * xRatio), (int) (line.getY() * yRatio), (int) (line.getWidth() * xRatio), (int) (line.getHeight() * yRatio));

                    } else if (line.type == 1) {
                        g.setColor(line.color.mix);
                        g.fillRoundRect((int) (line.getX() * xRatio), (int) (line.getY() * yRatio), (int) (line.getWidth() * xRatio), (int) (line.getHeight() * yRatio), 20, 30);
                    } else {
                        g.setColor(line.color.mix);
                        g.fillOval((int) (line.getX() * xRatio), (int) (line.getY() * yRatio), (int) (line.getWidth() * xRatio), (int) (line.getHeight() * yRatio));

                    }
                }
            }
        }

        setResizable(true);

    }

    public void readShapes() {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("./src/shapes.txt"));
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        while ((scan.hasNextLine())) {
            String[] str = scan.nextLine().split("-");

            int readX, readY, readWidth, readHeight, readType;

            int readRed = Integer.parseInt(str[1]);
            int readGreen = Integer.parseInt(str[2]);
            int readBlue = Integer.parseInt(str[3]);
            readType = Integer.parseInt(str[0]);
            readX = Integer.parseInt(str[4]);
            readY = Integer.parseInt(str[5]);
            readWidth = Integer.parseInt(str[6]);
            readHeight = Integer.parseInt(str[7]);

            Color2 readColor = new Color2();
            readColor.setColor(readRed, readGreen, readBlue);

            ShapeClass p = new ShapeClass(readColor, readType, readX, readY, readWidth, readHeight);
            shapeArray2.add(p);

        }
    }

    public int randomHeight() {
        return (int) ((Math.random() * ((getHeight() % 30) + 50) + 50));
    }

    public int randomWidth() {
        return (int) ((Math.random() * ((getWidth() % 30) + 40) + 50));
    }

    public int randomX() {
        return (int) ((Math.random() * (getWidth() - 175) + 30));
    }

    public int randomY() {
        return (int) ((Math.random() * (getHeight() - 175) + 30));
    }


    public Thread movingThread() {
        return new Thread(() -> {
            while (true) {
                repaint();
                try {
                    Thread.sleep(2000);
                    Color2 color = new Color2();
                    int checker = (int) (Math.random() * 3);
                    ShapeClass a = new ShapeClass(color, checker, randomX(), randomY(), randomWidth(), randomHeight());
                    shapeArray.add(a);
                    try {

                        fwriter.write(a.type + "-" + a.color.getColor().getRed() +
                                "-" + a.color.getColor().getGreen() +
                                "-" + a.color.getColor().getBlue() +
                                "-" + (a.getX()) +
                                "-" + (a.getY()) +
                                "-" + (a.getWidth()) +
                                "-" + (a.getHeight()) + "\n");
                        fwriter.flush();
                    } catch (IOException ex) {
                        System.err.println(ex);
                    }

                    readShapes();


                } catch (ConcurrentModificationException e) {
                } catch (InterruptedException e) {
                } catch (NullPointerException e) {
                }
            }
        });
    }

    public Thread readingThread() {
        return new Thread(() -> {
            while (true) {
                repaint();
                try {
                    Thread.sleep(2000);
                    Scanner scan = null;
                    try {
                        scan = new Scanner(new File("./src/shapes.txt"));
                    } catch (FileNotFoundException e) {
                        System.err.println(e);
                    }

                    while ((scan.hasNextLine())) {
                        String[] str = scan.nextLine().split("-");

                        int readX, readY, readWidth, readHeight, readType;
                        int readRed = Integer.parseInt(str[1]);
                        int readGreen = Integer.parseInt(str[2]);
                        int readBlue = Integer.parseInt(str[3]);
                        readType = Integer.parseInt(str[0]);
                        readX = Integer.parseInt(str[4]);
                        readY = Integer.parseInt(str[5]);
                        readWidth = Integer.parseInt(str[6]);
                        readHeight = Integer.parseInt(str[7]);

                        Color2 readColor = new Color2();
                        readColor.setColor(readRed, readGreen, readBlue);

                        ShapeClass p = new ShapeClass(readColor, readType, readX, readY, readWidth, readHeight);
                        shapeArray2.add(p);

                    }

                } catch (ConcurrentModificationException e) {
                } catch (InterruptedException e) {
                } catch (NullPointerException e) {
                }
            }
        });

    }

}
