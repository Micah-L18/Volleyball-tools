package PracticeType;

import PanelManager.PracticeFormat;

import javax.swing.*;
import java.awt.*;

public class SkillPractice {

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

    public void details(JPanel TypeDetails){
//      System.out.println("show details works");

        JLabel name = new JLabel();
            name.setVisible(true);
            name.setText("Focused Skill Practice");
            name.setBounds(50,50,150,50);
            name.setBackground(myblue);

//        pre practice
        JLabel prepractice = new JLabel();
            prepractice.setVisible(true);
            prepractice.setText("Pre~Practice");
            prepractice.setBounds(50,100,150,50);
  //      Warmup
        JLabel Warmup = new JLabel();
            Warmup.setVisible(true);
            Warmup.setText("Warm-up");
            Warmup.setBounds(50,150,150,50);
  //      Skill Discuss
        JLabel skill = new JLabel();
            skill.setVisible(true);
            skill.setText("Discuss Skill");
            skill.setBounds(50,200,150,50);
  //      Training
        JLabel training = new JLabel();
        training.setVisible(true);
        training.setText("Training");
        training.setBounds(50,250,150,50);
  //      Skill Controll
        JLabel skillcontrol = new JLabel();
        skillcontrol.setVisible(true);
        skillcontrol.setText("Skill Control");
        skill.setBounds(50,300,150,50);
  //      Skill Exacute
        JLabel skillexacute = new JLabel();
        skillexacute.setVisible(true);
        skillexacute.setText("Skill Exacute");
        skillexacute.setBounds(50,350,150,50);
  //      Implement Skill
        JLabel implementskill = new JLabel();
        implementskill.setVisible(true);
        implementskill.setText("Implement Skill");
        implementskill.setBounds(50,400,150,50);
//        Play
        JLabel play = new JLabel();
        play.setVisible(true);
        play.setText("Warm-up");
        play.setBounds(50,450,150,50);

        JButton select = new JButton();

        select.setVisible(true);
        select.setBackground(myblue);
        select.setForeground(Color.white);
        select.setText("Select");
        select.setBounds(400,600,120,45);

        TypeDetails.add(select);
        TypeDetails.add(name);
        TypeDetails.add(skill);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);

    }

    public void plan(){

    }

}
