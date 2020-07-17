package 去重demo;

import java.io.Serializable;

/**
 * @program: kaudi
 * @description: 对象
 * @author: wjz
 * @create: 2020-07-17 10:02
 **/
public class RobotCase implements Serializable {
    /**
     * 案件id
     */
    private Long caseId;

    /**
     * 自增id
     */
    private Long partnerId;

    /**
     * 甲方公司名称
     */
    private String clientName;

    /**
     * 借款人姓名
     */
    private String borrowerName;

    /**
     * 借款人性别 1 男 0 女
     */
    private Byte borrowerSex;

    /**
     * 借款人电话
     */
    private String borrowerTel;

    public RobotCase(Long caseId, Long partnerId, String clientName, String borrowerName, Byte borrowerSex, String borrowerTel) {
        this.caseId = caseId;
        this.partnerId = partnerId;
        this.clientName = clientName;
        this.borrowerName = borrowerName;
        this.borrowerSex = borrowerSex;
        this.borrowerTel = borrowerTel;
    }

    @Override
    public String toString() {
        return "RobotCase{" +
                "caseId=" + caseId +
                ", partnerId=" + partnerId +
                ", clientName='" + clientName + '\'' +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowerSex=" + borrowerSex +
                ", borrowerTel='" + borrowerTel + '\'' +
                '}';
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public Byte getBorrowerSex() {
        return borrowerSex;
    }

    public void setBorrowerSex(Byte borrowerSex) {
        this.borrowerSex = borrowerSex;
    }

    public String getBorrowerTel() {
        return borrowerTel;
    }

    public void setBorrowerTel(String borrowerTel) {
        this.borrowerTel = borrowerTel;
    }
}
