package com.javacodegeeks.androidcanvasexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class SquareView extends View {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        // setContentView(R.layout.activity_draw_touch);
//
//        mView = new DrawTouchView(this);
//        setContentView(mView);
//    }

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private float initX1, initY1, initX2, initY2;
    private boolean drawing = false;

    public SquareView(Context context) {
        super(context);
        init();
    }

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SquareView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        paint.setColor(Color.BLACK);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),
                MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (drawing) {
            canvas.drawRect(initX1, initY1, initX2, initY2, paint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getAction();
        if (action == MotionEvent.ACTION_MOVE) {
            initX2 = event.getX();
            initY2 = event.getY();
        } else if (action == MotionEvent.ACTION_DOWN) {
            initX1 = event.getX();
            initY1= event.getY();
            initX2 = initX1+1;
            initY2= initY1+1;
            drawing = true;
        } else if (action == MotionEvent.ACTION_UP) {
            //drawing = false;
            //performClick();
        }
        invalidate();
        return true;
    }

    public void clearCanvas() {
        drawing = false;
        performClick();
        invalidate();
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }

}