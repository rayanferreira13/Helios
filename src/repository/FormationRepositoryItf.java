package repository;

import java.util.List;

import entite.Etudiant;
import entite.Formation;
import entite.Module;

/**
 * Interface composant dao Formation
 * @author tophe
 * @version 1.0
 *
 */
public interface FormationRepositoryItf {
	void create(Formation formation);
	List<String> readAllAcronyme();
	Formation readSansEtudiant(String acronyme);
	Formation readAvecEtudiantEtModule(String acronyme);
	Formation update(Formation formation);
	void delete(String acronyme);
	List<Formation> readAllSansEtudiant();
	Etudiant inscrire(Etudiant etudiant, String acronyme);
	Module ajouterModuleFormation(Module module, String acronyme);
}
