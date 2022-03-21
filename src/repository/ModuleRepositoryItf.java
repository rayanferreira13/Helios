package repository;

import java.util.List;

import entite.Module;

public interface ModuleRepositoryItf {
	
	List<Module> readAllModule();
	public Module read(Long id);
	public void deleteModule(Long id);
	public Module update(Module module);
}
