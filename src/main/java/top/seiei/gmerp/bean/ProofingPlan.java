package top.seiei.gmerp.bean;

import java.io.Serializable;
import java.util.Date;

public class ProofingPlan implements Serializable {
    private String serialno;

    private String billno;

    private Date billdate;

    private String code;

    private String nodename;

    private String custname;

    private String styleno;

    private String productname;

    private String type;

    private Date deadline;

    private String productclassification;

    private String season;

    private String series;

    private String materialname;

    private Integer quantity;

    private String imageurl;

    private String imageurl1;

    private String size1;

    private String size2;

    private String size3;

    private String size4;

    private String size5;

    private String size6;

    private String size7;

    private String size8;

    private String size9;

    private String size10;

    private String technicalpattern;

    private Date technicalpatterndt;

    private Date technicalpatternrealdt;

    private String guid;

    private static final long serialVersionUID = 1L;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public String getStyleno() {
        return styleno;
    }

    public void setStyleno(String styleno) {
        this.styleno = styleno == null ? null : styleno.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getProductclassification() {
        return productclassification;
    }

    public void setProductclassification(String productclassification) {
        this.productclassification = productclassification == null ? null : productclassification.trim();
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getImageurl1() {
        return imageurl1;
    }

    public void setImageurl1(String imageurl1) {
        this.imageurl1 = imageurl1 == null ? null : imageurl1.trim();
    }

    public String getSize1() {
        return size1;
    }

    public void setSize1(String size1) {
        this.size1 = size1 == null ? null : size1.trim();
    }

    public String getSize2() {
        return size2;
    }

    public void setSize2(String size2) {
        this.size2 = size2 == null ? null : size2.trim();
    }

    public String getSize3() {
        return size3;
    }

    public void setSize3(String size3) {
        this.size3 = size3 == null ? null : size3.trim();
    }

    public String getSize4() {
        return size4;
    }

    public void setSize4(String size4) {
        this.size4 = size4 == null ? null : size4.trim();
    }

    public String getSize5() {
        return size5;
    }

    public void setSize5(String size5) {
        this.size5 = size5 == null ? null : size5.trim();
    }

    public String getSize6() {
        return size6;
    }

    public void setSize6(String size6) {
        this.size6 = size6 == null ? null : size6.trim();
    }

    public String getSize7() {
        return size7;
    }

    public void setSize7(String size7) {
        this.size7 = size7 == null ? null : size7.trim();
    }

    public String getSize8() {
        return size8;
    }

    public void setSize8(String size8) {
        this.size8 = size8 == null ? null : size8.trim();
    }

    public String getSize9() {
        return size9;
    }

    public void setSize9(String size9) {
        this.size9 = size9 == null ? null : size9.trim();
    }

    public String getSize10() {
        return size10;
    }

    public void setSize10(String size10) {
        this.size10 = size10 == null ? null : size10.trim();
    }

    public String getTechnicalpattern() {
        return technicalpattern;
    }

    public void setTechnicalpattern(String technicalpattern) {
        this.technicalpattern = technicalpattern == null ? null : technicalpattern.trim();
    }

    public Date getTechnicalpatterndt() {
        return technicalpatterndt;
    }

    public void setTechnicalpatterndt(Date technicalpatterndt) {
        this.technicalpatterndt = technicalpatterndt;
    }

    public Date getTechnicalpatternrealdt() {
        return technicalpatternrealdt;
    }

    public void setTechnicalpatternrealdt(Date technicalpatternrealdt) {
        this.technicalpatternrealdt = technicalpatternrealdt;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
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
        ProofingPlan other = (ProofingPlan) that;
        return (this.getSerialno() == null ? other.getSerialno() == null : this.getSerialno().equals(other.getSerialno()))
            && (this.getBillno() == null ? other.getBillno() == null : this.getBillno().equals(other.getBillno()))
            && (this.getBilldate() == null ? other.getBilldate() == null : this.getBilldate().equals(other.getBilldate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getNodename() == null ? other.getNodename() == null : this.getNodename().equals(other.getNodename()))
            && (this.getCustname() == null ? other.getCustname() == null : this.getCustname().equals(other.getCustname()))
            && (this.getStyleno() == null ? other.getStyleno() == null : this.getStyleno().equals(other.getStyleno()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getProductclassification() == null ? other.getProductclassification() == null : this.getProductclassification().equals(other.getProductclassification()))
            && (this.getSeason() == null ? other.getSeason() == null : this.getSeason().equals(other.getSeason()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getMaterialname() == null ? other.getMaterialname() == null : this.getMaterialname().equals(other.getMaterialname()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getImageurl() == null ? other.getImageurl() == null : this.getImageurl().equals(other.getImageurl()))
            && (this.getImageurl1() == null ? other.getImageurl1() == null : this.getImageurl1().equals(other.getImageurl1()))
            && (this.getSize1() == null ? other.getSize1() == null : this.getSize1().equals(other.getSize1()))
            && (this.getSize2() == null ? other.getSize2() == null : this.getSize2().equals(other.getSize2()))
            && (this.getSize3() == null ? other.getSize3() == null : this.getSize3().equals(other.getSize3()))
            && (this.getSize4() == null ? other.getSize4() == null : this.getSize4().equals(other.getSize4()))
            && (this.getSize5() == null ? other.getSize5() == null : this.getSize5().equals(other.getSize5()))
            && (this.getSize6() == null ? other.getSize6() == null : this.getSize6().equals(other.getSize6()))
            && (this.getSize7() == null ? other.getSize7() == null : this.getSize7().equals(other.getSize7()))
            && (this.getSize8() == null ? other.getSize8() == null : this.getSize8().equals(other.getSize8()))
            && (this.getSize9() == null ? other.getSize9() == null : this.getSize9().equals(other.getSize9()))
            && (this.getSize10() == null ? other.getSize10() == null : this.getSize10().equals(other.getSize10()))
            && (this.getTechnicalpattern() == null ? other.getTechnicalpattern() == null : this.getTechnicalpattern().equals(other.getTechnicalpattern()))
            && (this.getTechnicalpatterndt() == null ? other.getTechnicalpatterndt() == null : this.getTechnicalpatterndt().equals(other.getTechnicalpatterndt()))
            && (this.getTechnicalpatternrealdt() == null ? other.getTechnicalpatternrealdt() == null : this.getTechnicalpatternrealdt().equals(other.getTechnicalpatternrealdt()))
            && (this.getGuid() == null ? other.getGuid() == null : this.getGuid().equals(other.getGuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSerialno() == null) ? 0 : getSerialno().hashCode());
        result = prime * result + ((getBillno() == null) ? 0 : getBillno().hashCode());
        result = prime * result + ((getBilldate() == null) ? 0 : getBilldate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getNodename() == null) ? 0 : getNodename().hashCode());
        result = prime * result + ((getCustname() == null) ? 0 : getCustname().hashCode());
        result = prime * result + ((getStyleno() == null) ? 0 : getStyleno().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getProductclassification() == null) ? 0 : getProductclassification().hashCode());
        result = prime * result + ((getSeason() == null) ? 0 : getSeason().hashCode());
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getMaterialname() == null) ? 0 : getMaterialname().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getImageurl() == null) ? 0 : getImageurl().hashCode());
        result = prime * result + ((getImageurl1() == null) ? 0 : getImageurl1().hashCode());
        result = prime * result + ((getSize1() == null) ? 0 : getSize1().hashCode());
        result = prime * result + ((getSize2() == null) ? 0 : getSize2().hashCode());
        result = prime * result + ((getSize3() == null) ? 0 : getSize3().hashCode());
        result = prime * result + ((getSize4() == null) ? 0 : getSize4().hashCode());
        result = prime * result + ((getSize5() == null) ? 0 : getSize5().hashCode());
        result = prime * result + ((getSize6() == null) ? 0 : getSize6().hashCode());
        result = prime * result + ((getSize7() == null) ? 0 : getSize7().hashCode());
        result = prime * result + ((getSize8() == null) ? 0 : getSize8().hashCode());
        result = prime * result + ((getSize9() == null) ? 0 : getSize9().hashCode());
        result = prime * result + ((getSize10() == null) ? 0 : getSize10().hashCode());
        result = prime * result + ((getTechnicalpattern() == null) ? 0 : getTechnicalpattern().hashCode());
        result = prime * result + ((getTechnicalpatterndt() == null) ? 0 : getTechnicalpatterndt().hashCode());
        result = prime * result + ((getTechnicalpatternrealdt() == null) ? 0 : getTechnicalpatternrealdt().hashCode());
        result = prime * result + ((getGuid() == null) ? 0 : getGuid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialno=").append(serialno);
        sb.append(", billno=").append(billno);
        sb.append(", billdate=").append(billdate);
        sb.append(", code=").append(code);
        sb.append(", nodename=").append(nodename);
        sb.append(", custname=").append(custname);
        sb.append(", styleno=").append(styleno);
        sb.append(", productname=").append(productname);
        sb.append(", type=").append(type);
        sb.append(", deadline=").append(deadline);
        sb.append(", productclassification=").append(productclassification);
        sb.append(", season=").append(season);
        sb.append(", series=").append(series);
        sb.append(", materialname=").append(materialname);
        sb.append(", quantity=").append(quantity);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", imageurl1=").append(imageurl1);
        sb.append(", size1=").append(size1);
        sb.append(", size2=").append(size2);
        sb.append(", size3=").append(size3);
        sb.append(", size4=").append(size4);
        sb.append(", size5=").append(size5);
        sb.append(", size6=").append(size6);
        sb.append(", size7=").append(size7);
        sb.append(", size8=").append(size8);
        sb.append(", size9=").append(size9);
        sb.append(", size10=").append(size10);
        sb.append(", technicalpattern=").append(technicalpattern);
        sb.append(", technicalpatterndt=").append(technicalpatterndt);
        sb.append(", technicalpatternrealdt=").append(technicalpatternrealdt);
        sb.append(", guid=").append(guid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}