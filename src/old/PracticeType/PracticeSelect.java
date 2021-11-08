package old.PracticeType;

import old.TestingStuff.PracticePlanner;

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

    JLabel water1 = new JLabel();
    JLabel water2 = new JLabel();
    JLabel water3 = new JLabel();

    JLabel name = new JLabel();
    JLabel prepractice = new JLabel();
    JLabel Warmup = new JLabel();
    JLabel skill = new JLabel();
    JLabel training = new JLabel();
    JLabel skillcontrol = new JLabel();
    JLabel skillexacute = new JLabel();
    JLabel implementskill = new JLabel();
    JLabel play = new JLabel();

    JLabel PrepracticeTime = new JLabel();
    JLabel warmupTime = new JLabel();
    JLabel SkillTime = new JLabel();
    JLabel trainingTime = new JLabel();
    JLabel skillContolTime = new JLabel();
    JLabel SkillexacuteTime = new JLabel();
    JLabel ImplementskillTime = new JLabel();
    JLabel playTime = new JLabel();

    JLabel water1Time = new JLabel();
    JLabel water2Time = new JLabel();
    JLabel water3Time = new JLabel();

    public void skillpractice(JPanel TypeDetails,JPanel TypeSelect,JButton select){
//      System.out.println("show details works");
            name.setVisible(true);
            name.setText("Focused Skill Practice");
            name.setBounds(50,50,150,50);
            name.setForeground(myblue);
//        pre practice
            prepractice.setVisible(true);
            prepractice.setText("Pre~Practice");
            prepractice.setBounds(50,100,150,50);

            PrepracticeTime.setVisible(true);
            PrepracticeTime.setText("5 Min");
            PrepracticeTime.setBounds(500,100,150,50);
//      Warmup

            Warmup.setVisible(true);
            Warmup.setText("Warm-up");
            Warmup.setBounds(50,150,150,50);

            warmupTime.setVisible(true);
            warmupTime.setText("5 Min");
            warmupTime.setBounds(500,100,150,50);
  //      Skill Discuss

            skill.setVisible(true);
            skill.setText("Discuss Skill");
            skill.setBounds(50,200,150,50);

            SkillTime.setVisible(true);
            SkillTime.setText("5 Min");
            SkillTime.setBounds(500,100,150,50);
  //      Training

            training.setVisible(true);
            training.setText("Training");
            training.setBounds(50,250,150,50);

        trainingTime.setVisible(true);
        trainingTime.setText("5 Min");
        trainingTime.setBounds(500,100,150,50);
  //      water1
            water1.setVisible(true);
            water1.setText("--Water--");
            water1.setBounds(50,300,150,50);

        water1Time.setVisible(true);
        water1Time.setText("5 Min");
        water1Time.setBounds(500,100,150,50);
  //      Skill Controll

            skillcontrol.setVisible(true);
            skillcontrol.setText("Skill Control");
            skillcontrol.setBounds(50,350,150,50);

        skillContolTime.setVisible(true);
        skillContolTime.setText("5 Min");
        skillContolTime.setBounds(500,100,150,50);

    //     Skill Exacute

            skillexacute.setVisible(true);
            skillexacute.setText("Skill Exacute");
            skillexacute.setBounds(50,400,150,50);

        SkillexacuteTime.setVisible(true);
        SkillexacuteTime.setText("5 Min");
        SkillexacuteTime.setBounds(500,100,150,50);
   //       Implement Skill

            water2.setVisible(true);
            water2.setText("--Water--");
            water2.setBounds(50,450,150,50);

        water2Time.setVisible(true);
        water2Time.setText("5 Min");
        water2Time.setBounds(600,100,150,50);

            implementskill.setVisible(true);
            implementskill.setText("Implement Skill");
            implementskill.setBounds(50,500,150,50);

        ImplementskillTime.setVisible(true);
        ImplementskillTime.setText("5 Min");
        ImplementskillTime.setBounds(600,100,150,50);
 //         Play

            play.setVisible(true);
            play.setText("Play");
            play.setBounds(50,550,150,50);

            playTime.setVisible(true);
            playTime.setText("Play");
            playTime.setBounds(600,550,150,50);

        JPanel finalTypeDetails = TypeDetails;
        JPanel finalTypeSelect = TypeSelect;

        SkillexacuteTime.setVisible(true);
        SkillexacuteTime.setText("5 Min");
        SkillexacuteTime.setBounds(500,100,150,50);
 //         select
            select.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   // PlanPractice sp = new PlanPractice();
                   // sp.planSkillPractice(TypeDetails,TypeSelect);
                    select.setVisible(false);
                    PracticePlanner sp = new PracticePlanner();
                    sp.planSkill(finalTypeDetails,finalTypeSelect);

                }
            });

    }

    public void speedPractice(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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


        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp = new PlanPractice();
                sp.planSpeedPractice(TypeDetails,TypeSelect);
                select.setVisible(false);

            }

        });
    }

    public void lightPractice(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp  = new PlanPractice();
                sp.planLightPractice(TypeDetails,TypeSelect);
                select.setVisible(false);

            }
        });
        TypeDetails.add(select);



    }

    public void heavyPractice(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp  = new PlanPractice();
                sp.planHeavyPractice(TypeDetails,TypeSelect);
                select.setVisible(false);

            }
        });


        TypeDetails.add(select);
    }

    public void PreTournament(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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


        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp  = new PlanPractice();
                sp.planPreTournPractice(TypeDetails,TypeSelect);
                select.setVisible(false);

            }

        });

    }

    public void PostTournament(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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


        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp  = new PlanPractice();
                sp.planPostTournament(TypeDetails,TypeSelect);
                select.setVisible(false);

            }
        });




    }

    public void SystemPractice(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp  = new PlanPractice();
                sp.planSystemPractice(TypeDetails,TypeSelect);
                select.setVisible(false);

            }
        });

    }

    public void TeamBuildingPractice(JPanel TypeDetails,JPanel TypeSelect,JButton select){
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


        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlanPractice sp  = new PlanPractice();
                sp.planTeamBuildingPractice(TypeDetails,TypeSelect);
                select.setVisible(false);

            }

        });

    }

    public void displayFormat(JPanel TypeDetails){

        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(Warmup);
        TypeDetails.add(skill);
        TypeDetails.add(training);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillexacute);
        TypeDetails.add(implementskill);
        TypeDetails.add(play);
        TypeDetails.add(water1);
        TypeDetails.add(water2);
        TypeDetails.add(water3);
        TypeDetails.add(PrepracticeTime);
        TypeDetails.add(skillContolTime);
        TypeDetails.add(trainingTime);
        TypeDetails.add(playTime);
        TypeDetails.add(warmupTime);
        TypeDetails.add(water2Time);
        TypeDetails.add(water3Time);

    }

}