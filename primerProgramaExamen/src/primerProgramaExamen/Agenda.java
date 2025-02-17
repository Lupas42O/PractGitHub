//Lucas Sansaturnino Houari
package primerProgramaExamen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Agenda {
	Map<String, String> agenda = new HashMap<>();
	Pattern pat = Pattern.compile("^\\d{9}$");
	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldTlf;
	private JTextField textFieldBuscar;
	private JTextField textFieldBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda window = new Agenda();
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
	public Agenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombre.setBounds(46, 61, 55, 15);
		frame.getContentPane().add(lblNombre);

		JLabel lblBusqueda = new JLabel("");
		lblBusqueda.setFont(new Font("Dialog", Font.BOLD, 10));
		lblBusqueda.setBounds(155, 268, 136, 15);
		frame.getContentPane().add(lblBusqueda);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(119, 58, 114, 19);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTelefono.setBounds(46, 99, 55, 15);
		frame.getContentPane().add(lblTelefono);

		textFieldTlf = new JTextField();
		textFieldTlf.setBounds(119, 96, 114, 19);
		frame.getContentPane().add(textFieldTlf);
		textFieldTlf.setColumns(10);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Matcher mat = pat.matcher(textFieldTlf.getText());
				if (mat.matches()) {
					agenda.put(textFieldNombre.getText(), textFieldTlf.getText());
					JOptionPane.showMessageDialog(null, "Se ha añadido correctamente");
					textFieldNombre.setText("");
					textFieldTlf.setText("");
				} else {
					JOptionPane.showMessageDialog(null,
							"El número introducido no es correcto, debe ser un número de 9 dígitos");
				}
			}
		});
		btnAgregar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnAgregar.setBounds(119, 145, 81, 19);
		frame.getContentPane().add(btnAgregar);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(363, 46, 204, 132);
		frame.getContentPane().add(textArea);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				for (String nombre : agenda.keySet()) {
					textArea.setText(textArea.getText() + "\n" + nombre + ": " + agenda.get(nombre));
				}
			}
		});
		btnMostrar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnMostrar.setBounds(422, 19, 81, 15);
		frame.getContentPane().add(btnMostrar);

		JLabel lblIntroduceNombreA = new JLabel("Introduce nombre a buscar:");
		lblIntroduceNombreA.setFont(new Font("Dialog", Font.BOLD, 10));
		lblIntroduceNombreA.setBounds(12, 226, 166, 15);
		frame.getContentPane().add(lblIntroduceNombreA);

		textFieldBuscar = new JTextField();
		textFieldBuscar.setBounds(181, 223, 114, 19);
		frame.getContentPane().add(textFieldBuscar);
		textFieldBuscar.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblBusqueda.setText("");
				if (agenda.containsKey(textFieldBuscar.getText())) {
					lblBusqueda.setText(agenda.get(textFieldBuscar.getText()));
					textFieldBuscar.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "El nombre introducido no está en la agenda");
				}
			}
		});
		btnBuscar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBuscar.setBounds(317, 224, 75, 19);
		frame.getContentPane().add(btnBuscar);

		JLabel lblSuNmeroEs = new JLabel("Su número es:");
		lblSuNmeroEs.setFont(new Font("Dialog", Font.BOLD, 10));
		lblSuNmeroEs.setBounds(69, 268, 89, 15);
		frame.getContentPane().add(lblSuNmeroEs);

		JLabel lblIntroduceBorrar = new JLabel("Introduce nombre a borrar:");
		lblIntroduceBorrar.setFont(new Font("Dialog", Font.BOLD, 10));
		lblIntroduceBorrar.setBounds(12, 327, 166, 15);
		frame.getContentPane().add(lblIntroduceBorrar);

		textFieldBorrar = new JTextField();
		textFieldBorrar.setBounds(181, 324, 114, 19);
		frame.getContentPane().add(textFieldBorrar);
		textFieldBorrar.setColumns(10);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (agenda.containsKey(textFieldBorrar.getText())) {
					agenda.remove(textFieldBorrar.getText());
					JOptionPane.showMessageDialog(null,
							"Se ha borrado el nombre introducido y su número correspondiente de la agenda");
					textFieldBorrar.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "El nombre introducido no está en la agenda");
				}
			}
		});
		btnBorrar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBorrar.setBounds(317, 321, 75, 19);
		frame.getContentPane().add(btnBorrar);
	}
}
