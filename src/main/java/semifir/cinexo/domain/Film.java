package semifir.cinexo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the film database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Film.findAll", query="SELECT f FROM Film f")
})
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String duree;

	private String titre;

	@Column(name="titre_original")
	private String titreOriginal;

	private String visa;

	//bi-directional many-to-one association to Information
	@OneToMany(mappedBy="film")
	private List<Information> informations;

	//bi-directional many-to-one association to Seance
	@OneToMany(mappedBy="film")
	private List<Seance> seances;

	public Film() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDuree() {
		return this.duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTitreOriginal() {
		return this.titreOriginal;
	}

	public void setTitreOriginal(String titreOriginal) {
		this.titreOriginal = titreOriginal;
	}

	public String getVisa() {
		return this.visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	public List<Information> getInformations() {
		return this.informations;
	}

	public void setInformations(List<Information> informations) {
		this.informations = informations;
	}

	public Information addInformation(Information information) {
		getInformations().add(information);
		information.setFilm(this);

		return information;
	}

	public Information removeInformation(Information information) {
		getInformations().remove(information);
		information.setFilm(null);

		return information;
	}

	public List<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public Seance addSeance(Seance seance) {
		getSeances().add(seance);
		seance.setFilm(this);

		return seance;
	}

	public Seance removeSeance(Seance seance) {
		getSeances().remove(seance);
		seance.setFilm(null);

		return seance;
	}

}