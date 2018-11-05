package honor.com.dagger2example.module;

import dagger.Module;
import dagger.Provides;
import honor.com.dagger2example.entity.Student;
import honor.com.dagger2example.entity.Teacher;
import honor.com.dagger2example.entity.service.Role;
import honor.com.dagger2example.entity.service.StudentRole;
import honor.com.dagger2example.entity.service.TeacherRole;

/**
 * 作者：梁洋 on 2018/11/4 0004 16:35
 * 邮箱：m18513333561@163.com
 */
@Module
public class RoleModule1 {

    @Provides
    @TeacherRole
    Role provideTeacher() {
        return new Teacher();
    }

    @Provides
    @StudentRole
    Role provideStudent() {
        return new Student();
    }

}
