package com.mizhi.swipebackdemo;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * 类描述：新的界面
 *
 * @Author 许少东
 * Created at 2018/3/28.
 */

public class ThreeActivity extends BaseActivity implements View.OnClickListener {
    private Button mButton;
    private RelativeLayout mRelativeLayout;
    private SwipeBackController mSwipeBackController;
    private int[] mBgColors;
    private static int mBgIndex = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        mButton = (Button) findViewById(R.id.bt_tioazuan);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl_three_view);
        changeActionBarColor();
        mButton.setOnClickListener(this);
        initData();
    }

    private void initData() {
        mSwipeBackController = new SwipeBackController(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this,ThreeActivity.class));
    }

    private void changeActionBarColor() {
        mRelativeLayout.setBackgroundDrawable(new ColorDrawable(getColors()[mBgIndex]));
        mBgIndex++;
        if (mBgIndex >= getColors().length) {
            mBgIndex = 0;
        }
    }

    private int[] getColors() {
        if (mBgColors == null) {
            Resources resource = getResources();
            mBgColors = new int[] {
                    resource.getColor(R.color.androidColorA),
                    resource.getColor(R.color.androidColorB),
                    resource.getColor(R.color.androidColorC),
                    resource.getColor(R.color.androidColorD),
                    resource.getColor(R.color.androidColorE),
            };
        }
        return mBgColors;
    }
}
