package honor.com.mvp_examples.http;

/**
 * 作者：梁洋 on 2018/11/4 0004 22:10
 * 邮箱：m18513333561@163.com
 */
public interface IResponseManager {

    /**
     * 将传入的service 转换成Retrofit 的 serviceBean
     *
     * @param service
     * @param <T>
     * @return
     */
    <T> T obtainRetrofitService(Class<T> service);


}
