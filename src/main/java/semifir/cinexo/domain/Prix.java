package semifir.cinexo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the prix database table.
 * 
 */
@Entity
@NamedQuery(name="Prix.findAll", query="SELECT p FROM Prix p")
public class Prix implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private byte actif;

	private BigDecimal cout;

	private String description;

	//bi-directional many-to-one association to Assister
	@OneToMany(mappedBy="prix")
	private List<Assister> assisters;

	//bi-directional many-to-one association to Cinema
	@ManyToOne(fetch=FetchType.LAZY)
	private Cinema cinema;

	//bi-directional many-to-many association to Seance
	@ManyToMany
	@JoinTable(
		name="couter"
		, joinColumns={
			@JoinColumn(name="tarif_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="seance_id")
			}
		)
	private List<Seance> seances;

	public Prix() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActif() {
		return this.actif;
	}

	public void setActif(byte actif) {
		this.actif = actif;
	}

	public BigDecimal getCout() {
		return this.cout;
	}

	public void setCout(BigDecimal cout) {
		this.cout = cout;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Assister> getAssisters() {
		return this.assisters;
	}

	public void setAssisters(List<Assister> assisters) {
		this.assisters = assisters;
	}

	public Assister addAssister(Assister assister) {
		getAssisters().add(assister);
		assister.setPrix(this);

		return assister;
	}

	public Assister removeAssister(Assister assister) {
		getAssisters().remove(assister);
		assister.setPrix(null);

		return assister;
	}

	public Cinema getCinema() {
		return this.cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public List<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

}