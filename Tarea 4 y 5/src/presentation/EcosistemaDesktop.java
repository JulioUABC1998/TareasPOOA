package presentation;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import Ecosistema.Biotopo;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class EcosistemaDesktop {
	private EcosistemaDesktop elEcosistema;
	private Random random = new Random();

	private JFrame frame;
	private JTextField textFieldEcosistema;
	private JTextField txtBiotopo;
	private JTextField txtArchivo;
	protected Biotopo losBiotopos;
	private Biotopo i;
	private Biotopo size;
	private Biotopo LastElement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EcosistemaDesktop window = new EcosistemaDesktop();
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
	public EcosistemaDesktop() {
		initialize();
	}

	public EcosistemaDesktop(String text) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBarMain = new JMenuBar();
		frame.setJMenuBar(menuBarMain);
		
		JMenu mnFile = new JMenu("File");
		menuBarMain.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JToolBar toolBarMain = new JToolBar();
		frame.getContentPane().add(toolBarMain, BorderLayout.NORTH);
		
		JTabbedPane tabbedPaneMain = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPaneMain, BorderLayout.CENTER);
		
		JPanel panelEcosistema = new JPanel();
		tabbedPaneMain.addTab("Ecosistema", null, panelEcosistema, null);
		
		textFieldEcosistema = new JTextField();
		textFieldEcosistema.setText("Ecosistema");
		textFieldEcosistema.setColumns(10);
		panelEcosistema.add(textFieldEcosistema);
		
		JPanel panelBiotopo = new JPanel();
		tabbedPaneMain.addTab("Biotopo", null, panelBiotopo, null);
		panelBiotopo.setLayout(null);
		
		txtBiotopo = new JTextField();
		txtBiotopo.setText("Biotopo");
		txtBiotopo.setBounds(34, 40, 130, 26);
		panelBiotopo.add(txtBiotopo);
		txtBiotopo.setColumns(10);
		
		JComboBox<Biotopo> comboBoxBiotopo = new JComboBox<Biotopo>();
		comboBoxBiotopo.setBounds(34, 84, 127, 27);
		panelBiotopo.add(comboBoxBiotopo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser miJFileChooser = new JFileChooser();
	
					if(miJFileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)
					{ 
						//Aqui accedemos al archivo en el disco
						FileOutputStream miFileOutputStream = new FileOutputStream(miJFileChooser.getSelectedFile());
						//Aqui usamos el objeto miDataOutputStream para traducir de Java Types a bytes
						DataOutputStream miDataOutputStream = new DataOutputStream(miFileOutputStream);
						//Escribimos un entero
						miDataOutputStream.writeUTF(txtArchivo.getText());;
						//Cerramos el objeto traductor
						miDataOutputStream.close();
						//Cerramos el acceso al archivo
						miFileOutputStream.close();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolBarMain.add(btnGuardar);
		
		txtArchivo = new JTextField();
		txtArchivo.setText("miArchivo.dat");
		toolBarMain.add(txtArchivo);
		txtArchivo.setColumns(10);
		
		JButton btnRecuperar = new JButton("Recuperar");
		btnRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser miJFileChooser = new JFileChooser();

					if(miJFileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
					{ 
						FileInputStream miFileInputStream = new FileInputStream(miJFileChooser.getSelectedFile());
						DataInputStream miDataInputStream = new DataInputStream(miFileInputStream);
						String miString = miDataInputStream.readUTF();
						JOptionPane.showMessageDialog(frame, miString);
						miDataInputStream.close();
						miFileInputStream.close();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolBarMain.add(btnRecuperar);
		
		JButton btnGuardarEcosistema = new JButton("Guardar Ecosistema");
		btnGuardarEcosistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser miJFileChooser = new JFileChooser();
	
					if(miJFileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)
					{ 
						//Aqui accedemos al archivo en el disco
						FileOutputStream miFileOutputStream = new FileOutputStream(miJFileChooser.getSelectedFile());
						//Aqui usamos el objeto miObjectOutputStream para traducir de Java Types a bytes
						ObjectOutputStream miObjectOutputStream = new ObjectOutputStream(miFileOutputStream);
						//Escribimos un entero
						miObjectOutputStream.writeObject(elEcosistema);
						//Cerramos el objeto traductor
						miObjectOutputStream.close();
						//Cerramos el acceso al archivo
						miFileOutputStream.close();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolBarMain.add(btnGuardarEcosistema);
		
		JButton btnRecuperarEcosistema = new JButton("Recuperar Ecosistema");
		btnRecuperarEcosistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser miJFileChooser = new JFileChooser();

					if(miJFileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
					{ 
						FileInputStream miFileInputStream = new FileInputStream(miJFileChooser.getSelectedFile());
						ObjectInputStream miObjectInputStream = new ObjectInputStream(miFileInputStream);
						elEcosistema = (EcosistemaDesktop)miObjectInputStream.readObject();
						JOptionPane.showMessageDialog(frame, elEcosistema);
						miObjectInputStream.close();
						miFileInputStream.close();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(frame, e1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(frame, e1);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(frame, e1);
				}
				
				comboBoxBiotopo.removeAllItems();
				
				for(int i = 0; i < elEcosistema.losBiotopos.getSize(); i++) {
					comboBoxBiotopo.addItem(elEcosistema.losBiotopos.getI());
				}
			}
		});
		toolBarMain.add(btnRecuperarEcosistema);
		
		JButton btnSonido = new JButton("Sonido");
		btnSonido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("./" + "cash-register-02.wav");
				SonidoThread miSonidoThread = new SonidoThread(file);
				miSonidoThread.start();
			}
		});
		toolBarMain.add(btnSonido);
		
		JButton btnMusica = new JButton("Musica");
		btnMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("./" + "PimPoy.wav");
				MusicaThread miMusicaThread = new MusicaThread(file);
				miMusicaThread.start();
			}
		});
		toolBarMain.add(btnMusica);
		

		
		JButton buttonCrearEcosistema = new JButton("Crear Ecosistema");
		buttonCrearEcosistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				elEcosistema = new EcosistemaDesktop(textFieldEcosistema.getText());
				
				//JOptionPane.showMessageDialog(frame, elEcosistema.getNombre());
				
				buttonCrearEcosistema.setEnabled(false);
			}
		});
		panelEcosistema.add(buttonCrearEcosistema);
		
		JButton btnAgregarbiotopo = new JButton("Agregar Biotopo");
		btnAgregarbiotopo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Biotopo elBiotopo = new Biotopo(txtBiotopo.getText(), null, elEcosistema, 100, 0);
				elEcosistema.losBiotopos.add(elBiotopo);
				
				comboBoxBiotopo.addItem(elEcosistema.losBiotopos.LastElement);
				
				//JOptionPane.showMessageDialog(frame, elEcosistema.losBiotopos.lastElement().getNombre());
			}
		});
		btnAgregarbiotopo.setBounds(170, 40, 162, 29);
		panelBiotopo.add(btnAgregarbiotopo);
		
		JPanel panelBiocenosis = new JPanel();
		tabbedPaneMain.addTab("Biocenosis", null, panelBiocenosis, null);
		
		JPanel panelGrafico = new JPanel();
		panelGrafico.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				
				for(int i=0;i<elEcosistema.losBiotopos.getSize();i++) {
					Image img = Toolkit.getDefaultToolkit().getImage("balon.png");
				panelGrafico.getGraphics().drawImage(img, random.nextInt(panelGrafico.getWidth()), random.nextInt(panelGrafico.getHeight()), 40, 20, null);
				}
			}
		});
		tabbedPaneMain.addTab("Grafico", null, panelGrafico, null);
		panelGrafico.setLayout(null);
	}
}
