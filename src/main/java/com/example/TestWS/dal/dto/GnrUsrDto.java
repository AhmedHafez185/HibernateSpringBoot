/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author HP
 */
public class GnrUsrDto {
    

	private long usrNo;

	private String eMail;

	private Date fDateEffct;


	private Date fTimeEffct;

	private String hrchyCode;
	private String imgNm;


	private Date inactvDate;

	private String inactvDsc;

	private Integer inactvFlg;

	private BigDecimal inactvUsrNo;

	private String mobileNo;

	private Date tDateEffct;


	private Date tTimeEffct;

	private String usrCode;

	private String usrFNm;

	private String usrLNm;

	private BigDecimal usrNoMngr;

	private String usrPswrd;

    public GnrUsrDto() {
    }
        

    public long getUsrNo() {
        return usrNo;
    }

    public void setUsrNo(long usrNo) {
        this.usrNo = usrNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Date getfDateEffct() {
        return fDateEffct;
    }

    public void setfDateEffct(Date fDateEffct) {
        this.fDateEffct = fDateEffct;
    }

    public Date getfTimeEffct() {
        return fTimeEffct;
    }

    public void setfTimeEffct(Date fTimeEffct) {
        this.fTimeEffct = fTimeEffct;
    }

    public String getHrchyCode() {
        return hrchyCode;
    }

    public void setHrchyCode(String hrchyCode) {
        this.hrchyCode = hrchyCode;
    }

    public String getImgNm() {
        return imgNm;
    }

    public void setImgNm(String imgNm) {
        this.imgNm = imgNm;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date gettDateEffct() {
        return tDateEffct;
    }

    public void settDateEffct(Date tDateEffct) {
        this.tDateEffct = tDateEffct;
    }

    public Date gettTimeEffct() {
        return tTimeEffct;
    }

    public void settTimeEffct(Date tTimeEffct) {
        this.tTimeEffct = tTimeEffct;
    }

    public String getUsrCode() {
        return usrCode;
    }

    public void setUsrCode(String usrCode) {
        this.usrCode = usrCode;
    }

    public String getUsrFNm() {
        return usrFNm;
    }

    public void setUsrFNm(String usrFNm) {
        this.usrFNm = usrFNm;
    }

    public String getUsrLNm() {
        return usrLNm;
    }

    public void setUsrLNm(String usrLNm) {
        this.usrLNm = usrLNm;
    }

    public BigDecimal getUsrNoMngr() {
        return usrNoMngr;
    }

    public void setUsrNoMngr(BigDecimal usrNoMngr) {
        this.usrNoMngr = usrNoMngr;
    }

    public String getUsrPswrd() {
        return usrPswrd;
    }

    public void setUsrPswrd(String usrPswrd) {
        this.usrPswrd = usrPswrd;
    }
    
        
    
}
