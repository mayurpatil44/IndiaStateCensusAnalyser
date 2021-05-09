package com.censusanalyser;

import java.io.IOException;

public class CensusAnalyzerMain {

    public static final String CSV_PATH = "D:\\IndiaStateCensusAnalyser\\src\\StateCensusData.csv";
    public static final String CSV_PATH2 = "D:\\IndiaStateCensusAnalyser\\src\\StateCode.csv";


    public static void main(String[] args) {
        StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer();
        try {
            stateCensusAnalyzer.readCSVData(CSV_PATH);
            stateCensusAnalyzer.readStateCodeCSVData(CSV_PATH2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (StateAnalyzerException e) {
            e.printStackTrace();
        }
    }


}