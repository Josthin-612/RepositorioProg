package vista;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import dol.OperacionesMat;

public class MainFrame extends Frame implements FormInterface {

	private static final long serialVersionUID = 1L;
	private Button boton1, boton2, boton3, boton4, boton5;
	private Frame instancia;
	
	public MainFrame() {
		initComponents();
		instancia = this;
	}
	
	@Override
	public void initComponents() {
		setLayout(null);
		boton1 = new Button("Blanco");
		boton1.setBounds(80,50,100,32);
		add(boton1);
		
		boton2 = new Button("Azul");
		boton2.setBounds(210,50,100,32);
		add(boton2);
		
		boton3 = new Button("Azul y Blanco");
		boton3.setBounds(80,109,100,32);
		add(boton3);
		
		boton4 = new Button("Fucsia");
		boton4.setBounds(210,109,100,32);
		add(boton4);
		
		boton5 = new Button("Calculos");
		boton5.setBounds(140,160,100,32);
		add(boton5);
		
		setSize(390,220);
		this.setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		boton1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaBlanca v1 = new VentanaBlanca(instancia);
				v1.showForm();
			}
		});
		boton2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaAzul v1 = new VentanaAzul(instancia);
				v1.showForm();
			}
		});
		boton3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaAzulyBlanco v2 = new VentanaAzulyBlanco(instancia);
				v2.showForm();
			}
		});
		boton4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaFucsia v4 = new VentanaFucsia(instancia);
				v4.showForm();
			}
		});
		boton5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				OperacionesMat op = new OperacionesMat(instancia);
				op.showForm();
				//Calculos c = new Calculos(instancia);
				//c.showForm();
			}
		});
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showForm() {
		setTitle("GadeApp_1.1");
		setVisible(true);
		setLocationRelativeTo(null);
		//toFront();
	}
}
