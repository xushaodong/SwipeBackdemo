package com.mizhi.swipebackdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * 类描述：第三个页面
 *
 * @Author 许少东
 * Created at 2018/3/28.
 */

public class ThreeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private SwipeBackController mSwipeBackController;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        mButton = findViewById(R.id.bt_tioazuan);
        mButton.setOnClickListener(this);
        initData();
    }

    private void initData() {
        mSwipeBackController = new SwipeBackController(this);
    }

    @Override
    public void onClick(View view) {

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (mSwipeBackController.processEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
