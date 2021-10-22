package com.nesstedClasses;

public class Employee {
    private String name;
    private String age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    class Address{
        String block;
        String street;
        String city;
        String state;

        public String getBlock() {
            return block;
        }

        public void setBlock(String block) {
            this.block = block;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        String nameAddress =getName().concat(" ")
                .concat(age).concat(" ")
                .concat(city).concat(" ")
                .concat(getState());
    }

    static class Emplyeement{
        private String companyName;
        private static String isMnc;

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public static String getIsMnc() {
            return isMnc;
        }

        public static void setIsMnc(String isMnc) {
            Emplyeement.isMnc = isMnc;
        }
    }

}
