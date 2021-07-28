/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.dto;

import com.example.TestWS.dal.model.GnrHrchy;
import com.example.TestWS.dal.model.GnrUsr;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP
 */
public class GnrHrchDto {

    private String hrchyCode;

    private String hrchyCodeParnt;

    private String hrchyFNm;

    private String hrchyLNm;

    private BigDecimal hrchyTyp;

    private Date inactvDate;

    private String inactvDsc;

    private Integer inactvFlg;

    private BigDecimal inactvUsrNo;

    private Integer lvlNo;

    public GnrHrchDto() {
    }
    

    public String getHrchyCode() {
        return hrchyCode;
    }

    public void setHrchyCode(String hrchyCode) {
        this.hrchyCode = hrchyCode;
    }

    public String getHrchyCodeParnt() {
        return hrchyCodeParnt;
    }

    public void setHrchyCodeParnt(String hrchyCodeParnt) {
        this.hrchyCodeParnt = hrchyCodeParnt;
    }

    public String getHrchyFNm() {
        return hrchyFNm;
    }

    public void setHrchyFNm(String hrchyFNm) {
        this.hrchyFNm = hrchyFNm;
    }

    public String getHrchyLNm() {
        return hrchyLNm;
    }

    public void setHrchyLNm(String hrchyLNm) {
        this.hrchyLNm = hrchyLNm;
    }

    public BigDecimal getHrchyTyp() {
        return hrchyTyp;
    }

    public void setHrchyTyp(BigDecimal hrchyTyp) {
        this.hrchyTyp = hrchyTyp;
    }

    public Date getInactvDate() {
        return inactvDate;
    }

    public void setInactvDate(Date inactvDate) {
        this.inactvDate = inactvDate;
    }

    public String getInactvDsc() {
        return inactvDsc;
    }

    public void setInactvDsc(String inactvDsc) {
        this.inactvDsc = inactvDsc;
    }

    public Integer getInactvFlg() {
        return inactvFlg;
    }

    public void setInactvFlg(Integer inactvFlg) {
        this.inactvFlg = inactvFlg;
    }

    public BigDecimal getInactvUsrNo() {
        return inactvUsrNo;
    }

    public void setInactvUsrNo(BigDecimal inactvUsrNo) {
        this.inactvUsrNo = inactvUsrNo;
    }

    public Integer getLvlNo() {
        return lvlNo;
    }

    public void setLvlNo(Integer lvlNo) {
        this.lvlNo = lvlNo;
    }
    
}
