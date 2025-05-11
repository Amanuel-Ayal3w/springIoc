package com.itsc.ioc;

public class Safaricom implements SimInterface {
    private String operatorName;
    private String phoneNumber;

    public Safaricom() {}

    public Safaricom(String operatorName, String phoneNumber) {
        this.operatorName = operatorName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void calling() {
        System.out.println("Calling with Safaricom Sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing with Safaricom Sim");
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