package com.github.yishenggudou.blitzcrank.tasks;

import com.github.yishenggudou.blitzcrank.tasks.BlitzcrankEngine;
import org.junit.Test;

public class BlitzcrankEngineTest {

    @Test
    public void get() {
        BlitzcrankEngine blitzcrankEngine = new BlitzcrankEngine();
        blitzcrankEngine.get("jwrapper.BaskRunner", "BaskRunner");
    }
}