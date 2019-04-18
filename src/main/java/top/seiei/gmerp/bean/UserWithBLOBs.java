package top.seiei.gmerp.bean;

import java.io.Serializable;
import java.util.Arrays;

public class UserWithBLOBs extends User implements Serializable {
    private String vcard;

    private byte[] photodata;

    private String hometown;

    private String adress;

    private String memo;

    private static final long serialVersionUID = 1L;

    public String getVcard() {
        return vcard;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard == null ? null : vcard.trim();
    }

    public byte[] getPhotodata() {
        return photodata;
    }

    public void setPhotodata(byte[] photodata) {
        this.photodata = photodata;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
        UserWithBLOBs other = (UserWithBLOBs) that;
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
            && (this.getCannotlogin() == null ? other.getCannotlogin() == null : this.getCannotlogin().equals(other.getCannotlogin()))
            && (this.getVcard() == null ? other.getVcard() == null : this.getVcard().equals(other.getVcard()))
            && (Arrays.equals(this.getPhotodata(), other.getPhotodata()))
            && (this.getHometown() == null ? other.getHometown() == null : this.getHometown().equals(other.getHometown()))
            && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
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
        result = prime * result + ((getVcard() == null) ? 0 : getVcard().hashCode());
        result = prime * result + (Arrays.hashCode(getPhotodata()));
        result = prime * result + ((getHometown() == null) ? 0 : getHometown().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vcard=").append(vcard);
        sb.append(", photodata=").append(photodata);
        sb.append(", hometown=").append(hometown);
        sb.append(", adress=").append(adress);
        sb.append(", memo=").append(memo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}