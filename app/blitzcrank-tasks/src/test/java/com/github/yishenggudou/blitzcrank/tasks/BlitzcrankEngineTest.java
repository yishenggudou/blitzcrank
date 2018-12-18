package com.github.yishenggudou.blitzcrank.tasks;

import com.github.yishenggudou.blitzcrank.common.IRunnerType;
import org.junit.Test;

public class BlitzcrankEngineTest {

    @Test
    public void get() {
        Integer step = 0;
        Long start = System.currentTimeMillis();
        Integer times = 3000;
        while (step < times) {
            BlitzcrankEngine blitzcrankEngine = BlitzcrankEngine.getInstance();
            blitzcrankEngine.addPath("/data/github/blitzcrank/target/jython-plugins-tmp/Lib");
            IRunnerType iRunnerType = blitzcrankEngine.get("jwrapper.BaskRunner", "BaskRunner");
            iRunnerType.run();
            step += 1;
        }
        Long end = System.currentTimeMillis();
        Long token = end - start;
        System.out.println(token);
        System.out.println(String.format("%f ms", Float.valueOf(token) / times));
    }
}