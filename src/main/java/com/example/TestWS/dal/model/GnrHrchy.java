/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.model;

/**
 *
 * @author HP
 */
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="gnr_hrchy")
@NamedQuery(name="GnrHrchy.findAll", query="SELECT g FROM GnrHrchy g")
public class GnrHrchy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hrchy_code")
	private String hrchyCode;

	@Column(name="hrchy_code_parnt")
	private String hrchyCodeParnt;

	@Column(name="hrchy_f_nm")
	private String hrchyFNm;

	@Column(name="hrchy_l_nm")
	private String hrchyLNm;

	@Column(name="hrchy_typ")
	private BigDecimal hrchyTyp;

	@Temporal(TemporalType.DATE)
	@Column(name="inactv_date")
	private Date inactvDate;

	@Column(name="inactv_dsc")
	private String inactvDsc;

	@Column(name="inactv_flg")
	private Integer inactvFlg;

	@Column(name="inactv_usr_no")
	private BigDecimal inactvUsrNo;

	@Column(name="lvl_no")
	private Integer lvlNo;

	public GnrHrchy() {
	}

	public String getHrchyCode() {
		return this.hrchyCode;
	}

	public void setHrchyCode(String hrchyCode) {
		this.hrchyCode = hrchyCode;
	}

	public String getHrchyCodeParnt() {
		return this.hrchyCodeParnt;
	}

	public void setHrchyCodeParnt(String hrchyCodeParnt) {
		this.hrchyCodeParnt = hrchyCodeParnt;
	}

	public String getHrchyFNm() {
		return this.hrchyFNm;
	}

	public void setHrchyFNm(String hrchyFNm) {
		this.hrchyFNm = hrchyFNm;
	}

	public String getHrchyLNm() {
		return this.hrchyLNm;
	}

	public void setHrchyLNm(String hrchyLNm) {
		this.hrchyLNm = hrchyLNm;
	}

	public BigDecimal getHrchyTyp() {
		return this.hrchyTyp;
	}

	public void setHrchyTyp(BigDecimal hrchyTyp) {
		this.hrchyTyp = hrchyTyp;
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

	public Integer getLvlNo() {
		return this.lvlNo;
	}

	public void setLvlNo(Integer lvlNo) {
		this.lvlNo = lvlNo;
	}

}