package vista;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CrearVentana extends Frame implements FormInterface {
	
	private static final long serialVersionUID = 1325657196337114804L;
	Frame parentFrame;
	public CrearVentana(Frame parentFrame) {
		this.parentFrame = parentFrame;
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
			if(parentFrame!=null) {
				parentFrame.setVisible(true);
			}
			dispose();
				}
		});
	
	}
	
	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showForm() {
		if(parentFrame!=null)
			parentFrame.setVisible(false);
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();
		
	}

}
