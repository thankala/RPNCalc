package com.CalculatorEngine;
import java.util.Stack;

import com.calculatorGUI.*;

import com.calculatorGUI.*;


public class Calc{
    public static Stack<Float> st = new Stack<Float>(); //float stack used . Division is presented correctly this way.

    static Operand op; 
    static Adder add;
    static Subtracter sub;
    static Divider div;
    static Multiplier mult;
    static ResultPresenter rp;
    static CalculatorGui	calc;


    public static void main (String[] args) {

        op = new Operand();
        add = new Adder();
        sub = new Subtracter();
        mult = new Multiplier();
        div = new Divider();
        rp = new ResultPresenter();
        calc = new CalculatorGui(op,add,sub,mult,div,rp);


        //(1+2)*(5-2)*(2/1)

       /* op.addDigit('1');
        op.complete();
        op.addDigit('2');
        op.complete();	//add is 3
        add.operate();
        op.addDigit('5');
        op.complete();
        op.addDigit('2');
        op.complete();
        sub.operate(); //sub is 3
        mult.operate();//until this point this calculation is equal to 9
        op.addDigit('2');
        op.complete();
        op.addDigit('1');
        op.complete();
        div.operate(); // 2/1 = 2
        mult.operate(); //9*2=18
        rp.operate();
        */
    }
}