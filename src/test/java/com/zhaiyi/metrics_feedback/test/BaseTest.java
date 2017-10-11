package com.zhaiyi.metrics_feedback.test;

import com.codahale.metrics.MetricRegistry;
import com.zhaiyi.metrics_feedback.FeedbackManager;

import java.util.Random;

/**
 * Created by zhaiyi on 2017/10/3.
 */
public class BaseTest {
    protected FeedbackManager feedbackManager;
    protected MetricRegistry registry;
    protected Random random;

    protected void prepare() {
        registry = new MetricRegistry();
        feedbackManager = new FeedbackManager(registry, 10);
        feedbackManager.setLoggerName("root");
        random = new Random();
    }

    protected void xmlConfig() {
        feedbackManager.setConfigFile("src/test/resource/Configurations.xml");
    }

    protected void codeConfig() {
        feedbackManager.setConfigPackage("com.zhaiyi.metrics_feedback.test.config");
    }
}
