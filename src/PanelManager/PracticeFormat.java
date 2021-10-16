package PanelManager;

import PracticeType.PracticeSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeFormat {
    /*
    scrollable panel on left
    press button = larger panel on right displays format, with a select button at the bottum
     */
    PracticeSelect SP = new PracticeSelect();
    int i =1;
    public void selectType(JPanel mainPanel, JPanel TypeSelect,JPanel TypeDetails){

        Color myblue = new Color(0, 36, 172);
        Color mybackground = new Color(246, 246, 246);

        TypeSelect = new JPanel();
        TypeSelect.setVisible(true);
        TypeSelect.setBounds(0,0,300,720);
        TypeSelect.setBackground(myblue);
        TypeSelect.setLayout(null);

        TypeDetails = new JPanel();
        TypeDetails.setVisible(true);
        TypeDetails.setBounds(300,0,980,720);
        TypeDetails.setBackground(mybackground);
        mainPanel.add(TypeDetails);

        mainPanel.add(TypeSelect);

        JButton skillPractice= new JButton();
        JButton speedPractice= new JButton();
        JButton lightPractice= new JButton();
        JButton heavyPractice= new JButton();
        JButton PreTournament= new JButton();
        JButton PostTournament= new JButton();
        JButton SystemPractice= new JButton();
        JButton TeamBuildingPractice= new JButton();

        skillPractice.setVisible(true);
        speedPractice.setVisible(true);
        lightPractice.setVisible(true);
        heavyPractice.setVisible(true);
        PreTournament.setVisible(true);
        PostTournament.setVisible(true);
        SystemPractice.setVisible(true);
        TeamBuildingPractice.setVisible(true);

        skillPractice.setBackground(Color.white);
        speedPractice.setBackground(Color.white);
        lightPractice.setBackground(Color.white);
        heavyPractice.setBackground(Color.white);
        PreTournament.setBackground(Color.white);
        PostTournament.setBackground(Color.white);
        SystemPractice.setBackground(Color.white);
        TeamBuildingPractice.setBackground(Color.white);

        skillPractice.setForeground(myblue);
        speedPractice.setForeground(myblue);
        lightPractice.setForeground(myblue);
        heavyPractice.setForeground(myblue);
        PreTournament.setForeground(myblue);
        PostTournament.setForeground(myblue);
        SystemPractice.setForeground(myblue);
        TeamBuildingPractice.setForeground(myblue);

        skillPractice.setBounds(25,25,250,50);
        speedPractice.setBounds(25,100,250,50);
        lightPractice.setBounds(25,175,250,50);
        heavyPractice.setBounds(25,250,250,50);
        PreTournament.setBounds(25,325,250,50);
        PostTournament.setBounds(25,400,250,50);
        SystemPractice.setBounds(25,475,250,50);
        TeamBuildingPractice.setBounds(25,550,250,50);

        skillPractice.setText("Skill Practice");
        speedPractice.setText("Speed Practice");
        lightPractice.setText("Light Practice");
        heavyPractice.setText("Heavy Practice");
        PreTournament.setText("Pre Practice");
        PostTournament.setText("Post Practice");
        SystemPractice.setText("System Practice");
        TeamBuildingPractice.setText("TeamBuilding Practice");

        skillPractice.setToolTipText("");
        speedPractice.setToolTipText("");
        lightPractice.setToolTipText("");
        heavyPractice.setToolTipText("");
        PreTournament.setToolTipText("");
        PostTournament.setToolTipText("");
        SystemPractice.setToolTipText("");
        TeamBuildingPractice.setToolTipText("");

        JPanel finalTypeDetails = TypeDetails;
        skillPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();

                    SP.skillpractice(finalTypeDetails);

            }
        });

        speedPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.speedPractice(finalTypeDetails);
               // selectDetails(mainPanel,TypeDetails);
            }
        });

        lightPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.lightPractice(finalTypeDetails);
                // selectDetails(mainPanel,TypeDetails);
            }
        });

        heavyPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.heavyPractice(finalTypeDetails);
                // selectDetails(mainPanel,TypeDetails);
            }
        });

        PreTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.PreTournament(finalTypeDetails);
                // selectDetails(mainPanel,TypeDetails);
            }
        });

        PostTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.PostTournament(finalTypeDetails);
                // selectDetails(mainPanel,TypeDetails);
            }
        });

        SystemPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.SystemPractice(finalTypeDetails);
                // selectDetails(mainPanel,TypeDetails);
            }
        });

        TeamBuildingPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.repaint();
                SP.TeamBuildingPractice(finalTypeDetails);
                // selectDetails(mainPanel,TypeDetails);
            }
        });

        TypeSelect.add(skillPractice);
        TypeSelect.add(lightPractice);
        TypeSelect.add(heavyPractice);
        TypeSelect.add(PreTournament);
        TypeSelect.add(PostTournament);
        TypeSelect.add(speedPractice);
        TypeSelect.add(SystemPractice);
        TypeSelect.add(TeamBuildingPractice);

    }

}