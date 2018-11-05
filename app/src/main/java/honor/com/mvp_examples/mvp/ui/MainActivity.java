package honor.com.mvp_examples.mvp.ui;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import honor.com.mvp_examples.R;
import honor.com.mvp_examples.di.component.DaggerUserComponent;
import honor.com.mvp_examples.di.module.UserModule;
import honor.com.mvp_examples.mvp.base.BaseActivity;
import honor.com.mvp_examples.mvp.constract.UserContract;
import honor.com.mvp_examples.mvp.model.entity.UserTopic;
import honor.com.mvp_examples.mvp.presenter.UserPresenter;

public class MainActivity extends BaseActivity<UserPresenter> implements UserContract.View
{
    
    
    Button button;
    TextView tv;
    
    @Inject
    UserPresenter presenter;
    
    @Override
    public int getLayoutResId()
    {
        return R.layout.activity_main;
    }
    
    @Override
    public void setUpActivityComponent()
    {
        DaggerUserComponent
                .builder()
                .userModule(new UserModule(this))
                .build().inject(this);
        
        tv = findViewById(R.id.tv);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("onViewClicked", "onViewClicked: ");
                presenter.requestUserTopics();
            }
        });
    }
    
    @Override
    public void setData(UserTopic userTopics)
    {
        tv.setText("请求的数据：" + userTopics);
        Log.e("setData", "setData: " + userTopics);
    }
    
    @Override
    public void showLoading()
    {
        Log.e("showLoading", "showLoading: 数据加载中。。。");
    }
    
    @Override
    public void hideLoading()
    {
        Log.e("hideLoading", "hideLoading: 数据加载完成。。。");
    }
    
}
