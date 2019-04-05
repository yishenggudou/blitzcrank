package com.github.yishenggudou.blitzcrank.core;

import java.util.Map;

/**
 * @author timger
 */
public interface IRunnerType {


    public void initialize(Map<String, String> params, Map<String, String> settings);

    public String run();

    public String getStatus();

    public String getResult();

    public String getParams();

    public String getSetting();

    public String getContext();

    public void rollback();

    public void retry();


}
