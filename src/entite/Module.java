package entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Module {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	private String description;
	private String nomProfesseur;
	private int nbHeure;
	public Module() {}
	//@ManyToOne
	//Formation formation;
	public Module(String intitule) {
		super();
		this.intitule = intitule;
	}	
	
	public Module(String intitule, String description, String nomProfesseur, int nbHeure) {
		super();
		this.intitule = intitule;
		this.description = description;
		this.nomProfesseur = nomProfesseur;
		this.nbHeure = nbHeure;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomProfesseur() {
		return nomProfesseur;
	}
	public void setNomProfesseur(String nomProfesseur) {
		this.nomProfesseur = nomProfesseur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNbHeure() {
		return nbHeure;
	}
	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}	
}
