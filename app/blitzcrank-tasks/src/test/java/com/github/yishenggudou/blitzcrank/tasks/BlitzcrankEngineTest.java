package com.github.yishenggudou.blitzcrank.tasks;

import com.github.yishenggudou.blitzcrank.common.IRunnerType;
import org.junit.Test;

public class BlitzcrankEngineTest {

    @Test
    public void get() {
        Integer step = 0;
        Long start = System.currentTimeMillis();
        while (step < 1000) {
            BlitzcrankEngine blitzcrankEngine = BlitzcrankEngine.getInstance();
            IRunnerType iRunnerType = blitzcrankEngine.get("jwrapper.BaskRunner", "BaskRunner");
            iRunnerType.run();
            step += 1;
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}