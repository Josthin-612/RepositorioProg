package vista;

import java.awt.Frame;
import java.awt.*;

public class VentanaFucsia extends CrearVentana {
	
	private static final long serialVersionUID = 1L;
	private Canvas color1;
	
	public VentanaFucsia(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	public void initComponents() {
		color1 = new Canvas();
		color1.setBackground(Color.decode("#e30052"));
		add(color1);
		
		setTitle("Ventana Color Fucsia");
		setSize(600,360);
		this.setResizable(false);
		
	}
}