package top.seiei.gmerp.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String id;

    private String typecode;

    private String code;

    private String employeeno;

    private String employeename;

    private String name;

    private String pw;

    private String pw2;

    private String mnemoniccode;

    private Integer querymons;

    private Integer queryscope;

    private Integer grade;

    private Boolean isadmin;

    private Boolean del;

    private String buser;

    private Date btime;

    private String euser;

    private Date etime;

    private Integer state;

    private Date lastonline;

    private String loginip;

    private Integer loginos;

    private String loginport;

    private Integer headpicidx;

    private String smtp;

    private String emailname;

    private String emailpwd;

    private Byte sex;

    private Boolean isbroadcast;

    private Boolean isedituserdata;

    private Boolean issendnotice;

    private Boolean issendsms;

    private Integer createrooms;

    private Integer orderid;

    private String deptcode;

    private String birthday;

    private String job;

    private String officetelephone;

    private String education;

    private String post;

    private String school;

    private String mobilephone;

    private Boolean uncheckuser;

    private Boolean onImOff;

    private Boolean hidenotice;

    private String logininfo;

    private String power;

    private Boolean nonself;

    private String cwaccount;

    private Boolean onImOfftt;

    private Boolean warnnotice;

    private Boolean cannotlogin;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno == null ? null : employeeno.trim();
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    public String getPw2() {
        return pw2;
    }

    public void setPw2(String pw2) {
        this.pw2 = pw2 == null ? null : pw2.trim();
    }

    public String getMnemoniccode() {
        return mnemoniccode;
    }

    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    public Integer getQuerymons() {
        return querymons;
    }

    public void setQuerymons(Integer querymons) {
        this.querymons = querymons;
    }

    public Integer getQueryscope() {
        return queryscope;
    }

    public void setQueryscope(Integer queryscope) {
        this.queryscope = queryscope;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLastonline() {
        return lastonline;
    }

    public void setLastonline(Date lastonline) {
        this.lastonline = lastonline;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Integer getLoginos() {
        return loginos;
    }

    public void setLoginos(Integer loginos) {
        this.loginos = loginos;
    }

    public String getLoginport() {
        return loginport;
    }

    public void setLoginport(String loginport) {
        this.loginport = loginport == null ? null : loginport.trim();
    }

    public Integer getHeadpicidx() {
        return headpicidx;
    }

    public void setHeadpicidx(Integer headpicidx) {
        this.headpicidx = headpicidx;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp == null ? null : smtp.trim();
    }

    public String getEmailname() {
        return emailname;
    }

    public void setEmailname(String emailname) {
        this.emailname = emailname == null ? null : emailname.trim();
    }

    public String getEmailpwd() {
        return emailpwd;
    }

    public void setEmailpwd(String emailpwd) {
        this.emailpwd = emailpwd == null ? null : emailpwd.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Boolean getIsbroadcast() {
        return isbroadcast;
    }

    public void setIsbroadcast(Boolean isbroadcast) {
        this.isbroadcast = isbroadcast;
    }

    public Boolean getIsedituserdata() {
        return isedituserdata;
    }

    public void setIsedituserdata(Boolean isedituserdata) {
        this.isedituserdata = isedituserdata;
    }

    public Boolean getIssendnotice() {
        return issendnotice;
    }

    public void setIssendnotice(Boolean issendnotice) {
        this.issendnotice = issendnotice;
    }

    public Boolean getIssendsms() {
        return issendsms;
    }

    public void setIssendsms(Boolean issendsms) {
        this.issendsms = issendsms;
    }

    public Integer getCreaterooms() {
        return createrooms;
    }

    public void setCreaterooms(Integer createrooms) {
        this.createrooms = createrooms;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getOfficetelephone() {
        return officetelephone;
    }

    public void setOfficetelephone(String officetelephone) {
        this.officetelephone = officetelephone == null ? null : officetelephone.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Boolean getUncheckuser() {
        return uncheckuser;
    }

    public void setUncheckuser(Boolean uncheckuser) {
        this.uncheckuser = uncheckuser;
    }

    public Boolean getOnImOff() {
        return onImOff;
    }

    public void setOnImOff(Boolean onImOff) {
        this.onImOff = onImOff;
    }

    public Boolean getHidenotice() {
        return hidenotice;
    }

    public void setHidenotice(Boolean hidenotice) {
        this.hidenotice = hidenotice;
    }

    public String getLogininfo() {
        return logininfo;
    }

    public void setLogininfo(String logininfo) {
        this.logininfo = logininfo == null ? null : logininfo.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public Boolean getNonself() {
        return nonself;
    }

    public void setNonself(Boolean nonself) {
        this.nonself = nonself;
    }

    public String getCwaccount() {
        return cwaccount;
    }

    public void setCwaccount(String cwaccount) {
        this.cwaccount = cwaccount == null ? null : cwaccount.trim();
    }

    public Boolean getOnImOfftt() {
        return onImOfftt;
    }

    public void setOnImOfftt(Boolean onImOfftt) {
        this.onImOfftt = onImOfftt;
    }

    public Boolean getWarnnotice() {
        return warnnotice;
    }

    public void setWarnnotice(Boolean warnnotice) {
        this.warnnotice = warnnotice;
    }

    public Boolean getCannotlogin() {
        return cannotlogin;
    }

    public void setCannotlogin(Boolean cannotlogin) {
        this.cannotlogin = cannotlogin;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypecode() == null ? other.getTypecode() == null : this.getTypecode().equals(other.getTypecode()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getEmployeeno() == null ? other.getEmployeeno() == null : this.getEmployeeno().equals(other.getEmployeeno()))
            && (this.getEmployeename() == null ? other.getEmployeename() == null : this.getEmployeename().equals(other.getEmployeename()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPw() == null ? other.getPw() == null : this.getPw().equals(other.getPw()))
            && (this.getPw2() == null ? other.getPw2() == null : this.getPw2().equals(other.getPw2()))
            && (this.getMnemoniccode() == null ? other.getMnemoniccode() == null : this.getMnemoniccode().equals(other.getMnemoniccode()))
            && (this.getQuerymons() == null ? other.getQuerymons() == null : this.getQuerymons().equals(other.getQuerymons()))
            && (this.getQueryscope() == null ? other.getQueryscope() == null : this.getQueryscope().equals(other.getQueryscope()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getIsadmin() == null ? other.getIsadmin() == null : this.getIsadmin().equals(other.getIsadmin()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()))
            && (this.getBuser() == null ? other.getBuser() == null : this.getBuser().equals(other.getBuser()))
            && (this.getBtime() == null ? other.getBtime() == null : this.getBtime().equals(other.getBtime()))
            && (this.getEuser() == null ? other.getEuser() == null : this.getEuser().equals(other.getEuser()))
            && (this.getEtime() == null ? other.getEtime() == null : this.getEtime().equals(other.getEtime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastonline() == null ? other.getLastonline() == null : this.getLastonline().equals(other.getLastonline()))
            && (this.getLoginip() == null ? other.getLoginip() == null : this.getLoginip().equals(other.getLoginip()))
            && (this.getLoginos() == null ? other.getLoginos() == null : this.getLoginos().equals(other.getLoginos()))
            && (this.getLoginport() == null ? other.getLoginport() == null : this.getLoginport().equals(other.getLoginport()))
            && (this.getHeadpicidx() == null ? other.getHeadpicidx() == null : this.getHeadpicidx().equals(other.getHeadpicidx()))
            && (this.getSmtp() == null ? other.getSmtp() == null : this.getSmtp().equals(other.getSmtp()))
            && (this.getEmailname() == null ? other.getEmailname() == null : this.getEmailname().equals(other.getEmailname()))
            && (this.getEmailpwd() == null ? other.getEmailpwd() == null : this.getEmailpwd().equals(other.getEmailpwd()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getIsbroadcast() == null ? other.getIsbroadcast() == null : this.getIsbroadcast().equals(other.getIsbroadcast()))
            && (this.getIsedituserdata() == null ? other.getIsedituserdata() == null : this.getIsedituserdata().equals(other.getIsedituserdata()))
            && (this.getIssendnotice() == null ? other.getIssendnotice() == null : this.getIssendnotice().equals(other.getIssendnotice()))
            && (this.getIssendsms() == null ? other.getIssendsms() == null : this.getIssendsms().equals(other.getIssendsms()))
            && (this.getCreaterooms() == null ? other.getCreaterooms() == null : this.getCreaterooms().equals(other.getCreaterooms()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getDeptcode() == null ? other.getDeptcode() == null : this.getDeptcode().equals(other.getDeptcode()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getOfficetelephone() == null ? other.getOfficetelephone() == null : this.getOfficetelephone().equals(other.getOfficetelephone()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getPost() == null ? other.getPost() == null : this.getPost().equals(other.getPost()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getUncheckuser() == null ? other.getUncheckuser() == null : this.getUncheckuser().equals(other.getUncheckuser()))
            && (this.getOnImOff() == null ? other.getOnImOff() == null : this.getOnImOff().equals(other.getOnImOff()))
            && (this.getHidenotice() == null ? other.getHidenotice() == null : this.getHidenotice().equals(other.getHidenotice()))
            && (this.getLogininfo() == null ? other.getLogininfo() == null : this.getLogininfo().equals(other.getLogininfo()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getNonself() == null ? other.getNonself() == null : this.getNonself().equals(other.getNonself()))
            && (this.getCwaccount() == null ? other.getCwaccount() == null : this.getCwaccount().equals(other.getCwaccount()))
            && (this.getOnImOfftt() == null ? other.getOnImOfftt() == null : this.getOnImOfftt().equals(other.getOnImOfftt()))
            && (this.getWarnnotice() == null ? other.getWarnnotice() == null : this.getWarnnotice().equals(other.getWarnnotice()))
            && (this.getCannotlogin() == null ? other.getCannotlogin() == null : this.getCannotlogin().equals(other.getCannotlogin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypecode() == null) ? 0 : getTypecode().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getEmployeeno() == null) ? 0 : getEmployeeno().hashCode());
        result = prime * result + ((getEmployeename() == null) ? 0 : getEmployeename().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPw() == null) ? 0 : getPw().hashCode());
        result = prime * result + ((getPw2() == null) ? 0 : getPw2().hashCode());
        result = prime * result + ((getMnemoniccode() == null) ? 0 : getMnemoniccode().hashCode());
        result = prime * result + ((getQuerymons() == null) ? 0 : getQuerymons().hashCode());
        result = prime * result + ((getQueryscope() == null) ? 0 : getQueryscope().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getIsadmin() == null) ? 0 : getIsadmin().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getBuser() == null) ? 0 : getBuser().hashCode());
        result = prime * result + ((getBtime() == null) ? 0 : getBtime().hashCode());
        result = prime * result + ((getEuser() == null) ? 0 : getEuser().hashCode());
        result = prime * result + ((getEtime() == null) ? 0 : getEtime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLastonline() == null) ? 0 : getLastonline().hashCode());
        result = prime * result + ((getLoginip() == null) ? 0 : getLoginip().hashCode());
        result = prime * result + ((getLoginos() == null) ? 0 : getLoginos().hashCode());
        result = prime * result + ((getLoginport() == null) ? 0 : getLoginport().hashCode());
        result = prime * result + ((getHeadpicidx() == null) ? 0 : getHeadpicidx().hashCode());
        result = prime * result + ((getSmtp() == null) ? 0 : getSmtp().hashCode());
        result = prime * result + ((getEmailname() == null) ? 0 : getEmailname().hashCode());
        result = prime * result + ((getEmailpwd() == null) ? 0 : getEmailpwd().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getIsbroadcast() == null) ? 0 : getIsbroadcast().hashCode());
        result = prime * result + ((getIsedituserdata() == null) ? 0 : getIsedituserdata().hashCode());
        result = prime * result + ((getIssendnotice() == null) ? 0 : getIssendnotice().hashCode());
        result = prime * result + ((getIssendsms() == null) ? 0 : getIssendsms().hashCode());
        result = prime * result + ((getCreaterooms() == null) ? 0 : getCreaterooms().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getDeptcode() == null) ? 0 : getDeptcode().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getOfficetelephone() == null) ? 0 : getOfficetelephone().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getPost() == null) ? 0 : getPost().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getUncheckuser() == null) ? 0 : getUncheckuser().hashCode());
        result = prime * result + ((getOnImOff() == null) ? 0 : getOnImOff().hashCode());
        result = prime * result + ((getHidenotice() == null) ? 0 : getHidenotice().hashCode());
        result = prime * result + ((getLogininfo() == null) ? 0 : getLogininfo().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getNonself() == null) ? 0 : getNonself().hashCode());
        result = prime * result + ((getCwaccount() == null) ? 0 : getCwaccount().hashCode());
        result = prime * result + ((getOnImOfftt() == null) ? 0 : getOnImOfftt().hashCode());
        result = prime * result + ((getWarnnotice() == null) ? 0 : getWarnnotice().hashCode());
        result = prime * result + ((getCannotlogin() == null) ? 0 : getCannotlogin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typecode=").append(typecode);
        sb.append(", code=").append(code);
        sb.append(", employeeno=").append(employeeno);
        sb.append(", employeename=").append(employeename);
        sb.append(", name=").append(name);
        sb.append(", pw=").append(pw);
        sb.append(", pw2=").append(pw2);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", querymons=").append(querymons);
        sb.append(", queryscope=").append(queryscope);
        sb.append(", grade=").append(grade);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", del=").append(del);
        sb.append(", buser=").append(buser);
        sb.append(", btime=").append(btime);
        sb.append(", euser=").append(euser);
        sb.append(", etime=").append(etime);
        sb.append(", state=").append(state);
        sb.append(", lastonline=").append(lastonline);
        sb.append(", loginip=").append(loginip);
        sb.append(", loginos=").append(loginos);
        sb.append(", loginport=").append(loginport);
        sb.append(", headpicidx=").append(headpicidx);
        sb.append(", smtp=").append(smtp);
        sb.append(", emailname=").append(emailname);
        sb.append(", emailpwd=").append(emailpwd);
        sb.append(", sex=").append(sex);
        sb.append(", isbroadcast=").append(isbroadcast);
        sb.append(", isedituserdata=").append(isedituserdata);
        sb.append(", issendnotice=").append(issendnotice);
        sb.append(", issendsms=").append(issendsms);
        sb.append(", createrooms=").append(createrooms);
        sb.append(", orderid=").append(orderid);
        sb.append(", deptcode=").append(deptcode);
        sb.append(", birthday=").append(birthday);
        sb.append(", job=").append(job);
        sb.append(", officetelephone=").append(officetelephone);
        sb.append(", education=").append(education);
        sb.append(", post=").append(post);
        sb.append(", school=").append(school);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", uncheckuser=").append(uncheckuser);
        sb.append(", onImOff=").append(onImOff);
        sb.append(", hidenotice=").append(hidenotice);
        sb.append(", logininfo=").append(logininfo);
        sb.append(", power=").append(power);
        sb.append(", nonself=").append(nonself);
        sb.append(", cwaccount=").append(cwaccount);
        sb.append(", onImOfftt=").append(onImOfftt);
        sb.append(", warnnotice=").append(warnnotice);
        sb.append(", cannotlogin=").append(cannotlogin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}