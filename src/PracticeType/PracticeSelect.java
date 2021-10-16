package PracticeType;

import PanelManager.PracticeFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeSelect {

    /*
    JList
    Phase + how long (in minutes)
    Intensity
    Drill

    pre practice
    Warmup
    Skill Discuss
    Training
    Skill Controll
    Skill Exacute
    Implement Skill
    Play
     */

    Color myblue = new Color(0, 36, 172);

    JLabel name = new JLabel();
    JLabel prepractice = new JLabel();
    JLabel Warmup = new JLabel();
    JLabel skill = new JLabel();
    JLabel training = new JLabel();
    JLabel skillcontrol = new JLabel();
    JLabel skillexacute = new JLabel();
    JLabel implementskill = new JLabel();
    JLabel play = new JLabel();
    JButton select = new JButton();

    public void skillpractice(JPanel TypeDetails){
//      System.out.println("show details works");

            name.setVisible(true);
            name.setText("Focused Skill Practice");
            name.setBounds(50,50,150,50);
            name.setForeground(myblue);
//        pre practice

            prepractice.setVisible(true);
            prepractice.setText("Pre~Practice");
            prepractice.setBounds(50,100,150,50);
  //      Warmup

            Warmup.setVisible(true);
            Warmup.setText("Warm-up");
            Warmup.setBounds(50,150,150,50);
  //      Skill Discuss

            skill.setVisible(true);
            skill.setText("Discuss Skill");
            skill.setBounds(50,200,150,50);
  //      Training

            training.setVisible(true);
            training.setText("Training");
            training.setBounds(50,250,150,50);
  //      Skill Controll

            skillcontrol.setVisible(true);
            skillcontrol.setText("Skill Control");
            skillcontrol.setBounds(50,300,150,50);
    //     Skill Exacute

            skillexacute.setVisible(true);
            skillexacute.setText("Skill Exacute");
            skillexacute.setBounds(50,350,150,50);
   //       Implement Skill

            implementskill.setVisible(true);
            implementskill.setText("Implement Skill");
            implementskill.setBounds(50,400,150,50);
 //         Play

            play.setVisible(true);
            play.setText("Play");
            play.setBounds(50,450,150,50);
 //         select

            select.setVisible(true);
            select.setBackground(myblue);
            select.setForeground(Color.white);
            select.setText("Select");
            select.setBounds(400,600,120,45);
            select.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void speedPractice(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Speed Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void lightPractice(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Light Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void heavyPractice(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Heavy Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void PreTournament(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Pre Tournament Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void PostTournament(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Post Tournament Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void SystemPractice(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("System Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void TeamBuildingPractice(JPanel TypeDetails){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Team Building Practice");
        name.setBounds(50,50,150,50);
        name.setForeground(myblue);
//        pre practice

        prepractice.setVisible(true);
        prepractice.setText("Pre~Practice");
        prepractice.setBounds(50,100,150,50);
        //      Warmup

        Warmup.setVisible(true);
        Warmup.setText("Warm-up");
        Warmup.setBounds(50,150,150,50);
        //      Skill Discuss

        skill.setVisible(true);
        skill.setText("Discuss Skill");
        skill.setBounds(50,200,150,50);
        //      Training

        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
        //      Skill Controll

        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skillcontrol.setBounds(50,300,150,50);
        //     Skill Exacute

        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
        //       Implement Skill

        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
        //         Play

        play.setVisible(true);
        play.setText("Play");
        play.setBounds(50,450,150,50);
        //         select

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(select);

    }

    public void plan(){

    }

}
