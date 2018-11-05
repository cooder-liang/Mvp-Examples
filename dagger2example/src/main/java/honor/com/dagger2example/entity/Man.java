package honor.com.dagger2example.entity;

import android.util.Log;

import javax.inject.Inject;

import honor.com.dagger2example.entity.service.Human;

/**
 * 作者：梁洋 on 2018/11/4 0004 15:18
 * 邮箱：m18513333561@163.com
 */
public class Man implements Human {

    @Inject
    public Man() {
    }

    @Override
    public void speak() {
        Log.e("speak", "speak: " + "男人");
    }
}
