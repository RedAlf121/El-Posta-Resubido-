package visual;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Personal extends JDialog {
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblCi;
	private JTextField Nombre;
	private JTextField SegundoApellido;
	private JTextField PrimerApellido;
	private JTextField txtNumeroDeCarnet;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnFemenina;
	private JRadioButton rdbtnMasculino;
	private ButtonGroup groupFyM;
	private JTable table;
	

	
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
			setLocationRelativeTo(null);
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNombre());
			panel.add(getLblApellidos());
			panel.add(getLblCi());
			panel.add(getNombre());
			panel.add(getSegundoApellido());
			panel.add(getPrimerApellido());
			panel.add(getTxtNumeroDeCarnet());
			panel.add(getLblNewLabel());
			panel.add(getRdbtnFemenina());
			panel.add(getRdbtnMasculino());
			groupFyM();
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getTable());
		}
		return panel_2;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNombre.setBounds(27, 24, 73, 14);
		}
		return lblNombre;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("1er apellido");
			lblApellidos.setHorizontalAlignment(SwingConstants.RIGHT);
			lblApellidos.setBounds(27, 65, 73, 14);
		}
		return lblApellidos;
	}
	private JLabel getLblCi() {
		if (lblCi == null) {
			lblCi = new JLabel("CI:");
			lblCi.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCi.setBounds(27, 147, 73, 14);
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
			Nombre.setBounds(112, 21, 182, 20);
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
			SegundoApellido.setBounds(110, 103, 182, 20);
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
			PrimerApellido.setBounds(112, 62, 182, 20);
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
			txtNumeroDeCarnet.setBounds(112, 144, 182, 20);
			txtNumeroDeCarnet.setColumns(10);
		}
		return txtNumeroDeCarnet;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("2do apellido:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(27, 106, 73, 14);
		}
		return lblNewLabel;
	}
	private JRadioButton getRdbtnFemenina() {
		if (rdbtnFemenina == null) {
			rdbtnFemenina = new JRadioButton("Femenina");
			rdbtnFemenina.setBounds(112, 185, 73, 23);
		}
		return rdbtnFemenina;
	}
	private JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("Masculino");
			rdbtnMasculino.setBounds(204, 185, 90, 23);
		}
		return rdbtnMasculino;
	}
	private ButtonGroup groupFyM(){
		if(groupFyM == null){
			groupFyM = new ButtonGroup();
			groupFyM.add(rdbtnFemenina);
			groupFyM.add(rdbtnMasculino);
		}
		return groupFyM;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setBounds(128, 143, -54, -49);
		}
		return table;
	}
}
