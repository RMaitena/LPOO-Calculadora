package InterfazGrafica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Matriz {
	
	private JFrame frame;
	private JTextField textA2_2;
	private JTextField textA2_3;
	private JTextField textA3_2;
	private JTextField textA3_3;
	private JTextField textB3_1;
	private JTextField textB3_2;
	private JTextField textA2_1;
	private JTextField textA3_1;
	private JTextField textB2_1;
	private JTextField textB2_2;
	private JTextField textB2_3;
	private JTextField textB3_3;
	private JTextField textB1_3;
	private JTextField textB1_2;
	private JTextField textB1_1;
	private JTextField textA1_3;
	private JTextField textA1_2;
	private JTextField textA1_1;
	private JTextArea textArea;
	private JTextField txtResultado;
	private int matrizSize = 3;
	private int matrizA[][];
	private int matrizB[][];
	private int matrizSuma[][];
	private int matrizResta[][];
	private int matrizMulti[][];
	private float matrizDiv[][];
	private int determinante;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matriz window = new Matriz();
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
	public Matriz() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 206, 206));
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //
		frame.setSize(536, 698);
		
		JLabel lblTitulo = new JLabel("Operaciones con matrices");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(10, 35, 498, 22);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblSubtitulo = new JLabel("Elegir tipo de matriz cuadrada:");
		lblSubtitulo.setBounds(10, 68, 498, 22);
		lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblSubtitulo);
		
		JTextField lbltres = new JTextField("Matriz cuadrada 3x3");
		lbltres.setBounds(83, 149, 353, 25);
		lbltres.setBackground(new Color(255, 255, 255));
		lbltres.setEditable(false);
		lbltres.setHorizontalAlignment(SwingConstants.CENTER);
		lbltres.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lbltres);
		
		JTextField lbldos = new JTextField("Matriz cuadrada 2x2");
		lbldos.setBounds(83, 149, 353, 25);
		lbldos.setBackground(new Color(255, 255, 255));
		lbldos.setEditable(false);
		lbldos.setHorizontalAlignment(SwingConstants.CENTER);
		lbldos.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lbldos);
		
		
		JTextField lblIngreseValores = new JTextField("Ingrese valores:");
		lblIngreseValores.setBounds(83, 185, 353, 25);
		lblIngreseValores.setBackground(new Color(255, 255, 255));
		lblIngreseValores.setEditable(false);
		lblIngreseValores.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseValores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblIngreseValores);
		
		textA2_2 = new JTextField();
		textA2_2.setBounds(120, 279, 54, 47);
		textA2_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textA2_2);
		textA2_2.setColumns(10);
		
		textA2_3 = new JTextField();
		textA2_3.setBounds(184, 279, 54, 47);
		textA2_3.setHorizontalAlignment(SwingConstants.CENTER);
		textA2_3.setColumns(10);
		frame.getContentPane().add(textA2_3);
		
		textA3_2 = new JTextField();
		textA3_2.setBounds(120, 337, 54, 47);
		textA3_2.setHorizontalAlignment(SwingConstants.CENTER);
		textA3_2.setColumns(10);
		frame.getContentPane().add(textA3_2);
		
		textA3_3 = new JTextField();
		textA3_3.setBounds(184, 337, 54, 47);
		textA3_3.setHorizontalAlignment(SwingConstants.CENTER);
		textA3_3.setColumns(10);
		frame.getContentPane().add(textA3_3);
		
		textB3_1 = new JTextField();
		textB3_1.setBounds(280, 337, 54, 47);
		textB3_1.setHorizontalAlignment(SwingConstants.CENTER);
		textB3_1.setColumns(10);
		frame.getContentPane().add(textB3_1);
		
		textB3_2 = new JTextField();
		textB3_2.setBounds(344, 337, 54, 47);
		textB3_2.setHorizontalAlignment(SwingConstants.CENTER);
		textB3_2.setColumns(10);
		frame.getContentPane().add(textB3_2);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setEditable(false);
		textArea.setBackground(new Color(255, 106, 106));
		textArea.setBounds(83, 541, 353, 107);
		frame.getContentPane().add(textArea);
		
		textA2_1 = new JTextField();
		textA2_1.setHorizontalAlignment(SwingConstants.CENTER);
		textA2_1.setColumns(10);
		textA2_1.setBounds(56, 279, 54, 47);
		frame.getContentPane().add(textA2_1);
		
		textA3_1 = new JTextField();
		textA3_1.setHorizontalAlignment(SwingConstants.CENTER);
		textA3_1.setColumns(10);
		textA3_1.setBounds(56, 337, 54, 47);
		frame.getContentPane().add(textA3_1);
		
		textB2_1 = new JTextField();
		textB2_1.setHorizontalAlignment(SwingConstants.CENTER);
		textB2_1.setColumns(10);
		textB2_1.setBounds(280, 279, 54, 47);
		frame.getContentPane().add(textB2_1);
		
		textB2_2 = new JTextField();
		textB2_2.setHorizontalAlignment(SwingConstants.CENTER);
		textB2_2.setColumns(10);
		textB2_2.setBounds(344, 279, 54, 47);
		frame.getContentPane().add(textB2_2);
		
		textB2_3 = new JTextField();
		textB2_3.setHorizontalAlignment(SwingConstants.CENTER);
		textB2_3.setColumns(10);
		textB2_3.setBounds(408, 279, 55, 47);
		frame.getContentPane().add(textB2_3);
		
		textB3_3 = new JTextField();
		textB3_3.setHorizontalAlignment(SwingConstants.CENTER);
		textB3_3.setColumns(10);
		textB3_3.setBounds(408, 337, 55, 47);
		frame.getContentPane().add(textB3_3);
		
		textB1_3 = new JTextField();
		textB1_3.setHorizontalAlignment(SwingConstants.CENTER);
		textB1_3.setColumns(10);
		textB1_3.setBounds(408, 221, 55, 47);
		frame.getContentPane().add(textB1_3);
		
		textB1_2 = new JTextField();
		textB1_2.setHorizontalAlignment(SwingConstants.CENTER);
		textB1_2.setColumns(10);
		textB1_2.setBounds(344, 221, 54, 47);
		frame.getContentPane().add(textB1_2);
		
		textB1_1 = new JTextField();
		textB1_1.setHorizontalAlignment(SwingConstants.CENTER);
		textB1_1.setColumns(10);
		textB1_1.setBounds(280, 221, 54, 47);
		frame.getContentPane().add(textB1_1);
		
		textA1_3 = new JTextField();
		textA1_3.setHorizontalAlignment(SwingConstants.CENTER);
		textA1_3.setColumns(10);
		textA1_3.setBounds(184, 221, 54, 47);
		frame.getContentPane().add(textA1_3);
		
		textA1_2 = new JTextField();
		textA1_2.setHorizontalAlignment(SwingConstants.CENTER);
		textA1_2.setColumns(10);
		textA1_2.setBounds(120, 221, 54, 47);
		frame.getContentPane().add(textA1_2);
		
		textA1_1 = new JTextField();
		textA1_1.setHorizontalAlignment(SwingConstants.CENTER);
		textA1_1.setColumns(10);
		textA1_1.setBounds(56, 221, 54, 47);
		frame.getContentPane().add(textA1_1);
		
		JButton btnNewButton = new JButton("2x2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matrizSize = 2;		
				lbldos.setVisible(true);
				lbltres.setVisible(false);
				textA1_1.setVisible(false);
				textA1_1.setVisible(false);
				textA2_1.setVisible(false);
				textA2_1.setVisible(false);
				textA3_1.setVisible(false);
				textA3_2.setVisible(false);
				textA3_1.setVisible(false);
				textA3_3.setVisible(false);
				
				textB1_3.setVisible(false);
				textB2_3.setVisible(false);
				textB3_3.setVisible(false);
				textB3_2.setVisible(false);
				textB3_1.setVisible(false);
				matrizA = new int[2][2];
				matrizB = new int[2][2];	
			}
		});
		
		JButton btnNewButton_2 = new JButton("3x3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 matrizSize = 3;
				lbldos.setVisible(false);
				lbltres.setVisible(true);
				textA1_1.setVisible(false);
				textA2_1.setVisible(false);
				textA3_1.setVisible(false);
				
				textA1_1.setVisible(true);
				textA2_1.setVisible(true);
				textA3_1.setVisible(true);
				textA3_2.setVisible(true);
				textA3_3.setVisible(true);
				
				textB1_3.setVisible(true);
				textB2_3.setVisible(true);
				textB3_3.setVisible(true);
				textB3_2.setVisible(true);
				textB3_1.setVisible(true);
				matrizA = new int[3][3];
				matrizB = new int[3][3];
			}
		});
		btnNewButton.setBounds(138, 101, 100, 37);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_2.setBounds(280, 101, 100, 37);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnNewButton_2);
		
		txtResultado = new JTextField("RESULTADO");
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtResultado.setEditable(false);
		txtResultado.setBackground(Color.WHITE);
		txtResultado.setBounds(83, 508, 353, 22);
		frame.getContentPane().add(txtResultado);
		
		JButton btnDiv = new JButton("%");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divMatrices();
			}
		});
		btnDiv.setBounds(334, 392, 46, 43);
		btnDiv.setForeground(new Color(255, 255, 255));
		btnDiv.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiMatrices();
			}
		});
		btnMulti.setBounds(268, 392, 46, 43);
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnMulti);
		
		JButton btnResta = new JButton("-");
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restarMatrices();
			}
		});
		btnResta.setBounds(203, 392, 46, 43);
		btnResta.setForeground(new Color(255, 255, 255));
		btnResta.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnResta);
		
		JButton btnInversa = new JButton("Inversa");
		btnInversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inversaMatriz();
			}
		});
		btnInversa.setBounds(268, 442, 112, 30);
		btnInversa.setForeground(new Color(255, 255, 255));
		btnInversa.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnInversa);
		
		JButton btnDeterminante = new JButton("Determinante");
		btnDeterminante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detMatriz();
			}
		});
		btnDeterminante.setBounds(138, 442, 112, 30);
		btnDeterminante.setForeground(new Color(255, 255, 255));
		btnDeterminante.setBackground(new Color(255, 136, 136));
		frame.getContentPane().add(btnDeterminante);
		
		
		JButton btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sumarMatrices();
			}
		});
		btnSuma.setForeground(Color.WHITE);
		btnSuma.setBackground(new Color(255, 136, 136));
		btnSuma.setBounds(138, 392, 46, 43);
		frame.getContentPane().add(btnSuma);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textA1_1.setText("");
				textA1_1.setText("");
				textA1_2.setText("");
				textA1_3.setText("");
				textA2_1.setText("");
				textA2_1.setText("");
				textA2_2.setText("");
				textA2_3.setText("");
				textA3_1.setText("");
				textA3_1.setText("");
				textA3_2.setText("");
				textA3_3.setText("");
				textB1_1.setText("");
				textB1_2.setText("");
				textB1_3.setText("");
				textB2_1.setText("");
				textB2_2.setText("");
				textB2_3.setText("");
				textB3_1.setText("");
				textB3_2.setText("");
				textB3_3.setText("");
				textArea.setText("");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setBackground(new Color(255, 136, 136));
		btnClear.setBounds(138, 478, 242, 22);
		frame.getContentPane().add(btnClear);
	}
	
	private void declararMatriz() {
		try {
			if (matrizSize == 2) {
				matrizA = new int[2][2];
				matrizB = new int[2][2];
				matrizA[0][0] = Integer.parseInt(textA1_2.getText().trim());
				matrizA[0][1] = Integer.parseInt(textA1_3.getText().trim());
				matrizA[1][0] = Integer.parseInt(textA2_2.getText().trim());
				matrizA[1][1] = Integer.parseInt(textA2_3.getText().trim());
				matrizB[0][0] = Integer.parseInt(textB1_1.getText().trim());
				matrizB[0][1] = Integer.parseInt(textB1_2.getText().trim());
				matrizB[1][0] = Integer.parseInt(textB2_1.getText().trim());
				matrizB[1][1] = Integer.parseInt(textB2_2.getText().trim());
			} 
			else if (matrizSize == 3) {
				matrizA = new int[3][3];
				matrizB = new int[3][3];
				matrizA[0][0] = Integer.parseInt(textA1_1.getText().trim());
				matrizA[0][1] = Integer.parseInt(textA1_2.getText().trim());
				matrizA[0][2] = Integer.parseInt(textA1_3.getText().trim());
				matrizA[1][0] = Integer.parseInt(textA2_1.getText().trim());
				matrizA[1][1] = Integer.parseInt(textA2_2.getText().trim());
				matrizA[1][2] = Integer.parseInt(textA2_3.getText().trim());
				matrizA[2][0] = Integer.parseInt(textA3_1.getText().trim());
				matrizA[2][1] = Integer.parseInt(textA3_2.getText().trim());
				matrizA[2][2] = Integer.parseInt(textA3_3.getText().trim());
				matrizB[0][0] = Integer.parseInt(textB1_1.getText().trim());
				matrizB[0][1] = Integer.parseInt(textB1_2.getText().trim());
				matrizB[0][2] = Integer.parseInt(textB1_3.getText().trim());
				matrizB[1][0] = Integer.parseInt(textB2_1.getText().trim());
				matrizB[1][1] = Integer.parseInt(textB2_2.getText().trim());
				matrizB[1][2] = Integer.parseInt(textB2_3.getText().trim());
				matrizB[2][0] = Integer.parseInt(textB3_1.getText().trim());
				matrizB[2][1] = Integer.parseInt(textB3_2.getText().trim());
				matrizB[2][2] = Integer.parseInt(textB3_3.getText().trim());
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: Ingrese solo números enteros.");
			e.printStackTrace();
		}
	}
	
	private void sumarMatrices() {
		try {
			declararMatriz();
			matrizSuma = new int[matrizSize][matrizSize];
			for(int i=0;i<matrizSize;i++) {
				for(int j=0;j<matrizSize;j++) {
					matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}
			String matrizTexto = "";
			for (int i=0;i<matrizSize;i++) {
				for (int j=0;j<matrizSize;j++) {
					matrizTexto += "     " + matrizSuma[i][j] + "    " ;
				}
				matrizTexto += "\n";
			}
			textArea.setText(matrizTexto);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	private void restarMatrices() {
		declararMatriz();
		matrizResta = new int [matrizSize][matrizSize];
		for(int i=0;i<matrizSize;i++) {
			for(int j=0;j<matrizSize;j++) {
				matrizResta[i][j] = matrizA[i][j] - matrizB[i][j];
			}
		}
		String matrizRTexto = "";
		for (int i = 0; i < matrizSize; i++) {
			for (int j = 0; j < matrizSize; j++) {
				matrizRTexto += "     " + matrizResta[i][j] + "    " ;
			}
			matrizRTexto += "\n";
		}
		textArea.setText(matrizRTexto);
	}
	
	private void multiMatrices() {
		declararMatriz();
		matrizMulti = new int [matrizSize][matrizSize];
		for(int i=0;i<matrizSize;i++) {
			for(int j=0;j<matrizSize;j++) {
				matrizMulti[i][j] = matrizA[i][j] * matrizB[i][j];
			}
		}
		String matrizMTexto = "";
		for (int i = 0; i < matrizSize; i++) {
			for (int j = 0; j < matrizSize; j++) {
				matrizMTexto += "     " + matrizMulti[i][j] + "     " ;
			}
			matrizMTexto += "\n";
		}
		textArea.setText(matrizMTexto);
		}
	
	private void divMatrices() {
		declararMatriz();
		matrizDiv = new float [matrizSize][matrizSize];
		for(int i=0;i<matrizSize;i++) {
			for(int j=0;j<matrizSize;j++) {
				matrizDiv[i][j] = (float)matrizA[i][j] / matrizB[i][j];
			}
		}
		DecimalFormat df = new DecimalFormat("#.##");
		String matrizDTexto = "";
		for (int i = 0; i < matrizSize; i++) {
			for (int j = 0; j < matrizSize; j++) {
				matrizDTexto += "     " + df.format(matrizDiv[i][j]);
			}
			matrizDTexto += "\n";
		}
		textArea.setText(matrizDTexto);
	}
	
	private void detMatriz() {
	    declararMatriz();
	    determinante = 0;
	    try {
	        if (matrizSize == 2) {
	            determinante = (matrizA[0][0] * matrizA[1][1]) - (matrizA[0][1] * matrizA[1][0]);
	        } else if (matrizSize == 3) {
	            determinante = matrizA[0][0] * (matrizA[1][1] * matrizA[2][2] - matrizA[1][2] * matrizA[2][1])
	                    - matrizA[0][1] * (matrizA[1][0] * matrizA[2][2] - matrizA[1][2] * matrizA[2][0])
	                    + matrizA[0][2] * (matrizA[1][0] * matrizA[2][1] - matrizA[1][1] * matrizA[2][0]);
	        }
	        textArea.setText("\n                Determinante = " + (Integer.toString(determinante)));
	    } catch (NumberFormatException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

	private void inversaMatriz() {
	    declararMatriz();
	    double[][] matrizInversa = new double[matrizSize][matrizSize];
	    double det = 0;
	    
	    try {
	        if (matrizSize == 2) {
	            det = (matrizA[0][0] * matrizA[1][1]) - (matrizA[0][1] * matrizA[1][0]);
	        } else if (matrizSize == 3) {
	            det = matrizA[0][0] * (matrizA[1][1] * matrizA[2][2] - matrizA[1][2] * matrizA[2][1])
	                  - matrizA[0][1] * (matrizA[1][0] * matrizA[2][2] - matrizA[1][2] * matrizA[2][0])
	                  + matrizA[0][2] * (matrizA[1][0] * matrizA[2][1] - matrizA[1][1] * matrizA[2][0]);
	        }
	        
	        if (det != 0) {
	            if (matrizSize == 2) {
	                matrizInversa[0][0] = matrizA[1][1] / det;
	                matrizInversa[0][1] = -matrizA[0][1] / det;
	                matrizInversa[1][0] = -matrizA[1][0] / det;
	                matrizInversa[1][1] = matrizA[0][0] / det;
	            } else if (matrizSize == 3) {
	                matrizInversa[0][0] = (matrizA[1][1] * matrizA[2][2] - matrizA[1][2] * matrizA[2][1]) / det;
	                matrizInversa[0][1] = -(matrizA[0][1] * matrizA[2][2] - matrizA[0][2] * matrizA[2][1]) / det;
	                matrizInversa[0][2] = (matrizA[0][1] * matrizA[1][2] - matrizA[0][2] * matrizA[1][1]) / det;
	                matrizInversa[1][0] = -(matrizA[1][0] * matrizA[2][2] - matrizA[1][2] * matrizA[2][0]) / det;
	                matrizInversa[1][1] = (matrizA[0][0] * matrizA[2][2] - matrizA[0][2] * matrizA[2][0]) / det;
	                matrizInversa[1][2] = -(matrizA[0][0] * matrizA[1][2] - matrizA[0][2] * matrizA[1][0]) / det;
	                matrizInversa[2][0] = (matrizA[1][0] * matrizA[2][1] - matrizA[1][1] * matrizA[2][0]) / det;
	                matrizInversa[2][1] = -(matrizA[0][0] * matrizA[2][1] - matrizA[0][1] * matrizA[2][0]) / det;
	                matrizInversa[2][2] = (matrizA[0][0] * matrizA[1][1] - matrizA[0][1] * matrizA[1][0]) / det;
	            }
	            DecimalFormat df = new DecimalFormat("#.##");
	            String matrizDTexto = "";
	            for (int i = 0; i < matrizSize; i++) {
	                for (int j = 0; j < matrizSize; j++) {
	                    matrizDTexto += "     " + df.format(matrizInversa[i][j]);
	                }
	                matrizDTexto += "\n";
	            }
	            textArea.setText(matrizDTexto);
	        } else {
	            textArea.setText("No tiene inversa porque el determinante es 0");
	        }
	    } catch (NumberFormatException e) {
	        System.out.println("Error al calcular la inversa: " + e.getMessage());
	    }
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);	
	}
}
