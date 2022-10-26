package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
	private JMenuBar menuBar;
	private JMenu mnEditar;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDe;
	private JMenuItem mntmListado;
	private JMenuItem mntmPeriodos;
	private JMenu mnConsultar;
	private JMenuItem mntmReport;
	private JMenuItem mntmReporte;
	private JMenuItem mntmReporte_1;
	private JMenuItem mntmReporte_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//frame.setBounds(100, 100, 450, 300);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		//this.setUndecorated(true);
		setJMenuBar(getMenuBar_1());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnEditar());
			menuBar.add(getMnConsultar());
			menuBar.add(getMnAyuda());
		}
		return menuBar;
	}
	private JMenu getMnEditar() {
		if (mnEditar == null) {
			mnEditar = new JMenu("Gesti\u00F3n");
			mnEditar.add(getMntmPeriodos());
			mnEditar.add(getMntmListado());
		}
		return mnEditar;
	}
	private JMenu getMnAyuda() {
		if (mnAyuda == null) {
			mnAyuda = new JMenu("Ayuda");
			mnAyuda.add(getMntmAcercaDe());
		}
		return mnAyuda;
	}
	private JMenuItem getMntmAcercaDe() {
		if (mntmAcercaDe == null) {
			mntmAcercaDe = new JMenuItem("Acerca de ...");
		}
		return mntmAcercaDe;
	}
	private JMenuItem getMntmListado() {
		if (mntmListado == null) {
			mntmListado = new JMenuItem("Personal");
			mntmListado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Personal persona = new Personal();
					persona.setModal(true);
					persona.setVisible(true);
				}
			});
		}
		return mntmListado;
	}
	private JMenuItem getMntmPeriodos() {
		if (mntmPeriodos == null) {
			mntmPeriodos = new JMenuItem("Periodos");
		}
		return mntmPeriodos;
	}
	private JMenu getMnConsultar() {
		if (mnConsultar == null) {
			mnConsultar = new JMenu("Consultar");
			mnConsultar.add(getMntmReport());
			mnConsultar.add(getMntmReporte());
			mnConsultar.add(getMntmReporte_1());
			mnConsultar.add(getMntmReporte_2());
		}
		return mnConsultar;
	}
	private JMenuItem getMntmReport() {
		if (mntmReport == null) {
			mntmReport = new JMenuItem("Reporte 1");
		}
		return mntmReport;
	}
	private JMenuItem getMntmReporte() {
		if (mntmReporte == null) {
			mntmReporte = new JMenuItem("Reporte 2");
		}
		return mntmReporte;
	}
	private JMenuItem getMntmReporte_1() {
		if (mntmReporte_1 == null) {
			mntmReporte_1 = new JMenuItem("Reporte 3");
		}
		return mntmReporte_1;
	}
	private JMenuItem getMntmReporte_2() {
		if (mntmReporte_2 == null) {
			mntmReporte_2 = new JMenuItem("Reporte 4");
		}
		return mntmReporte_2;
	}
}
