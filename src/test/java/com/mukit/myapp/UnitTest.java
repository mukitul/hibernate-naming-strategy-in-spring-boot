package com.mukit.myapp;

import com.mukit.myapp.entity.AlphaAppUser;
import com.mukit.myapp.entity.MyAppUser;
import com.mukit.myapp.repository.AlphaAppRepository;
import com.mukit.myapp.repository.MyAppRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class UnitTest {
    @Autowired
    private AlphaAppRepository alphaAppRepository;

    @Autowired
    private MyAppRepository myAppRepository;

    @Test
    public void getAlphaAppUserTest() {
        AlphaAppUser alphaAppUser = alphaAppRepository.findByUserName("alpha_mahfuz");
        Assert.assertNotNull("Alpha app user not found for username: alpha_mahfuz", alphaAppUser);
    }

    @Test
    public void getMyAppUserTest() {
        MyAppUser myAppUser = myAppRepository.findByUserName("rashed_myapp");
        Assert.assertNotNull("Alpha app user not found for username: rashed_myapp", myAppUser);
    }
}
