package honor.com.mvp_examples.mvp.constract;

import honor.com.mvp_examples.mvp.base.IModel;
import honor.com.mvp_examples.mvp.base.IView;
import honor.com.mvp_examples.mvp.model.entity.UserTopic;
import io.reactivex.Observable;

/**
 * 作者：梁洋 on 2018/11/4 0004 22:47
 * 邮箱：m18513333561@163.com
 */
public interface UserContract
{
    
    interface View extends IView
    {
        void setData(UserTopic userTopic);
    }
    
    interface Model extends IModel
    {
        
        Observable<UserTopic> getUsers();
        
    }
    
}
