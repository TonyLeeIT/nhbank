package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_INFOInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_INFOInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_INFOInfo> ADST_DPB_INFOInfos);
	boolean isExist(String acctNo);
}