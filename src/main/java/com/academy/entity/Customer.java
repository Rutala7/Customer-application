package com.academy.entity;

public class Customer {

    private String id;

    //Mandatory
    private String firstName;
    private String lastName;
    private String personalNumber;

    //Optional
    private String middleName;
    private int age;
    private String countryCode;
    private String city;
    private int monthlyIncome;
    private String employer;
    private String gender;
    private String maritalStatus;

    // Creating Builder and deleting the setters

    public static class Builder {
        private String firstName;
        private String lastName;
        private String personalNumber;

        private String middleName;
        private int age;
        private String countryCode;
        private String city;
        private int monthlyIncome;
        private String employer;
        private String gender;
        private String maritalStatus;

        public Builder(String firstName, String lastName, String personalNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.personalNumber = personalNumber;
        }

        public Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder withMartialStatus(String martialStatus) {
            this.maritalStatus = martialStatus;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.personalNumber = personalNumber;
            customer.firstName = firstName;
            customer.lastName = lastName;
            customer.age = age;
            customer.countryCode = countryCode;
            customer.middleName = middleName;
            customer.maritalStatus = maritalStatus;
            return customer;
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getEmployer() {
        return employer;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    // We only leave Id setter because it's used to determine which of the customers has to be deleted.
    // We don't include Id in the builder.
    public void setId(String id) {
        this.id = id;
    }
}
