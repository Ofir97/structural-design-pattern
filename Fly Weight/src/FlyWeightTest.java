import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FlyWeightTest extends JFrame {

    /**
     * Used when you need to create a large number of similar objects
     * To reduce memory usage you share Objects that are similar in some way rather than creating new ones
     * Intrinsic state: Color
     * Extrinsic state: Size
     */

    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 150;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
    Color.blue, Color.pink, Color.cyan, Color.magenta,
    Color.black, Color.gray};

    public FlyWeightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw!");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(e -> {
            Graphics g = drawingPanel.getGraphics();

            long startTime = System.currentTimeMillis();

            for (int i=0; i < 100000; i++) {
                MyRect rect = RectFactory.getRect(getRandColor());
                rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
            }

            long endTime = System.currentTimeMillis();

            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private int getRandY() {
        return (int)(Math.random()*windowHeight);
    }

    private int getRandX() {
        return (int)(Math.random()*windowWidth);
    }

    private Color getRandColor() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(shapeColor.length);
        return shapeColor[rndInt];
    }

    public static void main(String[] args) {

        new FlyWeightTest();

    }



}
