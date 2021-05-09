package com.jager.crowd.test;

import com.jager.crowd.util.CrowdUtil;
import org.junit.Test;

public class SpringTest {

    @Test
    public void testMd5() {
        String source = "123456";
        String encoded = CrowdUtil.md5(source);
        System.out.println(encoded);
    }

}
