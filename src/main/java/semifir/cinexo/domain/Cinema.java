package semifir.cinexo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cinema database table.
 * 
 */
@Entity
@NamedQuery(name="Cinema.findAll", query="SELECT c FROM Cinema c")
public class Cinema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String adresse;

	//bi-directional many-to-one association to Prix
	@OneToMany(mappedBy="cinema")
	private List<Prix> prixs;

	//bi-directional many-to-one association to Salle
	@OneToMany(mappedBy="cinema")
	private List<Salle> salles;

	public Cinema() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Prix> getPrixs() {
		return this.prixs;
	}

	public void setPrixs(List<Prix> prixs) {
		this.prixs = prixs;
	}

	public Prix addPrix(Prix prix) {
		getPrixs().add(prix);
		prix.setCinema(this);

		return prix;
	}

	public Prix removePrix(Prix prix) {
		getPrixs().remove(prix);
		prix.setCinema(null);

		return prix;
	}

	public List<Salle> getSalles() {
		return this.salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public Salle addSalle(Salle salle) {
		getSalles().add(salle);
		salle.setCinema(this);

		return salle;
	}

	public Salle removeSalle(Salle salle) {
		getSalles().remove(salle);
		salle.setCinema(null);

		return salle;
	}

}