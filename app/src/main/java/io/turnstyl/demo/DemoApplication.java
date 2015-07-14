package io.turnstyl.demo;

import com.localytics.android.LocalyticsActivityLifecycleCallbacks;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by brian.chu on 7/8/15.
 */
public class DemoApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // localytics
        registerActivityLifecycleCallbacks(new LocalyticsActivityLifecycleCallbacks(this));

        // Leakcanary
        LeakCanary.install(this);

    }
}
