package honor.com.mvp_examples.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

/**
 * 作者：梁洋 on 2018/11/4 0004 23:15
 * 邮箱：m18513333561@163.com
 */
public abstract class BaseActivity<P extends IPresenter> extends Activity
{
    
    protected P mPresenter;
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        setUpActivityComponent();
    }
    
    public abstract int getLayoutResId();
    
    public abstract void setUpActivityComponent();
}
