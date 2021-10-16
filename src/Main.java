import PanelManager.PanelOne;
import PanelManager.PracticeFormat;
import PracticeType.SkillPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static JPanel mainPanel;
    public static JPanel TypeSelect;
    public static  JPanel TypeDetails;

    public static void main(String[] args){
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Github\\Volleyball-tools\\src\\icon.png");

        Color myblue = new Color(0, 36, 172);

        PracticeFormat selectPractice = new PracticeFormat();

        mainPanel = new JPanel();

        mainPanel.setVisible(false);
        mainPanel.setBounds(0,0,1280,720);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setIconImage(icon);
        frame.setSize(1280,720);
        frame.setResizable(false);
        frame.setTitle("Practice Planner");
        frame.setLayout(null);

        //----------------------------------

        JButton plan = new JButton();

        plan.setVisible(true);
        plan.setBackground(myblue);
        plan.setForeground(Color.white);
        plan.setBounds(580,360,120,45);
        plan.setText("Plan Practice");
        plan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                plan.setVisible(false);
                selectPractice.selectType(mainPanel,TypeSelect,TypeDetails);

                mainPanel.setVisible(true);

            }

        });

        frame.add(mainPanel);
        frame.add(plan);
        }

}