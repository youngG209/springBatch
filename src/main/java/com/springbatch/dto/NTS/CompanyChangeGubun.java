package com.springbatch.dto.NTS;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CompanyChangeGubun implements Serializable {

    private static final long serialVersionUID = -2473086732411199008L;

    private String changeGubunSeq;
    private String companyId;
    private String registNum;
    private String modCode;
    private String changeGubun;
    private String bfStartYmd;
    private String bfEndYmd;
    private String afStartYmd;
    private String afEndYmd;
    private String changeGubunDate;
    private String changeDateYn;

    public String getChangeGubunSeq() {
        return changeGubunSeq;
    }

    public void setChangeGubunSeq(String changeGubunSeq) {
        this.changeGubunSeq = changeGubunSeq;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getRegistNum() {
        return registNum;
    }

    public void setRegistNum(String registNum) {
        this.registNum = registNum;
    }

    public String getModCode() {
        return modCode;
    }

    public void setModCode(String modCode) {
        this.modCode = modCode;
    }

    public String getChangeGubun() {
        return changeGubun;
    }

    public void setChangeGubun(String changeGubun) {
        this.changeGubun = changeGubun;
    }

    public String getBfStartYmd() {
        return bfStartYmd;
    }

    public void setBfStartYmd(String bfStartYmd) {
        this.bfStartYmd = bfStartYmd;
    }

    public String getBfEndYmd() {
        return bfEndYmd;
    }

    public void setBfEndYmd(String bfEndYmd) {
        this.bfEndYmd = bfEndYmd;
    }

    public String getAfStartYmd() {
        return afStartYmd;
    }

    public void setAfStartYmd(String afStartYmd) {
        this.afStartYmd = afStartYmd;
    }

    public String getAfEndYmd() {
        return afEndYmd;
    }

    public void setAfEndYmd(String afEndYmd) {
        this.afEndYmd = afEndYmd;
    }

    public String getChangeGubunDate() {
        return changeGubunDate;
    }

    public void setChangeGubunDate(String changeGubunDate) {
        this.changeGubunDate = changeGubunDate;
    }

    public String getChangeDateYn() {
        return changeDateYn;
    }

    public void setChangeDateYn(String changeDateYn) {
        this.changeDateYn = changeDateYn;
    }
}
