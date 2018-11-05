package honor.com.dagger2example;

import android.app.Application;

import honor.com.dagger2example.component.DaggerUserComponent;
import honor.com.dagger2example.component.UserComponent;

/**
 * 作者：梁洋 on 2018/11/4 0004 18:21
 * 邮箱：m18513333561@163.com
 */
public class App extends Application {

    UserComponent userComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        userComponent = DaggerUserComponent.create();
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }
}
