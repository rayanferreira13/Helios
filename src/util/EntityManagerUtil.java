package util;
import javax.persistence.*;

/**
 * Singleton connexion � l'unit� de persitance UP_COMMANDE qui est configur�e 
 * dans le fichier META-INF/persistence.xml
 * @author tophe
 * @version 1.0
 *
 */
public class EntityManagerUtil {
    
	private static final EntityManagerFactory entityManagerFactory;
	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("UP_COMMANDE");         
		} catch (Throwable ex) {     
			System.err.println("Initial EntityManagerFactoryFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	public static void closeEntityManagerFactory() {
		entityManagerFactory.close();
	}
}
