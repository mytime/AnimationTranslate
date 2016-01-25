package com.hello.animationtranslate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

/**
 * 使用TranslateAnimation创建移位动画效果
 */
public class MainActivity extends AppCompatActivity {

    //移动属性
    private TranslateAnimation ta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //实例化移动对象
        //相对于自身向右移动200，向下移动200
        ta = new TranslateAnimation(0,200,0,200);

        //持续时间，不设置值无效果
        ta.setDuration(1000);

        findViewById(R.id.btnTranslate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //方法一
                //v.startAnimation(ta);

                //方法二: 使用xml方式创建
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.ta));

            }
        });
    }
}
