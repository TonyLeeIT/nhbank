package nhbank.core.controllers;

import lombok.extern.log4j.Log4j;
import nhbank.core.config.Config;
import nhbank.core.config.PathConfig;
import nhbank.core.services.*;
import nhbank.core.util.FileUtils;
import nhbank.core.util.GenerateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@Log4j
@CrossOrigin("*")
@RestController
@RequestMapping("/nhbank")

public class NHBankController {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    private Config config;
    @Autowired
    private PathConfig pathConfig;
    @Autowired
    private AACT_TRX_BALInfoService aact_trx_balInfoService;
    @Autowired
    private AACT_TRX_BASEInfoService aact_trx_baseInfoService;
    @Autowired
    private AACT_TRX_BSInfoService aact_trx_bsInfoService;
    @Autowired
    private AACT_TRX_PLInfoService aact_trx_plInfoService;
    @Autowired
    private ACOM_ATB_APPLYInfoService acom_atb_applyInfoService;
    @Autowired
    private ACOM_ATB_BASEInfoService acom_atb_baseInfoService;
    @Autowired
    private ACOM_CIX_BASEInfoService acom_cix_baseInfoService;
    @Autowired
    private ACOM_CIX_LOCALInfoService acom_cix_localInfoService;
    @Autowired
    private ACOM_COMH_MSGInfoService acom_comh_msgInfoService;
    @Autowired
    private ACOM_COMH_MSGHISInfoService acom_comh_msghisInfoService;
    @Autowired
    private ACOM_COMH_TAGLINEInfoService acom_comh_taglineInfoService;
    @Autowired
    private ACOM_COMH_USERInfoService acom_comh_userInfoService;
    @Autowired
    private ACOM_COM_ACTCDInfoService acom_com_actcdInfoService;
    @Autowired
    private ACOM_COM_ALLOWInfoService acom_com_allowInfoService;
    @Autowired
    private ACOM_COM_CCYInfoService acom_com_ccyInfoService;
    @Autowired
    private ACOM_COM_FEERTInfoService acom_com_feertInfoService;
    @Autowired
    private ACOM_COM_FPBODYInfoService acom_com_fpbodyInfoService;
    @Autowired
    private ACOM_COM_FPHEADInfoService acom_com_fpheadInfoService;
    @Autowired
    private ACOM_COM_VOUCHERInfoService acom_com_voucherInfoService;
    @Autowired
    private ACOM_CONT_BASEInfoService acom_cont_baseInfoService;
    @Autowired
    private ACOM_DMH_ALLOCInfoService acom_dmh_allocInfoService;
    @Autowired
    private ACOM_DMH_ALLOCHISInfoService acom_dmh_allochisInfoService;
    @Autowired
    private ACOM_DMH_BASEInfoService acom_dmh_baseInfoService;
    @Autowired
    private ACOM_DMH_HISInfoService acom_dmh_hisInfoService;
    @Autowired
    private ACOM_DTG_CONT_STSInfoService acom_dtg_cont_stsInfoService;
    @Autowired
    private ACOM_DTG_NAPAS_HISInfoService acom_dtg_napas_hisInfoService;
    @Autowired
    private ACOM_DTG_NAPAS_RECONInfoService acom_dtg_napas_reconInfoService;
    @Autowired
    private ACOM_EPB_BASEInfoService acom_epb_baseInfoService;
    @Autowired
    private ACOM_EPB_HISInfoService acom_epb_hisInfoService;
    @Autowired
    private ACOM_EPB_ITMInfoService acom_epb_itmInfoService;
    @Autowired
    private ACOM_EPB_RPTInfoService acom_epb_rptInfoService;
    @Autowired
    private ACOM_FAB_HISInfoService acom_fab_hisInfoService;
    @Autowired
    private ACOM_FAB_ITMInfoService acom_fab_itmInfoService;
    @Autowired
    private ACOM_LMT_BASEACTInfoService acom_lmt_baseactInfoService;
    @Autowired
    private ACOM_LMT_BASEHDInfoService acom_lmt_basehdInfoService;
    @Autowired
    private ACOM_LMT_BASEHISInfoService acom_lmt_basehisInfoService;
    @Autowired
    private ACOM_LMT_BOJInfoService acom_lmt_bojInfoService;
    @Autowired
    private ACOM_LMT_CLMITInfoService acom_lmt_clmitInfoService;
    @Autowired
    private ACOM_LMT_ITMInfoService acom_lmt_itmInfoService;
    @Autowired
    private ACOM_LMT_SILInfoService acom_lmt_silInfoService;
    @Autowired
    private ACOM_LMT_SILHISInfoService acom_lmt_silhisInfoService;
    @Autowired
    private ADST_DPB_BASEInfoService adst_dpb_baseInfoService;
    @Autowired
    private ADST_DPB_BURIInfoService adst_dpb_buriInfoService;
    @Autowired
    private ADST_DPB_CERTInfoService adst_dpb_certInfoService;
    @Autowired
    private ADST_DPB_DROKInfoService adst_dpb_drokInfoService;
    @Autowired
    private ADST_DPB_GYULInfoService adst_dpb_gyulInfoService;
    @Autowired
    private ADST_DPB_HEJIInfoService adst_dpb_hejiInfoService;
    @Autowired
    private ADST_DPB_HISInfoService adst_dpb_hisInfoService;
    @Autowired
    private ADST_DPB_INFOInfoService adst_dpb_infoInfoService;
    @Autowired
    private ADST_DPB_INRTInfoService adst_dpb_inrtInfoService;
    @Autowired
    private ADST_DPB_INTMInfoService adst_dpb_intmInfoService;
    @Autowired
    private ADST_DPB_TRANInfoService adst_dpb_tranInfoService;
    @Autowired
    private ADST_DPB_YEDEInfoService adst_dpb_yedeInfoService;
    @Autowired
    private ADST_LNB_AGRInfoService adst_lnb_agrInfoService;
    @Autowired
    private ADST_LNB_BASEInfoService adst_lnb_baseInfoService;
    @Autowired
    private ADST_LNB_FEEInfoService adst_lnb_feeInfoService;
    @Autowired
    private ADST_LNB_HISInfoService adst_lnb_hisInfoService;
    @Autowired
    private ADST_LNB_INTInfoService adst_lnb_intInfoService;
    @Autowired
    private ADST_LNB_ITMInfoService adst_lnb_itmInfoService;
    @Autowired
    private ADST_LNB_REPAYInfoService adst_lnb_repayInfoService;
    @Autowired
    private ADST_LNB_SCHInfoService adst_lnb_schInfoService;
    @Autowired
    private AFEX_ADH_AMENDInfoService afex_adh_amendInfoService;
    @Autowired
    private AFEX_ADH_BASEInfoService afex_adh_baseInfoService;
    @Autowired
    private AFEX_ADH_HISInfoService afex_adh_hisInfoService;
    @Autowired
    private AFEX_ADH_ITMInfoService afex_adh_itmInfoService;
    @Autowired
    private AFEX_BFH_BASEInfoService afex_bfh_baseInfoService;
    @Autowired
    private AFEX_BFH_HISInfoService afex_bfh_hisInfoService;
    @Autowired
    private AFEX_BFH_PAYInfoService afex_bfh_payInfoService;
    @Autowired
    private AFEX_IPB_AMDInfoService afex_ipb_amdInfoService;
    @Autowired
    private AFEX_IPB_BASEInfoService afex_ipb_baseInfoService;
    @Autowired
    private AFEX_IPB_BLDInfoService afex_ipb_bldInfoService;
    @Autowired
    private AFEX_IPB_BLKInfoService afex_ipb_blkInfoService;
    @Autowired
    private AFEX_IPB_BOJInfoService afex_ipb_bojInfoService;
    @Autowired
    private AFEX_IPB_DJBInfoService afex_ipb_djbInfoService;
    @Autowired
    private AFEX_IPB_DJHInfoService afex_ipb_djhInfoService;
    @Autowired
    private AFEX_IPB_LGMInfoService afex_ipb_lgmInfoService;
    @Autowired
    private AFEX_IPH_AMDInfoService afex_iph_amdInfoService;
    @Autowired
    private AFEX_IPH_ATAGInfoService afex_iph_atagInfoService;
    @Autowired
    private AFEX_IPH_BASEInfoService afex_iph_baseInfoService;
    @Autowired
    private AFEX_IPH_BTAGInfoService afex_iph_btagInfoService;
    @Autowired
    private AFEX_IPH_COVERInfoService afex_iph_coverInfoService;
    @Autowired
    private AFEX_IPH_HISInfoService afex_iph_hisInfoService;
    @Autowired
    private AFEX_RCH_BALInfoService afex_rch_balInfoService;
    @Autowired
    private AFEX_RCH_BASEInfoService afex_rch_baseInfoService;
    @Autowired
    private AFEX_RCH_PENDInfoService afex_rch_pendInfoService;
    @Autowired
    private AFEX_RCH_RECONInfoService afex_rch_reconInfoService;
    @Autowired
    private AFEX_RCH_SEQNOInfoService afex_rch_seqnoInfoService;
    @Autowired
    private AFEX_RCH_TRANInfoService afex_rch_tranInfoService;
    @Autowired
    private AFEX_RCH_VOSTROInfoService afex_rch_vostroInfoService;
    @Autowired
    private AFEX_RIH_BASEInfoService afex_rih_baseInfoService;
    @Autowired
    private AFEX_RIH_HISInfoService afex_rih_hisInfoService;
    @Autowired
    private AFEX_RIH_REFUNDInfoService afex_rih_refundInfoService;
    @Autowired
    private AFEX_ROB_AMDInfoService afex_rob_amdInfoService;
    @Autowired
    private AFEX_ROH_BASEInfoService afex_roh_baseInfoService;
    @Autowired
    private AFEX_ROH_HISInfoService afex_roh_hisInfoService;
    @Autowired
    private AFEX_RTB_BASEInfoService afex_rtb_baseInfoService;
    @Autowired
    private AFEX_RTB_HISInfoService afex_rtb_hisInfoService;
    @Autowired
    private AFEX_RTB_HSSInfoService afex_rtb_hssInfoService;
    @Autowired
    private AFEX_XPB_ADVInfoService afex_xpb_advInfoService;
    @Autowired
    private AFEX_XPB_AMDInfoService afex_xpb_amdInfoService;
    @Autowired
    private AFEX_XPB_BASEInfoService afex_xpb_baseInfoService;
    @Autowired
    private AFEX_XPB_BDMInfoService afex_xpb_bdmInfoService;
    @Autowired
    private AFEX_XPB_BDSInfoService afex_xpb_bdsInfoService;
    @Autowired
    private AFEX_XPB_HISInfoService afex_xpb_hisInfoService;
    @Autowired
    private AFEX_XPB_ITMInfoService afex_xpb_itmInfoService;
    @Autowired
    private AFEX_XPB_LGMInfoService afex_xpb_lgmInfoService;
    @Autowired
    private AFEX_XPB_RENEDTInfoService afex_xpb_renedtInfoService;
    @Autowired
    private AFEX_XPH_CAInfoService afex_xph_caInfoService;
    @Autowired
    private AFEX_XPH_COVERInfoService afex_xph_coverInfoService;
    @Autowired
    private AFEX_XPH_COVER_RESENDInfoService afex_xph_cover_resendInfoService;
    @Autowired
    private AFEX_XPH_RENEGOInfoService afex_xph_renegoInfoService;
    @Autowired
    private AFEX_XPH_SHIPInfoService afex_xph_shipInfoService;
    @Autowired
    private AFEX_XPH_SHIP_RESENDInfoService afex_xph_ship_resendInfoService;
    @Autowired
    private AFEX_XPH_TRAInfoService afex_xph_traInfoService;
    @Autowired
    private AFIF_FEH_BASEInfoService afif_feh_baseInfoService;
    @Autowired
    private AFIF_FEH_HISInfoService afif_feh_hisInfoService;
    @Autowired
    private AFIF_MMH_BASEInfoService afif_mmh_baseInfoService;
    @Autowired
    private AFIF_MMH_HISInfoService afif_mmh_hisInfoService;
    @Autowired
    private AFIF_MTH_BASEInfoService afif_mth_baseInfoService;
    @Autowired
    private AFIF_MTH_HISInfoService afif_mth_hisInfoService;
    @Autowired
    private AFTR_FFH_COMM_TRSC_PTCLInfoService aftr_ffh_comm_trsc_ptclInfoService;
    @Autowired
    private CheckUpdateService checkUpdateService;

    @GetMapping(value = "/worker")
//    @Scheduled(cron = "0 0 7,12 * * *")
    public ResponseEntity<?> worker() throws IOException {
        String dataPath = pathConfig.getDataPath();
        String backupPath = pathConfig.getBackupPath();
        //Move file to Backup Folder
        List<String> files = FileUtils.getFilesDirectory(dataPath);
        for (String file : files) {
            File file1 = new File(file);
            if (file1.getName().endsWith(".chk")){
                FileUtils.deleteFile(file1);
            }
            FileUtils.moveFile(dataPath, backupPath, file1.getName());
            // Rename File .dat . Not YYYYMMDD
            if (file1.getName().endsWith(".dat")) {
                File newFile = new File(dataPath + "\\" + file1.getName().substring(0, file1.getName().length() - 13) + ".dat");
                if (file1.renameTo(newFile)) {
                    System.out.println("Rename from " + file1.getName() + " to " + newFile.getName() + " done");
                } else {
                    System.out.println("Fail to rename file " + file1.getName());
                }
            }
        }
        //Import Data
        importDB();
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/generate")
    public ResponseEntity<?> parsingFile() throws IOException {
        String sqlPath = pathConfig.getSqlPath();
        List<String> sqlFiles = config.getSql();
        //Creating a File object for directory
        File directoryPath = new File(sqlPath);
        //List of all files and directories
        File[] filesList = directoryPath.listFiles();
        assert filesList != null;
        for (File file : filesList) {
            if (!file.getName().endsWith(".sql")) {
                continue;
            }
            if (!sqlFiles.contains(file.getName().replace(".sql", ""))) {
                continue;
            }
            Map<Integer, String> listFields = GenerateUtils.convertFileToObject(file);
            Map<Integer, String> primaryKeyMap = GenerateUtils.findPrimaryKeys(file);
            GenerateUtils.buildModel(file.getName(), listFields);
            GenerateUtils.buildDomain(file.getName(), listFields, file);
            GenerateUtils.buildDomainsID(file.getName(), primaryKeyMap);
            GenerateUtils.buildRepository(file);
            GenerateUtils.buildServices(file);
            GenerateUtils.buildServiceImpl(file.getName(), listFields, primaryKeyMap);
        }
        return new ResponseEntity<>("Build success", HttpStatus.OK);
    }

    public void importDB() throws IOException {
        aact_trx_balInfoService.updateAll();
        aact_trx_baseInfoService.updateAll();
        aact_trx_bsInfoService.updateAll();
        aact_trx_plInfoService.updateAll();
        acom_atb_applyInfoService.updateAll();
        acom_atb_baseInfoService.updateAll();
        acom_cix_baseInfoService.updateAll();
        acom_cix_localInfoService.updateAll();
        acom_comh_msgInfoService.updateAll();
        acom_comh_msghisInfoService.updateAll();
        acom_comh_taglineInfoService.updateAll();
        acom_comh_userInfoService.updateAll();
        acom_com_actcdInfoService.updateAll();
        acom_com_allowInfoService.updateAll();
        acom_com_ccyInfoService.updateAll();
        acom_com_feertInfoService.updateAll();
        acom_com_fpbodyInfoService.updateAll();
        acom_com_fpheadInfoService.updateAll();
        acom_com_voucherInfoService.updateAll();
        acom_cont_baseInfoService.updateAll();
        acom_dmh_allocInfoService.updateAll();
        acom_dmh_allochisInfoService.updateAll();
        acom_dmh_baseInfoService.updateAll();
        acom_dmh_hisInfoService.updateAll();
        acom_dtg_cont_stsInfoService.updateAll();
        acom_dtg_napas_hisInfoService.updateAll();
        acom_dtg_napas_reconInfoService.updateAll();
        acom_epb_baseInfoService.updateAll();
        acom_epb_hisInfoService.updateAll();
        acom_epb_itmInfoService.updateAll();
        acom_epb_rptInfoService.updateAll();
        acom_fab_hisInfoService.updateAll();
        acom_fab_itmInfoService.updateAll();
        acom_lmt_baseactInfoService.updateAll();
        acom_lmt_basehdInfoService.updateAll();
        acom_lmt_basehisInfoService.updateAll();
        acom_lmt_bojInfoService.updateAll();
        acom_lmt_clmitInfoService.updateAll();
        acom_lmt_itmInfoService.updateAll();
        acom_lmt_silInfoService.updateAll();
        acom_lmt_silhisInfoService.updateAll();
        adst_dpb_baseInfoService.updateAll();
        adst_dpb_buriInfoService.updateAll();
        adst_dpb_certInfoService.updateAll();
        adst_dpb_drokInfoService.updateAll();
        adst_dpb_gyulInfoService.updateAll();
        adst_dpb_hejiInfoService.updateAll();
        adst_dpb_hisInfoService.updateAll();
        adst_dpb_infoInfoService.updateAll();
        adst_dpb_inrtInfoService.updateAll();
        adst_dpb_intmInfoService.updateAll();
        adst_dpb_tranInfoService.updateAll();
        adst_dpb_yedeInfoService.updateAll();
        adst_lnb_agrInfoService.updateAll();
        adst_lnb_baseInfoService.updateAll();
        adst_lnb_feeInfoService.updateAll();
        adst_lnb_hisInfoService.updateAll();
        adst_lnb_intInfoService.updateAll();
        adst_lnb_itmInfoService.updateAll();
        adst_lnb_repayInfoService.updateAll();
        adst_lnb_schInfoService.updateAll();
        afex_adh_amendInfoService.updateAll();
        afex_adh_baseInfoService.updateAll();
        afex_adh_hisInfoService.updateAll();
        afex_adh_itmInfoService.updateAll();
        afex_bfh_baseInfoService.updateAll();
        afex_bfh_hisInfoService.updateAll();
        afex_bfh_payInfoService.updateAll();
        afex_ipb_amdInfoService.updateAll();
        afex_ipb_baseInfoService.updateAll();
        afex_ipb_bldInfoService.updateAll();
        afex_ipb_blkInfoService.updateAll();
        afex_ipb_bojInfoService.updateAll();
        afex_ipb_djbInfoService.updateAll();
        afex_ipb_djhInfoService.updateAll();
        afex_ipb_lgmInfoService.updateAll();
        afex_iph_amdInfoService.updateAll();
        afex_iph_atagInfoService.updateAll();
        afex_iph_baseInfoService.updateAll();
        afex_iph_btagInfoService.updateAll();
        afex_iph_coverInfoService.updateAll();
        afex_iph_hisInfoService.updateAll();
        afex_rch_balInfoService.updateAll();
        afex_rch_baseInfoService.updateAll();
        afex_rch_pendInfoService.updateAll();
        afex_rch_reconInfoService.updateAll();
        afex_rch_seqnoInfoService.updateAll();
        afex_rch_tranInfoService.updateAll();
        afex_rch_vostroInfoService.updateAll();
        afex_rih_baseInfoService.updateAll();
        afex_rih_hisInfoService.updateAll();
        afex_rih_refundInfoService.updateAll();
        afex_rob_amdInfoService.updateAll();
        afex_roh_baseInfoService.updateAll();
        afex_roh_hisInfoService.updateAll();
        afex_rtb_baseInfoService.updateAll();
        afex_rtb_hisInfoService.updateAll();
        afex_rtb_hssInfoService.updateAll();
        afex_xpb_advInfoService.updateAll();
        afex_xpb_amdInfoService.updateAll();
        afex_xpb_baseInfoService.updateAll();
        afex_xpb_bdmInfoService.updateAll();
        afex_xpb_bdsInfoService.updateAll();
        afex_xpb_hisInfoService.updateAll();
        afex_xpb_itmInfoService.updateAll();
        afex_xpb_lgmInfoService.updateAll();
        afex_xpb_renedtInfoService.updateAll();
        afex_xph_caInfoService.updateAll();
        afex_xph_coverInfoService.updateAll();
        afex_xph_cover_resendInfoService.updateAll();
        afex_xph_renegoInfoService.updateAll();
        afex_xph_shipInfoService.updateAll();
        afex_xph_ship_resendInfoService.updateAll();
        afex_xph_traInfoService.updateAll();
        afif_feh_baseInfoService.updateAll();
        afif_feh_hisInfoService.updateAll();
        afif_mmh_baseInfoService.updateAll();
        afif_mmh_hisInfoService.updateAll();
        afif_mth_baseInfoService.updateAll();
        afif_mth_hisInfoService.updateAll();
        aftr_ffh_comm_trsc_ptclInfoService.updateAll();
    }
}
