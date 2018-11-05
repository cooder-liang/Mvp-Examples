package honor.com.mvp_examples.di.component;

import dagger.Component;
import honor.com.mvp_examples.di.module.UserModule;
import honor.com.mvp_examples.di.scope.ActivityScope;
import honor.com.mvp_examples.mvp.ui.MainActivity;

/**
 * 作者：梁洋 on 2018/11/4 0004 23:30
 * 邮箱：m18513333561@163.com
 */
@ActivityScope
@Component(modules = UserModule.class)
public interface UserComponent
{
    
    void inject(MainActivity mainActivity);
    
}
