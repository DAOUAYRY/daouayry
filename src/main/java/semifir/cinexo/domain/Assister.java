package semifir.cinexo.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the assister database table.
 * 
 */
@Entity
@NamedQuery(name="Assister.findAll", query="SELECT a FROM Assister a")
public class Assister implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Prix
	@ManyToOne(fetch=FetchType.LAZY)
	private Prix prix;

	//bi-directional many-to-one association to Seance
	@ManyToOne(fetch=FetchType.LAZY)
	private Seance seance;

	//bi-directional many-to-one association to Spectateur
	@ManyToOne(fetch=FetchType.LAZY)
	private Spectateur spectateur;

	public Assister() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prix getPrix() {
		return this.prix;
	}

	public void setPrix(Prix prix) {
		this.prix = prix;
	}

	public Seance getSeance() {
		return this.seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public Spectateur getSpectateur() {
		return this.spectateur;
	}

	public void setSpectateur(Spectateur spectateur) {
		this.spectateur = spectateur;
	}

}