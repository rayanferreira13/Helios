package repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import entite.Module;
import util.EntityManagerUtil;

public class ModuleRepository implements ModuleRepositoryItf {
	
	public List<Module> readAllModule(){
		EntityManager entityManager = EntityManagerUtil.getEntityManager();       
		Query req = entityManager.createQuery("select m from Module m");
		List<Module> modules = (List<Module>) req.getResultList();
		entityManager.close();
		return modules;		
	}
	public Module read(Long id) {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		System.out.println("id=" + id);
		Module module = entityManager.find(Module.class, id);	
		entityManager.close();
		return module;
	}
	public void deleteModule(Long id) {
		EntityTransaction tx = null;
		EntityManager entityManager = null; 
		try {
			entityManager = EntityManagerUtil.getEntityManager(); 
			tx = entityManager.getTransaction();
			Module module = entityManager.find(Module.class, id);
			entityManager.remove(module);
			tx.begin();
			tx.commit();
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(entityManager != null) {
				entityManager.close();
			}
		}		
	}
	public Module update(Module module) {
		EntityTransaction tx = null;
		EntityManager entityManager = null; 
		try {
			entityManager = EntityManagerUtil.getEntityManager(); 
			tx = entityManager.getTransaction();
			tx.begin();
			module = entityManager.merge(module);
			tx.commit();
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(entityManager != null) {
				entityManager.close();
			}
			return module;
		}
	}
}
