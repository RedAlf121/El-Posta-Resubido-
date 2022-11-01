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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import utils.StatesWorker;
import utils.StatesStudent;

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
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	

	
	public Personal() {
		setBounds(100, 100, 320, 398);
		getContentPane().setLayout(null);
		getContentPane().add(getTabbedPane());
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 304, 359);
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
			panel.add(getComboBox_1());
			groupFyM();
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getTextField());
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getTextField_1());
			panel_1.add(getLblNewLabel_3());
			panel_1.add(getTextField_2());
			panel_1.add(getLblNewLabel_4());
			panel_1.add(getTextField_3());
			panel_1.add(getLblNewLabel_5());
			panel_1.add(getTextField_4());
			panel_1.add(getComboBox());
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
			lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
			lblNombre.setBounds(42, 11, 73, 14);
		}
		return lblNombre;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("1er apellido");
			lblApellidos.setHorizontalAlignment(SwingConstants.LEFT);
			lblApellidos.setBounds(42, 55, 73, 14);
		}
		return lblApellidos;
	}
	private JLabel getLblCi() {
		if (lblCi == null) {
			lblCi = new JLabel("CI:");
			lblCi.setHorizontalAlignment(SwingConstants.LEFT);
			lblCi.setBounds(42, 147, 73, 14);
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
			Nombre.setBounds(42, 24, 210, 20);
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
			SegundoApellido.setBounds(42, 116, 210, 20);
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
			PrimerApellido.setBounds(42, 69, 210, 20);
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
			txtNumeroDeCarnet.setBounds(42, 159, 210, 20);
			txtNumeroDeCarnet.setColumns(10);
		}
		return txtNumeroDeCarnet;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("2do apellido:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel.setBounds(42, 100, 73, 14);
		}
		return lblNewLabel;
	}
	private JRadioButton getRdbtnFemenina() {
		if (rdbtnFemenina == null) {
			rdbtnFemenina = new JRadioButton("Femenina");
			rdbtnFemenina.setBounds(42, 218, 90, 23);
		}
		return rdbtnFemenina;
	}
	private JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("Masculino");
			rdbtnMasculino.setBounds(42, 189, 90, 23);
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
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("1er apellido:");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1.setBounds(47, 55, 76, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(47, 24, 213, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("2do apellido:");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_2.setBounds(47, 142, 76, 14);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(47, 68, 213, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Nombre: ");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_3.setBounds(47, 11, 76, 14);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(47, 238, 213, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("CI:");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_4.setBounds(47, 99, 46, 14);
		}
		return lblNewLabel_4;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(47, 111, 213, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("D\u00EDa de retorno:");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_5.setBounds(47, 225, 97, 14);
		}
		return lblNewLabel_5;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(47, 155, 213, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(StatesWorker.values()));
			comboBox.setBounds(47, 196, 156, 20);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(StatesStudent.values()));
			comboBox_1.setBounds(141, 190, 111, 20);
		}
		return comboBox_1;
	}
}
