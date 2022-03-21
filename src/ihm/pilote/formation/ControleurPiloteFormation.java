package ihm.pilote.formation;

import java.util.List;

import entite.Etudiant;
import entite.Formation;
import entite.Module;
import ihm.ControleurMenu;
import service.ServiceItf;

public class ControleurPiloteFormation {
	private ServiceItf service;
	private ModelPilote modelPilote;
	private ControleurMenu ihmPrincipale;
	public ControleurPiloteFormation(ServiceItf service, ModelPilote modelPilote, ControleurMenu ihmPrincipale) {
		System.out.println("Constructeur ControleurPiloteFormation");
		this.service = service;
		this.modelPilote = modelPilote;
        this.ihmPrincipale = ihmPrincipale;

		String[] strAcronymes = service.readAllAcronyme().toArray(new String[0]);
		modelPilote.setStrAcronymes(strAcronymes);
		
		Formation formation = service.readAvecEtudiantEtModule(strAcronymes[0]);
		modelPilote.setFormation(formation);
		int indexFormation = getIndexFormation(formation, strAcronymes);
		modelPilote.setIndex(indexFormation);
	}
    private int getIndexFormation(Formation formation, String[] strAcronymes) {
		for(int i=0; i<strAcronymes.length; i++) {
			if(strAcronymes[i].equals(formation.getAcronyme())) {
				return i;
			}
		}
		return -1;
	}
    public void selectFormation(int index) {
		System.out.println("ControleurPiloteFormation - seclectFormation index=" + index);
		String[] strAcronymes = modelPilote.getStrAcronymes();
		String acronyme = strAcronymes[index];
		System.out.println("ControleurPiloteFormation - seclectFormation acronyme=" + acronyme);
		Formation formation = service.readAvecEtudiantEtModule(acronyme);
		System.out.println("ControleurPiloteFormation - seclectFormation formation=" + formation);
		modelPilote.setFormation(formation);
		int indexFormation = getIndexFormation(formation, strAcronymes);
		modelPilote.setIndex(indexFormation);
		VuePiloteFormation vue = new VuePiloteFormation(this, modelPilote);
		
	}

    public void ajouterModule(Module module, String intitule){
        service.ajouterModuleFormation(module, intitule);
        Formation formation = service.readAvecEtudiantEtModule(intitule);
		modelPilote.setFormation(formation);
	}	
	public void supprimerModule(String acronyme) {
		service.supprimerFormation(acronyme);
	}
	public void modifierModule(Formation formation) {
		service.modifier(formation);
	}
	public void IhmAfficherModule(Module module) {
		new IhmAfficherModule(module);
	}

}
