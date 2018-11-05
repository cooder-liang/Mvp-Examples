package honor.com.mvp_examples.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 作者：梁洋 on 2018/11/4 0004 23:30
 * 邮箱：m18513333561@163.com
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface FragmentScope {
}
