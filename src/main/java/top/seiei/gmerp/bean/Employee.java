package top.seiei.gmerp.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class Employee implements Serializable {
    private String id;

    private String serialno;

    private Boolean del;

    private String buser;

    private Date btime;

    private String euser;

    private Date etime;

    private String code;

    private String name;

    private String typecode;

    private String mnemoniccode;

    private String memo;

    private String tel;

    private String phone;

    private String job;

    private String nativeplace;

    private Date birthdate;

    private String sex;

    private String address;

    private Date idhandledate;

    private Date idenddate;

    private String idno;

    private String education;

    private Date joindate;

    private Boolean married;

    private String zipcode;

    private String salarykind;

    private BigDecimal basicsalary;

    private Boolean isbank;

    private String accountno;

    private String joinroute;

    private Date positivedate;

    private Date contractdates;

    private Date contractdatee;

    private Date appleavedate;

    private Date leavedate;

    private String leavereason;

    private String firetype;

    private String linker;

    private String linkertel;

    private String linkerrelationship;

    private String linkeraddress;

    private String workstate;

    private String idcardno;

    private String nation;

    private String political;

    private String healthy;

    private String workgroup;

    private String workshop;

    private String worksite;

    private String workpos;

    private String sharegroup;

    private String workline;

    private String worktype;

    private String atype;

    private String contracttype;

    private String classes;

    private Date securitydates;

    private Date securitydatee;

    private String usetype;

    private String worklevel;

    private BigDecimal salarym;

    private BigDecimal salaryhour;

    private BigDecimal foodallowance;

    private BigDecimal otallowance;

    private BigDecimal efficiencyallowance;

    private BigDecimal bonus;

    private BigDecimal bonusper;

    private Boolean isperform;

    private Boolean isproduct;

    private Boolean isyearend;

    private Boolean ismeal;

    private Boolean islive;

    private Boolean isworkover;

    private String dept;

    private String marry;

    private Boolean istemporary;

    private BigDecimal performancesalary;

    private BigDecimal othersalary;

    private BigDecimal productrate;

    private BigDecimal positionbase;

    private Boolean checked;

    private String checker;

    private Date checkdate;

    private Boolean hrchanged;

    private byte[] img;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getBuser() {
        return buser;
    }

    public void setBuser(String buser) {
        this.buser = buser == null ? null : buser.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public String getEuser() {
        return euser;
    }

    public void setEuser(String euser) {
        this.euser = euser == null ? null : euser.trim();
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getMnemoniccode() {
        return mnemoniccode;
    }

    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getIdhandledate() {
        return idhandledate;
    }

    public void setIdhandledate(Date idhandledate) {
        this.idhandledate = idhandledate;
    }

    public Date getIdenddate() {
        return idenddate;
    }

    public void setIdenddate(Date idenddate) {
        this.idenddate = idenddate;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getSalarykind() {
        return salarykind;
    }

    public void setSalarykind(String salarykind) {
        this.salarykind = salarykind == null ? null : salarykind.trim();
    }

    public BigDecimal getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(BigDecimal basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Boolean getIsbank() {
        return isbank;
    }

    public void setIsbank(Boolean isbank) {
        this.isbank = isbank;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getJoinroute() {
        return joinroute;
    }

    public void setJoinroute(String joinroute) {
        this.joinroute = joinroute == null ? null : joinroute.trim();
    }

    public Date getPositivedate() {
        return positivedate;
    }

    public void setPositivedate(Date positivedate) {
        this.positivedate = positivedate;
    }

    public Date getContractdates() {
        return contractdates;
    }

    public void setContractdates(Date contractdates) {
        this.contractdates = contractdates;
    }

    public Date getContractdatee() {
        return contractdatee;
    }

    public void setContractdatee(Date contractdatee) {
        this.contractdatee = contractdatee;
    }

    public Date getAppleavedate() {
        return appleavedate;
    }

    public void setAppleavedate(Date appleavedate) {
        this.appleavedate = appleavedate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason == null ? null : leavereason.trim();
    }

    public String getFiretype() {
        return firetype;
    }

    public void setFiretype(String firetype) {
        this.firetype = firetype == null ? null : firetype.trim();
    }

    public String getLinker() {
        return linker;
    }

    public void setLinker(String linker) {
        this.linker = linker == null ? null : linker.trim();
    }

    public String getLinkertel() {
        return linkertel;
    }

    public void setLinkertel(String linkertel) {
        this.linkertel = linkertel == null ? null : linkertel.trim();
    }

    public String getLinkerrelationship() {
        return linkerrelationship;
    }

    public void setLinkerrelationship(String linkerrelationship) {
        this.linkerrelationship = linkerrelationship == null ? null : linkerrelationship.trim();
    }

    public String getLinkeraddress() {
        return linkeraddress;
    }

    public void setLinkeraddress(String linkeraddress) {
        this.linkeraddress = linkeraddress == null ? null : linkeraddress.trim();
    }

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate == null ? null : workstate.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getHealthy() {
        return healthy;
    }

    public void setHealthy(String healthy) {
        this.healthy = healthy == null ? null : healthy.trim();
    }

    public String getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(String workgroup) {
        this.workgroup = workgroup == null ? null : workgroup.trim();
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop == null ? null : workshop.trim();
    }

    public String getWorksite() {
        return worksite;
    }

    public void setWorksite(String worksite) {
        this.worksite = worksite == null ? null : worksite.trim();
    }

    public String getWorkpos() {
        return workpos;
    }

    public void setWorkpos(String workpos) {
        this.workpos = workpos == null ? null : workpos.trim();
    }

    public String getSharegroup() {
        return sharegroup;
    }

    public void setSharegroup(String sharegroup) {
        this.sharegroup = sharegroup == null ? null : sharegroup.trim();
    }

    public String getWorkline() {
        return workline;
    }

    public void setWorkline(String workline) {
        this.workline = workline == null ? null : workline.trim();
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype == null ? null : atype.trim();
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public Date getSecuritydates() {
        return securitydates;
    }

    public void setSecuritydates(Date securitydates) {
        this.securitydates = securitydates;
    }

    public Date getSecuritydatee() {
        return securitydatee;
    }

    public void setSecuritydatee(Date securitydatee) {
        this.securitydatee = securitydatee;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype == null ? null : usetype.trim();
    }

    public String getWorklevel() {
        return worklevel;
    }

    public void setWorklevel(String worklevel) {
        this.worklevel = worklevel == null ? null : worklevel.trim();
    }

    public BigDecimal getSalarym() {
        return salarym;
    }

    public void setSalarym(BigDecimal salarym) {
        this.salarym = salarym;
    }

    public BigDecimal getSalaryhour() {
        return salaryhour;
    }

    public void setSalaryhour(BigDecimal salaryhour) {
        this.salaryhour = salaryhour;
    }

    public BigDecimal getFoodallowance() {
        return foodallowance;
    }

    public void setFoodallowance(BigDecimal foodallowance) {
        this.foodallowance = foodallowance;
    }

    public BigDecimal getOtallowance() {
        return otallowance;
    }

    public void setOtallowance(BigDecimal otallowance) {
        this.otallowance = otallowance;
    }

    public BigDecimal getEfficiencyallowance() {
        return efficiencyallowance;
    }

    public void setEfficiencyallowance(BigDecimal efficiencyallowance) {
        this.efficiencyallowance = efficiencyallowance;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getBonusper() {
        return bonusper;
    }

    public void setBonusper(BigDecimal bonusper) {
        this.bonusper = bonusper;
    }

    public Boolean getIsperform() {
        return isperform;
    }

    public void setIsperform(Boolean isperform) {
        this.isperform = isperform;
    }

    public Boolean getIsproduct() {
        return isproduct;
    }

    public void setIsproduct(Boolean isproduct) {
        this.isproduct = isproduct;
    }

    public Boolean getIsyearend() {
        return isyearend;
    }

    public void setIsyearend(Boolean isyearend) {
        this.isyearend = isyearend;
    }

    public Boolean getIsmeal() {
        return ismeal;
    }

    public void setIsmeal(Boolean ismeal) {
        this.ismeal = ismeal;
    }

    public Boolean getIslive() {
        return islive;
    }

    public void setIslive(Boolean islive) {
        this.islive = islive;
    }

    public Boolean getIsworkover() {
        return isworkover;
    }

    public void setIsworkover(Boolean isworkover) {
        this.isworkover = isworkover;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry == null ? null : marry.trim();
    }

    public Boolean getIstemporary() {
        return istemporary;
    }

    public void setIstemporary(Boolean istemporary) {
        this.istemporary = istemporary;
    }

    public BigDecimal getPerformancesalary() {
        return performancesalary;
    }

    public void setPerformancesalary(BigDecimal performancesalary) {
        this.performancesalary = performancesalary;
    }

    public BigDecimal getOthersalary() {
        return othersalary;
    }

    public void setOthersalary(BigDecimal othersalary) {
        this.othersalary = othersalary;
    }

    public BigDecimal getProductrate() {
        return productrate;
    }

    public void setProductrate(BigDecimal productrate) {
        this.productrate = productrate;
    }

    public BigDecimal getPositionbase() {
        return positionbase;
    }

    public void setPositionbase(BigDecimal positionbase) {
        this.positionbase = positionbase;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Boolean getHrchanged() {
        return hrchanged;
    }

    public void setHrchanged(Boolean hrchanged) {
        this.hrchanged = hrchanged;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSerialno() == null ? other.getSerialno() == null : this.getSerialno().equals(other.getSerialno()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()))
            && (this.getBuser() == null ? other.getBuser() == null : this.getBuser().equals(other.getBuser()))
            && (this.getBtime() == null ? other.getBtime() == null : this.getBtime().equals(other.getBtime()))
            && (this.getEuser() == null ? other.getEuser() == null : this.getEuser().equals(other.getEuser()))
            && (this.getEtime() == null ? other.getEtime() == null : this.getEtime().equals(other.getEtime()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTypecode() == null ? other.getTypecode() == null : this.getTypecode().equals(other.getTypecode()))
            && (this.getMnemoniccode() == null ? other.getMnemoniccode() == null : this.getMnemoniccode().equals(other.getMnemoniccode()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getNativeplace() == null ? other.getNativeplace() == null : this.getNativeplace().equals(other.getNativeplace()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIdhandledate() == null ? other.getIdhandledate() == null : this.getIdhandledate().equals(other.getIdhandledate()))
            && (this.getIdenddate() == null ? other.getIdenddate() == null : this.getIdenddate().equals(other.getIdenddate()))
            && (this.getIdno() == null ? other.getIdno() == null : this.getIdno().equals(other.getIdno()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getJoindate() == null ? other.getJoindate() == null : this.getJoindate().equals(other.getJoindate()))
            && (this.getMarried() == null ? other.getMarried() == null : this.getMarried().equals(other.getMarried()))
            && (this.getZipcode() == null ? other.getZipcode() == null : this.getZipcode().equals(other.getZipcode()))
            && (this.getSalarykind() == null ? other.getSalarykind() == null : this.getSalarykind().equals(other.getSalarykind()))
            && (this.getBasicsalary() == null ? other.getBasicsalary() == null : this.getBasicsalary().equals(other.getBasicsalary()))
            && (this.getIsbank() == null ? other.getIsbank() == null : this.getIsbank().equals(other.getIsbank()))
            && (this.getAccountno() == null ? other.getAccountno() == null : this.getAccountno().equals(other.getAccountno()))
            && (this.getJoinroute() == null ? other.getJoinroute() == null : this.getJoinroute().equals(other.getJoinroute()))
            && (this.getPositivedate() == null ? other.getPositivedate() == null : this.getPositivedate().equals(other.getPositivedate()))
            && (this.getContractdates() == null ? other.getContractdates() == null : this.getContractdates().equals(other.getContractdates()))
            && (this.getContractdatee() == null ? other.getContractdatee() == null : this.getContractdatee().equals(other.getContractdatee()))
            && (this.getAppleavedate() == null ? other.getAppleavedate() == null : this.getAppleavedate().equals(other.getAppleavedate()))
            && (this.getLeavedate() == null ? other.getLeavedate() == null : this.getLeavedate().equals(other.getLeavedate()))
            && (this.getLeavereason() == null ? other.getLeavereason() == null : this.getLeavereason().equals(other.getLeavereason()))
            && (this.getFiretype() == null ? other.getFiretype() == null : this.getFiretype().equals(other.getFiretype()))
            && (this.getLinker() == null ? other.getLinker() == null : this.getLinker().equals(other.getLinker()))
            && (this.getLinkertel() == null ? other.getLinkertel() == null : this.getLinkertel().equals(other.getLinkertel()))
            && (this.getLinkerrelationship() == null ? other.getLinkerrelationship() == null : this.getLinkerrelationship().equals(other.getLinkerrelationship()))
            && (this.getLinkeraddress() == null ? other.getLinkeraddress() == null : this.getLinkeraddress().equals(other.getLinkeraddress()))
            && (this.getWorkstate() == null ? other.getWorkstate() == null : this.getWorkstate().equals(other.getWorkstate()))
            && (this.getIdcardno() == null ? other.getIdcardno() == null : this.getIdcardno().equals(other.getIdcardno()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getPolitical() == null ? other.getPolitical() == null : this.getPolitical().equals(other.getPolitical()))
            && (this.getHealthy() == null ? other.getHealthy() == null : this.getHealthy().equals(other.getHealthy()))
            && (this.getWorkgroup() == null ? other.getWorkgroup() == null : this.getWorkgroup().equals(other.getWorkgroup()))
            && (this.getWorkshop() == null ? other.getWorkshop() == null : this.getWorkshop().equals(other.getWorkshop()))
            && (this.getWorksite() == null ? other.getWorksite() == null : this.getWorksite().equals(other.getWorksite()))
            && (this.getWorkpos() == null ? other.getWorkpos() == null : this.getWorkpos().equals(other.getWorkpos()))
            && (this.getSharegroup() == null ? other.getSharegroup() == null : this.getSharegroup().equals(other.getSharegroup()))
            && (this.getWorkline() == null ? other.getWorkline() == null : this.getWorkline().equals(other.getWorkline()))
            && (this.getWorktype() == null ? other.getWorktype() == null : this.getWorktype().equals(other.getWorktype()))
            && (this.getAtype() == null ? other.getAtype() == null : this.getAtype().equals(other.getAtype()))
            && (this.getContracttype() == null ? other.getContracttype() == null : this.getContracttype().equals(other.getContracttype()))
            && (this.getClasses() == null ? other.getClasses() == null : this.getClasses().equals(other.getClasses()))
            && (this.getSecuritydates() == null ? other.getSecuritydates() == null : this.getSecuritydates().equals(other.getSecuritydates()))
            && (this.getSecuritydatee() == null ? other.getSecuritydatee() == null : this.getSecuritydatee().equals(other.getSecuritydatee()))
            && (this.getUsetype() == null ? other.getUsetype() == null : this.getUsetype().equals(other.getUsetype()))
            && (this.getWorklevel() == null ? other.getWorklevel() == null : this.getWorklevel().equals(other.getWorklevel()))
            && (this.getSalarym() == null ? other.getSalarym() == null : this.getSalarym().equals(other.getSalarym()))
            && (this.getSalaryhour() == null ? other.getSalaryhour() == null : this.getSalaryhour().equals(other.getSalaryhour()))
            && (this.getFoodallowance() == null ? other.getFoodallowance() == null : this.getFoodallowance().equals(other.getFoodallowance()))
            && (this.getOtallowance() == null ? other.getOtallowance() == null : this.getOtallowance().equals(other.getOtallowance()))
            && (this.getEfficiencyallowance() == null ? other.getEfficiencyallowance() == null : this.getEfficiencyallowance().equals(other.getEfficiencyallowance()))
            && (this.getBonus() == null ? other.getBonus() == null : this.getBonus().equals(other.getBonus()))
            && (this.getBonusper() == null ? other.getBonusper() == null : this.getBonusper().equals(other.getBonusper()))
            && (this.getIsperform() == null ? other.getIsperform() == null : this.getIsperform().equals(other.getIsperform()))
            && (this.getIsproduct() == null ? other.getIsproduct() == null : this.getIsproduct().equals(other.getIsproduct()))
            && (this.getIsyearend() == null ? other.getIsyearend() == null : this.getIsyearend().equals(other.getIsyearend()))
            && (this.getIsmeal() == null ? other.getIsmeal() == null : this.getIsmeal().equals(other.getIsmeal()))
            && (this.getIslive() == null ? other.getIslive() == null : this.getIslive().equals(other.getIslive()))
            && (this.getIsworkover() == null ? other.getIsworkover() == null : this.getIsworkover().equals(other.getIsworkover()))
            && (this.getDept() == null ? other.getDept() == null : this.getDept().equals(other.getDept()))
            && (this.getMarry() == null ? other.getMarry() == null : this.getMarry().equals(other.getMarry()))
            && (this.getIstemporary() == null ? other.getIstemporary() == null : this.getIstemporary().equals(other.getIstemporary()))
            && (this.getPerformancesalary() == null ? other.getPerformancesalary() == null : this.getPerformancesalary().equals(other.getPerformancesalary()))
            && (this.getOthersalary() == null ? other.getOthersalary() == null : this.getOthersalary().equals(other.getOthersalary()))
            && (this.getProductrate() == null ? other.getProductrate() == null : this.getProductrate().equals(other.getProductrate()))
            && (this.getPositionbase() == null ? other.getPositionbase() == null : this.getPositionbase().equals(other.getPositionbase()))
            && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()))
            && (this.getChecker() == null ? other.getChecker() == null : this.getChecker().equals(other.getChecker()))
            && (this.getCheckdate() == null ? other.getCheckdate() == null : this.getCheckdate().equals(other.getCheckdate()))
            && (this.getHrchanged() == null ? other.getHrchanged() == null : this.getHrchanged().equals(other.getHrchanged()))
            && (Arrays.equals(this.getImg(), other.getImg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSerialno() == null) ? 0 : getSerialno().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getBuser() == null) ? 0 : getBuser().hashCode());
        result = prime * result + ((getBtime() == null) ? 0 : getBtime().hashCode());
        result = prime * result + ((getEuser() == null) ? 0 : getEuser().hashCode());
        result = prime * result + ((getEtime() == null) ? 0 : getEtime().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTypecode() == null) ? 0 : getTypecode().hashCode());
        result = prime * result + ((getMnemoniccode() == null) ? 0 : getMnemoniccode().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getNativeplace() == null) ? 0 : getNativeplace().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIdhandledate() == null) ? 0 : getIdhandledate().hashCode());
        result = prime * result + ((getIdenddate() == null) ? 0 : getIdenddate().hashCode());
        result = prime * result + ((getIdno() == null) ? 0 : getIdno().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getJoindate() == null) ? 0 : getJoindate().hashCode());
        result = prime * result + ((getMarried() == null) ? 0 : getMarried().hashCode());
        result = prime * result + ((getZipcode() == null) ? 0 : getZipcode().hashCode());
        result = prime * result + ((getSalarykind() == null) ? 0 : getSalarykind().hashCode());
        result = prime * result + ((getBasicsalary() == null) ? 0 : getBasicsalary().hashCode());
        result = prime * result + ((getIsbank() == null) ? 0 : getIsbank().hashCode());
        result = prime * result + ((getAccountno() == null) ? 0 : getAccountno().hashCode());
        result = prime * result + ((getJoinroute() == null) ? 0 : getJoinroute().hashCode());
        result = prime * result + ((getPositivedate() == null) ? 0 : getPositivedate().hashCode());
        result = prime * result + ((getContractdates() == null) ? 0 : getContractdates().hashCode());
        result = prime * result + ((getContractdatee() == null) ? 0 : getContractdatee().hashCode());
        result = prime * result + ((getAppleavedate() == null) ? 0 : getAppleavedate().hashCode());
        result = prime * result + ((getLeavedate() == null) ? 0 : getLeavedate().hashCode());
        result = prime * result + ((getLeavereason() == null) ? 0 : getLeavereason().hashCode());
        result = prime * result + ((getFiretype() == null) ? 0 : getFiretype().hashCode());
        result = prime * result + ((getLinker() == null) ? 0 : getLinker().hashCode());
        result = prime * result + ((getLinkertel() == null) ? 0 : getLinkertel().hashCode());
        result = prime * result + ((getLinkerrelationship() == null) ? 0 : getLinkerrelationship().hashCode());
        result = prime * result + ((getLinkeraddress() == null) ? 0 : getLinkeraddress().hashCode());
        result = prime * result + ((getWorkstate() == null) ? 0 : getWorkstate().hashCode());
        result = prime * result + ((getIdcardno() == null) ? 0 : getIdcardno().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getPolitical() == null) ? 0 : getPolitical().hashCode());
        result = prime * result + ((getHealthy() == null) ? 0 : getHealthy().hashCode());
        result = prime * result + ((getWorkgroup() == null) ? 0 : getWorkgroup().hashCode());
        result = prime * result + ((getWorkshop() == null) ? 0 : getWorkshop().hashCode());
        result = prime * result + ((getWorksite() == null) ? 0 : getWorksite().hashCode());
        result = prime * result + ((getWorkpos() == null) ? 0 : getWorkpos().hashCode());
        result = prime * result + ((getSharegroup() == null) ? 0 : getSharegroup().hashCode());
        result = prime * result + ((getWorkline() == null) ? 0 : getWorkline().hashCode());
        result = prime * result + ((getWorktype() == null) ? 0 : getWorktype().hashCode());
        result = prime * result + ((getAtype() == null) ? 0 : getAtype().hashCode());
        result = prime * result + ((getContracttype() == null) ? 0 : getContracttype().hashCode());
        result = prime * result + ((getClasses() == null) ? 0 : getClasses().hashCode());
        result = prime * result + ((getSecuritydates() == null) ? 0 : getSecuritydates().hashCode());
        result = prime * result + ((getSecuritydatee() == null) ? 0 : getSecuritydatee().hashCode());
        result = prime * result + ((getUsetype() == null) ? 0 : getUsetype().hashCode());
        result = prime * result + ((getWorklevel() == null) ? 0 : getWorklevel().hashCode());
        result = prime * result + ((getSalarym() == null) ? 0 : getSalarym().hashCode());
        result = prime * result + ((getSalaryhour() == null) ? 0 : getSalaryhour().hashCode());
        result = prime * result + ((getFoodallowance() == null) ? 0 : getFoodallowance().hashCode());
        result = prime * result + ((getOtallowance() == null) ? 0 : getOtallowance().hashCode());
        result = prime * result + ((getEfficiencyallowance() == null) ? 0 : getEfficiencyallowance().hashCode());
        result = prime * result + ((getBonus() == null) ? 0 : getBonus().hashCode());
        result = prime * result + ((getBonusper() == null) ? 0 : getBonusper().hashCode());
        result = prime * result + ((getIsperform() == null) ? 0 : getIsperform().hashCode());
        result = prime * result + ((getIsproduct() == null) ? 0 : getIsproduct().hashCode());
        result = prime * result + ((getIsyearend() == null) ? 0 : getIsyearend().hashCode());
        result = prime * result + ((getIsmeal() == null) ? 0 : getIsmeal().hashCode());
        result = prime * result + ((getIslive() == null) ? 0 : getIslive().hashCode());
        result = prime * result + ((getIsworkover() == null) ? 0 : getIsworkover().hashCode());
        result = prime * result + ((getDept() == null) ? 0 : getDept().hashCode());
        result = prime * result + ((getMarry() == null) ? 0 : getMarry().hashCode());
        result = prime * result + ((getIstemporary() == null) ? 0 : getIstemporary().hashCode());
        result = prime * result + ((getPerformancesalary() == null) ? 0 : getPerformancesalary().hashCode());
        result = prime * result + ((getOthersalary() == null) ? 0 : getOthersalary().hashCode());
        result = prime * result + ((getProductrate() == null) ? 0 : getProductrate().hashCode());
        result = prime * result + ((getPositionbase() == null) ? 0 : getPositionbase().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
        result = prime * result + ((getChecker() == null) ? 0 : getChecker().hashCode());
        result = prime * result + ((getCheckdate() == null) ? 0 : getCheckdate().hashCode());
        result = prime * result + ((getHrchanged() == null) ? 0 : getHrchanged().hashCode());
        result = prime * result + (Arrays.hashCode(getImg()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serialno=").append(serialno);
        sb.append(", del=").append(del);
        sb.append(", buser=").append(buser);
        sb.append(", btime=").append(btime);
        sb.append(", euser=").append(euser);
        sb.append(", etime=").append(etime);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", typecode=").append(typecode);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", memo=").append(memo);
        sb.append(", tel=").append(tel);
        sb.append(", phone=").append(phone);
        sb.append(", job=").append(job);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", sex=").append(sex);
        sb.append(", address=").append(address);
        sb.append(", idhandledate=").append(idhandledate);
        sb.append(", idenddate=").append(idenddate);
        sb.append(", idno=").append(idno);
        sb.append(", education=").append(education);
        sb.append(", joindate=").append(joindate);
        sb.append(", married=").append(married);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", salarykind=").append(salarykind);
        sb.append(", basicsalary=").append(basicsalary);
        sb.append(", isbank=").append(isbank);
        sb.append(", accountno=").append(accountno);
        sb.append(", joinroute=").append(joinroute);
        sb.append(", positivedate=").append(positivedate);
        sb.append(", contractdates=").append(contractdates);
        sb.append(", contractdatee=").append(contractdatee);
        sb.append(", appleavedate=").append(appleavedate);
        sb.append(", leavedate=").append(leavedate);
        sb.append(", leavereason=").append(leavereason);
        sb.append(", firetype=").append(firetype);
        sb.append(", linker=").append(linker);
        sb.append(", linkertel=").append(linkertel);
        sb.append(", linkerrelationship=").append(linkerrelationship);
        sb.append(", linkeraddress=").append(linkeraddress);
        sb.append(", workstate=").append(workstate);
        sb.append(", idcardno=").append(idcardno);
        sb.append(", nation=").append(nation);
        sb.append(", political=").append(political);
        sb.append(", healthy=").append(healthy);
        sb.append(", workgroup=").append(workgroup);
        sb.append(", workshop=").append(workshop);
        sb.append(", worksite=").append(worksite);
        sb.append(", workpos=").append(workpos);
        sb.append(", sharegroup=").append(sharegroup);
        sb.append(", workline=").append(workline);
        sb.append(", worktype=").append(worktype);
        sb.append(", atype=").append(atype);
        sb.append(", contracttype=").append(contracttype);
        sb.append(", classes=").append(classes);
        sb.append(", securitydates=").append(securitydates);
        sb.append(", securitydatee=").append(securitydatee);
        sb.append(", usetype=").append(usetype);
        sb.append(", worklevel=").append(worklevel);
        sb.append(", salarym=").append(salarym);
        sb.append(", salaryhour=").append(salaryhour);
        sb.append(", foodallowance=").append(foodallowance);
        sb.append(", otallowance=").append(otallowance);
        sb.append(", efficiencyallowance=").append(efficiencyallowance);
        sb.append(", bonus=").append(bonus);
        sb.append(", bonusper=").append(bonusper);
        sb.append(", isperform=").append(isperform);
        sb.append(", isproduct=").append(isproduct);
        sb.append(", isyearend=").append(isyearend);
        sb.append(", ismeal=").append(ismeal);
        sb.append(", islive=").append(islive);
        sb.append(", isworkover=").append(isworkover);
        sb.append(", dept=").append(dept);
        sb.append(", marry=").append(marry);
        sb.append(", istemporary=").append(istemporary);
        sb.append(", performancesalary=").append(performancesalary);
        sb.append(", othersalary=").append(othersalary);
        sb.append(", productrate=").append(productrate);
        sb.append(", positionbase=").append(positionbase);
        sb.append(", checked=").append(checked);
        sb.append(", checker=").append(checker);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", hrchanged=").append(hrchanged);
        sb.append(", img=").append(img);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}