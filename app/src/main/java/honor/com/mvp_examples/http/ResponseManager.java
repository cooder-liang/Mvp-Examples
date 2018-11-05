package honor.com.mvp_examples.http;

import honor.com.mvp_examples.mvp.model.api.Api;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：梁洋 on 2018/11/4 0004 22:13
 * 邮箱：m18513333561@163.com
 */
public class ResponseManager implements IResponseManager
{
    
    @Override
    public <T> T obtainRetrofitService(Class<T> service)
    {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(Api.BASE_URL)
                .build()
                .create(service);
    }
}
