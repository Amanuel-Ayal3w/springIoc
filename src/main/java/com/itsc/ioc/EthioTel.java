// EthioTel.java
package com.itsc.ioc;

public class EthioTel implements SimInterface {
    private String operatorName;
    private String phoneNumber;

    public EthioTel() {}

    public EthioTel(String operatorName, String phoneNumber) {
        this.operatorName = operatorName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void calling() {
        System.out.println("Calling with EthioTel Sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing with EthioTel Sim");
    }

    @Override
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public String getOperatorName() {
        return this.operatorName;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}