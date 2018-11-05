package honor.com.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import honor.com.dagger2example.R;
import honor.com.dagger2example.component.DaggerHumanComponent;
import honor.com.dagger2example.component.DaggerMain2ActivityComponent;
import honor.com.dagger2example.entity.Man;
import honor.com.dagger2example.entity.Woman;
import honor.com.dagger2example.entity.service.Role;
import honor.com.dagger2example.entity.service.StudentRole;
import honor.com.dagger2example.entity.service.TeacherRole;

public class Main2Activity extends AppCompatActivity {

    @Inject
    @Named("student")
    Role role;
    Role role1;

    @Inject
    @StudentRole
    Role role2;

    Role role3;

    @Inject
    Man man;
    @Inject
    Woman woman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        DaggerMain2ActivityComponent.create().inject(this);
        DaggerMain2ActivityComponent.builder()
                .humanComponent(DaggerHumanComponent.create())
                .build().inject(this);
        role.job();

        role1.job();

        role2.job();
        role3.job();

        man.speak();
        woman.speak();
    }

    @Inject
    public void setRole1(@Named("teacher") Role role1) {
        this.role1 = role1;
    }

    @Inject
    public void setRole3(@TeacherRole Role role3) {
        this.role3 = role3;
    }
}
