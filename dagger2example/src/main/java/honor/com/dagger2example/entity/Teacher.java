package honor.com.dagger2example.entity;

import android.util.Log;

import honor.com.dagger2example.entity.service.Role;

/**
 * 作者：梁洋 on 2018/11/4 0004 16:04
 * 邮箱：m18513333561@163.com
 */
public class Teacher implements Role {
    @Override
    public void job() {
        Log.e("job", "job: " + "teacher");
    }
}
