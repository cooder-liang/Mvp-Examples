package honor.com.dagger2example.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import honor.com.dagger2example.entity.Student;
import honor.com.dagger2example.entity.Teacher;
import honor.com.dagger2example.entity.service.Role;

/**
 * 作者：梁洋 on 2018/11/4 0004 16:08
 * 邮箱：m18513333561@163.com
 */
@Module
public class RoleModule {

    @Provides
    @Named("teacher")
    Role provideTeacher() {
        return new Teacher();
    }

    @Provides
    @Named("student")
    Role provideStudent() {
        return new Student();
    }

}
