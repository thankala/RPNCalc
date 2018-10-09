package com.calculatorGUI;
import com.CalculatorEngine.*;


import java.awt.TextField;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;

public class CalculatorGui extends Frame{

	public static Operand op;
	public static Adder add;
	public static Subtracter sub;
	public static Divider div;
	public static Multiplier mult;
	public static ResultPresenter rp;
	public static TextField display;
	public static Frame frame;
	public ButtonDigit myButton;
	public ButtonOperator myButtonOp;

	public CalculatorGui(Operand op,Adder add,Subtracter sub ,Multiplier mult, Divider div,ResultPresenter rp){
        super("RPN Calculator");

        CalculatorGui.op = op;
        CalculatorGui.div = div;
        CalculatorGui.mult = mult;
        CalculatorGui.add = add;
        CalculatorGui.sub = sub;
        CalculatorGui.rp = rp;

		this.setLayout(null);
		
		display = new TextField("0",14);
		display.setVisible(true);
		display.setBackground(Color.white);
		display.setBounds(13, 55, 260, 30);
		this.add(display);

		myButton = new ButtonDigit("0" ,64, 265, 35, 28,this);
		myButton = new ButtonDigit("1" ,64, 232, 35, 28,this);
		myButton = new ButtonDigit("2" ,104,232, 35, 28,this);
        myButton = new ButtonDigit("3" ,144,232, 35, 28,this);
        myButton = new ButtonDigit("4" ,64, 199, 35, 28,this);
        myButton = new ButtonDigit("5" ,104,199, 35, 28,this);
        myButton = new ButtonDigit("6" ,144,199, 35, 28,this);
        myButton = new ButtonDigit("7" ,64, 166, 35, 28,this);
        myButton = new ButtonDigit("8" ,104,166, 35, 28,this);
        myButton = new ButtonDigit("9" ,144,166, 35, 28,this);
        myButton = new ButtonDigit("." ,144,265, 35, 28,this);

        myButtonOp = new ButtonOperator("Enter",204, 100, 56, 28,this);
		myButtonOp = new ButtonOperator("Backspace",64,  100, 75, 28,this);
		myButtonOp = new ButtonOperator("CE",144, 133, 35, 28,this);
		myButtonOp = new ButtonOperator("C",144, 100, 35, 28,this);
		myButtonOp = new ButtonOperator("+",195, 265, 35, 28,this);
		myButtonOp = new ButtonOperator("-",195, 232, 35, 28,this);
		myButtonOp = new ButtonOperator("*",195, 199, 35, 28,this);
		myButtonOp = new ButtonOperator("/",195, 166, 35, 28,this);
		myButtonOp = new ButtonOperator("=",235, 265, 35, 28,this);
		
		this.setFont(new Font("Helvetica", Font.PLAIN, 14));
		this.setSize(290,300);
		this.setBackground(Color.blue);
		this.setResizable(false);
		this.setVisible(true);
		this.addWindowListener(new CloseWindowAndExit());
		
		} 
}