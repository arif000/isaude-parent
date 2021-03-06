package br.com.its.isaude.core.modal.domain;

// Generated 09/12/2013 22:31:28 by Hibernate Tools 4.0.0
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * AgendaMedico generated by hbm2java
 */
@Entity
@Table(name = "AGENDA_MEDICO", uniqueConstraints = @UniqueConstraint(columnNames = "NOME_AGENDA"))
public class AgendaDoctor implements java.io.Serializable {

    private Long id;
    private WorktimeDoctor expedienteMedico;
    private String nomeAgenda;
    private String status;
    private Set<MedicalConsultAgenda> agendaConsultaMedicas = new HashSet<MedicalConsultAgenda>();

    public AgendaDoctor() {
    }

    public AgendaDoctor(WorktimeDoctor expedienteMedico, String nomeAgenda) {
        this.expedienteMedico = expedienteMedico;
        this.nomeAgenda = nomeAgenda;
    }

    public AgendaDoctor(WorktimeDoctor expedienteMedico, String nomeAgenda, String status, Set<MedicalConsultAgenda> agendaConsultaMedicas) {
        this.expedienteMedico = expedienteMedico;
        this.nomeAgenda = nomeAgenda;
        this.status = status;
        this.agendaConsultaMedicas = agendaConsultaMedicas;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXPEDIENTE_MEDICO_ID", nullable = false)
    public WorktimeDoctor getExpedienteMedico() {
        return this.expedienteMedico;
    }

    public void setExpedienteMedico(WorktimeDoctor expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }

    @Column(name = "NOME_AGENDA", unique = true, nullable = false, length = 45)
    public String getNomeAgenda() {
        return this.nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    @Column(name = "STATUS", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaMedico")
    public Set<MedicalConsultAgenda> getAgendaConsultaMedicas() {
        return this.agendaConsultaMedicas;
    }

    public void setAgendaConsultaMedicas(Set<MedicalConsultAgenda> agendaConsultaMedicas) {
        this.agendaConsultaMedicas = agendaConsultaMedicas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 73 * hash + (this.expedienteMedico != null ? this.expedienteMedico.hashCode() : 0);
        hash = 73 * hash + (this.nomeAgenda != null ? this.nomeAgenda.hashCode() : 0);
        hash = 73 * hash + (this.status != null ? this.status.hashCode() : 0);
        hash = 73 * hash + (this.agendaConsultaMedicas != null ? this.agendaConsultaMedicas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AgendaDoctor other = (AgendaDoctor) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
