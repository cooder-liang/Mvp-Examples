package honor.com.mvp_examples.mvp.base;

import javax.inject.Inject;

import honor.com.mvp_examples.http.IResponseManager;

/**
 * 作者：梁洋 on 2018/11/4 0004 22:10
 * 邮箱：m18513333561@163.com
 */
public class BaseModel implements IModel {

    protected IResponseManager responseManager;

    public BaseModel(IResponseManager responseManager) {
        this.responseManager = responseManager;
    }

    @Override
    public void onDestroy() {
        responseManager = null;
    }
}
