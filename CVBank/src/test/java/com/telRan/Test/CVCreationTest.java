package com.telRan.Test;

import com.telRan.Manager.ApplicationManager;
import org.testng.annotations.Test;

public class CVCreationTest extends TestBase {

    @Test
    public void CreateCVWithoutLogin(){

        applicationManager.getCreateCVHelper().createCV();

    }

    @Test
    public void CreateCVByLogin(){

        applicationManager.getNavigationHelper().logIn();
        applicationManager.getCreateCVHelper().createCV();
    }

}
