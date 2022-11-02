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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;

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
	private JPanel panel_3;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton button;
	private JPanel panel_4;
	private JLabel lblEstado;
	

	
	public Personal() {
		setBounds(100, 100, 750, 429);
		getContentPane().setLayout(null);
		getContentPane().add(getTabbedPane());
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 734, 392);
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
			panel.add(getPanel_4());
			panel.add(getPanel_3());
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
			lblNombre.setBounds(20, 30, 41, 14);
			lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblNombre;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("1er apellido:");
			lblApellidos.setBounds(20, 76, 71, 14);
			lblApellidos.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblApellidos;
	}
	private JLabel getLblCi() {
		if (lblCi == null) {
			lblCi = new JLabel("CI:");
			lblCi.setBounds(20, 170, 15, 14);
			lblCi.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCi;
	}
	private JTextField getNombre() {
		if (Nombre == null) {
			Nombre = new JTextField();
			Nombre.setBounds(20, 46, 201, 20);
			Nombre.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					Nombre.setText("");
				}
			});
			
			Nombre.setHorizontalAlignment(SwingConstants.CENTER);
			Nombre.setColumns(10);
		}
		return Nombre;
	}
	private JTextField getSegundoApellido() {
		if (SegundoApellido == null) {
			SegundoApellido = new JTextField();
			SegundoApellido.setBounds(20, 92, 201, 20);
			SegundoApellido.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					SegundoApellido.setText("");
				}
			});
			SegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
			SegundoApellido.setColumns(10);
		}
		return SegundoApellido;
	}
	private JTextField getPrimerApellido() {
		if (PrimerApellido == null) {
			PrimerApellido = new JTextField();
			PrimerApellido.setBounds(20, 188, 201, 20);
			PrimerApellido.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					PrimerApellido.setText("");
				}
			});
			PrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
			PrimerApellido.setColumns(10);
		}
		return PrimerApellido;
	}
	private JTextField getTxtNumeroDeCarnet() {
		if (txtNumeroDeCarnet == null) {
			txtNumeroDeCarnet = new JTextField();
			txtNumeroDeCarnet.setBounds(18, 140, 203, 20);
			txtNumeroDeCarnet.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					txtNumeroDeCarnet.setText("");
				}
			});
			txtNumeroDeCarnet.setHorizontalAlignment(SwingConstants.CENTER);
			txtNumeroDeCarnet.setColumns(10);
		}
		return txtNumeroDeCarnet;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("2do apellido:");
			lblNewLabel.setBounds(20, 122, 61, 14);
			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblNewLabel;
	}
	private JRadioButton getRdbtnFemenina() {
		if (rdbtnFemenina == null) {
			rdbtnFemenina = new JRadioButton("Femenina");
			rdbtnFemenina.setBounds(148, 237, 71, 23);
		}
		return rdbtnFemenina;
	}
	private JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("Masculino");
			rdbtnMasculino.setBounds(150, 263, 71, 23);
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
			comboBox_1.setBounds(20, 238, 99, 20);
			comboBox_1.setModel(new DefaultComboBoxModel(StatesStudent.values()));
		}
		return comboBox_1;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(null, "Listado de estudiantes", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			panel_3.setBounds(269, 11, 450, 344);
			panel_3.setLayout(null);
			panel_3.add(getScrollPane());
			panel_3.add(getButton());
			panel_3.add(getBtnNewButton_1());
		}
		return panel_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 25, 430, 269);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		}
		return table_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(132, 305, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(351, 305, 89, 23);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return btnNewButton_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("New button");
			button.setBounds(252, 305, 89, 23);
		}
		return button;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBorder(new TitledBorder(null, "Nuevo estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			panel_4.setBounds(10, 11, 236, 344);
			panel_4.setLayout(null);
			panel_4.add(getLblNombre());
			panel_4.add(getLblApellidos());
			panel_4.add(getLblCi());
			panel_4.add(getNombre());
			panel_4.add(getSegundoApellido());
			panel_4.add(getPrimerApellido());
			panel_4.add(getTxtNumeroDeCarnet());
			panel_4.add(getLblNewLabel());
			panel_4.add(getRdbtnFemenina());
			panel_4.add(getRdbtnMasculino());
			panel_4.add(getComboBox_1());
			panel_4.add(getBtnNewButton());
			panel_4.add(getLblEstado());
		}
		return panel_4;
	}
	private JLabel getLblEstado() {
		if (lblEstado == null) {
			lblEstado = new JLabel("Estado:");
			lblEstado.setBounds(20, 220, 46, 14);
		}
		return lblEstado;
	}
}
