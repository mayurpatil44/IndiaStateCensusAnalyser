package com.censusanalyser;

public class CensusAnalyzerMain {

    public static void main(String[] args) {
        StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer();
        stateCensusAnalyzer.readCSVData();
    }
}