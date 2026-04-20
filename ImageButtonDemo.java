/*4c.Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is 
pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by 
implementing the event handling mechanism with addActionListener( ).*/

package lab4c;

import javax.swing.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Buttons");

        JButton clockBtn = new JButton("Digital Clock", new ImageIcon("clock.png"));
        JButton hourGlassBtn = new JButton("Hour Glass", new ImageIcon("hourglass.png"));
        JLabel label = new JLabel("", JLabel.CENTER);

        clockBtn.addActionListener(e -> label.setText("Digital Clock is pressed"));
        hourGlassBtn.addActionListener(e -> label.setText("Hour Glass is pressed"));

        frame.setLayout(new java.awt.GridLayout(3,1));
        frame.add(clockBtn);
        frame.add(hourGlassBtn);
        frame.add(label);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

