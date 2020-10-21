package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_TRANInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_TRANInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_TRANInfo> ADST_DPB_TRANInfos);
	boolean isExist(String acctNo, Date ibIl, BigDecimal trxNo);
}