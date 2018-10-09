package com.CalculatorEngine;

import com.calculatorGUI.*;

public class Operand{

    StringBuffer buffer = new StringBuffer();

    public void addDigit(char ch) {
        buffer.append(ch);
        CalculatorGui.display.setText(buffer.toString());
    }

    public void deleteLastDigit(){
    	try {
    		String s =new String(buffer);
    		buffer = new StringBuffer(s.substring(0,s.length()-1));
    		CalculatorGui.display.setText(buffer.toString());
        
    	}catch(StringIndexOutOfBoundsException s) {
    		CalculatorGui.display.setText("No number to delete");
    	}
    }

    public void complete (){
    	try {
    		float num = Float.parseFloat(buffer.toString());
            Calc.st.push(num);
            buffer = new StringBuffer();
            CalculatorGui.display.setText(buffer.toString());
    		
    	}catch(NumberFormatException st) {
            CalculatorGui.display.setText("Empty Stack");
        }
    }

    public void reset(){
        Calc.st.removeAllElements();
        buffer = new StringBuffer();
        CalculatorGui.display.setText(buffer.toString());
    }
}