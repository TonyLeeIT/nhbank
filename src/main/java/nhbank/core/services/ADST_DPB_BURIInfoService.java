package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_BURIInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_BURIInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_BURIInfo> ADST_DPB_BURIInfos);
	boolean isExist(String acctNo, Date buriIl);
}