package nhbank.core.services;

import nhbank.core.domain.AFTR_FFH_COMM_TRSC_PTCLInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFTR_FFH_COMM_TRSC_PTCLInfoService {
    void updateAll();

    void insertAll(List<AFTR_FFH_COMM_TRSC_PTCLInfo> objList);

    boolean isExist(String trscBrNo, Date trscDt, BigDecimal commTrscSeqNo, BigDecimal commTrscDtlsSeqNo);

}