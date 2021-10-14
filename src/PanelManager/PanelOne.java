package PanelManager;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOne {
    public int y = 150;
    public int yy = 150;

    JLabel detailed = new JLabel();
    JLabel time = new JLabel();
    JLabel breaks = new JLabel();
    JLabel focus = new JLabel();
    JLabel prePractice = new JLabel();
    JLabel SkillFocus = new JLabel();
    JLabel skillAdd = new JLabel();

    JTextField timeText = new JTextField();
    JTextField breaksText = new JTextField();
    JTextField prePracticeText = new JTextField();
    JTextArea focusText = new JTextArea();
    JTextField SkillFocusText1 = new JTextField();
    JTextField SkillFocusText2 = new JTextField();

    public void labels(JPanel panel){

            detailed.setVisible(true);
            time.setVisible(true);
            breaks.setVisible(true);
            focus.setVisible(true);
            prePractice.setVisible(true);
            SkillFocus.setVisible(true);
            skillAdd.setVisible(false);

            detailed.setBounds(500,0,100,75);
            time.setBounds(50,50,100,75);
            breaks.setBounds(50,125,100,75);
            focus.setBounds(50,250,100,75);
            prePractice.setBounds(950,50,100,75);
            SkillFocus.setBounds(700,50,100,75);
            skillAdd.setBounds(700,140,400,75);

            detailed.setText("Practice Details");
            time.setText("hours");
            breaks.setText("breaks");
            focus.setText("focus");
            prePractice.setText("pre practice");
            SkillFocus.setText("Skill Focus");
            skillAdd.setText("Skill Focus");

            /*
            detailed.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
            time.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
            breaks.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
            focus.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
            SkillFocus.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
            prePractice.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));

        skillAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
            */

        panel.add(detailed);
        panel.add(time);
        panel.add(breaks);
        panel.add(focus);
        panel.add(prePractice);
        panel.add(SkillFocus);
        panel.add(skillAdd);

    }

    public void buttons(JPanel panel){

        JButton save = new JButton();
        JButton addSkill = new JButton();
        JButton addPrePractice = new JButton();

        save.setVisible(true);
        save.setBounds(600,550,100,35);
        save.setText("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        addSkill.setVisible(true);
        addSkill.setBounds(750,150,150,35);
        addSkill.setText("add Skill");
        addSkill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y<550) {
                    y = y + 100;
                }else {
                    addSkill.setVisible(false);
                }
                addSkill.setBounds(750,y,150,35);
                skillAdd.setVisible(true);
                SkillFocusText2.setVisible(true);

                JLabel bob = new JLabel("hi");
                bob.setBounds(700,y,400,75);
                bob.setVisible(true);
                panel.add(bob);

            }
        });

        addPrePractice.setVisible(true);
        addPrePractice.setBounds(1025,150,150,35);
        addPrePractice.setText("add pre practice");
        addPrePractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (yy<550) {
                    yy = yy + 100;
                }else {
                    addPrePractice.setVisible(false);
                }
                addPrePractice.setBounds(1025,yy,150,35);
                addPrePractice(panel);
            }
        });

        panel.add(save);
        panel.add(addSkill);
        panel.add(addPrePractice);
    }

    public void TextEntry(JPanel panel){

        focusText.setBackground(Color.lightGray);

        timeText.setVisible(true);
        breaksText.setVisible(true);
        focusText.setVisible(true);
        prePracticeText.setVisible(true);
        SkillFocusText1.setVisible(true);
        SkillFocusText2.setVisible(false);

        timeText.setBounds(100,85,100,25);
        breaksText.setBounds(100,160,100,25);
        focusText.setBounds(100,250,450,350);
        prePracticeText.setBounds(1050,75,100,25);
        SkillFocusText1.setBounds(800,75,100,25);
        SkillFocusText2.setBounds(800,165,100,25);

        panel.add(timeText);
        panel.add(breaksText);
        panel.add(focusText);
        panel.add(prePracticeText);
        panel.add(SkillFocusText1);
        panel.add(SkillFocusText2);

    }

    public void addFocusSkill(JPanel panel){



    }

    public void addPrePractice(JPanel panel){



    }

    public void Save(){



    }

}