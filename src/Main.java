import PanelManager.PanelOne;
import PanelManager.PracticeFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static JPanel mainPanel;
    public static JPanel TypeSelect;
    public static JPanel TypeDetails;


    public static void main(String[] args){

        PanelOne panelDetails = new PanelOne();
        PracticeFormat selectPractice = new PracticeFormat();

        mainPanel = new JPanel();

        mainPanel.setVisible(false);
        mainPanel.setBounds(0,0,1280,720);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(1280,720);
        frame.setResizable(false);
        frame.setTitle("Practice Planner");
        frame.setLayout(null);

        //----------------------------------

        JButton plan = new JButton();

        plan.setVisible(true);
        plan.setBounds(580,360,120,45);
        plan.setText("Plan Practice");
        plan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                plan.setVisible(false);
                selectPractice.selectType(mainPanel,TypeSelect);
                selectPractice.selectDetails(mainPanel,TypeDetails);
                mainPanel.setVisible(true);

            }

        });

        frame.add(mainPanel);
        frame.add(plan);

        }

}