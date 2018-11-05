package honor.com.dagger2example.component;

import javax.inject.Singleton;

import dagger.Component;
import honor.com.dagger2example.entity.User;
import honor.com.dagger2example.module.UserModule;

/**
 * 作者：梁洋 on 2018/11/4 0004 21:37
 * 邮箱：m18513333561@163.com
 */
@Singleton
@Component(modules = UserModule.class)
public interface UserComponent {

    User getUser();
}
