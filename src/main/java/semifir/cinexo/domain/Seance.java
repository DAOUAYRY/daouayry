package semifir.cinexo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the seance database table.
 * 
 */
@Entity
@NamedQuery(name="Seance.findAll", query="SELECT s FROM Seance s")
public class Seance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	//bi-directional many-to-one association to Assister
	@OneToMany(mappedBy="seance")
	private List<Assister> assisters;

	//bi-directional many-to-many association to Prix
	@ManyToMany(mappedBy="seances")
	private List<Prix> prixs;

	//bi-directional many-to-one association to Film
	@ManyToOne(fetch=FetchType.LAZY)
	private Film film;

	//bi-directional many-to-one association to Salle
	@ManyToOne(fetch=FetchType.LAZY)
	private Salle salle;

	public Seance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Assister> getAssisters() {
		return this.assisters;
	}

	public void setAssisters(List<Assister> assisters) {
		this.assisters = assisters;
	}

	public Assister addAssister(Assister assister) {
		getAssisters().add(assister);
		assister.setSeance(this);

		return assister;
	}

	public Assister removeAssister(Assister assister) {
		getAssisters().remove(assister);
		assister.setSeance(null);

		return assister;
	}

	public List<Prix> getPrixs() {
		return this.prixs;
	}

	public void setPrixs(List<Prix> prixs) {
		this.prixs = prixs;
	}

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Salle getSalle() {
		return this.salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

}