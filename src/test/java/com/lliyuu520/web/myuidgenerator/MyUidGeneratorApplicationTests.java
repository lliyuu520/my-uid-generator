package com.lliyuu520.web.myuidgenerator;

import com.lliyuu520.web.myuidgenerator.generator.UidGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyUidGeneratorApplicationTests {
@Autowired
private UidGenerator generator;
    @Test
    public void contextLoads() {
        long uid = generator.getUID();
        System.out.println(uid);
    }

}
