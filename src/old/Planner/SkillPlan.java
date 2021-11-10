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
    Font font3 = new Font("rockwell", Font.BOLD, 15);

    Font fontplayer = new Font("rockwell",Font.HANGING_BASELINE,15);

    Color myblue = new Color(0, 36, 172);

    public void details(JPanel TypeSelect){

        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(25,0,300,75);
            labelMain.setText("Practice Details");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);
            labelMain.setFont(font1);

        JLabel skillFocusLabel = new JLabel();
            skillFocusLabel.setVisible(true);
            skillFocusLabel.setBounds(35,55,150,120);
            skillFocusLabel.setText("Skill Focus");
            skillFocusLabel.setFont(font2);
            skillFocusLabel.setForeground(Color.white);
            skillFocusLabel.setBackground(Color.white);

        JTextField skillFocus = new JTextField();
            skillFocus.setVisible(true);
            skillFocus.setFont(font3);
            skillFocus.setBounds(125,100,325,30);
            skillFocus.setForeground(myblue);
            skillFocus.setBackground(Color.white);

/*
        JLabel playerlabel = new JLabel();
            playerlabel.setVisible(true);
            playerlabel.setBounds(720,-25,150,120);
            playerlabel.setText("Players");
            playerlabel.setFont(fontplayer);
            playerlabel.setForeground(Color.white);
            playerlabel.setBackground(Color.white);

        JTextField player1 = new JTextField();
            player1.setVisible(true);
            player1.setFont(font3);
            player1.setBounds(600,70,125,30);
            player1.setForeground(myblue);
            player1.setBackground(Color.white);

        JTextField player2 = new JTextField();
            player2.setVisible(true);
            player2.setFont(font3);
            player2.setBounds(775,70,125,30);
            player2.setForeground(myblue);
            player2.setBackground(Color.white);

        JTextField player3 = new JTextField();
            player3.setVisible(true);
            player3.setFont(font3);
            player3.setBounds(600,110,125,30);
            player3.setForeground(myblue);
            player3.setBackground(Color.white);

        JTextField player4 = new JTextField();
            player4.setVisible(true);
            player4.setBounds(775,110,125,30);
            player4.setForeground(myblue);
            player4.setBackground(Color.white);
            player4.setFont(font3);

        JTextField player5 = new JTextField();
            player5.setVisible(true);
            player5.setBounds(600,150,125,30);
            player5.setForeground(myblue);
            player5.setBackground(Color.white);
            player5.setFont(font3);

        JTextField player6 = new JTextField();
            player6.setVisible(true);
            player6.setBounds(775,150,125,30);
            player6.setForeground(myblue);
            player6.setBackground(Color.white);
            player6.setFont(font3);

        JTextField player7 = new JTextField();
            player7.setVisible(true);
            player7.setBounds(600,190,125,30);
            player7.setForeground(myblue);
            player7.setBackground(Color.white);

        JTextField player8 = new JTextField();
            player8.setVisible(true);
            player8.setBounds(775,190,125,30);
            player8.setForeground(myblue);
            player8.setBackground(Color.white);
            player8.setFont(font3);

        JTextField player9 = new JTextField();
            player9.setVisible(true);
            player9.setBounds(600,230,125,30);
            player9.setForeground(myblue);
            player9.setBackground(Color.white);
            player9.setFont(font3);

        JTextField player10= new JTextField();
            player10.setVisible(true);
            player10.setBounds(775,230,125,30);
            player10.setForeground(myblue);
            player10.setBackground(Color.white);
            player10.setFont(font3);

        JTextField player11 = new JTextField();
            player11.setVisible(true);
            player11.setBounds(600,270,125,30);
            player11.setForeground(myblue);
            player11.setBackground(Color.white);
            player11.setFont(font3);

        JTextField player12 = new JTextField();
            player12.setVisible(true);
            player12.setBounds(775,270,125,30);
            player12.setForeground(myblue);
            player12.setBackground(Color.white);
            player12.setFont(font3);

        JTextField player13 = new JTextField();
            player13.setVisible(true);
            player13.setBounds(600,310,125,30);
            player13.setForeground(myblue);
            player13.setBackground(Color.white);
            player13.setFont(font3);

        JTextField player14 = new JTextField();
            player14.setVisible(true);
            player14.setBounds(775,310,125,30);
            player14.setForeground(myblue);
            player14.setBackground(Color.white);
            player14.setFont(font3);

        JTextField player15 = new JTextField();
            player15.setVisible(true);
            player15.setBounds(600,350,125,30);
            player15.setForeground(myblue);
            player15.setBackground(Color.white);
            player15.setFont(font3);

        TypeSelect.add(playerlabel);
        TypeSelect.add(player1);
        TypeSelect.add(player2);
        TypeSelect.add(player3);
        TypeSelect.add(player4);
        TypeSelect.add(player5);
        TypeSelect.add(player6);
        TypeSelect.add(player7);
        TypeSelect.add(player8);
        TypeSelect.add(player9);
        TypeSelect.add(player10);
        TypeSelect.add(player11);
        TypeSelect.add(player12);
        TypeSelect.add(player13);
        TypeSelect.add(player14);
        TypeSelect.add(player15);

*/ //player labels

        JLabel notelabel = new JLabel();
            notelabel.setVisible(true);
            notelabel.setBounds(35,315,150,120);
            notelabel.setText("Notes");
            notelabel.setForeground(Color.white);
            notelabel.setBackground(Color.white);

        JTextArea notes = new JTextArea();
            notes.setVisible(true);
            notes.setBounds(125,300,325,325);
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