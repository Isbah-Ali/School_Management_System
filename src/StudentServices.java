
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bjc
 */
public class StudentServices {
    private boolean hostel;
    private String transport;
    private String feePlan;
    private String activity;

    private StudentServices(Builder builder) {
        this.hostel = builder.hostel;
        this.transport = builder.transport;
        this.feePlan = builder.feePlan;
    }

    public static class Builder {
        private boolean hostel = false;
        private String transport = "None";
        private String feePlan = "Regular";

        public Builder withHostel(boolean hostel) {
            this.hostel = hostel;
            return this;
        }

        public Builder withTransport(String transport) {
            this.transport = transport;
            return this;
        }

        public Builder withFeePlan(String feePlan) {
            this.feePlan = feePlan;
            return this;
        }

       
        public StudentServices build() {
            return new StudentServices(this);
        }
    }

    public void print() {
        System.out.println("Hostel: " + hostel);
        System.out.println("Transport: " + transport);
        System.out.println("Fee Plan: " + feePlan);
    }
}

