package com.ltf.mytoolslibrary.viewbase.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/**
 * @author 李堂飞
 * @brief 只在竖直方向才能下拉刷新的控件
 * @date 2016/7/2
 */
public class VerticalSwipyRefreshLayout extends SwipyRefreshLayout {

	private int mTouchSlop;
	// 上一次触摸时的X坐标
	private float mPrevX;

	public VerticalSwipyRefreshLayout(Context context, AttributeSet attrs) {
		super(context, attrs);

		// 触发移动事件的最短距离，如果小于这个距离就不触发移动控件
		mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
		Log.d("VerticalSwipyRefreshLayout", "--mTouchSlop--"+mTouchSlop);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			mPrevX = event.getX();
			break;

		case MotionEvent.ACTION_MOVE:
			final float eventX = event.getX();
			float xDiff = Math.abs(eventX - mPrevX);
			// Log.d("refresh" ,"move----" + eventX + "   " + mPrevX + "   " +
			// mTouchSlop);
			// 增加60的容差，让下拉刷新在竖直滑动时就可以触发
			Log.d("VerticalSwipyRefreshLayout", "--xDiff--"+xDiff);
			if (xDiff > mTouchSlop + 10) {
				return false;
			}
		}

		return super.onInterceptTouchEvent(event);
	}
}
