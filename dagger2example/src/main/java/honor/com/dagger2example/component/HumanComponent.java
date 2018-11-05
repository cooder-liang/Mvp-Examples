package honor.com.dagger2example.component;

import dagger.Component;
import honor.com.dagger2example.ui.MainActivity;

/**
 * 作者：梁洋 on 2018/11/4 0004 15:22
 * 邮箱：m18513333561@163.com
 */
@Component
public interface HumanComponent {

    void inject(MainActivity mainActivity);

}
