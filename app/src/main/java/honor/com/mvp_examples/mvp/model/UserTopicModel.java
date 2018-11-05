package honor.com.mvp_examples.mvp.model;

import javax.inject.Inject;

import honor.com.mvp_examples.http.IResponseManager;
import honor.com.mvp_examples.mvp.base.BaseModel;
import honor.com.mvp_examples.mvp.constract.UserContract;
import honor.com.mvp_examples.mvp.model.api.service.ApiService;
import honor.com.mvp_examples.mvp.model.entity.UserTopic;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * 作者：梁洋 on 2018/11/4 0004 22:39
 * 邮箱：m18513333561@163.com
 */
public class UserTopicModel extends BaseModel implements UserContract.Model
{
    
    public UserTopicModel(IResponseManager responseManager)
    {
        super(responseManager);
    }
    
    @Override
    public Observable<UserTopic> getUsers()
    {
        return Observable.just(responseManager
                .obtainRetrofitService(ApiService.class)
                .getUsers()).flatMap(new Function<Observable<UserTopic>, ObservableSource<UserTopic>>()
        {
            @Override
            public ObservableSource<UserTopic> apply(Observable<UserTopic> userTopicObservable) throws Exception
            {
                return userTopicObservable;
            }
        });
    }
}
