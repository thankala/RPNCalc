package com.CalculatorEngine;

import com.calculatorGUI.CalculatorGui;

public class Subtracter{
	
    public void operate(){
    	try {
    		float n = Calc.st.pop();
        	Calc.st.push(Calc.st.pop() - n);
    	}catch(java.util.EmptyStackException st) {
    		CalculatorGui.display.setText("Empty Stack");
    	}
    }
}