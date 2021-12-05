package vista;

import java.awt.Frame;
import java.awt.*;

public class VentanaAzul extends CrearVentana {
	
	private static final long serialVersionUID = 1L;
	private Canvas color1;
	
	public VentanaAzul(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	public void initComponents() {
		color1 = new Canvas();
		color1.setBackground(Color.blue);
		add(color1);
		
		setTitle("Ventana Color Azul");
		setSize(600,360);
		this.setResizable(false);
		
	}
}