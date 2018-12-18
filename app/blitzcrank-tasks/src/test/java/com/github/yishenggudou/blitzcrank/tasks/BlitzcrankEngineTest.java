package com.github.yishenggudou.blitzcrank.tasks;

import com.github.yishenggudou.blitzcrank.common.IRunnerType;
import org.junit.Test;

public class BlitzcrankEngineTest {

    @Test
    public void get() {
        BlitzcrankEngine blitzcrankEngine = new BlitzcrankEngine();
        IRunnerType iRunnerType = blitzcrankEngine.get("jwrapper.BaskRunner", "BaskRunner");
        iRunnerType.run();
    }
}