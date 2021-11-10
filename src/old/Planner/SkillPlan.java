package old.Planner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SkillPlan {
     //look at these fonts?
    //https://alvinalexander.com/blog/post/jfc-swing/swing-faq-list-fonts-current-platform/
   //
    Font font1 = new Font("rockwell", Font.BOLD, 30);
    Font font2 = new Font("rockwell", Font.BOLD, 15);

    Color myblue = new Color(0, 36, 172);

    public void details(JPanel TypeSelect){

        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(25,0,300,75);
            labelMain.setText("Practice Details");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);
            labelMain.setFont(font1);

        JLabel labelEquipment = new JLabel();
            labelEquipment.setText("Equipment");
            labelEquipment.setVisible(true);
            labelEquipment.setFont(font2);
            labelEquipment.setBounds(35,150,150,120);
            labelEquipment.setForeground(Color.white);

        JTextArea equipmentlist = new JTextArea();
            equipmentlist.setVisible(true);
            equipmentlist.setFont(font2);
            equipmentlist.setBounds(125,200,750,100);
            equipmentlist.setForeground(myblue);
            equipmentlist.setBackground(Color.white);

        JLabel skillFocusLabel = new JLabel();
            skillFocusLabel.setVisible(true);
            skillFocusLabel.setBounds(35,55,150,120);
            skillFocusLabel.setText("Skill Focus");
            skillFocusLabel.setFont(font2);
            skillFocusLabel.setForeground(Color.white);
            skillFocusLabel.setBackground(Color.white);

        JTextField skillFocus = new JTextField();
            skillFocus.setVisible(true);
            skillFocus.setFont(font2);
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
                    TypeSelect.removeAll();
                    prePractice(TypeSelect);
                }
            });

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

    public void prePractice(JPanel TypeSelect){

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
            stretchLabel.setBounds(100,100,100,100);
            stretchLabel.setText("Stretch Order");
            stretchLabel.setFont(font2);

        JLabel conditionLabel = new JLabel();
            conditionLabel.setForeground(Color.white);
            conditionLabel.setVisible(true);
            conditionLabel.setBounds(100,200,100,100);
            conditionLabel.setText("Conditioning");
            conditionLabel.setFont(font2);

        JLabel CoordinationLabel = new JLabel();
            CoordinationLabel.setForeground(Color.white);
            CoordinationLabel.setVisible(true);
            CoordinationLabel.setBounds(100,300,100,100);
            CoordinationLabel.setText("Coordination Order");
            CoordinationLabel.setFont(font2);

        JTextArea StreatchList = new JTextArea();
            StreatchList.setVisible(true);
            StreatchList.setFont(font2);
            StreatchList.setBounds(125,100,325,30);
            StreatchList.setForeground(myblue);
            StreatchList.setBackground(Color.white);

        JTextArea ConditionList = new JTextArea();
            ConditionList.setVisible(true);
            ConditionList.setFont(font2);
            ConditionList.setBounds(125,100,325,30);
            ConditionList.setForeground(myblue);
            ConditionList.setBackground(Color.white);

        JTextArea CoordinationList = new JTextArea();
            CoordinationList.setVisible(true);
            CoordinationList.setFont(font2);
            CoordinationList.setBounds(125,100,325,30);
            CoordinationList.setForeground(myblue);
            CoordinationList.setBackground(Color.white);

        JButton next = new JButton();
            next.setVisible(true);
            next.setBackground(Color.white);
            next.setText("NEXT");
            next.setForeground(myblue);
            next.setBounds(815,620,100,35);
            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
        TypeSelect.add(ConditionList);
        TypeSelect.add(StreatchList);
        TypeSelect.add(CoordinationLabel);
        TypeSelect.add(conditionLabel);
        TypeSelect.add(stretchLabel);
        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public void warmup(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Warmup");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);

        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public void skill(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Teach Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);


        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

    public void training(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Training Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);


        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public void control(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Control Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);


        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public void execute(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Execute Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);


        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public void impalement(JPanel TypeSelect) {
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Implement Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);


        JButton next = new JButton();

        next.setVisible(true);
        next.setBackground(Color.white);
        next.setText("NEXT");
        next.setForeground(myblue);
        next.setBounds(815,620,100,35);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        TypeSelect.add(back);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();

    }

    public void play(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(25,0,300,75);
        labelMain.setText("Play");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);
        labelMain.setFont(font1);


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
                //open preview
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

        TypeSelect.add(back);
        TypeSelect.add(PREVIEW);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

}