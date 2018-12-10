package com.telRan.Test;

import com.telRan.Manager.ApplicationManager;
import org.testng.annotations.*;

public class TestBase {

    public ApplicationManager applicationManager = new ApplicationManager();


    @BeforeClass
    public void setUp(){
        applicationManager.start();
    }

    @AfterClass
    public void tearDown(){
        applicationManager.stop();
    }

}
