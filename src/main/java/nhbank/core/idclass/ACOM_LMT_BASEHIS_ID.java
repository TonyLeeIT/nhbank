package nhbank.core.idclass;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class ACOM_LMT_BASEHIS_ID implements Serializable {
    private String sngNo;
    private String actCd;
    private BigDecimal hisNo;
    private String hisGb;

    public ACOM_LMT_BASEHIS_ID(String sngNo, String actCd, BigDecimal hisNo, String hisGb) {
        this.sngNo = sngNo;
        this.actCd = actCd;
        this.hisNo = hisNo;
        this.hisGb = hisGb;
    }

    public ACOM_LMT_BASEHIS_ID() {
    }

    public String getSngNo() {
        return sngNo;
    }

    public void setSngNo(String sngNo) {
        this.sngNo = sngNo;
    }

    public String getActCd() {
        return actCd;
    }

    public void setActCd(String actCd) {
        this.actCd = actCd;
    }

    public BigDecimal getHisNo() {
        return hisNo;
    }

    public void setHisNo(BigDecimal hisNo) {
        this.hisNo = hisNo;
    }

    public String getHisGb() {
        return hisGb;
    }

    public void setHisGb(String hisGb) {
        this.hisGb = hisGb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ACOM_LMT_BASEHIS_ID)) return false;
        ACOM_LMT_BASEHIS_ID that = (ACOM_LMT_BASEHIS_ID) o;
        return Objects.equals(getSngNo(), that.getSngNo()) &&
                Objects.equals(getActCd(), that.getActCd()) &&
                Objects.equals(getHisNo(), that.getHisNo()) &&
                Objects.equals(getHisGb(), that.getHisGb());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSngNo(), getActCd(), getHisNo(), getHisGb());
    }
}
