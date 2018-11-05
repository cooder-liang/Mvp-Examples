package honor.com.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import honor.com.dagger2example.R;
import honor.com.dagger2example.component.DaggerHumanComponent;
import honor.com.dagger2example.entity.service.Human;
import honor.com.dagger2example.entity.Man;
import honor.com.dagger2example.entity.Woman;

/**
 * @Inject 构造器  属性  方法 @Inject only by one Constructor
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Man man;
    @Inject
    Woman woman;

    Man man1;

    Woman woman1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerHumanComponent.create().inject(this);
        man.speak();
        woman.speak();

        man1.speak();
        woman1.speak();

    }

    @Inject
    public void setMan1(Man man1) {
        this.man1 = man1;
    }

    @Inject
    public void setWoman1(Woman woman1) {
        this.woman1 = woman1;
    }
}
