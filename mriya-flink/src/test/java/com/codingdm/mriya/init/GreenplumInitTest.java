package com.codingdm.mriya.init;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 6/24/2020 1:35 PM
 **/
@Slf4j
public class GreenplumInitTest {

    @Test
    public void initTableSchema(){
        Init init = new GreenplumInit();
        init.initTableSchema();
    }
}
