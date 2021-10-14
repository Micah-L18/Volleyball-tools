package PanelManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeFormat {

    /*
    scrollable panel on left
    press button = larger panel on right displays format, with a select button at the bottum
     */

    public void selectType(JPanel panel, JPanel TypeSelect){
        Color myblue = new Color(0, 36, 172);

        TypeSelect = new JPanel();
        TypeSelect.setVisible(true);
        TypeSelect.setBounds(0,0,300,720);
        TypeSelect.setBackground(myblue);
        TypeSelect.setLayout(null);

        panel.add(TypeSelect);

        JButton skillPractice= new JButton();

        skillPractice.setVisible(true);
        skillPractice.setBackground(Color.white);
        skillPractice.setBounds(25,25,250,50);
        skillPractice.setText("Skill Practice");
        skillPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        TypeSelect.add(skillPractice);

    }

    public void selectDetails(JPanel panel, JPanel TypeDetails){

        TypeDetails = new JPanel();
        TypeDetails.setVisible(true);
        TypeDetails.setBounds(300,0,980,720);
        TypeDetails.setBackground(Color.white);
        panel.add(TypeDetails);

    }

}
