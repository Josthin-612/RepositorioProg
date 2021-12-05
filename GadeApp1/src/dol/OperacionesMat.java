package dol;

import java.awt.*;
import java.awt.event.*;

import vista.CrearVentana;

public class OperacionesMat extends CrearVentana implements ActionListener {
	
	public OperacionesMat(Frame parentFrame) {
		super(parentFrame);
		initComponent();
		
	}

	private static final long serialVersionUID = 1L;
	    static Frame f = new Frame();
	    private Label l1,l2,l3,texto;
	    private TextField t1,t2,t3;
	    private Button b1,b2,b3,b4,b5,b6;
	    
	public void initComponent() {
		setLayout(null);
		// Casillas vacias y sus Nombres
		texto = new Label("Ingrese dos Valores");texto.setBounds(240,40,120,30);add(texto);
		
		l1 = new Label("Numero 1");l1.setBounds(130,88,70,32);add(l1);
		t1 = new TextField("");t1.setBounds(240,85,250,32);add(t1);
		t1.setBackground(Color.CYAN);
		
		l2 = new Label("Numero 2");l2.setBounds(130,133,70,22);add(l2);
		t2 = new TextField("");t2.setBounds(240,130,250,32);add(t2);
		t2.setBackground(Color.CYAN);
		
		l3 = new Label("Resultado");l3.setBounds(130,178,70,22);add(l3);
		t3 = new TextField("");t3.setBounds(240,175,250,32);add(t3);
		t3.setBackground(Color.CYAN);
		t3.setEnabled(false);
		add(t3);
		
		//Opciones de la Calculadora
		b1 = new Button("Sumar");
		b1.setBounds(100,230,80,35);
		b1.setBackground(Color.CYAN);
		add(b1);
		
		b2 = new Button("Restar");
		b2.setBounds(100,280,80,35);
		b2.setBackground(Color.CYAN);
		add(b2);
		
		b3 = new Button("Multiplicar");
		b3.setBounds(245,230,80,35);
		b3.setBackground(Color.CYAN);
		add(b3);
		
		b4 = new Button("Dividir");
		b4.setBounds(245,280,80,35);
		b4.setBackground(Color.CYAN);
		add(b4);
		
	    b5 = new Button("Borrar");
		b5.setBounds(400,235,100,70);
		b5.setBackground(Color.CYAN);
		add(b5);
				
		b6 = new Button("Calcular");
		b6.setBounds(439,150,111,40);
		b6.setBackground(Color.CYAN);
		//add(b6);
				
		//Titulo y Pantalla
		setTitle("Operaciones Matematicas");
		setSize(600,360);
		this.setResizable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(220,70,370,70);
		
		g.setColor(Color.black);
		g.drawRect(110,85,101,121);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double n1 = Double.parseDouble(t1.getText());
		double n2 = Double.parseDouble(t2.getText());
		
		if(e.getSource()==b1) {
			t3.setText(String.valueOf(n1+n2));
		} else {
			if(e.getSource()==b2) {
				t3.setText(String.valueOf(n1-n2));
			} else {
				if(e.getSource()==b3) {
					t3.setText(String.valueOf(n1*n2));
				} else {
					if(e.getSource()==b4) {
						t3.setText(String.valueOf(n1/n2));
					} else {
						if(e.getSource()==b5) {
							t1.setText("");
					        t2.setText("");
					        t3.setText("");
					        t1.requestFocus();
						}
					}
				}
			}
		}
	}

}
