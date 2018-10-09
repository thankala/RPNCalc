package com.calculatorGUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class ButtonOperator extends Button {


    public ButtonOperator(String label, int x , int y , int w, int h,Frame frame){
        super(label);
        this.setBounds(x,y,w,h);
        this.addActionListener(new ButtonOperatorHandler(label));
        frame.add(this);
    }


}


