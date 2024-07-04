package InterfazGrafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Operaciones {

	private JFrame frame;
	private JTextField numA;
    private JTextField numB;
    private JTextField lblResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operaciones window = new Operaciones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Operaciones() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //
	    frame.getContentPane().setBackground(new Color(255, 206, 206));
	    frame.setSize(536, 698);

	    frame.setForeground(new Color(0, 0, 0));
	    frame.setBackground(new Color(255, 206, 206));
	    frame.getContentPane().setLayout(null); 
	    frame.getContentPane().setLayout(null);


	    JButton btnSuma = new JButton("+");
	    btnSuma.setForeground(new Color(0, 0, 0));
	    btnSuma.setBackground(new Color(255, 119, 119));
	    btnSuma.setBounds(154, 396, 43, 47);
	    frame.add(btnSuma);
	    
	    btnSuma.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	          try {
	             int num1 = Integer.parseInt(numA.getText());
	             int num2 = Integer.parseInt(numB.getText());
	             int suma = num1 + num2;
	             lblResult.setText("Resultado: " + suma);
	              } catch (NumberFormatException ex) {
	            lblResult.setText("Ingrese números válidos");
	             }
	           }
	        });
	    
	    JButton btnResta = new JButton("-");
	    btnResta.setForeground(new Color(0, 0, 0));
	    btnResta.setBackground(new Color(255, 119, 119));
	    btnResta.setBounds(207, 396, 43, 47);
	    frame.add(btnResta);
	    
	    btnResta.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	       try {
	         int num1 = Integer.parseInt(numA.getText());
	         int num2 = Integer.parseInt(numB.getText());
	         int resta = num1 - num2;
	         lblResult.setText("Resultado: " + resta);
	           } catch (NumberFormatException ex) {
	         lblResult.setText("Ingrese números válidos");
	          }
	        }
	     });
	    
	    JButton btnMult = new JButton("x"); 
	    btnMult.setForeground(new Color(0, 0, 0));
	    btnMult.setBackground(new Color(255, 119, 119));
	    btnMult.setBounds(260, 396, 43, 47);
	    frame.add(btnMult);
	    
	    btnMult.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	      try {
	        int num1 = Integer.parseInt(numA.getText());
	        int num2 = Integer.parseInt(numB.getText());
	        int mult = num1 * num2;
	        lblResult.setText("Resultado: " + mult);
	          } catch (NumberFormatException ex) {
	        lblResult.setText("Ingrese números válidos");
	         }
	       }
	    });
	    
	    JButton btnDiv = new JButton("%");
	    btnDiv.setForeground(new Color(0, 0, 0));
	    btnDiv.setBackground(new Color(255, 119, 119));
	    btnDiv.setBounds(313, 396, 43, 47);
	    frame.add(btnDiv);
	    
	    btnDiv.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	       try {
	         float num1 = Float.parseFloat(numA.getText());
	         float num2 = Float.parseFloat(numB.getText());
	         if(num2==0) {
		     lblResult.setText("Error: division por 0");
	          }
	         else {
	         float div = (float)num1 / num2;
	         lblResult.setText("Resultado: " + div);
	         }
	         } catch (NumberFormatException ex) {
	         lblResult.setText("Ingrese números válidos");
	          }
	        }
	     });
	    
	    JButton btnPotencia = new JButton("x^n"); //AGREGUE BOTON POTENCIA
	    btnPotencia.setForeground(Color.BLACK);
	    btnPotencia.setBackground(new Color(255, 119, 119));
	    btnPotencia.setBounds(271, 470, 85, 37);
	    frame.add(btnPotencia);
	    


	    btnPotencia.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	      try {
		      double num1 = Double.parseDouble(numA.getText());
		      double num2 = Double.parseDouble(numB.getText());
		      double potencia = Math.pow(num1, num2); //USE DOUBLE Y MATH.POW PARA CALCULAR
	          lblResult.setText("Resultado: " + potencia);
	           } catch (NumberFormatException ex) {
	          lblResult.setText("Ingrese números válidos");
	         }
	       }
	    });
	    
	    
	    JButton btnRaiz = new JButton("n√x");
	    btnRaiz.setForeground(Color.BLACK);
	    btnRaiz.setBackground(new Color(255, 119, 119));
	    btnRaiz.setBounds(154, 470, 85, 37);
	    frame.add(btnRaiz);
	    
	    btnRaiz.addActionListener(new ActionListener() { 
	    	public void actionPerformed(ActionEvent e) {
	    	try {
	    		float num1 = Float.parseFloat(numA.getText());
	    		float num2 = Float.parseFloat(numB.getText());
	    		if(num1<0 && num2 != Math.floor(num2)) {
	    			lblResult.setText("Error: valores invalidos");
	    		}
	    		else {
	    		float raiz = (float)Math.pow(num1, 1.0 / num2); //CUENTA PARA CALCULAR LA RAIZ
	    	lblResult.setText("Resultado: " + raiz); 	}
	    	} catch (NumberFormatException ex) {
	    	lblResult.setText("Ingrese números válidos");
	    	}
	      }
	    });
	    
	    //OPERACIONES SIMPLES INGRESO DE VALORES
	    JLabel lblTitulo = new JLabel("Operaciones simples");
	    lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
	    lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblTitulo.setBounds(10, 98, 498, 22);
	    frame.add(lblTitulo);

	    JTextField txtrValorA = new JTextField();
	    txtrValorA.setHorizontalAlignment(SwingConstants.CENTER);
	    txtrValorA.setForeground(new Color(22, 22, 22));
	    txtrValorA.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
	    txtrValorA.setBackground(new Color(255, 255, 255));
	    txtrValorA.setEditable(false);
	    txtrValorA.setText("Ingrese el primer valor");
	    txtrValorA.setBounds(143, 131, 231, 22);
	    frame.add(txtrValorA);

	    numA = new JTextField();
	    numA.setHorizontalAlignment(SwingConstants.CENTER);
	    numA.setText("0");
	    numA.setBounds(143, 176, 231, 30);
	    numA.setColumns(10);
	    frame.add(numA);

	    lblResult = new JTextField("");
	    lblResult.setFont(new Font("Tahoma", Font.PLAIN, 19));
	    lblResult.setEditable(false);
	    lblResult.setForeground(new Color(255, 255, 255));
	    lblResult.setBackground(new Color(255, 89, 89));
	    lblResult.setHorizontalAlignment(SwingConstants.CENTER);
	    lblResult.setBounds(143, 552, 231, 47);
	    frame.add(lblResult);
	    
	    JTextField txtrValorB = new JTextField();
	    txtrValorB.setText("Ingrese el segundo valor");
	    txtrValorB.setHorizontalAlignment(SwingConstants.CENTER);
	    txtrValorB.setForeground(new Color(22, 22, 22));
	    txtrValorB.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
	    txtrValorB.setEditable(false);
	    txtrValorB.setBackground(Color.WHITE);
	    txtrValorB.setBounds(143, 264, 231, 22);
	    frame.add(txtrValorB);
	    
	    numB = new JTextField();
	    numB.setText("0");
	    numB.setHorizontalAlignment(SwingConstants.CENTER);
	    numB.setColumns(10);
	    numB.setBounds(143, 308, 231, 30);
	    frame.add(numB);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}
}
