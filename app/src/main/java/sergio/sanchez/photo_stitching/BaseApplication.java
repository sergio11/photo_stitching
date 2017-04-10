package sergio.sanchez.photo_stitching;

import android.app.Application;

import com.orhanobut.hawk.Hawk;

import timber.log.Timber;

/**
 * Created by sergio on 10/04/2017.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        // Initialize Hawk 2.0
        Hawk.init(this).build();

    }
}
