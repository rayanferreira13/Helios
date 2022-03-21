package aprincipale;
import java.awt.EventQueue;
import entite.Etudiant;
import ihm.ControleurMenu;
import repository.EtudiantRepository;
import repository.EtudiantRepositoryItf;
import repository.FormationRepository;
import repository.ModuleRepository;
import repository.ModuleRepositoryItf;
import service.Service;
import service.ServiceItf;

/**
 * Classe principale - point d'entr�e du programme. Initialisation des composants 
 * Repository, service et contr�leur menu
 * @author tophe
 *
 */
public class PrincipaleClient {
	public static void main(String[] args) {
		FormationRepository formationRepository = new FormationRepository();
		EtudiantRepositoryItf etudiantRepository = new EtudiantRepository();
		ModuleRepositoryItf moduleRepository = new ModuleRepository();
	    ServiceItf service = new Service(formationRepository, etudiantRepository, moduleRepository);		
		ControleurMenu ihm = new ControleurMenu(service);			
	}
}
