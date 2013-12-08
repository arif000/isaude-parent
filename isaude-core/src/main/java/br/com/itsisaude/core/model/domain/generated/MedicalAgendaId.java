package br.com.itsisaude.core.model.domain.generated;

// Generated 08/12/2013 12:06:24 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MedicalAgendaId generated by hbm2java
 */
@Embeddable
public class MedicalAgendaId implements java.io.Serializable {

	private int id;
	private int expedienteMedicoId;
	private int instituicaoMedicaId;

	public MedicalAgendaId() {
	}

	public MedicalAgendaId(int id, int expedienteMedicoId,
			int instituicaoMedicaId) {
		this.id = id;
		this.expedienteMedicoId = expedienteMedicoId;
		this.instituicaoMedicaId = instituicaoMedicaId;
	}

	@Column(name = "ID", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "EXPEDIENTE_MEDICO_ID", nullable = false)
	public int getExpedienteMedicoId() {
		return this.expedienteMedicoId;
	}

	public void setExpedienteMedicoId(int expedienteMedicoId) {
		this.expedienteMedicoId = expedienteMedicoId;
	}

	@Column(name = "INSTITUICAO_MEDICA_ID", nullable = false)
	public int getInstituicaoMedicaId() {
		return this.instituicaoMedicaId;
	}

	public void setInstituicaoMedicaId(int instituicaoMedicaId) {
		this.instituicaoMedicaId = instituicaoMedicaId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MedicalAgendaId))
			return false;
		MedicalAgendaId castOther = (MedicalAgendaId) other;

		return (this.getId() == castOther.getId())
				&& (this.getExpedienteMedicoId() == castOther
						.getExpedienteMedicoId())
				&& (this.getInstituicaoMedicaId() == castOther
						.getInstituicaoMedicaId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getExpedienteMedicoId();
		result = 37 * result + this.getInstituicaoMedicaId();
		return result;
	}

}
