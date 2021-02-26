package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.domain.CheckUpdateDetail;
import nhbank.core.repositories.ACOM_LMT_BASEHISInfoRepository;
import nhbank.core.repositories.CheckUpdateDetailRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_LMT_BASEHISInfoService;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ACOM_LMT_BASEHISInfoServiceImpl implements ACOM_LMT_BASEHISInfoService {
	public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
	@Autowired
	PathConfig pathConfig;
	@Autowired
	CheckUpdateRepository checkUpdateRepository;
	@Autowired
	CheckUpdateDetailRepository checkUpdateDetialRepository;
	@Autowired
	ACOM_LMT_BASEHISInfoRepository acom_lmt_basehisInfoRepository;

	@Override
	public void updateAll() throws IOException {
		CheckUpdate checkUpdate = new CheckUpdate();
		CheckUpdateDetail checkUpdateDetail = new CheckUpdateDetail();
		checkUpdate.setTableName("ACOM_LMT_BASEHIS");
		checkUpdate.setUpdateTime(LocalDateTime.now());
		BufferedReader br = null;
		int countLine = 0;
		List<Integer> listRowFail = new ArrayList<>();
		StringBuffer stringListRowFail = new StringBuffer();
		try {
			List<ACOM_LMT_BASEHISInfo> objList = new ArrayList<>();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			String line;
			String dataPath = pathConfig.getDataPath();
			File file = new File(dataPath + "\\ACOM_LMT_BASEHIS.dat");
			if (!file.exists()) {
				logger.info("No such file");
			} else {
				br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_BASEHIS.dat"));
				while ((line = br.readLine()) != null) {
					String[] lineArray = line.split("\\|");
					countLine++;
					ACOM_LMT_BASEHISInfo obj = new ACOM_LMT_BASEHISInfo();
					try {
						obj.setSngNo(lineArray[0]);
						obj.setActCd(lineArray[1]);
						obj.setHisNo(new BigDecimal(lineArray[2]));
						obj.setHisGb(lineArray[3]);
						obj.setTrCd(lineArray[4]);
						obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
						obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
						obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
						obj.setCanIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
						obj.setMngBr(lineArray[9]);
						obj.setCixNo(lineArray[10]);
						obj.setSngSts(lineArray[11]);
						obj.setSngInfo(lineArray[12]);
						obj.setSisSngno(lineArray[13]);
						obj.setPogwlGb(lineArray[14]);
						obj.setRevolGb(lineArray[15]);
						obj.setGihanGb(lineArray[16]);
						obj.setExpMm(new BigDecimal(lineArray[17]));
						obj.setExpIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
						obj.setSngIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
						obj.setSngCcy(lineArray[20]);
						obj.setSngAmt(new BigDecimal(lineArray[21]));
						obj.setSngAbtrt(new BigDecimal(lineArray[22]));
						obj.setSngAbtamt(new BigDecimal(lineArray[23]));
						obj.setActAmt(new BigDecimal(lineArray[24]));
						obj.setActRtgb(lineArray[25]);
						obj.setActRate(new BigDecimal(lineArray[26]));
						obj.setActSprd(new BigDecimal(lineArray[27]));
						obj.setActRtjo(lineArray[28]);
						obj.setSilCnt(new BigDecimal(lineArray[29]));
						obj.setSilJanamt(new BigDecimal(lineArray[30]));
						obj.setSilAccum(new BigDecimal(lineArray[31]));
						obj.setSilWoijan(new BigDecimal(lineArray[32]));
						obj.setSilDjgjan(new BigDecimal(lineArray[33]));
						obj.setSilLstil((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
						obj.setBojBcnt(new BigDecimal(lineArray[35]));
						obj.setBojBjan(new BigDecimal(lineArray[36]));
						obj.setBojFcnt(new BigDecimal(lineArray[37]));
						obj.setBojFjan(new BigDecimal(lineArray[38]));
						obj.setWoiYongdo(new BigDecimal(lineArray[39]));
						obj.setWoiSunhu(lineArray[40]);
						obj.setWoiInttrm(new BigDecimal(lineArray[41]));
						obj.setWoiGaetrm(new BigDecimal(lineArray[42]));
						obj.setWoiSutgb(lineArray[43]);
						obj.setSngCond(lineArray[44]);
						obj.setIsSngno(lineArray[45]);
						obj.setIsCixno(lineArray[46]);
						obj.setIsBrno(lineArray[47]);
						obj.setIsIl((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
						obj.setIkSngno(lineArray[49]);
						obj.setIkCixno(lineArray[50]);
						obj.setIkBrno(lineArray[51]);
						obj.setIkIl((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
						obj.setSngAplseq(new BigDecimal(lineArray[53]));
						obj.setSngAuth(lineArray[54]);
						obj.setLstIbil((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
						obj.setSngBrno(lineArray[56]);
						obj.setSngClerk(lineArray[57]);
						obj.setSngAstmgr(lineArray[58]);
						obj.setSngLonmgr(lineArray[59]);
						obj.setSngChajang(lineArray[60]);
						obj.setSngJumjang(lineArray[61]);
						obj.setBojMjAmt(new BigDecimal(lineArray[62]));
						obj.setRateGb(lineArray[63]);
						obj.setRateJugi(lineArray[64]);
						obj.setSpread(new BigDecimal(lineArray[65]));
						obj.setYoncheRate(new BigDecimal(lineArray[66]));
						obj.setGraceDay(new BigDecimal(lineArray[67]));
						obj.setDayCntBasis(lineArray[68]);
						obj.setBusiDayRule(lineArray[69]);
						obj.setPenalRate(new BigDecimal(lineArray[70]));
						obj.setTrBr(lineArray[71]);
						obj.setSdBr(lineArray[72]);
						obj.setTrTime(lineArray[73]);
						obj.setOpNo(lineArray[74]);
						obj.setMngNo(lineArray[75]);
						obj.setAgreeNo(lineArray[76]);
						obj.setCondSts(lineArray[77]);
						obj.setRegEmpNo(lineArray[78]);
						obj.setRegDt((lineArray[79].equals("")) ? null : formatter.parse(lineArray[79]));
						obj.setRegTm(lineArray[80]);
						obj.setUpdEmpNo(lineArray[81]);
						obj.setUpdDt((lineArray[82].equals("")) ? null : formatter.parse(lineArray[82]));
						obj.setUpdTm(lineArray[83]);
						checkUpdate.setTotalRow(countLine);
						checkUpdate.setTotalFailed(0);
						checkUpdate.setStatus("Done");
						checkUpdateRepository.save(checkUpdate);
						if (isExist(obj.getSngNo(), obj.getActCd(), obj.getHisNo(), obj.getHisGb())) {
							acom_lmt_basehisInfoRepository.save(obj);
						} else {
							objList.add(obj);
						}
						if (!objList.isEmpty()) {
							insertAll(objList);
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						listRowFail.add(countLine);
						checkUpdate.setStatus("File Format Error");
						checkUpdateDetail.setErrMsg("Object had Wrong!");
					}
				}
				br.close();
				FileUtils.deleteFile(file);
			}
			
			checkUpdate.setTotalFailed(listRowFail.size());
			checkUpdate.setTotalRow(countLine);
			if (listRowFail.size() != 0) {
				CheckUpdate c = checkUpdateRepository.save(checkUpdate);
				checkUpdateDetail.setCheckUpdate(c);

				for (int item : listRowFail) {
					stringListRowFail.append(item);
					stringListRowFail.append("  ");
					logger.info("Object had wrong " + String.valueOf(item));
				}
				checkUpdateDetail.setRowIndex(stringListRowFail.toString());
				checkUpdateDetialRepository.save(checkUpdateDetail);
			}

			int size = objList.size();
			logger.info("total row in file : " + String.valueOf(size));
		} catch (Exception ex) {
			ex.printStackTrace();
			checkUpdate.setStatus("File Not found");
			checkUpdate.setTotalRow(0);
			checkUpdate.setTotalFailed(0);
			checkUpdateRepository.save(checkUpdate);
			assert br != null;
			br.close();
		}

	}

	@Override
	public void insertAll(List<ACOM_LMT_BASEHISInfo> objList) {
		acom_lmt_basehisInfoRepository.saveAll(objList);
	}

	@Override
	public boolean isExist(String sngNo, String actCd, BigDecimal hisNo, String hisGb) {
		return acom_lmt_basehisInfoRepository.existsBySngNoAndActCdAndHisNoAndHisGb(sngNo, actCd, hisNo, hisGb);
	}
}
