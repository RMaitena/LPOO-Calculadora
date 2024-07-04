package InterfazGrafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SistEcu {

	private JFrame frame;
	private JTextField textFieldx1;
	private JTextField textFieldy1;
	private JTextField textFieldz1;
	private JTextField textFieldx2;
	private JTextField textFieldy2;
	private JTextField textFieldz2;
	private JTextField textFieldx3;
	private JTextField textFieldy3;
	private JTextField textFieldz3;
	private JTextField textFieldti1;
	private JTextField textFieldti2;
	private JTextField textFieldti3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistEcu window = new SistEcu();
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
	public SistEcu() {
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


	    textFieldx1 = new JTextField();
	    textFieldx1.setColumns(10);
	    textFieldx1.setBounds(82, 160, 45, 29);
	    frame.getContentPane().add(textFieldx1);
	    
	    JLabel lblX = new JLabel("X");
	    lblX.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblX.setBounds(132, 167, 25, 22);
	    frame.getContentPane().add(lblX);
	    
	    textFieldy1 = new JTextField();
	    textFieldy1.setColumns(10);
	    textFieldy1.setBounds(190, 160, 45, 29);
	    frame.getContentPane().add(textFieldy1);
	    
	    JLabel lblY = new JLabel("Y");
	    lblY.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblY.setBounds(239, 167, 25, 22);
	    frame.getContentPane().add(lblY);
	    
	    textFieldz1 = new JTextField();
	    textFieldz1.setColumns(10);
	    textFieldz1.setBounds(284, 160, 45, 29);
	    frame.getContentPane().add(textFieldz1);
	    
	    JLabel lblZ = new JLabel("Z");
	    lblZ.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblZ.setBounds(336, 167, 36, 22);
	    frame.getContentPane().add(lblZ);
	    
	    JLabel lblmas2 = new JLabel("+");
	    lblmas2.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblmas2.setBounds(262, 167, 25, 22);
	    frame.getContentPane().add(lblmas2);
	    
	    JLabel lblmas = new JLabel("+");
	    lblmas.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblmas.setBounds(159, 167, 25, 22);
	    frame.getContentPane().add(lblmas);
	    
	    textFieldx2 = new JTextField();
	    textFieldx2.setColumns(10);
	    textFieldx2.setBounds(82, 211, 45, 29);
	    frame.getContentPane().add(textFieldx2);
	    
	    JLabel lblX_1 = new JLabel("X");
	    lblX_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblX_1.setBounds(132, 218, 25, 22);
	    frame.getContentPane().add(lblX_1);
	    
	    JLabel lblmas3 = new JLabel("+");
	    lblmas3.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblmas3.setBounds(159, 218, 25, 22);
	    frame.getContentPane().add(lblmas3);
	    
	    textFieldy2 = new JTextField();
	    textFieldy2.setColumns(10);
	    textFieldy2.setBounds(190, 211, 45, 29);
	    frame.getContentPane().add(textFieldy2);
	    
	    JLabel lblY_1 = new JLabel("Y");
	    lblY_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblY_1.setBounds(239, 218, 25, 22);
	    frame.getContentPane().add(lblY_1);
	    
	    JLabel lblmas4 = new JLabel("+");
	    lblmas4.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblmas4.setBounds(262, 218, 25, 22);
	    frame.getContentPane().add(lblmas4);
	    
	    textFieldz2 = new JTextField();
	    textFieldz2.setColumns(10);
	    textFieldz2.setBounds(284, 211, 45, 29);
	    frame.getContentPane().add(textFieldz2);
	    
	    JLabel lblZ_1 = new JLabel("Z");
	    lblZ_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblZ_1.setBounds(336, 218, 36, 22);
	    frame.getContentPane().add(lblZ_1);
	    
	    textFieldx3 = new JTextField();
	    textFieldx3.setColumns(10);
	    textFieldx3.setBounds(82, 261, 45, 29);
	    frame.getContentPane().add(textFieldx3);
	    
	    JLabel lblX_2 = new JLabel("X");
	    lblX_2.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblX_2.setBounds(132, 268, 25, 22);
	    frame.getContentPane().add(lblX_2);
	    
	    JLabel lblmas5 = new JLabel("+");
	    lblmas5.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblmas5.setBounds(159, 268, 25, 22);
	    frame.getContentPane().add(lblmas5);
	    
	    textFieldy3 = new JTextField();
	    textFieldy3.setColumns(10);
	    textFieldy3.setBounds(190, 261, 45, 29);
	    frame.getContentPane().add(textFieldy3);
	    
	    JLabel lblY_2 = new JLabel("Y");
	    lblY_2.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblY_2.setBounds(239, 268, 25, 22);
	    frame.getContentPane().add(lblY_2);
	    
	    JLabel lblmas6 = new JLabel("+");
	    lblmas6.setFont(new Font("Tahoma", Font.BOLD, 19));
	    lblmas6.setBounds(262, 268, 25, 22);
	    frame.getContentPane().add(lblmas6);
	    
	    textFieldz3 = new JTextField();
	    textFieldz3.setColumns(10);
	    textFieldz3.setBounds(284, 261, 45, 29);
	    frame.getContentPane().add(textFieldz3);
	    
	    JLabel lblZ_2 = new JLabel("Z");
	    lblZ_2.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblZ_2.setBounds(336, 268, 36, 22);
	    frame.getContentPane().add(lblZ_2);
	    
	    JLabel lbligual2 = new JLabel("=");
	    lbligual2.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lbligual2.setBounds(358, 218, 25, 22);
	    frame.getContentPane().add(lbligual2);
	    
	    JLabel lbligual3 = new JLabel("=");
	    lbligual3.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lbligual3.setBounds(358, 268, 25, 22);
	    frame.getContentPane().add(lbligual3);
	    
	    JLabel lbligual = new JLabel("=");
	    lbligual.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lbligual.setBounds(358, 167, 25, 22);
	    frame.getContentPane().add(lbligual);
	    
	    textFieldti1 = new JTextField();
	    textFieldti1.setColumns(10);
	    textFieldti1.setBounds(379, 160, 45, 29);
	    frame.getContentPane().add(textFieldti1);
	    
	    textFieldti2 = new JTextField();
	    textFieldti2.setColumns(10);
	    textFieldti2.setBounds(379, 211, 45, 29);
	    frame.getContentPane().add(textFieldti2);
	    
	    textFieldti3 = new JTextField();
	    textFieldti3.setColumns(10);
	    textFieldti3.setBounds(379, 261, 45, 29);
	    frame.getContentPane().add(textFieldti3);
	    
	    JLabel lblX_3 = new JLabel("X");
	    lblX_3.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblX_3.setBounds(82, 404, 25, 22);
	    frame.getContentPane().add(lblX_3);
	    
	    JLabel lblY_3 = new JLabel("Y");
	    lblY_3.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblY_3.setBounds(82, 437, 25, 22);
	    frame.getContentPane().add(lblY_3);
	    
	    JLabel lblZ_3 = new JLabel("Z");
	    lblZ_3.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblZ_3.setBounds(82, 470, 36, 22);
	    frame.getContentPane().add(lblZ_3);
	    
	    JLabel lbligual4 = new JLabel("=");
	    lbligual4.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lbligual4.setBounds(102, 403, 25, 22);
	    frame.getContentPane().add(lbligual4);
	    
	    JLabel lbligual5 = new JLabel("=");
	    lbligual5.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lbligual5.setBounds(102, 437, 25, 22);
	    frame.getContentPane().add(lbligual5);
	    
	    JLabel lbligual6 = new JLabel("=");
	    lbligual6.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lbligual6.setBounds(102, 470, 25, 22);
	    frame.getContentPane().add(lbligual6);
	    
	    JTextArea textArea = new JTextArea();
	    textArea.setBackground(new Color(255, 128, 128));
	    textArea.setEditable(false);
	    textArea.setBounds(132, 406, 52, 22);
	    frame.getContentPane().add(textArea);
	    
	    JTextArea textArea_1 = new JTextArea();
	    textArea_1.setBackground(new Color(255, 128, 128));
	    textArea_1.setEditable(false);
	    textArea_1.setBounds(132, 439, 52, 22);
	    frame.getContentPane().add(textArea_1);
	    
	    JTextArea textArea_2 = new JTextArea();
	    textArea_2.setBackground(new Color(255, 128, 128));
	    textArea_2.setEditable(false);
	    textArea_2.setBounds(132, 472, 52, 22);
	    frame.getContentPane().add(textArea_2);
	    
	    JButton btnNewButton = new JButton("Calcular");
	    btnNewButton.setForeground(new Color(255, 255, 255));
	    btnNewButton.setBackground(new Color(255, 136, 136));
	    btnNewButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            try {
	                float X1 = Float.parseFloat(textFieldx1.getText());
	                float X2 = Float.parseFloat(textFieldx2.getText());
	                float Y1 = Float.parseFloat(textFieldy1.getText());
	                float Y2 = Float.parseFloat(textFieldy2.getText());
	                float TI1 = Float.parseFloat(textFieldti1.getText());
	                float TI2 = Float.parseFloat(textFieldti2.getText());

	                if (textFieldx3.isVisible()) {
	                    float X3 = Float.parseFloat(textFieldx3.getText());
	                    float Y3 = Float.parseFloat(textFieldy3.getText());
	                    float Z1 = Float.parseFloat(textFieldz1.getText());
	                    float Z2 = Float.parseFloat(textFieldz2.getText());
	                    float Z3 = Float.parseFloat(textFieldz3.getText());
	                    float TI3 = Float.parseFloat(textFieldti3.getText());

	                    float detA = (X1 * Y2 * Z3 + Y1 * Z2 * X3 + Z1 * X2 * Y3) - (Y1 * X2 * Z3 + X1 * Z2 * Y3 + Z1 * Y2 * X3);
	                    float detAx = (TI1 * Y2 * Z3 + Y1 * Z2 * TI3 + Z1 * TI2 * Y3) - (Y1 * TI2 * Z3 + TI1 * Z2 * Y3 + Z1 * Y2 * TI3);
	                    float detAy = (X1 * TI2 * Z3 + TI1 * Z2 * X3 + Z1 * X2 * TI3) - (TI1 * X2 * Z3 + X1 * Z2 * TI3 + Z1 * TI2 * X3);
	                    float detAz = (X1 * Y2 * TI3 + Y1 * TI2 * X3 + TI1 * X2 * Y3) - (Y1 * X2 * TI3 + X1 * TI2 * Y3 + TI1 * Y2 * X3);

	                    float x = detAx / detA;
	                    float y = detAy / detA;
	                    float z = detAz / detA;

	                    textArea.setText(" " + x);
	                    textArea_1.setText(" " + y);
	                    textArea_2.setText(" " + z);
	                } else {
	                    float detA = (X1 * Y2) - (Y1 * X2);
	                    float detAx = (TI1 * Y2) - (Y1 * TI2);
	                    float detAy = (X1 * TI2) - (TI1 * X2);

	                    float x = detAx / detA;
	                    float y = detAy / detA;

	                    textArea.setText(" " + x);
	                    textArea_1.setText(" " + y);
	                }
	            } catch (Exception ex) {
	                textArea.setText("Error: " + ex.getMessage());
	                textArea_1.setText("Error: " + ex.getMessage());
	                textArea_2.setText("Error: " + ex.getMessage());
	            }
	        }
	    });
	    btnNewButton.setBounds(82, 335, 89, 29);
	    frame.getContentPane().add(btnNewButton);
	    
	    JButton btnNewButton_1 = new JButton("Clear");
	    btnNewButton_1.setForeground(new Color(255, 255, 255));
	    btnNewButton_1.setBackground(new Color(255, 136, 136));
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textFieldx1.setText("");
	    		textFieldx2.setText("");
	    		textFieldx3.setText("");
	    		
	    		textFieldy1.setText("");
	    		textFieldy2.setText("");
	    		textFieldy3.setText("");
	    		
	    		textFieldz1.setText("");
	    		textFieldz2.setText("");
	    		textFieldz3.setText("");
	    		
	    		textFieldti1.setText("");
	    		textFieldti2.setText("");
	    		textFieldti3.setText("");
	    		
	    		textArea.setText("");
	    		textArea_1.setText("");
	    		textArea_2.setText("");
	    		
	    	}
	    });
	    btnNewButton_1.setBounds(336, 335, 89, 29);
	    frame.getContentPane().add(btnNewButton_1);
	    
	    JLabel lblSistemaDeEcuaciones = new JLabel("Sistema de ecuaciones");
	    lblSistemaDeEcuaciones.setHorizontalAlignment(SwingConstants.CENTER);
	    lblSistemaDeEcuaciones.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblSistemaDeEcuaciones.setBounds(77, 50, 358, 22);
	    frame.getContentPane().add(lblSistemaDeEcuaciones);
	    
	    JButton btnNewButton_2 = new JButton("2x2");
	    btnNewButton_2.setForeground(new Color(255, 255, 255));
	    btnNewButton_2.setBackground(new Color(255, 136, 136));
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textFieldz1.setVisible(false);
	    		textFieldz2.setVisible(false);
	    		textFieldz3.setVisible(false);
	    		textFieldx3.setVisible(false);
	    		textFieldy3.setVisible(false);
	    		textFieldti3.setVisible(false);
	    		
	    		textFieldz1.setText("");
	    		textFieldz2.setText("");
	    		textFieldz3.setText("");
	    		textFieldx3.setText("");
	    		textFieldy3.setText("");
	    		textFieldti3.setText("");
	    		
	    		lblZ.setVisible(false);
	    		lblZ_1.setVisible(false);
	    		lblZ_2.setVisible(false);
	    		lblX_2.setVisible(false);
	    		lblY_2.setVisible(false);
	    		
	    		lblmas2.setVisible(false);
	    		lblmas4.setVisible(false);
	    		lblmas5.setVisible(false);
	    		lblmas6.setVisible(false);
	    		
	    		lblZ_3.setVisible(false);
	    		lbligual3.setVisible(false);
	    		lbligual6.setVisible(false);
	    		textArea_2.setVisible(false);
	    	}
	    });
	    btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    btnNewButton_2.setBounds(149, 99, 75, 35);
	    frame.getContentPane().add(btnNewButton_2);
	    
	    JButton btnNewButton_2_1 = new JButton("3x3");
	    btnNewButton_2_1.setForeground(new Color(255, 255, 255));
	    btnNewButton_2_1.setBackground(new Color(255, 136, 136));
	    btnNewButton_2_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textFieldz1.setVisible(true);
	    		textFieldz2.setVisible(true);
	    		textFieldz3.setVisible(true);
	    		textFieldx3.setVisible(true);
	    		textFieldy3.setVisible(true);
	    		textFieldti3.setVisible(true);
	    		
	    		lblZ.setVisible(true);
	    		lblZ_1.setVisible(true);
	    		lblZ_2.setVisible(true);
	    		lblX_2.setVisible(true);
	    		lblY_2.setVisible(true);
	    		
	    		
	    		lblmas2.setVisible(true);
	    		lblmas4.setVisible(true);
	    		lblmas5.setVisible(true);
	    		lblmas6.setVisible(true);
	    		
	    		lblZ_3.setVisible(true);
	    		lbligual3.setVisible(true);
	    		lbligual6.setVisible(true);
	    		textArea_2.setVisible(true);
	    	}
	    });
	    btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    btnNewButton_2_1.setBounds(283, 99, 75, 35);
	    frame.getContentPane().add(btnNewButton_2_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}
}
