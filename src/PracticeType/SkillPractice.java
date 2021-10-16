package PracticeType;

import PanelManager.PracticeFormat;

import javax.swing.*;

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

    public void details(JPanel TypeDetails){
        System.out.println("show details works");

        PracticeFormat bob = new PracticeFormat();

        JLabel name = new JLabel();

        name.setVisible(true);
        name.setText("Focused Skill Practice");
        name.setBounds(50,50,150,50);

        TypeDetails.add(name);
    }

    public void plan(){



    }

}
