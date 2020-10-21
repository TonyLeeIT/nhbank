package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_HISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_HISInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_HISInfo> ADST_DPB_HISInfos);
	boolean isExist(String acctNo, BigDecimal hisNo);
}