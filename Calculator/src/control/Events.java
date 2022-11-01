package control;

import view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Events implements ActionListener {
	
	private MainFrame frame;
	
	public Events(MainFrame frame) {
		this.frame = frame;
		
	}
	
	public void actionPerformed(ActionEvent e){
		double n1 = Double.parseDouble(frame.getField1().getText());
		double n2 = Double.parseDouble(frame.getField2().getText());
		
		if (e.getSource() == frame.getButton1()) {
			frame.getLabel3().setText("Resultado:" + (n1 + n2));
		}
		
		if (e.getSource() == frame.getButton2()) {
			frame.getLabel3().setText("Resultado:" + (n1 - n2));
		}
		
		if (e.getSource() == frame.getButton3()) {
			frame.getLabel3().setText("Resultado:" + (n1 * n2));
		}
		
		if (e.getSource() == frame.getButton4()) {
			frame.getLabel3().setText("Resultado:" + (n1 / n2));
		}
		
		if (e.getSource() == frame.getButton5()) {
			JOptionPane.showMessageDialog(null, "Funcionalidad no disponible", "Raíz Cuadrada", JOptionPane.ERROR_MESSAGE);
		}
		
		if (e.getSource() == frame.getButton6()) {
			JOptionPane.showInputDialog("Contraseña:");
		}
		
		

	}
	
	public boolean exceptionHandling(String args[]) {
		try {
			
		}
		catch (NumberFormatException | ArithmeticException e){
			JOptionPane.showMessageDialog(null, "Inserte números", "", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}

	

}
