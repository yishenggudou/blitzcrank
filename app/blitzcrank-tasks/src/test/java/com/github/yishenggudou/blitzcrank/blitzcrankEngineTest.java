package com.github.yishenggudou.blitzcrank;

import org.junit.Test;

public class blitzcrankEngineTest {

    @Test
    public void get() {
        BlitzcrankEngine blitzcrankEngine = new BlitzcrankEngine();
        IRunner runner = blitzcrankEngine.get("jwrapper.BaskRunner", "BaskRunner");
        runner.run();
    }
}