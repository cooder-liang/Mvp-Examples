package honor.com.dagger2example.component;

import dagger.Component;
import honor.com.dagger2example.module.RoleModule;
import honor.com.dagger2example.module.RoleModule1;
import honor.com.dagger2example.ui.Main2Activity;

/**
 * 作者：梁洋 on 2018/11/4 0004 16:10
 * 邮箱：m18513333561@163.com
 */
@Component(modules = {RoleModule.class, RoleModule1.class}, dependencies = {HumanComponent.class})
public interface Main2ActivityComponent {

    void inject(Main2Activity activity);

}
