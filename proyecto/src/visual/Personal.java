package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;

public class Personal extends JDialog {
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton_1;
	private JButton btnEchatepalistado;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblCi;
	private JTextField Nombre;
	private JTextField SegundoApellido;
	private JTextField PrimerApellido;
	private JTextField txtNumeroDeCarnet;

	

	
	public Personal() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getTabbedPane());
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 434, 261);
			tabbedPane.addTab("Estudiante", null, getPanel(), "");
			tabbedPane.addTab("Trabajador", null, getPanel_1(), null);
			tabbedPane.addTab("Listado", null, getPanel_2(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNombre());
			panel.add(getLblApellidos());
			panel.add(getLblCi());
			panel.add(getNombre());
			panel.add(getSegundoApellido());
			panel.add(getPrimerApellido());
			panel.add(getTxtNumeroDeCarnet());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getBtnNewButton_1());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getBtnEchatepalistado());
		}
		return panel_2;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("CreaTuTrabajador");
		}
		return btnNewButton_1;
	}
	private JButton getBtnEchatepalistado() {
		if (btnEchatepalistado == null) {
			btnEchatepalistado = new JButton("EchatePaListado");
		}
		return btnEchatepalistado;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNombre.setBounds(41, 11, 59, 14);
		}
		return lblNombre;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setHorizontalAlignment(SwingConstants.TRAILING);
			lblApellidos.setBounds(27, 36, 73, 14);
		}
		return lblApellidos;
	}
	private JLabel getLblCi() {
		if (lblCi == null) {
			lblCi = new JLabel("CI:");
			lblCi.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCi.setBounds(52, 61, 48, 14);
		}
		return lblCi;
	}
	private JTextField getNombre() {
		if (Nombre == null) {
			Nombre = new JTextField();
			Nombre.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					Nombre.setText("");
				}
			});
			
			Nombre.setHorizontalAlignment(SwingConstants.CENTER);
			Nombre.setText("Nombre");
			Nombre.setBounds(112, 8, 147, 20);
			Nombre.setColumns(10);
		}
		return Nombre;
	}
	private JTextField getSegundoApellido() {
		if (SegundoApellido == null) {
			SegundoApellido = new JTextField();
			SegundoApellido.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					SegundoApellido.setText("");
				}
			});
			SegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
			SegundoApellido.setText("Segundo Apellido");
			SegundoApellido.setBounds(224, 33, 98, 20);
			SegundoApellido.setColumns(10);
		}
		return SegundoApellido;
	}
	private JTextField getPrimerApellido() {
		if (PrimerApellido == null) {
			PrimerApellido = new JTextField();
			PrimerApellido.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					PrimerApellido.setText("");
				}
			});
			PrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
			PrimerApellido.setText("Primer Apellido");
			PrimerApellido.setBounds(112, 33, 86, 20);
			PrimerApellido.setColumns(10);
		}
		return PrimerApellido;
	}
	private JTextField getTxtNumeroDeCarnet() {
		if (txtNumeroDeCarnet == null) {
			txtNumeroDeCarnet = new JTextField();
			txtNumeroDeCarnet.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					txtNumeroDeCarnet.setText("");
				}
			});
			txtNumeroDeCarnet.setHorizontalAlignment(SwingConstants.CENTER);
			txtNumeroDeCarnet.setText("Numero De Carnet");
			txtNumeroDeCarnet.setBounds(112, 58, 182, 20);
			txtNumeroDeCarnet.setColumns(10);
		}
		return txtNumeroDeCarnet;
	}
}
