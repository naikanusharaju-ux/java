 /*5a.Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, 
 France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console 
 whenever the countries are selected on the list.*/

package lab5a;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class CountryListExample {

    public static void main(String[] args) {

        // Run GUI on Event Dispatch Thread (Best Practice)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("Country List Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                frame.setLayout(new BorderLayout());

                // List of countries
                String[] countries = {
                        "USA", "India", "Vietnam", "Canada", "Denmark",
                        "France", "Great Britain", "Japan", "Africa",
                        "Greenland", "Singapore"
                };

                // Create JList
                JList<String> countryList = new JList<>(countries);
                countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                countryList.setVisibleRowCount(8);

                // Add scroll pane
                JScrollPane scrollPane = new JScrollPane(countryList);
                frame.add(scrollPane, BorderLayout.CENTER);

                // Add listener
                countryList.addListSelectionListener(new ListSelectionListener() {
                    public void valueChanged(ListSelectionListener e) {
                        if (!((ListSelectionEvent) e).getValueIsAdjusting()) {
                            java.util.List<String> selectedCountries =
                                    countryList.getSelectedValuesList();
                            System.out.println("Selected countries: " + selectedCountries);
                        }
                    }

					@Override
					public void valueChanged(ListSelectionEvent e) {
						// TODO Auto-generated method stub
						
					}
                });

                // Center window
                frame.setLocationRelativeTo(null);

                // Make visible
                frame.setVisible(true);
            }
        });
    }
}
