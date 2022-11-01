package view;

import control.Events;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	
	private JLabel label1, label2, label3;
	private JTextField field1, field2;
	private JButton button1, button2, button3, button4, button5, button6;

	public MainFrame() {
		setTitle("Calculadora");
		setSize(330, 460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		start();
		setVisible(true);
		
	}
	
	private void start() {
		
		label1 = new JLabel("Número 1:");
		label1.setBounds(20, 20, 100, 30);
		
		label2 = new JLabel("Número 2:");
		label2.setBounds(20, 55, 100, 30);
		
		label3 = new JLabel("Resultado:");
		label3.setBounds(20, 300, 100, 30);
			
		field1 = new JTextField();
		field1.setBounds(110, 20, 50, 30);
		
		field2 = new JTextField();
		field2.setBounds(110, 55, 50, 30);
		
		button1 = new JButton("Sumar");
		button1.setBounds(50, 120, 100, 40);
		
		button2 = new JButton("Restar");
		button2.setBounds(170, 120, 100, 40);
		
		button3 = new JButton("Multiplicar");
		button3.setBounds(50, 170, 100, 40);
		
		button4 = new JButton("Dividir");
		button4.setBounds(170, 170, 100, 40);

		button5 = new JButton("Raíz 2");
		button5.setBounds(50, 220, 100, 40);
		
		button6 = new JButton("Raíz 3");
		button6.setBounds(170, 220, 100, 40);
		
		add(label1);
		add(label2);
		add(label3);
		add(field1);
		add(field2);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
	}
	
	public JLabel getLabel1() {
		return label1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public void setLabel2(JLabel label2) {
		this.label2 = label2;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public void setLabel3(JLabel label3) {
		this.label3 = label3;
	}

	public JTextField getField1() {
		return field1;
	}

	public void setField1(JTextField field1) {
		this.field1 = field1;
	}

	public JTextField getField2() {
		return field2;
	}

	public void setField2(JTextField field2) {
		this.field2 = field2;
	}

	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public void setButton4(JButton button4) {
		this.button4 = button4;
	}

	public JButton getButton5() {
		return button5;
	}

	public void setButton5(JButton button5) {
		this.button5 = button5;
	}

	public JButton getButton6() {
		return button6;
	}

	public void setButton6(JButton button6) {
		this.button6 = button6;
	}
	
	public void applyEvents(Events events) {
		button1.addActionListener(events);
		button2.addActionListener(events);
		button3.addActionListener(events);
		button4.addActionListener(events);
		button5.addActionListener(events);
		button6.addActionListener(events);

	}

}
