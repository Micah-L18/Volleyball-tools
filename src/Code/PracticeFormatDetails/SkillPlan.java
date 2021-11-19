package Code.PracticeFormatDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SkillPlan {
    //look at these fonts?
    //https://alvinalexander.com/blog/post/jfc-swing/swing-faq-list-fonts-current-platform/

    Font font1 = new Font("rockwell", Font.BOLD, 30);
    Font font2 = new Font("rockwell", Font.BOLD, 15);

    Color myblue = new Color(0, 36, 172);

    public String Details_Skill ="";
    public String Details_Equipment="";
    public String Details_Notes="";
    public String Details_Date="";

    public void details(JPanel TypeSelect){

        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(25,0,300,75);
            labelMain.setText("Practice Details");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);
            labelMain.setFont(font1);

        JLabel skill = new JLabel();
            skill.setVisible(true);
            skill.setText(Details_Skill);
            skill.setBounds(25,15,300,100);
            skill.setForeground(Color.white);
            skill.setFont(font2);
            TypeSelect.add(skill);

        JLabel labelEquipment = new JLabel();
            labelEquipment.setText("Equipment");
            labelEquipment.setVisible(true);
            labelEquipment.setFont(font2);
            labelEquipment.setBounds(20,150,150,120);
            labelEquipment.setForeground(Color.white);

        JTextArea equipmentlist = new JTextArea();
            equipmentlist.setVisible(true);
            equipmentlist.setFont(font2);
            equipmentlist.setText(Details_Equipment);
            equipmentlist.setBounds(125,200,750,100);
            equipmentlist.setForeground(myblue);
            equipmentlist.setBackground(Color.white);

        JLabel dateLabel = new JLabel();
            dateLabel.setVisible(true);
            dateLabel.setBounds(550,55,150,120);
            dateLabel.setText("Date");
            dateLabel.setFont(font2);
            dateLabel.setForeground(Color.white);
            dateLabel.setBackground(Color.white);

        JTextField dateText = new JTextField();
            dateText.setVisible(true);
            dateText.setFont(font2);
            dateText.setText(Details_Date);
            dateText.setBounds(600,100,150,30);
            dateText.setForeground(myblue);
            dateText.setBackground(Color.white);

        JLabel skillFocusLabel = new JLabel();
            skillFocusLabel.setVisible(true);
            skillFocusLabel.setBounds(25,55,150,120);
            skillFocusLabel.setText("Skill Focus");
            skillFocusLabel.setFont(font2);
            skillFocusLabel.setForeground(Color.white);
            skillFocusLabel.setBackground(Color.white);

        JTextField skillFocus = new JTextField();
            skillFocus.setVisible(true);
            skillFocus.setFont(font2);
            skillFocus.setText(Details_Skill);
            skillFocus.setBounds(125,100,325,30);
            skillFocus.setForeground(myblue);
            skillFocus.setBackground(Color.white);

        JLabel notelabel = new JLabel();
            notelabel.setVisible(true);
            notelabel.setBounds(35,300,150,120);
            notelabel.setText("Notes");
            notelabel.setForeground(Color.white);
            notelabel.setBackground(Color.white);
            notelabel.setFont(font2);

        JTextArea notes = new JTextArea();
            notes.setVisible(true);
            notes.setFont(font2);
            notes.setText(Details_Notes);
            notes.setBounds(125,350,750,200);
            notes.setForeground(myblue);
            notes.setBackground(Color.white);

        JButton next = new JButton();
            next.setVisible(true);
            next.setBackground(Color.white);
            next.setText("NEXT");
            next.setForeground(myblue);
            next.setBounds(815,620,100,35);
            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //save inputs
                    Details_Date = dateText.getText();
                    Details_Skill = skillFocus.getText();
                    Details_Notes = notes.getText();
                    Details_Equipment = equipmentlist.getText();
                    TypeSelect.removeAll();
                    prePractice(TypeSelect);
                }
            });

        TypeSelect.add(dateLabel);
        TypeSelect.add(dateText);
        TypeSelect.add(equipmentlist);
        TypeSelect.add(labelEquipment);
        TypeSelect.add(notelabel);
        TypeSelect.add(notes);
        TypeSelect.add(skillFocusLabel);
        TypeSelect.add(skillFocus);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public String PrePractice_Streatch="";
    public String PrePractice_Condition="";
    public String PrePractice_Coordination="";

    public void prePractice(JPanel TypeSelect){
        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(25,0,300,75);
            labelMain.setText("Pre Practice");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);
            labelMain.setFont(font1);

        JLabel stretchLabel = new JLabel();
            stretchLabel.setForeground(Color.white);
            stretchLabel.setVisible(true);
            stretchLabel.setBounds(125,75,200,100);
            stretchLabel.setText("Stretch Order");
            stretchLabel.setFont(font2);

        JLabel conditionLabel = new JLabel();
            conditionLabel.setForeground(Color.white);
            conditionLabel.setVisible(true);
            conditionLabel.setBounds(425,75,200,100);
            conditionLabel.setText("Conditioning");
            conditionLabel.setFont(font2);

        JLabel CoordinationLabel = new JLabel();
            CoordinationLabel.setForeground(Color.white);
            CoordinationLabel.setVisible(true);
            CoordinationLabel.setBounds(700,75,200,100);
            CoordinationLabel.setText("Coordination Order");
            CoordinationLabel.setFont(font2);

        JTextArea StreatchList = new JTextArea();
            StreatchList.setVisible(true);
            StreatchList.setFont(font2);
            StreatchList.setBounds(50,140,250,450);
            StreatchList.setForeground(myblue);
            StreatchList.setBackground(Color.white);
            StreatchList.setText(PrePractice_Streatch);

        JTextArea ConditionList = new JTextArea();
            ConditionList.setVisible(true);
            ConditionList.setFont(font2);
            ConditionList.setBounds(350,140,250,450);
            ConditionList.setForeground(myblue);
            ConditionList.setBackground(Color.white);
            ConditionList.setText(PrePractice_Condition);

        JTextArea CoordinationList = new JTextArea();
            CoordinationList.setVisible(true);
            CoordinationList.setFont(font2);
            CoordinationList.setBounds(650,140,250,450);
            CoordinationList.setForeground(myblue);
            CoordinationList.setBackground(Color.white);
            CoordinationList.setText(PrePractice_Coordination);

        JButton next = new JButton();
            next.setVisible(true);
            next.setBackground(Color.white);
            next.setText("NEXT");
            next.setForeground(myblue);
            next.setBounds(815,620,100,35);
            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    PrePractice_Streatch = StreatchList.getText();
                    PrePractice_Condition = ConditionList.getText();
                    PrePractice_Coordination = CoordinationList.getText();

                    TypeSelect.removeAll();
                    warmup(TypeSelect);
                }
            });

        JButton back = new JButton();
            back.setVisible(true);
            back.setBackground(Color.white);
            back.setText("BACK");
            back.setForeground(myblue);
            back.setBounds(700,620,100,35);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TypeSelect.removeAll();
                    details(TypeSelect);
                }
            });

        TypeSelect.add(ConditionList);
        TypeSelect.add(CoordinationList);
        TypeSelect.add(StreatchList);
        TypeSelect.add(CoordinationLabel);
        TypeSelect.add(conditionLabel);
        TypeSelect.add(stretchLabel);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public String Warmup_drill="";
    public String Warmup_details="";
    public String Warmup_notes="";

    public void warmup(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Warmup");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);

        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel warmupDrill = new JLabel();
        warmupDrill.setText("Drill");
        warmupDrill.setForeground(Color.white);
        warmupDrill.setFont(font2);
        warmupDrill.setBounds(35,100,200,50);
        warmupDrill.setVisible(true);

        JLabel drilldetailsLabel = new JLabel();
        drilldetailsLabel.setText("Drill Details");
        drilldetailsLabel.setForeground(Color.white);
        drilldetailsLabel.setFont(font2);
        drilldetailsLabel.setBounds(20,200,200,50);
        drilldetailsLabel.setVisible(true);

        JLabel noteLabel = new JLabel();
        noteLabel.setText("Notes");
        noteLabel.setForeground(Color.white);
        noteLabel.setFont(font2);
        noteLabel.setBounds(20,500,200,50);
        noteLabel.setVisible(true);

        JTextArea notes = new JTextArea();
        notes.setVisible(true);
        notes.setFont(font2);
        notes.setBounds(150,500,650,100);
        notes.setForeground(myblue);
        notes.setText(Warmup_notes);

        JTextArea drilldetails = new JTextArea();
        drilldetails.setVisible(true);
        drilldetails.setFont(font2);
        drilldetails.setBounds(150,200,650,250);
        drilldetails.setForeground(myblue);
        drilldetails.setText(Warmup_details);

        JTextField drillname = new JTextField();
        drillname.setVisible(true);
        drillname.setFont(font2);
        drillname.setBounds(150,100,400,35);
        drillname.setForeground(myblue);
        drillname.setText(Warmup_drill);

        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Warmup_drill = drillname.getText();
                Warmup_details = drilldetails.getText();
                Warmup_notes = notes.getText();

                TypeSelect.removeAll();
                skill(TypeSelect);
            }
        });

        JButton back = new JButton();

        back.setVisible(true);
        back.setBackground(Color.white);
        back.setText("BACK");
        back.setForeground(myblue);
        back.setBounds(700,620,100,35);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeSelect.removeAll();
                prePractice(TypeSelect);
            }
        });
        TypeSelect.add(skill);
        TypeSelect.add(notes);
        TypeSelect.add(noteLabel);
        TypeSelect.add(drilldetailsLabel);
        TypeSelect.add(drillname);
        TypeSelect.add(drilldetails);
        TypeSelect.add(warmupDrill);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public String Skill_tech="";
    public String Skill_footwork="";
    public String Skill_fun="";
    public String Skill_notes="";

    public void skill(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(25,0,300,75);
            labelMain.setText("Teach Skill");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);
            labelMain.setFont(font1);
        JLabel skill = new JLabel();
            skill.setVisible(true);
            skill.setText(Details_Skill);
            skill.setBounds(25,15,300,100);
            skill.setForeground(Color.white);
            skill.setFont(font2);
        JLabel techniqueLabel = new JLabel();
            techniqueLabel.setVisible(true);
            techniqueLabel.setText("Technique");
            techniqueLabel.setBounds(185,50,100,100);
            techniqueLabel.setForeground(Color.white);
            techniqueLabel.setFont(font2);
        JLabel footworkLabel = new JLabel();
            footworkLabel.setVisible(true);
            footworkLabel.setText("Footwork");
            footworkLabel.setBounds(485,50,100,100);
            footworkLabel.setForeground(Color.white);
            footworkLabel.setFont(font2);
        JLabel fundamentalLabel = new JLabel();
            fundamentalLabel.setVisible(true);
            fundamentalLabel.setText("Fundamentals");
            fundamentalLabel.setBounds(775,50,300,100);
            fundamentalLabel.setForeground(Color.white);
            fundamentalLabel.setFont(font2);
        JLabel notelabel = new JLabel();
            notelabel.setVisible(true);
            notelabel.setBounds(350,475,150,120);
            notelabel.setText("Notes");
            notelabel.setForeground(Color.white);
            notelabel.setBackground(Color.white);
            notelabel.setFont(font2);

        JTextArea fundamentals = new JTextArea();
            fundamentals.setVisible(true);
            fundamentals.setFont(font2);
            fundamentals.setBounds(700,125,250,350);
            fundamentals.setForeground(myblue);
            fundamentals.setBackground(Color.white);
            fundamentals.setText(Skill_fun);
        JTextArea footwork = new JTextArea();
            footwork.setVisible(true);
            footwork.setFont(font2);
            footwork.setBounds(400,125,250,350);
            footwork.setForeground(myblue);
            footwork.setBackground(Color.white);
            footwork.setText(Skill_footwork);
        JTextArea technique = new JTextArea();
            technique.setVisible(true);
            technique.setFont(font2);
            technique.setBounds(100,125,250,350);
            technique.setForeground(myblue);
            technique.setBackground(Color.white);
            technique.setText(Skill_tech);
        JTextArea notes = new JTextArea();
            notes.setVisible(true);
            notes.setFont(font2);
            notes.setBounds(100,550,550,100);
            notes.setForeground(myblue);
            notes.setBackground(Color.white);
            notes.setText(Skill_notes);
        JButton next = new JButton();
            next.setVisible(true);
            next.setBackground(Color.white);
            next.setText("NEXT");
            next.setForeground(myblue);
            next.setBounds(815,620,100,35);
            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Skill_footwork = footwork.getText();
                    Skill_fun = fundamentals.getText();
                    Skill_notes = notes.getText();
                    Skill_tech = technique.getText();

                    TypeSelect.removeAll();
                    training(TypeSelect);
                }
            });
        JButton back = new JButton();
            back.setVisible(true);
            back.setBackground(Color.white);
            back.setText("BACK");
            back.setForeground(myblue);
            back.setBounds(700,620,100,35);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TypeSelect.removeAll();
                    warmup(TypeSelect);
                }
            });

        TypeSelect.add(footwork);
        TypeSelect.add(fundamentals);
        TypeSelect.add(technique);
        TypeSelect.add(notes);
        TypeSelect.add(notelabel);
        TypeSelect.add(footworkLabel);
        TypeSelect.add(fundamentalLabel);
        TypeSelect.add(techniqueLabel);
        TypeSelect.add(skill);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

    public String Train_drill="";
    public String Train_details="";
    public String Train_notes="";

    public void training(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Training Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);

        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel warmupDrill = new JLabel();
        warmupDrill.setText("Training drill");
        warmupDrill.setForeground(Color.white);
        warmupDrill.setFont(font2);
        warmupDrill.setBounds(35,100,200,50);
        warmupDrill.setVisible(true);

        JLabel drilldetailsLabel = new JLabel();
        drilldetailsLabel.setText("Drill Details");
        drilldetailsLabel.setForeground(Color.white);
        drilldetailsLabel.setFont(font2);
        drilldetailsLabel.setBounds(20,200,200,50);
        drilldetailsLabel.setVisible(true);

        JLabel noteLabel = new JLabel();
        noteLabel.setText("Notes");
        noteLabel.setForeground(Color.white);
        noteLabel.setFont(font2);
        noteLabel.setBounds(20,500,200,50);
        noteLabel.setVisible(true);

        JTextArea notes = new JTextArea();
        notes.setVisible(true);
        notes.setFont(font2);
        notes.setBounds(150,500,650,100);
        notes.setForeground(myblue);

        JTextArea drilldetails = new JTextArea();
        drilldetails.setVisible(true);
        drilldetails.setFont(font2);
        drilldetails.setBounds(150,200,650,250);
        drilldetails.setForeground(myblue);


        JTextField drillname = new JTextField();
        drillname.setVisible(true);
        drillname.setFont(font2);
        drillname.setBounds(150,100,400,35);
        drillname.setForeground(myblue);

        drilldetails.setText(Train_details);
        notes.setText(Train_notes);
        drillname.setText(Train_drill);

        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Train_details = drilldetails.getText();
                Train_notes = notes.getText();
                Train_drill = drillname.getText();

                TypeSelect.removeAll();
                control(TypeSelect);
            }
        });
        JButton back = new JButton();
        back.setVisible(true);
        back.setBackground(Color.white);
        back.setText("BACK");
        back.setForeground(myblue);
        back.setBounds(700,620,100,35);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeSelect.removeAll();
                skill(TypeSelect);
            }
        });

        TypeSelect.add(skill);
        TypeSelect.add(notes);
        TypeSelect.add(noteLabel);
        TypeSelect.add(drilldetailsLabel);
        TypeSelect.add(drillname);
        TypeSelect.add(drilldetails);
        TypeSelect.add(warmupDrill);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public String Control_notes="";
    public String Control_drill="";
    public String Control_details="";

    public void control(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Control Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);

        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel warmupDrill = new JLabel();
        warmupDrill.setText("Drill");
        warmupDrill.setForeground(Color.white);
        warmupDrill.setFont(font2);
        warmupDrill.setBounds(35,100,200,50);
        warmupDrill.setVisible(true);

        JLabel drilldetailsLabel = new JLabel();
        drilldetailsLabel.setText("Drill Details");
        drilldetailsLabel.setForeground(Color.white);
        drilldetailsLabel.setFont(font2);
        drilldetailsLabel.setBounds(20,200,200,50);
        drilldetailsLabel.setVisible(true);

        JLabel noteLabel = new JLabel();
        noteLabel.setText("Notes");
        noteLabel.setForeground(Color.white);
        noteLabel.setFont(font2);
        noteLabel.setBounds(20,500,200,50);
        noteLabel.setVisible(true);

        JTextArea notes = new JTextArea();
        notes.setVisible(true);
        notes.setFont(font2);
        notes.setBounds(150,500,650,100);
        notes.setForeground(myblue);

        JTextArea drilldetails = new JTextArea();
        drilldetails.setVisible(true);
        drilldetails.setFont(font2);
        drilldetails.setBounds(150,200,650,250);
        drilldetails.setForeground(myblue);

        JTextField drillname = new JTextField();
        drillname.setVisible(true);
        drillname.setFont(font2);
        drillname.setBounds(150,100,400,35);
        drillname.setForeground(myblue);

        drilldetails.setText(Control_details);
        notes.setText(Control_notes);
        drillname.setText(Control_drill);

        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_drill = drillname.getText();
                Control_notes = notes.getText();
                Control_details = drilldetails.getText();

                TypeSelect.removeAll();
                execute(TypeSelect);
            }
        });
        JButton back = new JButton();

        back.setVisible(true);
        back.setBackground(Color.white);
        back.setText("BACK");
        back.setForeground(myblue);
        back.setBounds(700,620,100,35);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeSelect.removeAll();
                training(TypeSelect);
            }
        });
        TypeSelect.add(notes);
        TypeSelect.add(noteLabel);
        TypeSelect.add(drilldetailsLabel);
        TypeSelect.add(drillname);
        TypeSelect.add(drilldetails);
        TypeSelect.add(warmupDrill);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

    public String Exacute_drill="";
    public String Exacute_details="";
    public String Exacute_notes="";

    public void execute(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Execute Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);

        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel warmupDrill = new JLabel();
        warmupDrill.setText("Drill");
        warmupDrill.setForeground(Color.white);
        warmupDrill.setFont(font2);
        warmupDrill.setBounds(35,100,200,50);
        warmupDrill.setVisible(true);

        JLabel drilldetailsLabel = new JLabel();
        drilldetailsLabel.setText("Drill Details");
        drilldetailsLabel.setForeground(Color.white);
        drilldetailsLabel.setFont(font2);
        drilldetailsLabel.setBounds(20,200,200,50);
        drilldetailsLabel.setVisible(true);

        JLabel noteLabel = new JLabel();
        noteLabel.setText("Notes");
        noteLabel.setForeground(Color.white);
        noteLabel.setFont(font2);
        noteLabel.setBounds(20,500,200,50);
        noteLabel.setVisible(true);

        JTextArea notes = new JTextArea();
        notes.setVisible(true);
        notes.setFont(font2);
        notes.setBounds(150,500,650,100);
        notes.setForeground(myblue);

        JTextArea drilldetails = new JTextArea();
        drilldetails.setVisible(true);
        drilldetails.setFont(font2);
        drilldetails.setBounds(150,200,650,250);
        drilldetails.setForeground(myblue);

        JTextField drillname = new JTextField();
        drillname.setVisible(true);
        drillname.setFont(font2);
        drillname.setBounds(150,100,400,35);
        drillname.setForeground(myblue);

        drilldetails.setText(Exacute_details);
        notes.setText(Exacute_notes);
        drillname.setText(Exacute_drill);

        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exacute_details = drilldetails.getText();
                Exacute_drill = drillname.getText();
                Exacute_notes = notes.getText();
                TypeSelect.removeAll();
                impalement(TypeSelect);
            }
        });
        JButton back = new JButton();

        back.setVisible(true);
        back.setBackground(Color.white);
        back.setText("BACK");
        back.setForeground(myblue);
        back.setBounds(700,620,100,35);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeSelect.removeAll();
                control(TypeSelect);
            }
        });

        TypeSelect.add(skill);
        TypeSelect.add(notes);
        TypeSelect.add(noteLabel);
        TypeSelect.add(drilldetailsLabel);
        TypeSelect.add(drillname);
        TypeSelect.add(drilldetails);
        TypeSelect.add(warmupDrill);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public String Imp_drill="";
    public String Imp_details="";
    public String Imp_notes="";

    public void impalement(JPanel TypeSelect) {
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Implement Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);

        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel warmupDrill = new JLabel();
        warmupDrill.setText("Drill");
        warmupDrill.setForeground(Color.white);
        warmupDrill.setFont(font2);
        warmupDrill.setBounds(35,100,200,50);
        warmupDrill.setVisible(true);

        JLabel drilldetailsLabel = new JLabel();
        drilldetailsLabel.setText("Drill Details");
        drilldetailsLabel.setForeground(Color.white);
        drilldetailsLabel.setFont(font2);
        drilldetailsLabel.setBounds(20,200,200,50);
        drilldetailsLabel.setVisible(true);

        JLabel noteLabel = new JLabel();
        noteLabel.setText("Notes");
        noteLabel.setForeground(Color.white);
        noteLabel.setFont(font2);
        noteLabel.setBounds(20,500,200,50);
        noteLabel.setVisible(true);

        JTextArea notes = new JTextArea();
        notes.setVisible(true);
        notes.setFont(font2);
        notes.setBounds(150,500,650,100);
        notes.setForeground(myblue);

        JTextArea drilldetails = new JTextArea();
        drilldetails.setVisible(true);
        drilldetails.setFont(font2);
        drilldetails.setBounds(150,200,650,250);
        drilldetails.setForeground(myblue);

        JTextField drillname = new JTextField();
        drillname.setVisible(true);
        drillname.setFont(font2);
        drillname.setBounds(150,100,400,35);
        drillname.setForeground(myblue);

        drilldetails.setText(Imp_details);
        notes.setText(Imp_notes);
        drillname.setText(Imp_drill);


        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Imp_drill = drillname.getText();
                Imp_notes = notes.getText();
                Imp_details = drilldetails.getText();

                TypeSelect.removeAll();
                play(TypeSelect);
            }
        });
        JButton back = new JButton();

        back.setVisible(true);
        back.setBackground(Color.white);
        back.setText("BACK");
        back.setForeground(myblue);
        back.setBounds(700,620,100,35);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeSelect.removeAll();
                execute(TypeSelect);
            }
        });

        TypeSelect.add(skill);
        TypeSelect.add(notes);
        TypeSelect.add(noteLabel);
        TypeSelect.add(drilldetailsLabel);
        TypeSelect.add(drillname);
        TypeSelect.add(drilldetails);
        TypeSelect.add(warmupDrill);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

    public String Play_TeamB="";
    public String Play_TeamA="";
    public String Play_notes="";

    public void play(JPanel TypeSelect){
        JLabel skill = new JLabel();
        skill.setVisible(true);
        skill.setText(Details_Skill);
        skill.setBounds(25,15,300,100);
        skill.setForeground(Color.white);
        skill.setFont(font2);
        TypeSelect.add(skill);

        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(25,0,300,75);
            labelMain.setText("Play");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);
            labelMain.setFont(font1);

        JLabel team1Label = new JLabel();
            team1Label.setText("Team 1");
            team1Label.setForeground(Color.white);
            team1Label.setFont(font2);
            team1Label.setBounds(200,50,200,50);
            team1Label.setVisible(true);
        JLabel team2Label = new JLabel();
            team2Label.setText("Team 2");
            team2Label.setForeground(Color.white);
            team2Label.setFont(font2);
            team2Label.setBounds(600,50,200,50);
            team2Label.setVisible(true);
        JLabel notelabel = new JLabel();
            notelabel.setVisible(true);
            notelabel.setBounds(350,475,150,120);
            notelabel.setText("Notes");
            notelabel.setForeground(Color.white);
            notelabel.setBackground(Color.white);
            notelabel.setFont(font2);

        JTextArea teamA = new JTextArea();
            teamA.setVisible(true);
            teamA.setFont(font2);
            teamA.setBounds(100,100,300,400);
            teamA.setForeground(myblue);
        JTextArea TeamB = new JTextArea();
            TeamB.setVisible(true);
            TeamB.setFont(font2);
            TeamB.setBounds(500,100,300,400);
            TeamB.setForeground(myblue);
        JTextArea notes = new JTextArea();
            notes.setVisible(true);
            notes.setFont(font2);
            notes.setBounds(100,550,550,100);
            notes.setForeground(myblue);
            notes.setBackground(Color.white);

        TeamB.setText(Play_TeamB);
        notes.setText(Play_notes);
        teamA.setText(Play_TeamA);

        JButton PREVIEW = new JButton();
            PREVIEW.setVisible(true);
            PREVIEW.setBackground(Color.white);
            PREVIEW.setText("PREVIEW");
            PREVIEW.setForeground(myblue);
            PREVIEW.setBounds(815,620,100,35);
            PREVIEW.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //save
                    Play_notes = notes.getText();
                    Play_TeamA = teamA.getText();
                    Play_TeamB = TeamB.getText();

                    Preivew();
                }
            });
        JButton back = new JButton();
            back.setVisible(true);
            back.setBackground(Color.white);
            back.setText("BACK");
            back.setForeground(myblue);
            back.setBounds(700,620,100,35);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TypeSelect.removeAll();
                    impalement(TypeSelect);
                }
            });

        TypeSelect.add(skill);
        TypeSelect.add(team1Label);
        TypeSelect.add(team2Label);
        TypeSelect.add(teamA);
        TypeSelect.add(TeamB);
        TypeSelect.add(notelabel);
        TypeSelect.add(notes);
        TypeSelect.add(back);
        TypeSelect.add(PREVIEW);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

    public String Plans;

    public void Preivew(){
        JFrame previewFrame = new JFrame();
            previewFrame.setLayout(null);
            previewFrame.setVisible(true);
            previewFrame.setSize(600,720);
            previewFrame.setResizable(false);
            previewFrame.setTitle("Preview");
        //make a scrollable view of documents
        //fill

        JTextArea formatedPractice = new JTextArea(50,10);
        formatedPractice.setText(
                        "Practice Plan ( " + Details_Date+")"+
                        "\n"+"\n"+
                        "\nSkill: "+Details_Skill+"\n"+

                        "\nEquipment: "+ "\n"+Details_Equipment+"\n"+
                        "\nPractice Notes: "+ "\n"+Details_Notes+"\n"+
                        "\n"+
                        "\nStretch: "+ "\n"+PrePractice_Streatch+"\n"+
                        "\nCondition: "+ "\n"+PrePractice_Condition+"\n"+
                        "\nCoordination: "+ "\n"+PrePractice_Coordination+"\n"+
                        "\n"+
                        "\nWarmup Drill: "+Warmup_drill+"\n"+
                        "\nWarmup Details: "+ "\n"+Warmup_details+"\n"+
                        "\nWarmup Notes: "+ "\n"+Warmup_notes +"\n"+
                        "\n"+
                        "\nFocus Fundamentals: "+ "\n"+Skill_fun +"\n"+
                        "\nFocus Footwork: "+ "\n"+Skill_footwork +"\n"+
                        "\nFocus Technique: "+ "\n"+Skill_tech +"\n"+
                        "\nFocus Notes: "+ "\n"+Skill_notes +"\n"+
                        "\n"+
                        "\nTraining Drill: "+Train_drill+"\n"+
                        "\nTraining Details: "+ "\n"+Train_details+"\n"+
                        "\nTraining Notes: "+ "\n"+Train_notes +"\n"+
                        "\n"+
                        "\nControl Drill: "+Control_drill+"\n"+
                        "\nControl Details: "+ "\n"+Control_details+"\n"+
                        "\nControl notes: "+ "\n"+Control_notes +"\n"+
                        "\n"+
                        "\nExecute Drill: "+Exacute_drill+"\n"+
                        "\nExecute Details: "+ "\n"+Exacute_details+"\n"+
                        "\nExecute Notes: "+ "\n"+Exacute_notes+"\n"+
                        "\n"+
                        "\nImplement Drill: "+Imp_drill+"\n"+
                        "\nImplement Details: "+ "\n"+Imp_details+"\n"+
                        "\nImplement Notes: "+ "\n"+Imp_notes+"\n"+
                        "\n"+
                        "\nTeam A: "+ "\n"+Play_TeamA+"\n"+
                        "\nTeam B: "+ "\n"+Play_TeamB+"\n"+
                        "\nScrimmage Notes: "+ "\n"+Play_notes

        );
        formatedPractice.setVisible(true);
        formatedPractice.getScrollableTracksViewportHeight();
        formatedPractice.setFont(font2);
        formatedPractice.setForeground(myblue);
        formatedPractice.setBounds(10,10,580,625);
        formatedPractice.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(formatedPractice);
        scrollPane.setVisible(true);
        scrollPane.setBounds(0,0,600,625);

        JButton Save = new JButton();
            Save.setVisible(true);
            Save.setForeground(Color.white);
            Save.setBackground(myblue);
            Save.setText("Save");
            Save.setOpaque(true);
            Save.setBorderPainted(false);
            Save.setBounds(315,650,100,35);
            Save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Plans = formatedPractice.getText();
                    //System.out.println(Plans);

                    JFrame parentFrame = new JFrame();

                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Specify a file to save");

                    int userSelection = fileChooser.showSaveDialog(parentFrame);

                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        File fileToSave = fileChooser.getSelectedFile();
                        System.out.println("Save as file: " + fileToSave.getAbsolutePath());


                        try {

                            FileWriter myWriter = new FileWriter(fileToSave.getAbsolutePath()+".txt");

                            myWriter.write(Plans);
                            myWriter.close();
                            System.out.println("Successfully wrote to the file.");


                        } catch (IOException a) {
                            // System.out.println("An error occurred.");
                            a.printStackTrace();
                        }

                    }
                   //previewFrame.setVisible(false);

                }
            });


        JButton Cancel = new JButton();
        Cancel.setVisible(true);
        Cancel.setForeground(Color.white);
        Cancel.setBackground(myblue);
        Cancel.setText("Cancel");
        Cancel.setOpaque(true);
        Cancel.setBorderPainted(false);
        Cancel.setBounds(185,650,100,35);
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                previewFrame.setVisible(false);

            }
        });

        previewFrame.add(scrollPane);
        previewFrame.add(Cancel);
        previewFrame.add(Save);

    }
}