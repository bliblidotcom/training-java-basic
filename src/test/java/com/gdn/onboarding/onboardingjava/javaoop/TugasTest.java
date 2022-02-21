package com.gdn.onboarding.onboardingjava.javaoop;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TugasTest {
    private Tugas obj = new Tugas();
    private Logger log = LoggerFactory.getLogger(TugasTest.class);
    @Test
    public void factorialTest_success() throws Exception {
        int result = obj.factorial(4);
        if(result != 24){
            log.error("Faktorial dari 4 bukan {}", result);
            throw new Exception("Wrong Result");
        }
    }

    @Test
    public void factorialTest_failed() throws Exception {
        int result = obj.factorial(-3);
        if(result != -1){
            log.error("Seharusnya tidak ada nilai faktorial dari -3");
            throw new Exception("Invalid input");
        }
    }

    @Test
    public void calenderTest_success() throws Exception {
        String month = obj.calender(4);
        if(!month.equals("April")){
            log.error("Seharusnya string yang benar adalah April");
            throw new Exception("Wrong Answer");
        }
    }

    @Test
    public void calenderTest_failed() throws Exception {
        String month = obj.calender(13);
        if(!month.equals("Invalid input")){
            log.error("Tidak ada nama bulan yang merepresentasikan bulan ke-13");
            throw new Exception("Wrong Answer");
        }
    }

    @Test
    public void letterGradeTest_success() throws Exception {
        String grade = obj.letterGrade(90);
        if(!grade.equals("A")){
            throw new Exception("Wrong Conversion");
        }
    }

    @Test
    public void letterGrade_failed() throws Exception {
        String grade = obj.letterGrade(-1);
        if(grade != null){
            throw new Exception("The grade should be null");
        }
    }
}
