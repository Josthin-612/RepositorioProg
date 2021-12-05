package vista;

import java.awt.Frame;
import java.awt.*;

public class VentanaBlanca extends CrearVentana {
	
	private static final long serialVersionUID = 1L;
	private Canvas color1;
	
	public VentanaBlanca(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	public void initComponents() {
		color1 = new Canvas();
		color1.setBounds(0,0,0,0);
		color1.setBackground(Color.white);
		add(color1);
		
		setTitle("Ventana Color Verde");
		setSize(600,360);
		this.setResizable(false);
		
	}
}