package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_INRTInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_INRTInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_INRTInfo> ADST_DPB_INRTInfos);
	boolean isExist(
}