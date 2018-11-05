package honor.com.mvp_examples.mvp.base;

/**
 * 作者：梁洋 on 2018/11/4 0004 22:03
 * 邮箱：m18513333561@163.com
 */
public interface IView {

    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 显示信息
     *
     * @param message
     */
    default void showMessage(String message) {
    }

}
