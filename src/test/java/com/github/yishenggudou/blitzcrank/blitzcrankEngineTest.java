package com.github.yishenggudou.blitzcrank;

import org.junit.Test;

public class blitzcrankEngineTest {

    @Test
    public void get() {
        BlitzcrankEngine blitzcrankEngine = new BlitzcrankEngine();
        IRunner runner = blitzcrankEngine.get("jython-package-wrapper.BaskRunner", "BaskRunner");
        runner.run();
    }
}