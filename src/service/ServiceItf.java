package service;

import java.util.List;
import entite.Etudiant;
import entite.EtudiantWhithAcronyme;
import entite.Formation;
import entite.Module;

/**
 * Interface composant service. 
 * @author tophe
 * @version 1.0
 *
 */
public interface ServiceItf {
	
	// FORMATION
	void create(Formation formation);
	List<String> readAllAcronyme();
	Formation readSansEtudiant(String acronyme);
	Formation readAvecEtudiantEtModule(String acronyme);
	void modifier(Formation formation);
	void supprimerFormation(String acronyme);
	List<Formation> readAllSansEtudiant();
	
	// ETUDIANT
	EtudiantWhithAcronyme readEtudiant(Long id);
	EtudiantWhithAcronyme inscrire(EtudiantWhithAcronyme etudiantWhithAcronyme);
	Etudiant inscrire(Etudiant etudiant, String acronyme);
	void supprimerEtudiant(Long id, String acronyme);	
	void modifier(EtudiantWhithAcronyme etudiantWhithAcronyme);
	List<EtudiantWhithAcronyme> readAllEtudiantWithAcronyme();
	List<EtudiantWhithAcronyme> readLikeName(String chaine);
	
	void ajouterModuleFormation(Module module, String acronyme);
	void supprimerModuleFormation(Module module, String acronyme);
	List<Module> readAllModule();
	public Module update(Module module);
	void modifierModuleFormation(Module module, String acronyme);

	
	

}

	