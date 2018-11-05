package honor.com.mvp_examples.di.module;

import dagger.Module;
import dagger.Provides;
import honor.com.mvp_examples.di.scope.ActivityScope;
import honor.com.mvp_examples.http.IResponseManager;
import honor.com.mvp_examples.http.ResponseManager;
import honor.com.mvp_examples.mvp.constract.UserContract;
import honor.com.mvp_examples.mvp.model.UserTopicModel;
import honor.com.mvp_examples.mvp.presenter.UserPresenter;

/**
 * 作者：梁洋 on 2018/11/4 0004 23:35
 * 邮箱：m18513333561@163.com
 */
@Module
public class UserModule
{
    private UserContract.View view;
    
    public UserModule(UserContract.View view)
    {
        this.view = view;
    }
    
    @ActivityScope
    @Provides
    IResponseManager providerIResponseManager()
    {
        return new ResponseManager();
    }
    
    @ActivityScope
    @Provides
    UserTopicModel providerUserTopicModel(IResponseManager responseManager)
    {
        return new UserTopicModel(responseManager);
    }
    
    @ActivityScope
    @Provides
    UserContract.Model providerUserModel(UserTopicModel model)
    {
        return model;
    }
    
    @ActivityScope
    @Provides
    UserContract.View providerUserView()
    {
        return view;
    }
    
    @ActivityScope
    @Provides
    UserPresenter providerUserPresenter(UserContract.Model model, UserContract.View view)
    {
        return new UserPresenter(model, view);
    }
    
}
