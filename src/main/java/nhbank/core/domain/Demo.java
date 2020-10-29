package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name="DEMO")
@Entity
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DOB")
    private Date dob;
}
