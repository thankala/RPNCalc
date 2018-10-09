package com.CalculatorEngine;
import com.calculatorGUI.*;

import java.util.EmptyStackException;

public class ResultPresenter{

    public void operate(){
        try {
            float n = Calc.st.peek();
            if (n / Math.round(n) != 1.0) {// Using math.round i was able to display a float number only
                //whenever it was necessary (there is no need displaying e.g 25.0 because this is an integer)
                String buffer = String.valueOf(n);
                CalculatorGui.display.setText(buffer.toString());
            }
            else{
                int val = Math.round(n);
                String buffer = String.valueOf(val);
                CalculatorGui.display.setText(buffer.toString());
            }
        }catch(EmptyStackException st){
            CalculatorGui.display.setText("Empty Stack");
        }
    }
}