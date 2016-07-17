/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simpleSpringConfig.test;

import com.mycompany.simplespringconfig.CompactDisc;
//import com.mycompany.simplespringconfig.Config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
/**
 *
 * @author eyuel
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=AppConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }
}
