package dawidkapica.pracadyplomowa.sportapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "Opinion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpinionEntity extends AbstractPersistable<Integer> {

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "expert_id")
    private ExpertEntity expert;

    private Integer rate;



}
