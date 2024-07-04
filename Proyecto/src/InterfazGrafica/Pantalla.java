package InterfazGrafica;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
@SuppressWarnings("serial")
public class Pantalla extends JFrame {
	private JPanel ControlPane;
	private JPanel contentPane;
	private JPanel PanelVectores;
	private JPanel mainPanel;
	private JPanel PanelMatriz;
	private JPanel PanelSistEcu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Pantalla () {
		setTitle("Calculadora");
		setBounds(0, 0, 645, 270);
		mainPanel = new JPanel(new CardLayout());
		mainPanel.setSize(534, 698);
		setContentPane(mainPanel);
		//INICIALIZACION DE PANELES
		ControlPane = new JPanel();
		ControlPane.setBackground(new Color(255, 206, 206));
		ControlPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.add(ControlPane, "Control");
		ControlPane.setLayout(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 206, 206));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.add(contentPane, "Operaciones");
		contentPane.setLayout(null);
		inicializePanelOperacion();
		PanelVectores = new JPanel();
		PanelVectores.setBackground(new Color(255, 206, 206));
		mainPanel.add(PanelVectores, "Vectores");
		PanelVectores.setLayout(null);
		initializePanelVectores();
		PanelMatriz = new JPanel();
		PanelMatriz.setBackground(new Color(255, 206, 206));
		mainPanel.add(PanelMatriz, "Matrices");
		PanelMatriz.setLayout(null);
		initializePanelMatrices();
		PanelSistEcu = new JPanel();
		PanelSistEcu.setForeground(new Color(255, 255, 255));
		PanelSistEcu.setBackground(new Color(255, 206, 206));
		mainPanel.add(PanelSistEcu, "Sist.Ecuaciones");
		PanelSistEcu.setLayout(null);
		initializePanelSistEcu();
	}
	
	private void inicializePanelOperacion() {
		JButton btnNewButton_3_3 = new JButton("Operaciones");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones abrir = new Operaciones();
				abrir.setVisible(true);
			}
		});
		btnNewButton_3_3.setForeground(Color.WHITE);
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_3.setBackground(new Color(255, 113, 113));
		btnNewButton_3_3.setBounds(23, 96, 137, 41);
		ControlPane.add(btnNewButton_3_3);	
	}
	
	private void initializePanelVectores() {
		JButton btnNewButton_3_2 = new JButton("Vectores");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vectores abrir = new Vectores();
				abrir.setVisible(true);
			}
		});
		btnNewButton_3_2.setForeground(Color.WHITE);
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_2.setBackground(new Color(255, 113, 113));
		btnNewButton_3_2.setBounds(464, 96, 137, 41);
		ControlPane.add(btnNewButton_3_2);
	}
//ACA CERRAMOS PUBLIC PANTALLA
	private void initializePanelSistEcu() {
		JButton btnNewButton_3_1 = new JButton("SistEcu");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SistEcu abrir = new SistEcu();
				abrir.setVisible(true);
			}
		});
		btnNewButton_3_1.setForeground(Color.WHITE);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1.setBackground(new Color(255, 113, 113));
		btnNewButton_3_1.setBounds(317, 96, 137, 41);
		ControlPane.add(btnNewButton_3_1);
		JLabel lblNewLabel = new JLabel("CALCULADORA KITTY ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 49, 578, 21);
		ControlPane.add(lblNewLabel);
	}
	
	private void initializePanelMatrices() {
		JButton btnNewButton_3 = new JButton("Matrices");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Matriz abrir = new Matriz();
				abrir.setVisible(true);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(255, 113, 113));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(170, 96, 137, 41);
		ControlPane.add(btnNewButton_3);
			
	}
}
