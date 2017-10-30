package ListaDoble;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ListaDoblementeEnlazada.ListaDE;
import ListaDoblementeEnlazada.Musica;
import ListaDoblementeEnlazada.Opciones;
import ListaDoblementeEnlazada.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textcancion;
	private JTextField textAlbum;
	private JTextField textArtista;
	private JTextField textGenero;
	private ListaD ld = new ListaD();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(71, 43, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCancion = new JLabel("Cancion");
		lblCancion.setBounds(71, 81, 46, 14);
		contentPane.add(lblCancion);
		
		JLabel lblNewLabel_1 = new JLabel("Album");
		lblNewLabel_1.setBounds(71, 134, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Artista");
		lblNewLabel_2.setBounds(71, 185, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Genero");
		lblNewLabel_3.setBounds(71, 239, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textid = new JTextField();
		textid.setBounds(159, 40, 175, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textcancion = new JTextField();
		textcancion.setBounds(159, 78, 175, 20);
		contentPane.add(textcancion);
		textcancion.setColumns(10);
		
		textAlbum = new JTextField();
		textAlbum.setBounds(153, 131, 181, 20);
		contentPane.add(textAlbum);
		textAlbum.setColumns(10);
		
		textArtista = new JTextField();
		textArtista.setBounds(155, 182, 179, 20);
		contentPane.add(textArtista);
		textArtista.setColumns(10);
		
		textGenero = new JTextField();
		textGenero.setBounds(157, 236, 177, 20);
		contentPane.add(textGenero);
		textGenero.setColumns(10);
		
		JComboBox<String> opciones = new JComboBox<String>();
		opciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                Opciones.setOpc(opciones.getSelectedItem().toString());
				
				if(Opciones.getOpc().equals("1.Insertar nodo adelante"))
				{
					Music insertar=new Music();
					insertar.setId(textid.getText());
					insertar.setGenero(textid.getText());
					insertar.setcancion(textcancion.getText());
					insertar.setArtista(textArtista.getText());
					insertar.setAlbum(textAlbum.getText());
					ld.insertarinicio(insertar);
					JOptionPane.showMessageDialog(null, "Dato insertado al principio");
					
				}
				if(Opciones.getOpc().equals("2.Insertar nodo atrás"))
				{
					Music insertar=new Music();
					insertar.setId(textid.getText());
					insertar.setGenero(textid.getText());
					insertar.setcancion(textcancion.getText());
					insertar.setArtista(textArtista.getText());
					insertar.setAlbum(textAlbum.getText());
					ld.insertarfinal(insertar);
					JOptionPane.showMessageDialog(null, "Dato insertado al final");
				}
				if(Opciones.getOpc().equals("3.Eliminar primer nodo"))
				{
					ld.eliminarprimer();

				}
				if(Opciones.getOpc().equals("4.Eliminar último nodo"))
				{
					ld.eliminarultimo();
				}
				if(Opciones.getOpc().equals("5.Imprimir Lista adelante"))
				{
					JOptionPane.showMessageDialog(Menu.this, ld.imprimiradelante());
				}
				if(Opciones.getOpc().equals("6.Imprimir Lista atras"))
				{
					JOptionPane.showMessageDialog(Menu.this, ld.imprimiratras());
				}
			}
		});
		opciones.setBounds(130, 308, 188, 20);
		contentPane.add(opciones);
		opciones.addItem("1.Insertar nodo adelante");
		opciones.addItem("2.Insertar nodo atrás");
		opciones.addItem("3.Eliminar primer nodo");
		opciones.addItem("4.Eliminar último nodo");
		opciones.addItem("5.Imprimir Lista adelante");
		opciones.addItem("6.Imprimir Lista atras");
		
		
	}
}
