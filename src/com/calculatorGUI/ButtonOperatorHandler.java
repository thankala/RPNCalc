package com.calculatorGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOperatorHandler implements ActionListener {

    public String label;


    public ButtonOperatorHandler(String label){
        this.label = label;
    }

    public void actionPerformed(ActionEvent pushingOperatorButton){

        switch(label){
            case("Enter"):
                CalculatorGui.op.complete();
                break;
            case("+"):
                CalculatorGui.add.operate();
                break;
            case("-"):
                CalculatorGui.sub.operate();
                break;
            case("*"):
                CalculatorGui.mult.operate();
                break;
            case("/"):
                CalculatorGui.div.operate();
                break;
            case("="):
                CalculatorGui.rp.operate();
                break;
            case("Backspace"):
                CalculatorGui.op.deleteLastDigit();
                break;
            case("CE"):
                CalculatorGui.op.reset();
                break;
            case("C"):
                CalculatorGui.op.reset();
                break;

        }
    }
}
