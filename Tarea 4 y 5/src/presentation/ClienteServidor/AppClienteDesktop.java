package presentation.ClienteServidor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppClienteDesktop {

	private JFrame frame;
	private JTextField txtMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppClienteDesktop window = new AppClienteDesktop();
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
	public AppClienteDesktop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtMensaje = new JTextField();
		txtMensaje.setText("Mensaje");
		txtMensaje.setBounds(30, 56, 130, 26);
		panel.add(txtMensaje);
		txtMensaje.setColumns(10);
		
		JButton btnEnviarMensaje = new JButton("Enviar mensaje");
		btnEnviarMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente miCliente = new Cliente(1234, "localhost");
				miCliente.enviarMensaje(txtMensaje.getText());
			}
		});
		btnEnviarMensaje.setBounds(172, 56, 147, 29);
		panel.add(btnEnviarMensaje);
	}
}
