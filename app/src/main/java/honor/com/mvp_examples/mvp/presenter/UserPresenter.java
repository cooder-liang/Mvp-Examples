package honor.com.mvp_examples.mvp.presenter;

import honor.com.mvp_examples.mvp.base.BasePresenter;
import honor.com.mvp_examples.mvp.constract.UserContract;
import honor.com.mvp_examples.mvp.model.entity.UserTopic;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：梁洋 on 2018/11/4 0004 23:00
 * 邮箱：m18513333561@163.com
 */
public class UserPresenter extends BasePresenter<UserContract.Model, UserContract.View>
{
    
    public UserPresenter(UserContract.Model model, UserContract.View view)
    {
        super(model, view);
    }
    
    public void requestUserTopics()
    {
        mRootView.showLoading();
        mModel.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<UserTopic>()
                {
                    @Override
                    public void accept(UserTopic userTopic) throws Exception
                    {
                        mRootView.hideLoading();
                        mRootView.showMessage("request data success");
                        mRootView.setData(userTopic);
                    }
                });
    }
    
}
