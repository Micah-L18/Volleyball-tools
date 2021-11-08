package old.PracticeType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanPractice {

    Color myblue = new Color(0, 36, 172);
    JButton preview = new JButton();
    JTextField prepractice = new JTextField();
    JTextField Warmup = new JTextField();
    JLabel name = new JLabel();

    JTextField skill = new JTextField();
    JTextField training = new JTextField();
    JTextField skillcontrol = new JTextField();
    JTextField skillexacute = new JTextField();
    JTextField implementskill = new JTextField();
    JTextField play = new JTextField();

    JButton prePracticePlan = new JButton();
    JButton warmUpPlan = new JButton();
    JButton skillPlan = new JButton();
    JButton trainingPlan = new JButton();
    JButton skillcontrolPlan = new JButton();
    JButton skillexacutePlan = new JButton();
    JButton implementskillPlan = new JButton();
    JButton playPlan = new JButton();

    public void planSkillPractice(JPanel TypeDetails,JPanel TypeSelect){
        TypeSelect.setBounds(300,0,980,720);
        TypeSelect.removeAll();

        TypeDetails.setBounds(0,0,300,720);
        TypeDetails.removeAll();

        name.setVisible(true);
        name.setText("Focused Skill Practice");
        name.setBounds(50,25,150,50);
        name.setForeground(myblue);

        prePracticePlan.setVisible(true);
        prePracticePlan.setText("Pre Practice");
        prePracticePlan.setBounds(50,100,200,50);
        prePracticePlan.setBackground(myblue);
        prePracticePlan.setForeground(Color.white);
        prePracticePlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("prepracticeworks");
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

        prepractice.setVisible(true);
        prepractice.setBounds(35,110,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(35,160,400,35);

        skill.setVisible(true);
        skill.setBounds(35,210,400,35);

        training.setVisible(true);
        training.setBounds(35,260,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(35,360,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(35,410,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(35,510,400,35);

        play.setVisible(true);
        play.setBounds(35,560,400,35);

        preview.setVisible(true);
        preview.setText("Preview");
        preview.setBackground(Color.white);
        preview.setForeground(myblue);
        preview.setBounds(825,615,120,45);

        preview.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {

              }
        });

        TypeSelect.add(play);
        TypeSelect.add(preview);
        TypeSelect.add(prepractice);
        TypeSelect.add(Warmup);
        TypeSelect.add(skill);
        TypeSelect.add(training);
        TypeSelect.add(skillcontrol);
        TypeSelect.add(skillexacute);
        TypeSelect.add(implementskill);
        TypeDetails.add(prePracticePlan);
        TypeDetails.add(warmUpPlan);
        TypeDetails.add(skillPlan);
        TypeDetails.add(trainingPlan);
        TypeDetails.add(skillcontrolPlan);
        TypeDetails.add(skillexacutePlan);
        TypeDetails.add(implementskillPlan);
        TypeDetails.add(playPlan);

    }

    public void planLightPractice(JPanel TypeDetails,JPanel TypeSelect){

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);

*/
    }

    public void planHeavyPractice(JPanel TypeDetails,JPanel TypeSelect){

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);
*/
    }

    public void planSpeedPractice(JPanel TypeDetails,JPanel TypeSelect){
        TypeSelect.setBounds(300,0,980,720);
        TypeSelect.removeAll();

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);

*/
    }

    public void planPreTournPractice(JPanel TypeDetails,JPanel TypeSelect){
        TypeSelect.setBounds(300,0,980,720);
        TypeSelect.removeAll();

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);
*/
    }

    public void planPostTournament(JPanel TypeDetails,JPanel TypeSelect){

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);

*/
    }

    public void planSystemPractice(JPanel TypeDetails,JPanel TypeSelect){
        TypeSelect.setBounds(300,0,980,720);
        TypeSelect.removeAll();

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);
*/

    }

    public void planTeamBuildingPractice(JPanel TypeDetails,JPanel TypeSelect){
        TypeSelect.setBounds(300,0,980,720);
        TypeSelect.removeAll();

        TypeDetails.setBounds(0,0,300,720);
/*
        prepractice.setVisible(true);
        prepractice.setBounds(50,105,400,35);

        Warmup.setVisible(true);
        Warmup.setBounds(50,155,400,35);

        skill.setVisible(true);
        skill.setBounds(50,210,400,35);

        training.setVisible(true);
        training.setBounds(50,105,400,35);

        skillcontrol.setVisible(true);
        skillcontrol.setBounds(50,105,400,35);

        skillexacute.setVisible(true);
        skillexacute.setBounds(50,105,400,35);

        implementskill.setVisible(true);
        implementskill.setBounds(50,105,400,35);
*/

    }

}