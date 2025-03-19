package vue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.Controleur;

public class FramePrincipale extends JFrame {
	private Controleur ctrl;
	private PanelPrincipal panel;

	public FramePrincipale(Controleur ctrl) {
		this.ctrl=ctrl;

		this.setTitle("Les couleurs tt ça");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

		this.panel = new PanelPrincipal();

		this.add(panel);

        this.setVisible(true);
	}
	public static void main(String[] args) {
		Controleur ctrl = new Controleur();
		FramePrincipale fr = new FramePrincipale(ctrl);
	}
}