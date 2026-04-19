/*4a.Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing 
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/




import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class SwingExample {

    SwingExample() {
        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size
        jfrm.setSize(600, 200);

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!", JLabel.CENTER);

        // Set font (plain, size 32)
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));

        // Set text color (blue)
        jlab.setForeground(Color.BLUE);

        // Add label to frame
        jfrm.add(jlab);

        // Make frame visible
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}