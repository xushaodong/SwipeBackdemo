package com.mizhi.swipebackdemo;

import android.os.Bundle;

import com.mizhi.swipbacklibrary.SwipeBackLayout;
import com.mizhi.swipbacklibrary.app.SwipeBackActivity;


/**
 * 类描述：
 *
 * @Author 许少东
 * Created at 2018/3/28.
 */

public class BaseActivity extends SwipeBackActivity {
    private SwipeBackLayout mSwipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSwipeBackEnable(true);
        mSwipeBackLayout = getSwipeBackLayout();
        // 设置滑动方向，可设置EDGE_LEFT, EDGE_RIGHT, EDGE_ALL, EDGE_BOTTOM
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
        // 滑动退出的效果只能从边界滑动才有效果，如果要扩大touch的范围，可以调用这个方法
        //mSwipeBackLayout.setEdgeSize(200);
    }
}
