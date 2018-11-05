package honor.com.mvp_examples.mvp.base;

/**
 * 作者：梁洋 on 2018/11/4 0004 23:00
 * 邮箱：m18513333561@163.com
 */
public class BasePresenter<M extends IModel, V extends IView> implements IPresenter {

    protected M mModel;
    protected V mRootView;

    public BasePresenter(M mModel, V mRootView) {
        this.mModel = mModel;
        this.mRootView = mRootView;
        onStart();
    }

    public BasePresenter(V mRootView) {
        this.mRootView = mRootView;
        onStart();
    }

    public BasePresenter() {
        onStart();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {

    }
}
