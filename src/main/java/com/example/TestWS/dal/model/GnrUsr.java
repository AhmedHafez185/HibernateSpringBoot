/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="gnr_usr")
@NamedQuery(name="GnrUsr.findAll", query="SELECT g FROM GnrUsr g")
public class GnrUsr implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="usr_no")
	private long usrNo;

	@Column(name="e_mail")
	private String eMail;

	@Temporal(TemporalType.DATE)
	@Column(name="f_date_effct")
	private Date fDateEffct;

	@Temporal(TemporalType.DATE)
	@Column(name="f_time_effct")
	private Date fTimeEffct;

	@Column(name="hrchy_code")
	private String hrchyCode;

	@Column(name="img_nm")
	private String imgNm;

	@Temporal(TemporalType.DATE)
	@Column(name="inactv_date")
	private Date inactvDate;

	@Column(name="inactv_dsc")
	private String inactvDsc;

	@Column(name="inactv_flg")
	private Integer inactvFlg;

	@Column(name="inactv_usr_no")
	private BigDecimal inactvUsrNo;

	@Column(name="mobile_no")
	private String mobileNo;

	@Temporal(TemporalType.DATE)
	@Column(name="t_date_effct")
	private Date tDateEffct;

	@Temporal(TemporalType.DATE)
	@Column(name="t_time_effct")
	private Date tTimeEffct;

	@Column(name="usr_code")
	private String usrCode;

	@Column(name="usr_f_nm")
	private String usrFNm;

	@Column(name="usr_l_nm")
	private String usrLNm;

	@Column(name="usr_no_mngr")
	private BigDecimal usrNoMngr;

	@Column(name="usr_pswrd")
	private String usrPswrd;

	public GnrUsr() {
	}

	public long getUsrNo() {
		return this.usrNo;
	}

	public void setUsrNo(long usrNo) {
		this.usrNo = usrNo;
	}

	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getFDateEffct() {
		return this.fDateEffct;
	}

	public void setFDateEffct(Date fDateEffct) {
		this.fDateEffct = fDateEffct;
	}

	public Date getFTimeEffct() {
		return this.fTimeEffct;
	}

	public void setFTimeEffct(Date fTimeEffct) {
		this.fTimeEffct = fTimeEffct;
	}

	public String getHrchyCode() {
		return this.hrchyCode;
	}

	public void setHrchyCode(String hrchyCode) {
		this.hrchyCode = hrchyCode;
	}

	public String getImgNm() {
		return this.imgNm;
	}

	public void setImgNm(String imgNm) {
		this.imgNm = imgNm;
	}

	public Date getInactvDate() {
		return this.inactvDate;
	}

	public void setInactvDate(Date inactvDate) {
		this.inactvDate = inactvDate;
	}

	public String getInactvDsc() {
		return this.inactvDsc;
	}

	public void setInactvDsc(String inactvDsc) {
		this.inactvDsc = inactvDsc;
	}

	public Integer getInactvFlg() {
		return this.inactvFlg;
	}

	public void setInactvFlg(Integer inactvFlg) {
		this.inactvFlg = inactvFlg;
	}

	public BigDecimal getInactvUsrNo() {
		return this.inactvUsrNo;
	}

	public void setInactvUsrNo(BigDecimal inactvUsrNo) {
		this.inactvUsrNo = inactvUsrNo;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getTDateEffct() {
		return this.tDateEffct;
	}

	public void setTDateEffct(Date tDateEffct) {
		this.tDateEffct = tDateEffct;
	}

	public Date getTTimeEffct() {
		return this.tTimeEffct;
	}

	public void setTTimeEffct(Date tTimeEffct) {
		this.tTimeEffct = tTimeEffct;
	}

	public String getUsrCode() {
		return this.usrCode;
	}

	public void setUsrCode(String usrCode) {
		this.usrCode = usrCode;
	}

	public String getUsrFNm() {
		return this.usrFNm;
	}

	public void setUsrFNm(String usrFNm) {
		this.usrFNm = usrFNm;
	}

	public String getUsrLNm() {
		return this.usrLNm;
	}

	public void setUsrLNm(String usrLNm) {
		this.usrLNm = usrLNm;
	}

	public BigDecimal getUsrNoMngr() {
		return this.usrNoMngr;
	}

	public void setUsrNoMngr(BigDecimal usrNoMngr) {
		this.usrNoMngr = usrNoMngr;
	}

	public String getUsrPswrd() {
		return this.usrPswrd;
	}

	public void setUsrPswrd(String usrPswrd) {
		this.usrPswrd = usrPswrd;
	}

    @Override
    public String toString() {
        return "GnrUsr{" + "usrNo=" + usrNo + ", hrchyCode=" + hrchyCode + ", usrFNm=" + usrFNm + ", usrLNm=" + usrLNm + ", usrNoMngr=" + usrNoMngr + ", usrPswrd=" + usrPswrd + '}';
    }
        

}