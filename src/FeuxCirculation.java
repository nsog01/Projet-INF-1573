import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Canvas;

public class FeuxCirculation {

	private JFrame frm_Principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeuxCirculation window = new FeuxCirculation();
					window.frm_Principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FeuxCirculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm_Principal = new JFrame();
		frm_Principal.setTitle("Feux Circulation");
		frm_Principal.setBounds(100, 100, 1004, 618);
		frm_Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frm_Principal.setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mnFichier.add(mntmQuitter);
		
		JMenu mnApropos = new JMenu("Aide");
		menuBar.add(mnApropos);
		
		JMenuItem mntmAPropos = new JMenuItem("A propos");
		mnApropos.add(mntmAPropos);
		frm_Principal.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 716, 535);
		frm_Principal.getContentPane().add(panel);
		panel.setLayout(null);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(10, 10, 696, 515);
		panel.add(canvas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(733, 11, 245, 535);
		frm_Principal.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\pato\\eclipse-workspace\\ProjetProgrammation2\\img\\play.jpg"));
		btnNewButton.setBounds(10, 11, 40, 37);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\pato\\eclipse-workspace\\ProjetProgrammation2\\img\\stop.jpg"));
		btnNewButton_1.setBounds(60, 11, 40, 37);
		panel_1.add(btnNewButton_1);
		
		JSlider slider = new JSlider();
		slider.setToolTipText("Vitesse des voitures");
		slider.setBounds(10, 81, 200, 26);
		panel_1.add(slider);
		
		JLabel lblVitesse = new JLabel("Vitesse des voitures");
		lblVitesse.setToolTipText("Vitesse des voitures");
		lblVitesse.setBounds(60, 118, 104, 14);
		panel_1.add(lblVitesse);
	}
}
