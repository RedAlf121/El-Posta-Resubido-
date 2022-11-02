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
	private JPanel studentPanel;
	private JPanel workerPanel;
	private JLabel lblStudentName;
	private JLabel lblLastName;
	private JLabel lblStudentID;
	private JTextField studentName;
	private JTextField studentLastName;
	private JTextField studentID;
	private JTextField studentSecLastName;
	private JLabel lblSecLastName;
	private JRadioButton studentFemale;
	private JRadioButton studentMale;
	private ButtonGroup groupFyM;
	private JLabel lblWorkerLastName;
	private JTextField workerName;
	private JLabel lblworkerSecLastName;
	private JTextField workerLastName;
	private JLabel lblWorkerName;
	private JLabel lblWorkerID;
	private JTextField workerSecLastName;
	private JTextField workerID;
	private JComboBox workerState;
	private JComboBox studentState;
	private JPanel studentListPanel;
	private JScrollPane scrollPane;
	private JTable studentListTable;
	private JButton newStudent;
	private JButton deleteStudent;
	private JButton button;
	private JPanel newStudentPanel;
	private JLabel lblStudentState;
	private JPanel newWorkerPanel;
	private JLabel lblWorkerState;
	private JRadioButton workerFemale;
	private JRadioButton workerMale;
	private JButton newWorker;
	private JPanel workerListPanel;
	

	
	public Personal() {
		setBounds(100, 100, 750, 450);
		getContentPane().setLayout(null);
		getContentPane().add(getTabbedPane());
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 734, 411);
			tabbedPane.addTab("Estudiante", null, getStudentPanel(), "");
			tabbedPane.addTab("Trabajador", null, getWorkerPanel(), null);
		}
		return tabbedPane;
	}
	private JPanel getStudentPanel() {
		if (studentPanel == null) {
			setLocationRelativeTo(null);
			studentPanel = new JPanel();
			studentPanel.setLayout(null);
			studentPanel.add(getNewStudentPanel());
			studentPanel.add(getStudentListPanel());
			groupFyM();
		}
		return studentPanel;
	}
	private JPanel getWorkerPanel() {
		if (workerPanel == null) {
			workerPanel = new JPanel();
			workerPanel.setLayout(null);
			workerPanel.add(getPanel_2());
			workerPanel.add(getPanel_5());
		}
		return workerPanel;
	}
	private JLabel getLblStudentName() {
		if (lblStudentName == null) {
			lblStudentName = new JLabel("Nombre:");
			lblStudentName.setBounds(20, 30, 71, 14);
			lblStudentName.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblStudentName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("1er apellido:");
			lblLastName.setBounds(20, 76, 71, 14);
			lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblLastName;
	}
	private JLabel getLblStudentID() {
		if (lblStudentID == null) {
			lblStudentID = new JLabel("CI:");
			lblStudentID.setBounds(20, 170, 71, 14);
			lblStudentID.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblStudentID;
	}
	private JTextField getStudentName() {
		if (studentName == null) {
			studentName = new JTextField();
			studentName.setBounds(20, 46, 200, 20);
			studentName.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					studentName.setText("");
				}
			});
			
			studentName.setHorizontalAlignment(SwingConstants.CENTER);
			studentName.setColumns(10);
		}
		return studentName;
	}
	private JTextField getStudentLastName() {
		if (studentLastName == null) {
			studentLastName = new JTextField();
			studentLastName.setBounds(20, 92, 200, 20);
			studentLastName.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					studentLastName.setText("");
				}
			});
			studentLastName.setHorizontalAlignment(SwingConstants.CENTER);
			studentLastName.setColumns(10);
		}
		return studentLastName;
	}
	private JTextField getStudentID() {
		if (studentID == null) {
			studentID = new JTextField();
			studentID.setBounds(20, 188, 200, 20);
			studentID.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					studentID.setText("");
				}
			});
			studentID.setHorizontalAlignment(SwingConstants.CENTER);
			studentID.setColumns(10);
		}
		return studentID;
	}
	private JTextField getStudentSecLastName() {
		if (studentSecLastName == null) {
			studentSecLastName = new JTextField();
			studentSecLastName.setBounds(20, 140, 200, 20);
			studentSecLastName.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					studentSecLastName.setText("");
				}
			});
			studentSecLastName.setHorizontalAlignment(SwingConstants.CENTER);
			studentSecLastName.setColumns(10);
		}
		return studentSecLastName;
	}
	private JLabel getLblSecLastName() {
		if (lblSecLastName == null) {
			lblSecLastName = new JLabel("2do apellido:");
			lblSecLastName.setBounds(20, 122, 71, 14);
			lblSecLastName.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblSecLastName;
	}
	private JRadioButton getStudentFemale() {
		if (studentFemale == null) {
			studentFemale = new JRadioButton("Femenina");
			studentFemale.setBounds(135, 237, 86, 23);
		}
		return studentFemale;
	}
	private JRadioButton getStudentMale() {
		if (studentMale == null) {
			studentMale = new JRadioButton("Masculino");
			studentMale.setBounds(135, 265, 86, 23);
		}
		return studentMale;
	}
	private ButtonGroup groupFyM(){
		if(groupFyM == null){
			groupFyM = new ButtonGroup();
			groupFyM.add(studentFemale);
			groupFyM.add(studentMale);
		}
		return groupFyM;
	}
	private JLabel getLblWorkerLastName() {
		if (lblWorkerLastName == null) {
			lblWorkerLastName = new JLabel("1er apellido:");
			lblWorkerLastName.setBounds(20, 76, 71, 14);
			lblWorkerLastName.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblWorkerLastName;
	}
	private JTextField getWorkerName() {
		if (workerName == null) {
			workerName = new JTextField();
			workerName.setBounds(20, 46, 200, 20);
			workerName.setColumns(10);
		}
		return workerName;
	}
	private JLabel getLblworkerSecLastName() {
		if (lblworkerSecLastName == null) {
			lblworkerSecLastName = new JLabel("2do apellido:");
			lblworkerSecLastName.setBounds(20, 122, 71, 14);
			lblworkerSecLastName.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblworkerSecLastName;
	}
	private JTextField getWorkerLastName() {
		if (workerLastName == null) {
			workerLastName = new JTextField();
			workerLastName.setBounds(20, 92, 200, 20);
			workerLastName.setColumns(10);
		}
		return workerLastName;
	}
	private JLabel getLblWorkerName() {
		if (lblWorkerName == null) {
			lblWorkerName = new JLabel("Nombre: ");
			lblWorkerName.setBounds(20, 30, 59, 14);
			lblWorkerName.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblWorkerName;
	}
	private JLabel getLblWorkerID() {
		if (lblWorkerID == null) {
			lblWorkerID = new JLabel("CI:");
			lblWorkerID.setBounds(20, 170, 59, 14);
			lblWorkerID.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblWorkerID;
	}
	private JTextField getWorkerSecLastName() {
		if (workerSecLastName == null) {
			workerSecLastName = new JTextField();
			workerSecLastName.setBounds(20, 140, 200, 20);
			workerSecLastName.setColumns(10);
		}
		return workerSecLastName;
	}
	private JTextField getWorkerID() {
		if (workerID == null) {
			workerID = new JTextField();
			workerID.setBounds(20, 188, 200, 20);
			workerID.setColumns(10);
		}
		return workerID;
	}
	private JComboBox getWorkerState() {
		if (workerState == null) {
			workerState = new JComboBox();
			workerState.setBounds(20, 238, 99, 20);
			workerState.setModel(new DefaultComboBoxModel(StatesWorker.values()));
		}
		return workerState;
	}
	private JComboBox getStudentState() {
		if (studentState == null) {
			studentState = new JComboBox();
			studentState.setBounds(20, 238, 99, 20);
			studentState.setModel(new DefaultComboBoxModel(StatesStudent.values()));
		}
		return studentState;
	}
	private JPanel getStudentListPanel() {
		if (studentListPanel == null) {
			studentListPanel = new JPanel();
			studentListPanel.setBorder(new TitledBorder(null, "Listado de estudiantes", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			studentListPanel.setBounds(269, 11, 450, 360);
			studentListPanel.setLayout(null);
			studentListPanel.add(getScrollPane());
			studentListPanel.add(getButton());
			studentListPanel.add(getDeleteStudent());
		}
		return studentListPanel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 25, 430, 269);
			scrollPane.setViewportView(getStudentListTable());
		}
		return scrollPane;
	}
	private JTable getStudentListTable() {
		if (studentListTable == null) {
			studentListTable = new JTable();
			studentListTable.setModel(new DefaultTableModel(
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
		return studentListTable;
	}
	private JButton getNewStudent() {
		if (newStudent == null) {
			newStudent = new JButton("Agregar");
			newStudent.setBounds(135, 326, 85, 23);
		}
		return newStudent;
	}
	private JButton getDeleteStudent() {
		if (deleteStudent == null) {
			deleteStudent = new JButton("Eliminar");
			deleteStudent.setBounds(351, 326, 89, 23);
			deleteStudent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return deleteStudent;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("New button");
			button.setBounds(252, 326, 89, 23);
		}
		return button;
	}
	private JPanel getNewStudentPanel() {
		if (newStudentPanel == null) {
			newStudentPanel = new JPanel();
			newStudentPanel.setBorder(new TitledBorder(null, "Nuevo estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			newStudentPanel.setBounds(10, 10, 240, 360);
			newStudentPanel.setLayout(null);
			newStudentPanel.add(getLblStudentName());
			newStudentPanel.add(getLblLastName());
			newStudentPanel.add(getLblStudentID());
			newStudentPanel.add(getStudentName());
			newStudentPanel.add(getStudentLastName());
			newStudentPanel.add(getStudentID());
			newStudentPanel.add(getStudentSecLastName());
			newStudentPanel.add(getLblSecLastName());
			newStudentPanel.add(getStudentFemale());
			newStudentPanel.add(getStudentMale());
			newStudentPanel.add(getStudentState());
			newStudentPanel.add(getNewStudent());
			newStudentPanel.add(getLblStudentState());
		}
		return newStudentPanel;
	}
	private JLabel getLblStudentState() {
		if (lblStudentState == null) {
			lblStudentState = new JLabel("Estado:");
			lblStudentState.setBounds(20, 220, 46, 14);
		}
		return lblStudentState;
	}
	private JPanel getPanel_2() {
		if (newWorkerPanel == null) {
			newWorkerPanel = new JPanel();
			newWorkerPanel.setBorder(new TitledBorder(null, "Nuevo trabajador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			newWorkerPanel.setBounds(10, 10, 240, 360);
			newWorkerPanel.setLayout(null);
			newWorkerPanel.add(getLblWorkerLastName());
			newWorkerPanel.add(getWorkerName());
			newWorkerPanel.add(getLblworkerSecLastName());
			newWorkerPanel.add(getWorkerLastName());
			newWorkerPanel.add(getLblWorkerName());
			newWorkerPanel.add(getLblWorkerID());
			newWorkerPanel.add(getWorkerSecLastName());
			newWorkerPanel.add(getWorkerID());
			newWorkerPanel.add(getWorkerState());
			newWorkerPanel.add(getLblWorkerState());
			newWorkerPanel.add(getWorkerFemale());
			newWorkerPanel.add(getWorkerMale());
			newWorkerPanel.add(getNewWorker());
		}
		return newWorkerPanel;
	}
	private JLabel getLblWorkerState() {
		if (lblWorkerState == null) {
			lblWorkerState = new JLabel("Estado:");
			lblWorkerState.setBounds(20, 220, 59, 14);
		}
		return lblWorkerState;
	}
	private JRadioButton getWorkerFemale() {
		if (workerFemale == null) {
			workerFemale = new JRadioButton("Femenina");
			workerFemale.setBounds(135, 237, 86, 23);
		}
		return workerFemale;
	}
	private JRadioButton getWorkerMale() {
		if (workerMale == null) {
			workerMale = new JRadioButton("Masculino");
			workerMale.setBounds(135, 265, 86, 23);
		}
		return workerMale;
	}
	private JButton getNewWorker() {
		if (newWorker == null) {
			newWorker = new JButton("Agregar");
			newWorker.setBounds(135, 326, 85, 23);
		}
		return newWorker;
	}
	private JPanel getPanel_5() {
		if (workerListPanel == null) {
			workerListPanel = new JPanel();
			workerListPanel.setBorder(new TitledBorder(null, "Lista de trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			workerListPanel.setBounds(260, 10, 459, 360);
			workerListPanel.setLayout(null);
		}
		return workerListPanel;
	}
}
