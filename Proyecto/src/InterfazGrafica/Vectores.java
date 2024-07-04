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

public class Vectores {

	private JFrame frame;
    private JTextField textField_vector1Pos1;
    private JTextField textField_vector1Pos2;
    private JTextField textField_vector1Pos3;
    private JTextField textField_vector1Pos4;
    private JTextField textField_vector2Pos1;
    private JTextField textField_vector2Pos2;
    private JTextField textField_vector2Pos3;
    private JTextField textField_vector2Pos4;
    private JTextField txtResultado;
    private JTextField textField_RtaPos1;
    private JTextField textField_RtaPos2;
    private JTextField textField_RtaPos3;
    private JTextField textField_RtaPos4;
    private JButton btnResta;
    private JButton btnMulti;
    private JButton btnProdEsc;
    private JButton btnProdVec;
    private JTextField lblNewLabelTit;
    private JTextField lblIngreseValores;
    private int vectorSize = 4;
    private JButton btnClear;
    private JTextField textField_Cagada;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vectores window = new Vectores();
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
	public Vectores() {
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
        
        JLabel lblTitulo = new JLabel("Operaciones con vectores");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTitulo.setBounds(150, 11, 239, 56);
        frame.add(lblTitulo);
        
        JLabel lblSubtitulo = new JLabel("Elegir tipo de tamaño del vector");
        lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblSubtitulo.setBounds(157, 40, 226, 56);
        frame.add(lblSubtitulo);
        
        JButton btn2x2 = new JButton("2x2");
        btn2x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVectorSize(2);
            }
        });
        btn2x2.setBounds(85, 101, 100, 37);
        btn2x2.setForeground(new Color(255, 255, 255));
        btn2x2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn2x2.setBackground(new Color(255, 136, 136));
        frame.add(btn2x2);
        
        JButton btn3x3 = new JButton("3x3");
        btn3x3.setForeground(Color.WHITE);
        btn3x3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn3x3.setBackground(new Color(255, 136, 136));
        btn3x3.setBounds(214, 101, 100, 37);
        btn3x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVectorSize(3);
            }
        });
        frame.add(btn3x3);
        
        JButton btn4x4 = new JButton("4x4");
        btn4x4.setForeground(Color.WHITE);
        btn4x4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn4x4.setBackground(new Color(255, 136, 136));
        btn4x4.setBounds(342, 101, 100, 37);
        btn4x4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVectorSize(4);
            }
        });
        frame.add(btn4x4);
        
        lblNewLabelTit = new JTextField("Vector 4x4");
        lblNewLabelTit.setBounds(83, 149, 359, 22);
        lblNewLabelTit.setBackground(new Color(255, 255, 255));
        lblNewLabelTit.setEditable(false);
        lblNewLabelTit.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabelTit.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.add(lblNewLabelTit);
        
        lblIngreseValores = new JTextField("Ingrese valores:");
        lblIngreseValores.setHorizontalAlignment(SwingConstants.CENTER);
        lblIngreseValores.setBounds(83, 182, 359, 22);
        lblIngreseValores.setBackground(new Color(255, 255, 255));
        lblIngreseValores.setEditable(false);
        lblIngreseValores.setFont(new Font("Tahoma", Font.PLAIN, 15));
        frame.add(lblIngreseValores);
        
        textField_vector1Pos1 = new JTextField("");
        textField_vector1Pos1.setBounds(85, 224, 66, 62);
        textField_vector1Pos1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector1Pos1.setColumns(10);
        frame.add(textField_vector1Pos1);
        
        textField_vector1Pos2 = new JTextField("");
        textField_vector1Pos2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector1Pos2.setColumns(10);
        textField_vector1Pos2.setBounds(179, 224, 66, 62);
        frame.add(textField_vector1Pos2);
        
        textField_vector1Pos3 = new JTextField("");
        textField_vector1Pos3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector1Pos3.setColumns(10);
        textField_vector1Pos3.setBounds(280, 224, 66, 62);
        frame.add(textField_vector1Pos3);
        
        textField_vector1Pos4 = new JTextField("");
        textField_vector1Pos4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector1Pos4.setColumns(10);
        textField_vector1Pos4.setBounds(376, 224, 66, 62);
        frame.add(textField_vector1Pos4);
        
        textField_vector2Pos1 = new JTextField("");
        textField_vector2Pos1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector2Pos1.setColumns(10);
        textField_vector2Pos1.setBounds(85, 309, 66, 62);
        frame.add(textField_vector2Pos1);
        
        textField_vector2Pos2 = new JTextField("");
        textField_vector2Pos2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector2Pos2.setColumns(10);
        textField_vector2Pos2.setBounds(179, 309, 66, 62);
        frame.add(textField_vector2Pos2);
        
        textField_vector2Pos3 = new JTextField("");
        textField_vector2Pos3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector2Pos3.setColumns(10);
        textField_vector2Pos3.setBounds(280, 309, 66, 62);
        frame.add(textField_vector2Pos3);
        
        textField_vector2Pos4 = new JTextField("");
        textField_vector2Pos4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_vector2Pos4.setColumns(10);
        textField_vector2Pos4.setBounds(376, 309, 66, 62);
        frame.add(textField_vector2Pos4);
        
        txtResultado = new JTextField("RESULTADO");
        txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtResultado.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtResultado.setEditable(false);
        txtResultado.setBackground(Color.WHITE);
        txtResultado.setBounds(83, 391, 359, 22);
        frame.add(txtResultado);
        
        textField_RtaPos1 = new JTextField("");
        textField_RtaPos1.setEditable(false);
        textField_RtaPos1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_RtaPos1.setColumns(10);
        textField_RtaPos1.setBounds(85, 432, 66, 62);
        frame.add(textField_RtaPos1);
        
        textField_RtaPos2 = new JTextField("");
        textField_RtaPos2.setEditable(false);
        textField_RtaPos2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_RtaPos2.setColumns(10);
        textField_RtaPos2.setBounds(179, 432, 66, 62);
        frame.add(textField_RtaPos2);
        
        textField_RtaPos3 = new JTextField("");
        textField_RtaPos3.setEditable(false);
        textField_RtaPos3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_RtaPos3.setColumns(10);
        textField_RtaPos3.setBounds(280, 432, 66, 62);
        frame.add(textField_RtaPos3);
        
        textField_RtaPos4 = new JTextField("");
        textField_RtaPos4.setEditable(false);
        textField_RtaPos4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_RtaPos4.setColumns(10);
        textField_RtaPos4.setBounds(376, 432, 66, 62);
        frame.add(textField_RtaPos4);
        
        JButton btnSuma = new JButton("+");
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sumarVectores();
            }
        });
        btnSuma.setForeground(Color.WHITE);
        btnSuma.setBackground(new Color(255, 100, 100));
        btnSuma.setBounds(158, 513, 56, 50);
        frame.add(btnSuma);
        
        btnResta = new JButton("-");
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	restaVectores();
            }
        });
        btnResta.setForeground(Color.WHITE);
        btnResta.setBackground(new Color(255, 100, 100));
        btnResta.setBounds(236, 513, 56, 50);
        frame.add(btnResta);
        
        btnMulti = new JButton("*");
        btnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	multiVectores();
            }
        });
        btnMulti.setForeground(Color.WHITE);
        btnMulti.setBackground(new Color(255, 100, 100));
        btnMulti.setBounds(313, 513, 56, 50);
        frame.add(btnMulti);
        
        btnProdEsc = new JButton("Prod.Escalar");
        btnProdEsc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	prodEscalar();
            }
        });
        btnProdEsc.setForeground(Color.WHITE);
        btnProdEsc.setBackground(new Color(255, 100, 100));
        btnProdEsc.setBounds(158, 574, 100, 50);
        frame.add(btnProdEsc);
        
        btnProdVec = new JButton("Prod.Vectorial");
        btnProdVec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	prodVectorial();
            }
        });
        btnProdVec.setForeground(Color.WHITE);
        btnProdVec.setBackground(new Color(255, 100, 100));
        btnProdVec.setBounds(269, 574, 100, 50);
        frame.add(btnProdVec);
        
        btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textField_vector1Pos1.setText("");
            	textField_vector1Pos2.setText("");
            	textField_vector1Pos3.setText("");
	    		textField_vector1Pos4.setText("");
            	
	    		textField_vector2Pos1.setText("");
            	textField_vector2Pos2.setText("");
	    		textField_vector2Pos3.setText("");
            	textField_vector2Pos4.setText("");
	    		
	    		textField_RtaPos1.setText("");
	    		textField_RtaPos2.setText("");
	    		textField_RtaPos3.setText("");
	    		textField_RtaPos4.setText("");
            }
        });
        btnClear.setForeground(Color.WHITE);
        btnClear.setBackground(new Color(255, 100, 100));
        btnClear.setBounds(158, 632, 211, 22);
        frame.add(btnClear);
        
        textField_Cagada = new JTextField();
        textField_Cagada.setHorizontalAlignment(SwingConstants.CENTER);
        textField_Cagada.setBackground(new Color(255, 206, 206));
        textField_Cagada.setBounds(85, 659, 359, 13);
        textField_Cagada.setText("Hey! Ojito con lo que haces, Prod.Vect solo se puede 3x3");
        textField_Cagada.setFont(new Font("Tahoma", Font.BOLD, 10));
        textField_Cagada.setEditable(false);
        textField_Cagada.setVisible(false);
        frame.add(textField_Cagada);


        setVectorSize(4);
    }

    private void setVectorSize(int size) {
        vectorSize = size;
        
        textField_vector1Pos1.setVisible(size >= 2);
        textField_vector1Pos2.setVisible(size >= 2);
        textField_vector1Pos3.setVisible(size >= 3);
        textField_vector1Pos4.setVisible(size >= 4);

        textField_vector2Pos1.setVisible(size >= 2);
        textField_vector2Pos2.setVisible(size >= 2);
        textField_vector2Pos3.setVisible(size >= 3);
        textField_vector2Pos4.setVisible(size >= 4);

        textField_RtaPos1.setVisible(size >= 2);
        textField_RtaPos2.setVisible(size >= 2);
        textField_RtaPos3.setVisible(size >= 3);
        textField_RtaPos4.setVisible(size >= 4);

        if (size == 2) {
            lblNewLabelTit.setText("Vector 2x2");
        } else if (size == 3) {
            lblNewLabelTit.setText("Vector 3x3");
        } else {
            lblNewLabelTit.setText("Vector 4x4");
        }
    }

    private void sumarVectores() {
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] resultado = new int[4];
        
        try {
            if (vectorSize >= 2) {
                vector1[0] = Integer.parseInt(textField_vector1Pos1.getText());
                vector1[1] = Integer.parseInt(textField_vector1Pos2.getText());
                vector2[0] = Integer.parseInt(textField_vector2Pos1.getText());
                vector2[1] = Integer.parseInt(textField_vector2Pos2.getText());
                resultado[0] = vector1[0] + vector2[0];
                resultado[1] = vector1[1] + vector2[1];
            }
            if (vectorSize >= 3) {
                vector1[2] = Integer.parseInt(textField_vector1Pos3.getText());
                vector2[2] = Integer.parseInt(textField_vector2Pos3.getText());
                resultado[2] = vector1[2] + vector2[2];
            }
            if (vectorSize >= 4) {
                vector1[3] = Integer.parseInt(textField_vector1Pos4.getText());
                vector2[3] = Integer.parseInt(textField_vector2Pos4.getText());
                resultado[3] = vector1[3] + vector2[3];
            }


            if (vectorSize >= 2) {
                textField_RtaPos1.setText(String.valueOf(resultado[0]));
                textField_RtaPos2.setText(String.valueOf(resultado[1]));
            }
            if (vectorSize >= 3) {
                textField_RtaPos3.setText(String.valueOf(resultado[2]));
            }
            if (vectorSize >= 4) {
                textField_RtaPos4.setText(String.valueOf(resultado[3]));
            }
        } catch (NumberFormatException e) { //that confuse
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void restaVectores() {
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] resultado = new int[4];
        
        try {
            if (vectorSize >= 2) {
                vector1[0] = Integer.parseInt(textField_vector1Pos1.getText());
                vector1[1] = Integer.parseInt(textField_vector1Pos2.getText());
                vector2[0] = Integer.parseInt(textField_vector2Pos1.getText());
                vector2[1] = Integer.parseInt(textField_vector2Pos2.getText());
                resultado[0] = vector1[0] - vector2[0];
                resultado[1] = vector1[1] - vector2[1];
            }
            if (vectorSize >= 3) {
                vector1[2] = Integer.parseInt(textField_vector1Pos3.getText());
                vector2[2] = Integer.parseInt(textField_vector2Pos3.getText());
                resultado[2] = vector1[2] - vector2[2];
            }
            if (vectorSize >= 4) {
                vector1[3] = Integer.parseInt(textField_vector1Pos4.getText());
                vector2[3] = Integer.parseInt(textField_vector2Pos4.getText());
                resultado[3] = vector1[3] - vector2[3];
            }

            if (vectorSize >= 2) {
                textField_RtaPos1.setText(String.valueOf(resultado[0]));
                textField_RtaPos2.setText(String.valueOf(resultado[1]));
            }
            if (vectorSize >= 3) {
                textField_RtaPos3.setText(String.valueOf(resultado[2]));
            }
            if (vectorSize >= 4) {
                textField_RtaPos4.setText(String.valueOf(resultado[3]));
            }
        } catch (NumberFormatException e) { //that confuse
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void multiVectores() {
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] resultado = new int[4];
        
        try {
            if (vectorSize >= 2) {
                vector1[0] = Integer.parseInt(textField_vector1Pos1.getText());
                vector1[1] = Integer.parseInt(textField_vector1Pos2.getText());
                vector2[0] = Integer.parseInt(textField_vector2Pos1.getText());
                vector2[1] = Integer.parseInt(textField_vector2Pos2.getText());
                resultado[0] = vector1[0] * vector2[0];
                resultado[1] = vector1[1] * vector2[1];
            }
            if (vectorSize >= 3) {
                vector1[2] = Integer.parseInt(textField_vector1Pos3.getText());
                vector2[2] = Integer.parseInt(textField_vector2Pos3.getText());
                resultado[2] = vector1[2] * vector2[2];
            }
            if (vectorSize >= 4) {
                vector1[3] = Integer.parseInt(textField_vector1Pos4.getText());
                vector2[3] = Integer.parseInt(textField_vector2Pos4.getText());
                resultado[3] = vector1[3] * vector2[3];
            }

            if (vectorSize >= 2) {
                textField_RtaPos1.setText(String.valueOf(resultado[0]));
                textField_RtaPos2.setText(String.valueOf(resultado[1]));
            }
            if (vectorSize >= 3) {
                textField_RtaPos3.setText(String.valueOf(resultado[2]));
            }
            if (vectorSize >= 4) {
                textField_RtaPos4.setText(String.valueOf(resultado[3]));
            }
        } catch (NumberFormatException e) { //that confuse
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void prodEscalar() {
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int resultado = 0;

        try {
            if (vectorSize >= 2) {
                vector1[0] = Integer.parseInt(textField_vector1Pos1.getText());
                vector1[1] = Integer.parseInt(textField_vector1Pos2.getText());
                vector2[0] = Integer.parseInt(textField_vector2Pos1.getText());
                vector2[1] = Integer.parseInt(textField_vector2Pos2.getText());
                resultado += vector1[0] * vector2[0];
                resultado += vector1[1] * vector2[1];
            }
            if (vectorSize >= 3) {
                vector1[2] = Integer.parseInt(textField_vector1Pos3.getText());
                vector2[2] = Integer.parseInt(textField_vector2Pos3.getText());
                resultado += vector1[2] * vector2[2];
            }
            if (vectorSize >= 4) {
                vector1[3] = Integer.parseInt(textField_vector1Pos4.getText());
                vector2[3] = Integer.parseInt(textField_vector2Pos4.getText());
                resultado += vector1[3] * vector2[3];
            }


            if (vectorSize >= 2) {
                textField_RtaPos1.setText(String.valueOf(resultado));
                textField_RtaPos2.setText("");
            }
            if (vectorSize >= 3) {
                textField_RtaPos3.setText("");
            }
            if (vectorSize >= 4) {
                textField_RtaPos4.setText("");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void prodVectorial() {
        if (vectorSize != 3) {
        	textField_Cagada.setVisible(true);
        	return;
        }
        textField_Cagada.setVisible(false);
        
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        int[] resultado = new int[3];

        try {
            vector1[0] = Integer.parseInt(textField_vector1Pos1.getText());
            vector1[1] = Integer.parseInt(textField_vector1Pos2.getText());
            vector1[2] = Integer.parseInt(textField_vector1Pos3.getText());

            vector2[0] = Integer.parseInt(textField_vector2Pos1.getText());
            vector2[1] = Integer.parseInt(textField_vector2Pos2.getText());
            vector2[2] = Integer.parseInt(textField_vector2Pos3.getText());

            resultado[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
            resultado[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
            resultado[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];

            textField_RtaPos1.setText(String.valueOf(resultado[0]));
            textField_RtaPos2.setText(String.valueOf(resultado[1]));
            textField_RtaPos3.setText(String.valueOf(resultado[2]));
            textField_RtaPos4.setText("");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}
}
