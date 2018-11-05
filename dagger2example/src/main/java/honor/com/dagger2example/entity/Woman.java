package honor.com.dagger2example.entity;

import android.util.Log;

import javax.inject.Inject;

import honor.com.dagger2example.entity.service.Human;

/**
 * 作者：梁洋 on 2018/11/4 0004 15:20
 * 邮箱：m18513333561@163.com
 */
public class Woman implements Human {

    @Inject
    public Woman() {
    }

    @Override
    public void speak() {
        Log.e("speak", "speak: " + "女人");
    }
}
