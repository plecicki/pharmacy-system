package pl.plecicki.prescriptionservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medicines")
@Getter
@Setter
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "active_substance", nullable = false)
    private String activeSubstance;

    @Column(name = "dosage_form", nullable = false)
    private String dosageForm;
}
