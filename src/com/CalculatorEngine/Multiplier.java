package com.CalculatorEngine;

import com.calculatorGUI.CalculatorGui;

public class Multiplier{
	
    public void operate(){
        try {
        	Calc.st.push(Calc.st.pop() * Calc.st.pop());
    	}catch(java.util.EmptyStackException st) {
    		CalculatorGui.display.setText("Empty Stack");
    	}
    }
}
