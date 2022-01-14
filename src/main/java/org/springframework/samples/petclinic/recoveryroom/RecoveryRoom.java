package org.springframework.samples.petclinic.recoveryroom;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.pet.Visit;

import antlr.collections.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RECOVERYROOMS")
public class RecoveryRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    
	@NotNull
    @Size(min = 3, max = 50)
    String name;
	
	@NotNull
    @Min(0)
    double size;
	
    @NotNull
    boolean secure;
    

    @ManyToOne
    @JoinColumn(name= "ROOMTYPE")
    RecoveryRoomType roomType;
}
