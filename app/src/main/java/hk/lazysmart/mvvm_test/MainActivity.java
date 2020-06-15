package hk.lazysmart.mvvm_test;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import hk.lazysmart.mvvm_test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();

//        final User user = new User();
        user.setAge(22);
        user.setUserName("Tom");
//        Button btn1 = (Button) findViewById(R.id.btn1);
//        btn1.setText("ABC");
binding.setUser(user);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age = user.getAge();
                age++;
                user.setAge(age);
                updateChange();
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                int age = user.getAge();
                //                age++;
                //                user.setAge(age);

                String name = user.getUserName();
                name = name + " A";
                user.setUserName(name);
//                binding.setUser(user);
                updateChange();
            }
        });
    }

//    private void updateChange(User user) {
//    }

    private void updateChange() {
        binding.setUser(user);
    }
}
