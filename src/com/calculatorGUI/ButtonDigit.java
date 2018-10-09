package com.calculatorGUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDigit extends Button {

    public ButtonDigit(String label, int x , int y , int w, int h,Frame frame){
        super(label);
        this.setBounds(x,y,w,h);
        this.addActionListener(new ButtonDigitHandler(label));
        frame.add(this);
    }

    public class ButtonDigitHandler implements ActionListener{

        private String label;

        private ButtonDigitHandler(String label){
            this.label = label;
        }

        public void actionPerformed(ActionEvent pushingDigitButton){
            CalculatorGui.op.addDigit(label.charAt(0));
        }
    }
}


