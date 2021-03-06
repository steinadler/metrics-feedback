package com.zhaiyi.metricsfeedback.origin.xml.action;

import com.zhaiyi.metricsfeedback.origin.action.Action;
import com.zhaiyi.metricsfeedback.origin.configuration.SafeRange;
import junit.framework.Assert;

/**
 * Created by zhaiyi on 2017/10/10.
 */
public class CounterAction implements Action {
    @Override
    public void onSafe(String metricName, SafeRange safeRange, double current) {
        Assert.assertTrue(current <= safeRange.getMax() && current >= safeRange.getMin());
    }

    @Override
    public void onUnsafe(String metricName, SafeRange safeRange, double current) {
        Assert.assertFalse(current <= safeRange.getMax() && current >= safeRange.getMin());
    }

    @Override
    public void onResume(String metricName, SafeRange safeRange, double current) {
        Assert.assertTrue(current <= safeRange.getMax() && current >= safeRange.getMin());
    }
}
