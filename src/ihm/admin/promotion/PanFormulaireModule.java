package ihm.admin.promotion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import entite.Formation;
import ihm.composant.MonJButton;
import ihm.composant.MonJLabelTexte;
import ihm.composant.MonJPanel;
import ihm.composant.MonJTextField;
import ihm.pilote.formation.ControleurPiloteFormation;
import util.Constante;

/**
 * Formulaire de cr�ation et modification d'une formation.  
 * @author tophe
 * @version 1.0
 * 
 */
public class PanFormulaireModule extends MonJPanel implements ActionListener {
	private JTextField acronymeField;
	private JTextField intituleField;
	private JTextField nbHeureField;
	private JTextArea descriptionField;
	private MonJButton creerModifierBouton;
	private ControleurPiloteFormation controleur; 
	private Formation formation;
	private boolean modifierMode = false;
	/**
	 * Instanciation d'un formulaire de cr�ation "Formation"
	 * @param controleur contr�leur "Formation" - callback action utilisateur
	 */
	public PanFormulaireModule(ControleurPiloteFormation controleur) {
		System.out.println("PanFormulaireModule0");
		this.controleur = controleur;
		modifierMode = false;
		creerModifierFormulaire();
	}
	/**
	 * Instanciation d'un formulaire de modification "Formation"
	 * @param controleur contr�leur "Formation" - callback action utilisateur
	 * @param formation formation s�lectionn�e tableau
	 */
	public PanFormulaireModule(ControleurPiloteFormation controleur, Formation formation) {
		this.controleur = controleur;
		this.formation = formation;
		modifierMode = true;
		creerModifierFormulaire();
	}
	private void creerModifierFormulaire() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		if(modifierMode == false) {
			add(getPanFormSansDescrition());
			descriptionField = new JTextArea(8, 30);
			add(descriptionField);
			creerModifierBouton = new MonJButton("créer");
			add(creerModifierBouton);
		}
		else {
			MonJPanel panModifierForm = new MonJPanel();
			panModifierForm.setLayout(new BorderLayout(20, 10));
			panModifierForm.add(getPanFormSansDescrition(), BorderLayout.NORTH);
			descriptionField = new JTextArea(formation.getDescription(), 8, 30);
			panModifierForm.add(descriptionField, BorderLayout.CENTER);

			MonJPanel panBouton = new MonJPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
			creerModifierBouton = new MonJButton("modifier");
			panBouton.add(creerModifierBouton);
			panModifierForm.add(panBouton, BorderLayout.SOUTH);
			add(panModifierForm);
		}
		creerModifierBouton.addActionListener(this);

	}
	public MonJPanel getPanFormSansDescrition() {		
		MonJPanel panSansDescr = new MonJPanel();
		panSansDescr.setLayout (new GridLayout(3, 2, 20, 20));	
		MonJLabelTexte acronymeLabel = null;
		panSansDescr.add(new MonJLabelTexte("Acronyme : "));

		if(modifierMode == true) {
			acronymeLabel = new MonJLabelTexte(formation.getAcronyme());
			panSansDescr.add(acronymeLabel);
			intituleField = new MonJTextField(formation.getIntitule(), 20);
			nbHeureField = new MonJTextField(Integer.toString(formation.getNbrHeure()), 20);
		}
		else {
			acronymeField = new MonJTextField(20);
			panSansDescr.add(acronymeField);
			intituleField = new MonJTextField(20);
			nbHeureField = new MonJTextField(20);
		}
		panSansDescr.add(new MonJLabelTexte("Intitul� :"));
		panSansDescr.add(intituleField);

		panSansDescr.add(new MonJLabelTexte("Nombre heure :"));
		panSansDescr.add(nbHeureField);

		return panSansDescr;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String acronyme = "";
		String intitule = "";
		int nbHeure = 0;
		String description;
		System.out.println("Bouton créer/modifier promotion");
		if(modifierMode==true) {
			System.out.println("Modifier promotion");
			acronyme = formation.getAcronyme();
		}
		else {
			System.out.println("créer promotion");
			acronyme = acronymeField.getText();
		}
	}
}	

