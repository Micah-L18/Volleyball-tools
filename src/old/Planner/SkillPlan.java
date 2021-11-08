package old.Planner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SkillPlan {
    Color myblue = new Color(0, 36, 172);
    public void details(JPanel TypeSelect){

        JLabel labelMain = new JLabel();
            labelMain.setVisible(true);
            labelMain.setBounds(5,5,150,120);
            labelMain.setText("Practice Details");
            labelMain.setForeground(Color.white);
            labelMain.setBackground(Color.white);

        JLabel skillFocusLabel = new JLabel();
            skillFocusLabel.setVisible(true);
            skillFocusLabel.setBounds(35,55,150,120);
            skillFocusLabel.setText("Skill Focus");
            skillFocusLabel.setForeground(Color.white);
            skillFocusLabel.setBackground(Color.white);

        JTextField skillFocus = new JTextField();
            skillFocus.setVisible(true);
            skillFocus.setBounds(125,100,325,30);
            skillFocus.setForeground(myblue);
            skillFocus.setBackground(Color.white);

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
                    prePractice(TypeSelect);
                }
            });
        TypeSelect.add(skillFocusLabel);
        TypeSelect.add(skillFocus);
        TypeSelect.add(next);
        TypeSelect.add(labelMain);
        TypeSelect.repaint();
    }

    public void prePractice(JPanel TypeSelect){
        JLabel labelMain = new JLabel();
        labelMain.setVisible(true);
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Pre Practice");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Warmup");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Teach Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Training Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Control Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Execute Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Implement Skill");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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
        labelMain.setBounds(5,5,150,120);
        labelMain.setText("Play");
        labelMain.setForeground(Color.white);
        labelMain.setBackground(Color.white);

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