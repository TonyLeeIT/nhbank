package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;


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
    @Column(name = "TOTAL_ROW")
    private int totalRow;
    @Column(name = "TOTAL_FAILED")
    private int totalFailed;
    
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy="checkUpdate" , cascade = CascadeType.ALL)
    private Set<CheckUpdateDetail> checkUpdateDetail;
}
