package nhbank.core.services;
import nhbank.core.domain.AACT_TRX_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AACT_TRX_BASEInfoService {
	void updateAll();
	void insertAll(List<AACT_TRX_BASEInfo> AACT_TRX_BASEInfos);
	boolean isExist(Date trxIl, String trxBr);
}