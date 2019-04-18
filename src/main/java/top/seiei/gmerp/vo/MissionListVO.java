package top.seiei.gmerp.vo;

import java.util.Date;

public class MissionListVO {

    private String nodeName;

    private String technicalpattern;

    private Date technicalpatterndt;

    private Date technicalpatternrealdt;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getTechnicalpattern() {
        return technicalpattern;
    }

    public void setTechnicalpattern(String technicalpattern) {
        this.technicalpattern = technicalpattern;
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
}
