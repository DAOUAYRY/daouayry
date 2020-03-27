package semifir.cinexo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the spectateur database table.
 * 
 */
@Entity
@NamedQuery(name="Spectateur.findAll", query="SELECT s FROM Spectateur s")
public class Spectateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nom;

	private byte premium;

	private String prenom;

	//bi-directional many-to-one association to Assister
	@OneToMany(mappedBy="spectateur")
	private List<Assister> assisters;

	public Spectateur() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public byte getPremium() {
		return this.premium;
	}

	public void setPremium(byte premium) {
		this.premium = premium;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Assister> getAssisters() {
		return this.assisters;
	}

	public void setAssisters(List<Assister> assisters) {
		this.assisters = assisters;
	}

	public Assister addAssister(Assister assister) {
		getAssisters().add(assister);
		assister.setSpectateur(this);

		return assister;
	}

	public Assister removeAssister(Assister assister) {
		getAssisters().remove(assister);
		assister.setSpectateur(null);

		return assister;
	}

}