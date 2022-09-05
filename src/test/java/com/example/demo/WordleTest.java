package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

// input need to be changed as well as StringsMatchAnalyser class to take 2 arguments
// or changed as an array of strings - hardcoded target string for now

public class WordleTest {

    @Test
    void firstTest() {
        StringsMatchAnalyser stringsMatchAnalyser = new StringsMatchAnalyser();
        String result = stringsMatchAnalyser.analyseMatch("child", "ropes");
        assertThat(result, CoreMatchers.is("00000"));
    }

    @Test
    void secondTest() {
        StringsMatchAnalyser stringsMatchAnalyser = new StringsMatchAnalyser();
        String result = stringsMatchAnalyser.analyseMatch("alarm", "alert");
        assertThat(result, CoreMatchers.is("22020"));
    }

    @Test
    void thirdTest() {
        StringsMatchAnalyser stringsMatchAnalyser = new StringsMatchAnalyser();
        String result = stringsMatchAnalyser.analyseMatch("chore", "stair");
        assertThat(result, CoreMatchers.is("00010"));
    }

    @Test
    void fourthTest() {
        StringsMatchAnalyser stringsMatchAnalyser = new StringsMatchAnalyser();
        String result = stringsMatchAnalyser.analyseMatch("charm", "hairy");
        assertThat(result, CoreMatchers.is("01120"));
    }

    @Test
    void fifthTest() {
        StringsMatchAnalyser stringsMatchAnalyser = new StringsMatchAnalyser();
        String result = stringsMatchAnalyser.analyseMatch("elect", "reads");
        assertThat(result, CoreMatchers.is("10000"));
    }

}
