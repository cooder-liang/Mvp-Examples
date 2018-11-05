package honor.com.dagger2example.component;

import dagger.Component;
import honor.com.dagger2example.entity.service.ActivityScope;
import honor.com.dagger2example.ui.Main3Activity;

/**
 * 作者：梁洋 on 2018/11/4 0004 17:05
 * 邮箱：m18513333561@163.com
 */
@ActivityScope
@Component(dependencies = UserComponent.class)
public interface Main3ActivityComponent {

    void inject(Main3Activity activity);
}
