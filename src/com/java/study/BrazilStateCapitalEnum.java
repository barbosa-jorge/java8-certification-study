package com.java.study;

import java.util.Arrays;

public enum BrazilStateCapitalEnum {

    SAO_PAULO("São Paulo") {

        private String description = "State of São Paulo";
        private Long population = 2000000L;

        public String getDescription() {
            return description;
        }

        public Long getPopulation() {
            return population;
        }

        public void print() {
            System.out.println("São Paulo");
        }
    },
    MINAS("Belo Horizonte") {

        private String description = "State of Minas";
        private Long population = 800000L;

        public String getDescription() {
            return description;
        }

        public Long getPopulation() {
            return population;
        }

        public void print() {
            System.out.println("Belo Horizonte");
        }
    },
    RIO("Rio") {

        private String description = "State of Rio";
        private Long population = 700000L;

        public String getDescription() {
            return description;
        }

        public Long getPopulation() {
            return population;
        }

        public void print() {
            System.out.println("Rio");
        }
    },
    AMAZONAS("Manaus") {

        private String description = "State of Amazonas";
        private Long population = 500000L;

        public String getDescription() {
            return description;
        }

        public Long getPopulation() {
            return population;
        }

        public void print() {
            System.out.println("Manaus");
        }
    };

    public abstract void print();
    public abstract Long getPopulation();
    public abstract String getDescription();

    private String capital;

    public String getCapital() {
        return capital;
    }

    BrazilStateCapitalEnum(String capital) {
        this.capital = capital;
    }
}

class TestEnum {
    public static void main(String[] args) {

        System.out.println(BrazilStateCapitalEnum.AMAZONAS);
        System.out.println(BrazilStateCapitalEnum.AMAZONAS.toString());
        System.out.println(BrazilStateCapitalEnum.AMAZONAS.name());
        System.out.println(BrazilStateCapitalEnum.AMAZONAS.getCapital());

        System.out.println("---------------------------------------");

        Arrays.stream(BrazilStateCapitalEnum.values()).forEach(c -> {
            System.out.println(c.toString() + " - "+ c.getCapital());
        });

        System.out.println("---------------------------------------");
        BrazilStateCapitalEnum amazonas = BrazilStateCapitalEnum.valueOf("AMAZONAS");
        System.out.println("The Capital of "+ amazonas + " is: "+ amazonas.getCapital());

        System.out.println("---------------------------------------");
        System.out.println( BrazilStateCapitalEnum.RIO == BrazilStateCapitalEnum.valueOf("RIO"));

        BrazilStateCapitalEnum.RIO.print();
        System.out.println("Description: "+BrazilStateCapitalEnum.RIO.getDescription());
        System.out.println("Population: "+BrazilStateCapitalEnum.RIO.getPopulation());

    }
}
