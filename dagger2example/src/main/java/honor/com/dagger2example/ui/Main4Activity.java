package honor.com.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import honor.com.dagger2example.App;
import honor.com.dagger2example.R;
import honor.com.dagger2example.component.DaggerMain4ActivityComponent;
import honor.com.dagger2example.entity.User;

public class Main4Activity extends AppCompatActivity {

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        DaggerMain4ActivityComponent.builder()
                .userComponent(((App) getApplication()).getUserComponent())
                .build().inject(this);

        Log.e("onCreate", "onCreate: " + user);
    }
}
