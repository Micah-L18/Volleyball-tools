package TestingStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticePlanner {

    Color myblue = new Color(0, 36, 172);

    //Plan buttons
    JButton practiceDetails = new JButton();
    JButton prePracticePlan = new JButton();
    JButton warmUpPlan = new JButton();
    JButton skillPlan = new JButton();
    JButton trainingPlan = new JButton();
    JButton skillcontrolPlan = new JButton();
    JButton skillexacutePlan = new JButton();
    JButton implementskillPlan = new JButton();
    JButton playPlan = new JButton();

    //details panel
    JLabel practiceType = new JLabel();
    JButton next = new JButton();
    JButton back = new JButton();

    public void planSkill(JPanel TypeDetails, JPanel TypeSelect){

        TypeSelect.setBounds(300,0,980,720);
        TypeSelect.removeAll();

        practiceType.setText("Skill Practice");
        practiceType.setVisible(true);
        practiceType.setBounds(5,5,120,35);
        practiceType.setForeground(Color.white);

        next.setVisible(false);
        next.setText("NEXT");
        next.setBounds(505,630,100,35);
        next.setBackground(Color.white);
        next.setForeground(myblue);

        back.setVisible(false);
        back.setText("BACK");
        back.setBounds(400,630,100,35);
        back.setBackground(Color.white);
        back.setForeground(myblue);

        TypeSelect.add(practiceType);
        TypeSelect.add(next);
        TypeSelect.add(back);

        TypeDetails.setBounds(0,0,300,720);
        TypeDetails.removeAll();

        practiceDetails.setVisible(true);
        practiceDetails.setText("Practice Details");
        practiceDetails.setBounds(50,25,200,50);
        practiceDetails.setBackground(myblue);
        practiceDetails.setForeground(Color.white);
        practiceDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                details();

                System.out.println("prepracticeworks");
            }
        });

        prePracticePlan.setVisible(true);
        prePracticePlan.setText("Pre Practice");
        prePracticePlan.setBounds(50,100,200,50);
        prePracticePlan.setBackground(myblue);
        prePracticePlan.setForeground(Color.white);
        prePracticePlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prePractice();
            }
        });

        warmUpPlan.setVisible(true);
        warmUpPlan.setText("Warmup");
        warmUpPlan.setBounds(50,175,200,50);
        warmUpPlan.setBackground(myblue);
        warmUpPlan.setForeground(Color.white);
        warmUpPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });
        skillPlan.setVisible(true);
        skillPlan.setText("Skill Discuss");
        skillPlan.setBounds(50,250,200,50);
        skillPlan.setBackground(myblue);
        skillPlan.setForeground(Color.white);
        skillPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });

        trainingPlan.setVisible(true);
        trainingPlan.setText("training");
        trainingPlan.setBounds(50,325,200,50);
        trainingPlan.setBackground(myblue);
        trainingPlan.setForeground(Color.white);
        trainingPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });

        skillcontrolPlan.setVisible(true);
        skillcontrolPlan.setText("Skill Control");
        skillcontrolPlan.setBounds(50,400,200,50);
        skillcontrolPlan.setBackground(myblue);
        skillcontrolPlan.setForeground(Color.white);
        skillcontrolPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });
        skillexacutePlan.setVisible(true);
        skillexacutePlan.setText("Skill Exacute");
        skillexacutePlan.setBounds(50,475,200,50);
        skillexacutePlan.setBackground(myblue);
        skillexacutePlan.setForeground(Color.white);
        skillexacutePlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });
        implementskillPlan.setVisible(true);
        implementskillPlan.setText("Implement Skill");
        implementskillPlan.setBounds(50,550,200,50);
        implementskillPlan.setBackground(myblue);
        implementskillPlan.setForeground(Color.white);
        implementskillPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });
        playPlan.setVisible(true);
        playPlan.setText("Play");
        playPlan.setBounds(50,625,200,50);
        playPlan.setBackground(myblue);
        playPlan.setForeground(Color.white);
        playPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
            }
        });

        TypeDetails.add(practiceDetails);
        TypeDetails.add(prePracticePlan);
        TypeDetails.add(warmUpPlan);
        TypeDetails.add(skillPlan);
        TypeDetails.add(trainingPlan);
        TypeDetails.add(skillcontrolPlan);
        TypeDetails.add(skillexacutePlan);
        TypeDetails.add(implementskillPlan);
        TypeDetails.add(playPlan);
    }

    public void details(){

        next.setVisible(true);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                //save details
                prePractice();

            }
        });
        back.setVisible(false);

    }

    public void prePractice(){

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                warmup();
            }
        });

        back.setVisible(true);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                details();
            }
        });

    }

    public void warmup(){

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent c) {

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               prePractice();
            }
        });

    }

}