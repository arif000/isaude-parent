package br.com.itsisaude.core.model.domain.generated;

// Generated 09/12/2013 22:31:28 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AgendamentoConsultaMedicaPaciente generated by hbm2java
 */
@Entity
@Table(name = "agendamento_consulta_medica_paciente", catalog = "camilo_itsisaude")
public class AgendamentoConsultaMedicaPaciente implements java.io.Serializable {

	private Integer id;
	private Paciente paciente;
	private AgendaConsultaMedica agendaConsultaMedica;

	public AgendamentoConsultaMedicaPaciente() {
	}

	public AgendamentoConsultaMedicaPaciente(Paciente paciente,
			AgendaConsultaMedica agendaConsultaMedica) {
		this.paciente = paciente;
		this.agendaConsultaMedica = agendaConsultaMedica;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PACIENTE_ID", nullable = false)
	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AGENDA_CONSULTA_MEDICA_ID", nullable = false)
	public AgendaConsultaMedica getAgendaConsultaMedica() {
		return this.agendaConsultaMedica;
	}

	public void setAgendaConsultaMedica(
			AgendaConsultaMedica agendaConsultaMedica) {
		this.agendaConsultaMedica = agendaConsultaMedica;
	}

}
