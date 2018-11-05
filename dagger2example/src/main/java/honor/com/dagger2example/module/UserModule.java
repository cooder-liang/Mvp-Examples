package honor.com.dagger2example.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import honor.com.dagger2example.entity.User;

/**
 * 作者：梁洋 on 2018/11/4 0004 17:17
 * 邮箱：m18513333561@163.com
 */
@Module
public class UserModule {

    @Provides
    @Singleton
    User provideUser() {
        return new User();
    }

}
