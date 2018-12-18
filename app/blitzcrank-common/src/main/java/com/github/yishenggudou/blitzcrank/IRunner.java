package com.github.yishenggudou.blitzcrank;

import java.util.Map;

/**
 * @author timger
 */
interface IRunner {


    void initialize(Map<String, String> params, Map<String, String> settings);


    String run();

    /**
     * @return
     */
    String getStatus();

    String getResult();


}
