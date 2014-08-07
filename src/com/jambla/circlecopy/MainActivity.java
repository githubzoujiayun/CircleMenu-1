package com.jambla.circlecopy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findView();
		initContent();
		addListener();
	}
	
	/*
	 * 查找布局组件
	 */
	private void findView() {
		
	}

	/*
	 * 初始化布局内容
	 */
	private void initContent() {
	}

	/*
	 * 为布局组件添加监听器
	 */
	private void addListener() {

	}
}
