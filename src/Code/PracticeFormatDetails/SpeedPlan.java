package Code.PracticeFormatDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedPlan {

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
              //warmup(TypeSelect);
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

}
