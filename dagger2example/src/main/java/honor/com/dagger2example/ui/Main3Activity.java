package honor.com.dagger2example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import honor.com.dagger2example.App;
import honor.com.dagger2example.R;
import honor.com.dagger2example.component.DaggerMain3ActivityComponent;
import honor.com.dagger2example.entity.User;

public class Main3Activity extends AppCompatActivity {

    @Inject
    User user;

    @Inject
    User user1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        DaggerMain3ActivityComponent.builder()
                .userComponent(((App) getApplication()).getUserComponent())
                .build().inject(this);

        Log.e("onCreate", "onCreate: " + user);
        Log.e("onCreate11", "onCreate: " + user1);

        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
}
