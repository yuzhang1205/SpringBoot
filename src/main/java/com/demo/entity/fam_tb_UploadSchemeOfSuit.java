package com.demo.entity;

import java.util.Date;

public class fam_tb_UploadSchemeOfSuit {
    private Integer id;

    private Integer taskid;

    private String Package;

    private Date begindate;

    private Integer seqno;

    private String plnid;

    private Date createtime;

    private String creator;

    private Date modifytime;

    private String modifier;

    private Boolean ismanual;

    private String contractno;

    private String ordercity;

    private String city;

    private String adcustomer;

    private String adproduct;

    private String adcontent;

    private String adstyle;

    private String adproperty;

    private String adtype;

    private String adlength;

    private Short adfrequency;

    private Short weekfrequency;

    private Date starttime;

    private Date endtime;

    private Short uploadstate;

    private String uploadtor;

    private Date uploadtime;

    private Integer publishid;

    private String pbverno;

    private String fsocityno;

    private String fsopackageno;

    private Short fromtype;

    private Short basefrequency;

    private Short auditstate;

    private String auditremark;

    private String auditor;

    private Date audittime;

    private Short meijieauditstate;

    private String meijieauditremark;

    private String meijieauditor;

    private Date meijieaudittime;

    private String meijieunauditremark;

    private String meijieunauditor;

    private Date meijieunaudittime;

    private Short zhizuoauditstate;

    private String zhizuoauditremark;

    private String zhizuoauditor;

    private Date zhizuoaudittime;

    private String bysystem;

    private String cityno;

    private String packageno;

    private String adtypeno;

    private Integer framediacount;

    private String position;

    private String productattibute;

    private Short isbuqi;

    private String district;

    private Date fsostarttime;

    private Date fsoendtime;

    private Integer seqnobak;

    private Integer forbidcnt;

    private Integer excludeframediacnt;

    private Integer designationframediacnt;

    private Integer auditbuildframediacnt;

    private String producttype;

    private Date uploadframediacounttime;

    private String lcdplnid;

    private String productplaytype;

    private String inproportion;

    private Integer copyrecord;

    private Integer a2copyd3flag;

    private Integer onlineinplay;

    private Integer modifyadfrequency;

    private String ctradcontent;

    private String selfunion;

    private String selfauder;

    private Integer screentype;

    private Integer fromtypeSource;

    private Integer playpicseqno;

    private Date zhizuofinishtime;

    private Integer zhizuofinishflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getPackage() {
        return Package;
    }

    public void setPackage(String Package) {
        this.Package = Package == null ? null : Package.trim();
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getPlnid() {
        return plnid;
    }

    public void setPlnid(String plnid) {
        this.plnid = plnid == null ? null : plnid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Boolean getIsmanual() {
        return ismanual;
    }

    public void setIsmanual(Boolean ismanual) {
        this.ismanual = ismanual;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public String getOrdercity() {
        return ordercity;
    }

    public void setOrdercity(String ordercity) {
        this.ordercity = ordercity == null ? null : ordercity.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAdcustomer() {
        return adcustomer;
    }

    public void setAdcustomer(String adcustomer) {
        this.adcustomer = adcustomer == null ? null : adcustomer.trim();
    }

    public String getAdproduct() {
        return adproduct;
    }

    public void setAdproduct(String adproduct) {
        this.adproduct = adproduct == null ? null : adproduct.trim();
    }

    public String getAdcontent() {
        return adcontent;
    }

    public void setAdcontent(String adcontent) {
        this.adcontent = adcontent == null ? null : adcontent.trim();
    }

    public String getAdstyle() {
        return adstyle;
    }

    public void setAdstyle(String adstyle) {
        this.adstyle = adstyle == null ? null : adstyle.trim();
    }

    public String getAdproperty() {
        return adproperty;
    }

    public void setAdproperty(String adproperty) {
        this.adproperty = adproperty == null ? null : adproperty.trim();
    }

    public String getAdtype() {
        return adtype;
    }

    public void setAdtype(String adtype) {
        this.adtype = adtype == null ? null : adtype.trim();
    }

    public String getAdlength() {
        return adlength;
    }

    public void setAdlength(String adlength) {
        this.adlength = adlength == null ? null : adlength.trim();
    }

    public Short getAdfrequency() {
        return adfrequency;
    }

    public void setAdfrequency(Short adfrequency) {
        this.adfrequency = adfrequency;
    }

    public Short getWeekfrequency() {
        return weekfrequency;
    }

    public void setWeekfrequency(Short weekfrequency) {
        this.weekfrequency = weekfrequency;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Short getUploadstate() {
        return uploadstate;
    }

    public void setUploadstate(Short uploadstate) {
        this.uploadstate = uploadstate;
    }

    public String getUploadtor() {
        return uploadtor;
    }

    public void setUploadtor(String uploadtor) {
        this.uploadtor = uploadtor == null ? null : uploadtor.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getPublishid() {
        return publishid;
    }

    public void setPublishid(Integer publishid) {
        this.publishid = publishid;
    }

    public String getPbverno() {
        return pbverno;
    }

    public void setPbverno(String pbverno) {
        this.pbverno = pbverno == null ? null : pbverno.trim();
    }

    public String getFsocityno() {
        return fsocityno;
    }

    public void setFsocityno(String fsocityno) {
        this.fsocityno = fsocityno == null ? null : fsocityno.trim();
    }

    public String getFsopackageno() {
        return fsopackageno;
    }

    public void setFsopackageno(String fsopackageno) {
        this.fsopackageno = fsopackageno == null ? null : fsopackageno.trim();
    }

    public Short getFromtype() {
        return fromtype;
    }

    public void setFromtype(Short fromtype) {
        this.fromtype = fromtype;
    }

    public Short getBasefrequency() {
        return basefrequency;
    }

    public void setBasefrequency(Short basefrequency) {
        this.basefrequency = basefrequency;
    }

    public Short getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(Short auditstate) {
        this.auditstate = auditstate;
    }

    public String getAuditremark() {
        return auditremark;
    }

    public void setAuditremark(String auditremark) {
        this.auditremark = auditremark == null ? null : auditremark.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Short getMeijieauditstate() {
        return meijieauditstate;
    }

    public void setMeijieauditstate(Short meijieauditstate) {
        this.meijieauditstate = meijieauditstate;
    }

    public String getMeijieauditremark() {
        return meijieauditremark;
    }

    public void setMeijieauditremark(String meijieauditremark) {
        this.meijieauditremark = meijieauditremark == null ? null : meijieauditremark.trim();
    }

    public String getMeijieauditor() {
        return meijieauditor;
    }

    public void setMeijieauditor(String meijieauditor) {
        this.meijieauditor = meijieauditor == null ? null : meijieauditor.trim();
    }

    public Date getMeijieaudittime() {
        return meijieaudittime;
    }

    public void setMeijieaudittime(Date meijieaudittime) {
        this.meijieaudittime = meijieaudittime;
    }

    public String getMeijieunauditremark() {
        return meijieunauditremark;
    }

    public void setMeijieunauditremark(String meijieunauditremark) {
        this.meijieunauditremark = meijieunauditremark == null ? null : meijieunauditremark.trim();
    }

    public String getMeijieunauditor() {
        return meijieunauditor;
    }

    public void setMeijieunauditor(String meijieunauditor) {
        this.meijieunauditor = meijieunauditor == null ? null : meijieunauditor.trim();
    }

    public Date getMeijieunaudittime() {
        return meijieunaudittime;
    }

    public void setMeijieunaudittime(Date meijieunaudittime) {
        this.meijieunaudittime = meijieunaudittime;
    }

    public Short getZhizuoauditstate() {
        return zhizuoauditstate;
    }

    public void setZhizuoauditstate(Short zhizuoauditstate) {
        this.zhizuoauditstate = zhizuoauditstate;
    }

    public String getZhizuoauditremark() {
        return zhizuoauditremark;
    }

    public void setZhizuoauditremark(String zhizuoauditremark) {
        this.zhizuoauditremark = zhizuoauditremark == null ? null : zhizuoauditremark.trim();
    }

    public String getZhizuoauditor() {
        return zhizuoauditor;
    }

    public void setZhizuoauditor(String zhizuoauditor) {
        this.zhizuoauditor = zhizuoauditor == null ? null : zhizuoauditor.trim();
    }

    public Date getZhizuoaudittime() {
        return zhizuoaudittime;
    }

    public void setZhizuoaudittime(Date zhizuoaudittime) {
        this.zhizuoaudittime = zhizuoaudittime;
    }

    public String getBysystem() {
        return bysystem;
    }

    public void setBysystem(String bysystem) {
        this.bysystem = bysystem == null ? null : bysystem.trim();
    }

    public String getCityno() {
        return cityno;
    }

    public void setCityno(String cityno) {
        this.cityno = cityno == null ? null : cityno.trim();
    }

    public String getPackageno() {
        return packageno;
    }

    public void setPackageno(String packageno) {
        this.packageno = packageno == null ? null : packageno.trim();
    }

    public String getAdtypeno() {
        return adtypeno;
    }

    public void setAdtypeno(String adtypeno) {
        this.adtypeno = adtypeno == null ? null : adtypeno.trim();
    }

    public Integer getFramediacount() {
        return framediacount;
    }

    public void setFramediacount(Integer framediacount) {
        this.framediacount = framediacount;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getProductattibute() {
        return productattibute;
    }

    public void setProductattibute(String productattibute) {
        this.productattibute = productattibute == null ? null : productattibute.trim();
    }

    public Short getIsbuqi() {
        return isbuqi;
    }

    public void setIsbuqi(Short isbuqi) {
        this.isbuqi = isbuqi;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Date getFsostarttime() {
        return fsostarttime;
    }

    public void setFsostarttime(Date fsostarttime) {
        this.fsostarttime = fsostarttime;
    }

    public Date getFsoendtime() {
        return fsoendtime;
    }

    public void setFsoendtime(Date fsoendtime) {
        this.fsoendtime = fsoendtime;
    }

    public Integer getSeqnobak() {
        return seqnobak;
    }

    public void setSeqnobak(Integer seqnobak) {
        this.seqnobak = seqnobak;
    }

    public Integer getForbidcnt() {
        return forbidcnt;
    }

    public void setForbidcnt(Integer forbidcnt) {
        this.forbidcnt = forbidcnt;
    }

    public Integer getExcludeframediacnt() {
        return excludeframediacnt;
    }

    public void setExcludeframediacnt(Integer excludeframediacnt) {
        this.excludeframediacnt = excludeframediacnt;
    }

    public Integer getDesignationframediacnt() {
        return designationframediacnt;
    }

    public void setDesignationframediacnt(Integer designationframediacnt) {
        this.designationframediacnt = designationframediacnt;
    }

    public Integer getAuditbuildframediacnt() {
        return auditbuildframediacnt;
    }

    public void setAuditbuildframediacnt(Integer auditbuildframediacnt) {
        this.auditbuildframediacnt = auditbuildframediacnt;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public Date getUploadframediacounttime() {
        return uploadframediacounttime;
    }

    public void setUploadframediacounttime(Date uploadframediacounttime) {
        this.uploadframediacounttime = uploadframediacounttime;
    }

    public String getLcdplnid() {
        return lcdplnid;
    }

    public void setLcdplnid(String lcdplnid) {
        this.lcdplnid = lcdplnid == null ? null : lcdplnid.trim();
    }

    public String getProductplaytype() {
        return productplaytype;
    }

    public void setProductplaytype(String productplaytype) {
        this.productplaytype = productplaytype == null ? null : productplaytype.trim();
    }

    public String getInproportion() {
        return inproportion;
    }

    public void setInproportion(String inproportion) {
        this.inproportion = inproportion == null ? null : inproportion.trim();
    }

    public Integer getCopyrecord() {
        return copyrecord;
    }

    public void setCopyrecord(Integer copyrecord) {
        this.copyrecord = copyrecord;
    }

    public Integer getA2copyd3flag() {
        return a2copyd3flag;
    }

    public void setA2copyd3flag(Integer a2copyd3flag) {
        this.a2copyd3flag = a2copyd3flag;
    }

    public Integer getOnlineinplay() {
        return onlineinplay;
    }

    public void setOnlineinplay(Integer onlineinplay) {
        this.onlineinplay = onlineinplay;
    }

    public Integer getModifyadfrequency() {
        return modifyadfrequency;
    }

    public void setModifyadfrequency(Integer modifyadfrequency) {
        this.modifyadfrequency = modifyadfrequency;
    }

    public String getCtradcontent() {
        return ctradcontent;
    }

    public void setCtradcontent(String ctradcontent) {
        this.ctradcontent = ctradcontent == null ? null : ctradcontent.trim();
    }

    public String getSelfunion() {
        return selfunion;
    }

    public void setSelfunion(String selfunion) {
        this.selfunion = selfunion == null ? null : selfunion.trim();
    }

    public String getSelfauder() {
        return selfauder;
    }

    public void setSelfauder(String selfauder) {
        this.selfauder = selfauder == null ? null : selfauder.trim();
    }

    public Integer getScreentype() {
        return screentype;
    }

    public void setScreentype(Integer screentype) {
        this.screentype = screentype;
    }

    public Integer getFromtypeSource() {
        return fromtypeSource;
    }

    public void setFromtypeSource(Integer fromtypeSource) {
        this.fromtypeSource = fromtypeSource;
    }

    public Integer getPlaypicseqno() {
        return playpicseqno;
    }

    public void setPlaypicseqno(Integer playpicseqno) {
        this.playpicseqno = playpicseqno;
    }

    public Date getZhizuofinishtime() {
        return zhizuofinishtime;
    }

    public void setZhizuofinishtime(Date zhizuofinishtime) {
        this.zhizuofinishtime = zhizuofinishtime;
    }

    public Integer getZhizuofinishflag() {
        return zhizuofinishflag;
    }

    public void setZhizuofinishflag(Integer zhizuofinishflag) {
        this.zhizuofinishflag = zhizuofinishflag;
    }
}