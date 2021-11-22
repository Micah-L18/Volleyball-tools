package Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticePreview {

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

    Font font1 = new Font("rockwell", Font.BOLD, 30);
    Font font2 = new Font("rockwell", Font.BOLD, 15);

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
            name.setFont(font1);
            name.setBounds(50,50,400,50);
            name.setForeground(myblue);
//        pre practice
            prepractice.setVisible(true);
            prepractice.setText("Pre~Practice");
            prepractice.setBounds(50,100,150,50);
            prepractice.setFont(font2);

            PrepracticeTime.setVisible(true);
            PrepracticeTime.setText("10 Min");
            PrepracticeTime.setBounds(600,100,150,50);
            PrepracticeTime.setFont(font2);
//      Warmup
            Warmup.setVisible(true);
            Warmup.setText("Warm-up");
            Warmup.setBounds(50,150,150,50);
            Warmup.setFont(font2);

            warmupTime.setVisible(true);
            warmupTime.setText("15 Min");
            warmupTime.setBounds(600,150,150,50);
            warmupTime.setFont(font2);
  //      Skill Discuss
            skill.setVisible(true);
            skill.setText("Discuss Skill");
            skill.setBounds(50,200,150,50);
            skill.setFont(font2);

            SkillTime.setVisible(true);
            SkillTime.setText("5 Min");
            SkillTime.setBounds(600,200,150,50);
            SkillTime.setFont(font2);
  //      Training
            training.setVisible(true);
            training.setText("Training");
            training.setBounds(50,250,150,50);
            training.setFont(font2);

            trainingTime.setVisible(true);
            trainingTime.setText("30 Min");
            trainingTime.setBounds(600,250,150,50);
            trainingTime.setFont(font2);
  //      water1
            water1.setVisible(true);
            water1.setText("--Water--");
            water1.setBounds(50,300,150,50);
            water1.setFont(font2);

            water1Time.setVisible(true);
            water1Time.setText("1 Min");
            water1Time.setBounds(600,300,150,50);
            water1Time.setFont(font2);
  //      Skill Controll
            skillcontrol.setVisible(true);
            skillcontrol.setText("Skill Control");
            skillcontrol.setBounds(50,350,150,50);
            skillcontrol.setFont(font2);

            skillContolTime.setVisible(true);
            skillContolTime.setText("15 Min");
            skillContolTime.setBounds(600,350,150,50);
            skillContolTime.setFont(font2);
    //     Skill Exacute
            skillexacute.setVisible(true);
            skillexacute.setText("Skill Exacute");
            skillexacute.setBounds(50,400,150,50);
            skillexacute.setFont(font2);

            SkillexacuteTime.setVisible(true);
            SkillexacuteTime.setText("15 Min");
            SkillexacuteTime.setBounds(600,400,150,50);
            SkillexacuteTime.setFont(font2);
        //water
            water2.setVisible(true);
            water2.setText("--Water--");
            water2.setBounds(50,450,150,50);
            water2.setFont(font2);

            water2Time.setVisible(true);
            water2Time.setText("1 Min");
            water2Time.setBounds(600,450,150,50);
            water2Time.setFont(font2);
        //Implement Skill
            implementskill.setVisible(true);
            implementskill.setText("Implement Skill");
            implementskill.setBounds(50,500,150,50);
            implementskill.setFont(font2);

            ImplementskillTime.setVisible(true);
            ImplementskillTime.setText("15 Min");
            ImplementskillTime.setBounds(600,500,150,50);
            ImplementskillTime.setFont(font2);
 //         Play
            play.setVisible(true);
            play.setText("Play");
            play.setBounds(50,550,150,50);
            play.setFont(font2);

            playTime.setVisible(true);
            playTime.setText("Till end");
            playTime.setBounds(600,550,150,50);
            playTime.setFont(font2);

            JPanel finalTypeDetails = TypeDetails;
            JPanel finalTypeSelect = TypeSelect;

 //         select
            select.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TypeDetails.removeAll();
                    TypeSelect.removeAll();
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
                TypeDetails.removeAll();
                TypeSelect.removeAll();
                PracticePlanner sp = new PracticePlanner();
                sp.planSpeed(TypeDetails,TypeSelect);
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
                PracticePlanner sp  = new PracticePlanner();
                sp.planLight(TypeDetails,TypeSelect);
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
                PracticePlanner sp  = new PracticePlanner();
                sp.planHeavy(TypeDetails,TypeSelect);
                select.setVisible(false);

            }
        });


        TypeDetails.add(select);
    }

    public void PreTournament(JPanel TypeDetails,JPanel TypeSelect,JButton select){
//      System.out.println("show details works");

        name.setVisible(true);
        name.setText("Pre Tournament Practice");
        name.setBounds(50,50,350,50);
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
                PracticePlanner sp  = new PracticePlanner();
                sp.planPreTourn(TypeDetails,TypeSelect);
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
                PracticePlanner sp  = new PracticePlanner();
                sp.planPostTourn(TypeDetails,TypeSelect);
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
                PracticePlanner sp  = new PracticePlanner();
                sp.planSystem(TypeDetails,TypeSelect);
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
                PracticePlanner sp  = new PracticePlanner();
                sp.planTeam(TypeDetails,TypeSelect);
                select.setVisible(false);

            }

        });

    }

    public void displayFormat(JPanel TypeDetails){

        TypeDetails.add(name);
        TypeDetails.add(prepractice);
        TypeDetails.add(PrepracticeTime);
        TypeDetails.add(Warmup);
        TypeDetails.add(warmupTime);
        TypeDetails.add(skill);
        TypeDetails.add(SkillTime);
        TypeDetails.add(training);
        TypeDetails.add(trainingTime);
        TypeDetails.add(skillcontrol);
        TypeDetails.add(skillContolTime);
        TypeDetails.add(skillexacute);
        TypeDetails.add(SkillexacuteTime);
        TypeDetails.add(implementskill);
        TypeDetails.add(ImplementskillTime);
        TypeDetails.add(play);
        TypeDetails.add(playTime);
        TypeDetails.add(water1);
        TypeDetails.add(water2);
        TypeDetails.add(water3);
        TypeDetails.add(water1Time);
        TypeDetails.add(water2Time);
        TypeDetails.add(water3Time);

    }

}