package Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeTypes {
    /*
    scrollable panel on left
    press button = larger panel on right displays format, with a select button at the bottum
     */
    PracticePreview SP = new PracticePreview();
    int bob = 0;
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
        TypeDetails.setLayout(null);
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

        skillPractice.setOpaque(true);
        speedPractice.setOpaque(true);
        lightPractice.setOpaque(true);
        heavyPractice.setOpaque(true);
        PostTournament.setOpaque(true);
        PreTournament.setOpaque(true);
        SystemPractice.setOpaque(true);
        TeamBuildingPractice.setOpaque(true);

        skillPractice.setBorderPainted(false);
        speedPractice.setBorderPainted(false);
        lightPractice.setBorderPainted(false);
        heavyPractice.setBorderPainted(false);
        PreTournament.setBorderPainted(false);
        PostTournament.setBorderPainted(false);
        SystemPractice.setBorderPainted(false);
        TeamBuildingPractice.setBorderPainted(false);

/*
        skillPractice.setBorderPainted(false);
        speedPractice.setBorderPainted(false);
        lightPractice.setBorderPainted(false);
        heavyPractice.setBorderPainted(false);
        PreTournament.setBorderPainted(false);
        PostTournament.setBorderPainted(false);
        SystemPractice.setBorderPainted(false);
        TeamBuildingPractice.setBorderPainted(false);

        skillPractice.setFocusPainted(false);
        speedPractice.setFocusPainted(false);
        lightPractice.setFocusPainted(false);
        heavyPractice.setFocusPainted(false);
        PreTournament.setFocusPainted(false);
        PostTournament.setFocusPainted(false);
        SystemPractice.setFocusPainted(false);
        TeamBuildingPractice.setFocusPainted(false);

        skillPractice.setContentAreaFilled(false);
        speedPractice.setContentAreaFilled(false);
        lightPractice.setContentAreaFilled(false);
        heavyPractice.setContentAreaFilled(false);
        PreTournament.setContentAreaFilled(false);
        PostTournament.setContentAreaFilled(false);
        SystemPractice.setContentAreaFilled(false);
        TeamBuildingPractice.setContentAreaFilled(false);

        */

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

        skillPractice.setToolTipText("skill based practice");
        speedPractice.setToolTipText("");
        lightPractice.setToolTipText("");
        heavyPractice.setToolTipText("");
        PreTournament.setToolTipText("");
        PostTournament.setToolTipText("");
        SystemPractice.setToolTipText("");
        TeamBuildingPractice.setToolTipText("");

        SP.displayFormat(TypeDetails);

        JPanel finalTypeDetails = TypeDetails;
        JPanel finalTypeSelect = TypeSelect;
        JButton select = new JButton();

        select.setVisible(false);
        select.setText("Select");
        select.setBackground(myblue);
        select.setOpaque(true);
        select.setBorderPainted(false);
        select.setForeground(Color.white);
        select.setBounds(400,600,120,45);

        skillPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                select.setVisible(true);
                SP.skillpractice(finalTypeDetails,finalTypeSelect,select);
            }
        });

        speedPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.speedPractice(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
            }
        });

        lightPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.lightPractice(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
            }
        });

        heavyPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.heavyPractice(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
            }
        });

        PreTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.PreTournament(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
            }
        });

        PostTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.PostTournament(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
            }
        });

        SystemPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.SystemPractice(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
            }
        });

        TeamBuildingPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SP.TeamBuildingPractice(finalTypeDetails,finalTypeSelect,select);
                select.setVisible(true);
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
        TypeDetails.add(select);

    }

}