package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new PuzzleByOmer();
    }

    public static class PuzzleByOmer extends Frame implements ActionListener {
        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
                btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btnExit;


        PuzzleByOmer() {
            super("Simple Puzzle Game byAkben");

            /*
             *If you want to make  harder switch the alphabets (ie A <--> G, J <--> B etc)
             */
            btn1 = new Button("");
            btn1.setBounds(100, 100, 100, 100);
            btn2 = new Button("2");
            btn2.setBounds(200, 100, 100, 100);
            btn3 = new Button("3");
            btn3.setBounds(300, 100, 100, 100);
            btn4 = new Button("4");
            btn4.setBounds(400, 100, 100, 100);
            btn5 = new Button("5");
            btn5.setBounds(100, 200, 100, 100);
            btn6 = new Button("6");
            btn6.setBounds(200, 200, 100, 100);
            btn7 = new Button("7");
            btn7.setBounds(300, 200, 100, 100);
            btn8 = new Button("8");
            btn8.setBounds(400, 200, 100, 100);
            btn9 = new Button("9");
            btn9.setBounds(100, 300, 100, 100);
            btn10 = new Button("10");
            btn10.setBounds(200, 300, 100, 100);
            btn11 = new Button("11");
            btn11.setBounds(300, 300, 100, 100);
            btn12 = new Button("12");
            btn12.setBounds(400, 300, 100, 100);
            btn13 = new Button("13");
            btn13.setBounds(100, 400, 100, 100);
            btn14 = new Button("14");
            btn14.setBounds(200, 400, 100, 100);
            btn15 = new Button("15");
            btn15.setBounds(300, 400, 100, 100);
            btn16 = new Button("1");
            btn16.setBounds(400, 400, 100, 100);

            btn17 = new Button("Make me 1 to 15, Good Luck!");
            btn17.setBounds(100, 500, 400, 100);

            btnExit = new Button("Exit");
            btnExit.setBounds(500, 50, 50, 50);
            btnExit.setBackground(Color.RED);


            btn1.addActionListener(this);
            btn2.addActionListener(this);
            btn3.addActionListener(this);
            btn4.addActionListener(this);
            btn5.addActionListener(this);
            btn6.addActionListener(this);
            btn7.addActionListener(this);
            btn8.addActionListener(this);
            btn9.addActionListener(this);
            btn10.addActionListener(this);
            btn11.addActionListener(this);
            btn12.addActionListener(this);
            btn13.addActionListener(this);
            btn14.addActionListener(this);
            btn15.addActionListener(this);
            btn16.addActionListener(this);
            btn17.addActionListener(this);
            btnExit.addActionListener(this);


            add(btn1);
            add(btn2);
            add(btn3);
            add(btn4);
            add(btn5);
            add(btn6);
            add(btn7);
            add(btn8);
            add(btn9);
            add(btn10);
            add(btn11);
            add(btn12);
            add(btn13);
            add(btn14);
            add(btn15);
            add(btn16);
            add(btn17);
            add(btnExit);


            setSize(600, 650);
            setLayout(null);
            setVisible(true);
            setResizable(true);
            setFocusable(true);
            setBackground(Color.darkGray);
            setLocation(200, 200);

        }


        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btn1) {
                String label = btn1.getLabel();
                if (btn2.getLabel().equals("")) {
                    btn2.setLabel(label);
                    btn1.setLabel("");
                }
                if (btn5.getLabel().equals("")) {
                    btn5.setLabel(label);
                    btn1.setLabel("");
                }
            }
            if (e.getSource() == btn2) {
                String label = btn2.getLabel();
                if (btn1.getLabel().equals("")) {
                    btn1.setLabel(label);
                    btn2.setLabel("");
                }
                if (btn3.getLabel().equals("")) {
                    btn3.setLabel(label);
                    btn2.setLabel("");
                }
                if (btn6.getLabel().equals("")) {
                    btn6.setLabel(label);
                    btn2.setLabel("");
                }
            }
            if (e.getSource() == btn3) {
                String label = btn3.getLabel();
                if (btn2.getLabel().equals("")) {
                    btn2.setLabel(label);
                    btn3.setLabel("");
                }
                if (btn4.getLabel().equals("")) {
                    btn4.setLabel(label);
                    btn3.setLabel("");
                }
                if (btn7.getLabel().equals("")) {
                    btn7.setLabel(label);
                    btn3.setLabel("");
                }
            }
            if (e.getSource() == btn4) {
                String label = btn4.getLabel();
                if (btn3.getLabel().equals("")) {
                    btn3.setLabel(label);
                    btn4.setLabel("");
                }
                if (btn8.getLabel().equals("")) {
                    btn8.setLabel(label);
                    btn4.setLabel("");
                }
            }
            if (e.getSource() == btn5) {
                String label = btn5.getLabel();
                if (btn1.getLabel().equals("")) {
                    btn1.setLabel(label);
                    btn5.setLabel("");
                }
                if (btn6.getLabel().equals("")) {
                    btn6.setLabel(label);
                    btn5.setLabel("");
                }
                if (btn9.getLabel().equals("")) {
                    btn9.setLabel(label);
                    btn5.setLabel("");
                }
            }
            if (e.getSource() == btn6) {
                String label = btn6.getLabel();
                if (btn2.getLabel().equals("")) {
                    btn2.setLabel(label);
                    btn6.setLabel("");
                }
                if (btn5.getLabel().equals("")) {
                    btn5.setLabel(label);
                    btn6.setLabel("");
                }
                if (btn7.getLabel().equals("")) {
                    btn7.setLabel(label);
                    btn6.setLabel("");
                }
                if (btn10.getLabel().equals("")) {
                    btn10.setLabel(label);
                    btn6.setLabel("");
                }
            }
            if (e.getSource() == btn7) {
                String label = btn7.getLabel();
                if (btn3.getLabel().equals("")) {
                    btn3.setLabel(label);
                    btn7.setLabel("");
                }
                if (btn6.getLabel().equals("")) {
                    btn6.setLabel(label);
                    btn7.setLabel("");
                }
                if (btn8.getLabel().equals("")) {
                    btn8.setLabel(label);
                    btn7.setLabel("");
                }
                if (btn11.getLabel().equals("")) {
                    btn11.setLabel(label);
                    btn7.setLabel("");
                }
            }
            if (e.getSource() == btn8) {
                String label = btn8.getLabel();
                if (btn4.getLabel().equals("")) {
                    btn4.setLabel(label);
                    btn8.setLabel("");
                }
                if (btn7.getLabel().equals("")) {
                    btn7.setLabel(label);
                    btn8.setLabel("");
                }
                if (btn12.getLabel().equals("")) {
                    btn12.setLabel(label);
                    btn8.setLabel("");
                }
            }
            if (e.getSource() == btn9) {
                String label = btn9.getLabel();
                if (btn5.getLabel().equals("")) {
                    btn5.setLabel(label);
                    btn9.setLabel("");
                }
                if (btn10.getLabel().equals("")) {
                    btn10.setLabel(label);
                    btn9.setLabel("");
                }
                if (btn13.getLabel().equals("")) {
                    btn13.setLabel(label);
                    btn9.setLabel("");
                }
            }
            if (e.getSource() == btn10) {
                String label = btn10.getLabel();
                if (btn6.getLabel().equals("")) {
                    btn6.setLabel(label);
                    btn10.setLabel("");
                }
                if (btn9.getLabel().equals("")) {
                    btn9.setLabel(label);
                    btn10.setLabel("");
                }
                if (btn11.getLabel().equals("")) {
                    btn11.setLabel(label);
                    btn10.setLabel("");
                }
                if (btn14.getLabel().equals("")) {
                    btn14.setLabel(label);
                    btn10.setLabel("");
                }
            }
            if (e.getSource() == btn11) {
                String label = btn11.getLabel();
                if (btn7.getLabel().equals("")) {
                    btn7.setLabel(label);
                    btn11.setLabel("");
                }
                if (btn10.getLabel().equals("")) {
                    btn10.setLabel(label);
                    btn11.setLabel("");
                }
                if (btn12.getLabel().equals("")) {
                    btn12.setLabel(label);
                    btn11.setLabel("");
                }
                if (btn15.getLabel().equals("")) {
                    btn15.setLabel(label);
                    btn11.setLabel("");
                }
            }
            if (e.getSource() == btn12) {
                String label = btn12.getLabel();
                if (btn8.getLabel().equals("")) {
                    btn8.setLabel(label);
                    btn12.setLabel("");
                }
                if (btn11.getLabel().equals("")) {
                    btn11.setLabel(label);
                    btn12.setLabel("");
                }
                if (btn16.getLabel().equals("")) {
                    btn16.setLabel(label);
                    btn12.setLabel("");
                }
            }
            if (e.getSource() == btn13) {
                String label = btn13.getLabel();
                if (btn9.getLabel().equals("")) {
                    btn9.setLabel(label);
                    btn13.setLabel("");
                }
                if (btn14.getLabel().equals("")) {
                    btn14.setLabel(label);
                    btn13.setLabel("");
                }
            }
            if (e.getSource() == btn14) {
                String label = btn14.getLabel();
                if (btn10.getLabel().equals("")) {
                    btn10.setLabel(label);
                    btn14.setLabel("");
                }
                if (btn13.getLabel().equals("")) {
                    btn13.setLabel(label);
                    btn14.setLabel("");
                }
                if (btn15.getLabel().equals("")) {
                    btn15.setLabel(label);
                    btn14.setLabel("");
                }
            }
            if (e.getSource() == btn15) {
                String label = btn15.getLabel();
                if (btn11.getLabel().equals("")) {
                    btn11.setLabel(label);
                    btn15.setLabel("");
                }
                if (btn14.getLabel().equals("")) {
                    btn14.setLabel(label);
                    btn15.setLabel("");
                }
                if (btn16.getLabel().equals("")) {
                    btn16.setLabel(label);
                    btn15.setLabel("");
                }
            }
            if (e.getSource() == btn16) {
                String label = btn16.getLabel();
                if (btn12.getLabel().equals("")) {
                    btn12.setLabel(label);
                    btn16.setLabel("");
                }
                if (btn15.getLabel().equals("")) {
                    btn15.setLabel(label);
                    btn16.setLabel("");
                }
            }
            if (e.getSource() == btnExit) {
                System.exit(0);
            }


            if (btn1.getLabel().equals("1") && btn2.getLabel().equals("2") && btn3.getLabel().equals("3") && btn4.getLabel().equals("4") && btn5.getLabel().equals("5") && btn6.getLabel().equals("6") && btn7.getLabel().equals("7") && btn8.getLabel().equals("8") && btn9.getLabel().equals("9")
                    && btn10.getLabel().equals("10") && btn11.getLabel().equals("11") && btn12.getLabel().equals("12") && btn13.getLabel().equals("13") && btn14.getLabel().equals("14") && btn15.getLabel().equals("15") && btn16.getLabel().equals("")) {


                JOptionPane.showMessageDialog(this, "Congratulations!");

            }

        }
    }//PuzzleByOmer
}