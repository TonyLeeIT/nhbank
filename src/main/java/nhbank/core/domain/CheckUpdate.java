package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Table(name = "CHECK_UPDATE")
@Entity
public class CheckUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "UPDATE_TIME")
    private LocalDateTime updateTime;
    @Column(name = "STATUS")
    private String status;
}
