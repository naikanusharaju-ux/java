/*5d.Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow 
and display the concerned color whenever the specific tab is selected in the Pan*/

package lab5d;

import javax.swing.*;
import javax.swing.plaf.synth.ColorType;

import java.awt.*;

public class TabbedPaneCMY {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CMY Tabs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
