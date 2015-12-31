package com.javacodegeeks.androidcanvasexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AndroidCanvasExample extends Activity {

	private DotView dot;
	private CircleView circle;
	private SquareView square;
	private LineView line;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//dot = (DotView) findViewById(R.id.dot_canvas);
		//circle = (CircleView) findViewById(R.id.circle_canvas);
		//square = (SquareView) findViewById(R.id.square_canvas);
		line = (LineView) findViewById(R.id.line_canvas);
	}

	public void clearCanvas(View v) {
		//dot.clearCanvas();
		//circle.clearCanvas();
		//square.clearCanvas();
		line.clearCanvas();
	}

}