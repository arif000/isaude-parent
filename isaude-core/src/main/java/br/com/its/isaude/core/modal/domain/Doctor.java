package br.com.its.isaude.core.modal.domain;

// Generated 09/12/2013 22:31:28 by Hibernate Tools 4.0.0
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Medico generated by hbm2java
 */
@Entity
@Table(name = "MEDICO", uniqueConstraints = {
    @UniqueConstraint(columnNames = "EMAIL"),
    @UniqueConstraint(columnNames = "CRM")})
public class Doctor implements java.io.Serializable {

    private static final long serialVersionUID = -6427508514192035137L;

    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String curriculo;
    private String telefone;
    private String crm;
    private Set<MedicalSpeciality> especialidadeMedicas = new HashSet<MedicalSpeciality>();
    private Set<WorktimeDoctor> expedienteMedicos = new HashSet<WorktimeDoctor>();
    private Set<MedicalInstitutional> instituicaoMedicas = new HashSet<MedicalInstitutional>();

    public Doctor() {
    }

    public Doctor(String nome, String sobrenome, String email, String telefone, String crm) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.crm = crm;
    }

    public Doctor(String nome, String sobrenome, String email, String curriculo, String telefone, String crm, Set<MedicalSpeciality> especialidadeMedicas, Set<WorktimeDoctor> expedienteMedicos, Set<MedicalInstitutional> instituicaoMedicas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.curriculo = curriculo;
        this.telefone = telefone;
        this.crm = crm;
        this.especialidadeMedicas = especialidadeMedicas;
        this.expedienteMedicos = expedienteMedicos;
        this.instituicaoMedicas = instituicaoMedicas;
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

    @Column(name = "NOME", nullable = false, length = 45)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "SOBRENOME", nullable = false, length = 45)
    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Email
    @NotNull
    @Column(name = "EMAIL", unique = true, nullable = false, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "CURRICULO", length = 65535)
    public String getCurriculo() {
        return this.curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    @Column(name = "TELEFONE", nullable = false, length = 45)
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @NotNull
    @NotEmpty
    @Column(name = "CRM", unique = true, nullable = false, length = 45)
    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "MEDICO_HAS_ESPECIALIDADE_MEDICA", joinColumns = {
        @JoinColumn(name = "MEDICO_ID", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "ESPECIALIDADE_MEDICA_ID", nullable = false, updatable = false)})
    public Set<MedicalSpeciality> getEspecialidadeMedicas() {
        return this.especialidadeMedicas;
    }

    public void setEspecialidadeMedicas(Set<MedicalSpeciality> especialidadeMedicas) {
        this.especialidadeMedicas = especialidadeMedicas;
    }

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medico", cascade = CascadeType.ALL)
    public Set<WorktimeDoctor> getExpedienteMedicos() {
        return this.expedienteMedicos;
    }

    public void setExpedienteMedicos(Set<WorktimeDoctor> expedienteMedicos) {
        this.expedienteMedicos = expedienteMedicos;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "INSTITUICAO_MEDICA_HAS_MEDICO", joinColumns = {
        @JoinColumn(name = "MEDICO_ID", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "INSTITUICAO_MEDICA_ID", nullable = false, updatable = false)})
    public Set<MedicalInstitutional> getInstituicaoMedicas() {
        return this.instituicaoMedicas;
    }

    public void setInstituicaoMedicas(Set<MedicalInstitutional> instituicaoMedicas) {
        this.instituicaoMedicas = instituicaoMedicas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 67 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 67 * hash + (this.sobrenome != null ? this.sobrenome.hashCode() : 0);
        hash = 67 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 67 * hash + (this.curriculo != null ? this.curriculo.hashCode() : 0);
        hash = 67 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 67 * hash + (this.crm != null ? this.crm.hashCode() : 0);
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
        final Doctor other = (Doctor) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.instituicaoMedicas != other.instituicaoMedicas && (this.instituicaoMedicas == null || !this.instituicaoMedicas.equals(other.instituicaoMedicas))) {
            return false;
        }
        return true;
    }

}
