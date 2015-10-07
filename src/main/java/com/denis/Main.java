package com.denis;

import com.denis.Regimes.Calculator;
import com.denis.Regimes.CenterCalc;
import com.denis.Regimes.IntervalCalc;
import com.denis.Regimes.SimpleCalc;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Created by Denis on 02.10.2015.
 */
public class Main {

    public static Calculator calculator = new IntervalCalc();

    public static void main(String[] args) {
        /**
         *
         */
        JFrame mainFrame = new JFrame("IntervalMath (0.1)");             // creating new frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // close if close button is pressed
        mainFrame.setSize(400, 250);                                    // size if mane window (208, 438)
        mainFrame.setResizable(false);                                  // set frame unresizable
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocation(600, 200);

        /**
         *
         */
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New file"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exit);

        JMenu editMenu = new JMenu("Settings");
        JMenu pasteMenu = new JMenu("Type");
        pasteMenu.add(new JMenuItem("Original"));
        pasteMenu.add(new JMenuItem("Interval"));
        JMenu helpMenu = new JMenu("Help");
        editMenu.add(pasteMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        menuBar.add(Box.createHorizontalGlue());
        mainFrame.setJMenuBar(menuBar);
        menuBar.setBackground(Color.lightGray);
        menuBar.setBorderPainted(true);
        mainFrame.getRootPane().setJMenuBar(menuBar);
        mainFrame.setResizable(false);

        /**
         *
         */
        JPanel operationMenu = new JPanel(new GridLayout(1, 0));
        JPanel dataMenu = new JPanel(new GridLayout(1, 0));
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        JPanel controlMenu = new JPanel(new GridLayout(0, 1));

        /**
         *
         */
        JButton summButton = new JButton("summ");
        JButton minusButton = new JButton("minus");
        JButton multButton = new JButton("mult");
        JButton divButton = new JButton("div");

        operationMenu.add(summButton);
        operationMenu.add(minusButton);
        operationMenu.add(multButton);
        operationMenu.add(divButton);

        /**
         *
         */
        final JTextField aUp= new JTextField("a up");
        final JTextField aDown= new JTextField("a down");
        final JTextField bUp= new JTextField("b up");
        final JTextField bDown= new JTextField("b down");

        dataMenu.add(aDown);
        dataMenu.add(aUp);
        dataMenu.add(bDown);
        dataMenu.add(bUp);


        /**
         *
         */
        JButton resButton = new JButton("get result");
        JButton clearButton = new JButton("clear");

        controlMenu.add(resButton);
        controlMenu.add(clearButton);

        /**
         *
         */
        JRadioButton simple = new JRadioButton("Simple    ");
        JRadioButton interval = new JRadioButton("Interval    ", true);
        final JRadioButton central = new JRadioButton("Central   ");

        ButtonGroup group = new ButtonGroup();
        group.add(simple);
        group.add(interval);
        group.add(central);

        radioPanel.add(simple);
        radioPanel.add(interval);
        radioPanel.add(central);

        /**
         *
         */
        final JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        mainFrame.add(textArea, BorderLayout.CENTER);
        mainFrame.add(radioPanel, BorderLayout.EAST);
        mainFrame.add(controlMenu, BorderLayout.WEST);
        mainFrame.add(operationMenu, BorderLayout.NORTH);
        mainFrame.add(dataMenu, BorderLayout.SOUTH);

        mainFrame.setVisible(true);

        /**
         *
         */


        simple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator = new SimpleCalc();
            }
        });

        interval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator = new IntervalCalc();

            }
        });

        central.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator = new CenterCalc();
            }
        });

        resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText() + "[ " + calculator.getResult()[0] + " , " + calculator.getResult()[1] + " ] \n");
                System.out.println();
            }
        });

        summButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                double[][] data = new double[2][2];
                data[0][0] = Double.valueOf(aDown.getText());
                data[0][1] = Double.valueOf(aUp.getText());
                data[1][0] = Double.valueOf(bDown.getText());
                data[1][1] = Double.valueOf(bUp.getText());

                calculator.setData(data);
                calculator.sum();

            }

        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double[][] data = new double[2][2];
                data[0][0] = Double.valueOf(aDown.getText());
                data[0][1] = Double.valueOf(aUp.getText());
                data[1][0] = Double.valueOf(bDown.getText());
                data[1][1] = Double.valueOf(bUp.getText());

                calculator.setData(data);
                calculator.sub();

            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double[][] data = new double[2][2];
                data[0][0] = Double.valueOf(aDown.getText());
                data[0][1] = Double.valueOf(aUp.getText());
                data[1][0] = Double.valueOf(bDown.getText());
                data[1][1] = Double.valueOf(bUp.getText());

                calculator.setData(data);
                calculator.div();

            }
        });

        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double[][] data = new double[2][2];
                data[0][0] = Double.valueOf(aDown.getText());
                data[0][1] = Double.valueOf(aUp.getText());
                data[1][0] = Double.valueOf(bDown.getText());
                data[1][1] = Double.valueOf(bUp.getText());

                calculator.setData(data);
                calculator.mult();

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aDown.setText("");
                aUp.setText("");
                bDown.setText("");
                bUp.setText("");
                textArea.setText("");
                calculator.resetResult();
            }
        });
    }

}
