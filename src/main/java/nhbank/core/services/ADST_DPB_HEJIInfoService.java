package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_HEJIInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_HEJIInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_HEJIInfo> ADST_DPB_HEJIInfos);
	boolean isExist(String acctNo, Date ibIl, BigDecimal trxNo);
}