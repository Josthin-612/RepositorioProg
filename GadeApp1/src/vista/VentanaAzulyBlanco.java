package vista;

import java.awt.Frame;
import java.awt.*;

public class VentanaAzulyBlanco extends CrearVentana {
	
	private static final long serialVersionUID = 1L;
	private Canvas color1;
	
	public VentanaAzulyBlanco(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	@Override
	public void initComponents() {
		color1 = new Canvas();
		color1.setSize(0,170);
		color1.setBackground(Color.blue);
		add("South",color1);
		setVisible(true);
		setTitle("Ventana Azul y Blanco");
		setSize(600,360);
		this.setResizable(false);
		
	}
}