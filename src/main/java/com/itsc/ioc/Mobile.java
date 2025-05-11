// Mobile.java
package com.itsc.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        // Create the Spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");

        // Get beans using different approaches
        SimInterface ethioTel = context.getBean("ethiotel", SimInterface.class);
        SimInterface safaricom = context.getBean("safari", SimInterface.class);
        SimInterface defaultSim = context.getBean("sim", SimInterface.class);

        // Demonstrate functionality
        System.out.println("\n=== EthioTel ===");
        System.out.println("Operator: " + ethioTel.getOperatorName());
        System.out.println("Phone: " + ethioTel.getPhoneNumber());
        ethioTel.calling();
        ethioTel.data();

        System.out.println("\n=== Safaricom ===");
        System.out.println("Operator: " + safaricom.getOperatorName());
        System.out.println("Phone: " + safaricom.getPhoneNumber());
        safaricom.calling();
        safaricom.data();

        System.out.println("\n=== Default SIM ===");
        System.out.println("Operator: " + defaultSim.getOperatorName());





















































        System.out.println("Phone: " + defaultSim.getPhoneNumber());
        defaultSim.calling();
        defaultSim.data();
    }
}