package com.qc.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.VideoView;

/*
 * �Զ���VideoView
 * 
 */
public class MyVideoView extends VideoView{

	public MyVideoView(Context context) {
		super(context);
	}

	public MyVideoView(Context context, AttributeSet attrs){
		super(context, attrs);
	}
	
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
		int width = getDefaultSize(0, widthMeasureSpec);
		int height = getDefaultSize(0, heightMeasureSpec);
		setMeasuredDimension(width, height);
	}
	
	public boolean onTouchEvent (MotionEvent ev){
		return true;
	}
	
}
