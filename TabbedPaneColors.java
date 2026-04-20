/*5b.Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display 
the concerned color whenever the specific tab is selected in the Pan.*/

package lab5b;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneColors {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        tabbedPane.addTab("RED", redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        tabbedPane.addTab("BLUE", bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        tabbedPane.addTab("GREEN", greenPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
