package br.com.its.isaude.core.modal.domain;

// Generated 21/11/2013 15:00:51 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Medico generated by hbm2java
 */
@Entity
@Table(name = "medico")
public class Doctor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5437070110427241608L;
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	private String curriculo;
	private String telefone;
	private String crm;
	private Set<MedicalSpeciality> especialidadeMedicas = new HashSet<MedicalSpeciality>();
	private Set<AgendaDoctor> agendaMedicos = new HashSet<AgendaDoctor>();
	private Set<MedicalInstitutional> instituicaoMedicas = new HashSet<MedicalInstitutional>();

	public Doctor() {
	}

	public Doctor(String nome, String sobrenome, String email,
			String curriculo, String telefone, String crm,
			Set<MedicalSpeciality> especialidadeMedicas, Set<AgendaDoctor> agendaMedicos, Set<MedicalInstitutional> instituicaoMedicas) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.curriculo = curriculo;
		this.telefone = telefone;
		this.crm = crm;
		this.especialidadeMedicas = especialidadeMedicas;
		this.agendaMedicos = agendaMedicos;
		this.instituicaoMedicas = instituicaoMedicas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NOME", length = 45)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "SOBRENOME", length = 45)
	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Column(name = "EMAIL", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "CURRICULO", length = 45)
	public String getCurriculo() {
		return this.curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	@Column(name = "TELEFONE", length = 45)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "CRM", length = 45)
	public String getCrm() {
		return this.crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "medico_has_especialidade_medica",  joinColumns = { @JoinColumn(name = "MEDICO_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ESPECIALIDADE_MEDICA_ID", nullable = false, updatable = false) })
	public Set<MedicalSpeciality> getEspecialidadeMedicas() {
		return this.especialidadeMedicas;
	}

	public void setEspecialidadeMedicas(Set<MedicalSpeciality> especialidadeMedicas) {
		this.especialidadeMedicas = especialidadeMedicas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medico")
	public Set<AgendaDoctor> getAgendaMedicos() {
		return this.agendaMedicos;
	}

	public void setAgendaMedicos(Set<AgendaDoctor> agendaMedicos) {
		this.agendaMedicos = agendaMedicos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "instituicao_medica_has_medico", 
	joinColumns = { @JoinColumn(name = "MEDICO_ID", nullable = false, updatable = false) }, 
	inverseJoinColumns = { @JoinColumn(name = "INSTITUICAO_MEDICA_ID", nullable = false, updatable = false) })
	public Set<MedicalInstitutional> getInstituicaoMedicas() {
		return this.instituicaoMedicas;
	}

	public void setInstituicaoMedicas(Set<MedicalInstitutional> instituicaoMedicas) {
		this.instituicaoMedicas = instituicaoMedicas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crm == null) ? 0 : crm.hashCode());
		result = prime * result
				+ ((curriculo == null) ? 0 : curriculo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Doctor))
			return false;
		Doctor other = (Doctor) obj;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (curriculo == null) {
			if (other.curriculo != null)
				return false;
		} else if (!curriculo.equals(other.curriculo))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}
