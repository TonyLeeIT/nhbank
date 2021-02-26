package nhbank.core.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CHECK_UPDATE_DETAIL")
public class CheckUpdateDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CHECK_UPDATE_ID", nullable = false)
	private CheckUpdate checkUpdate;

	@Column(name = "ROW_INDEX")
	private String rowIndex;

	@Column(name = "ERR_MSG")
	private String errMsg;

}
