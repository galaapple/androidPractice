package com.example.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.myapplication.R;

/**
 * @author 李阳(liyang073)
 * @date 2020/11/26 14:14
 * @desc view继承练习
 */
public class CustomCircle extends View {
    private final int mColor = Color.RED;
    private final Paint mPaint = new Paint();
    private float radius;

    public CustomCircle(Context context) {
        super(context);
        init();
    }

    public CustomCircle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomCircle);
        radius = Math.max(0, typedArray.getDimension(R.styleable.CustomCircle_radius, 0f));
        typedArray.recycle();
        init();
    }

    private void init() {
        mPaint.setColor(mColor);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawCircle(getPaddingStart() + radius, getPaddingTop() + radius, radius, mPaint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(getCustomDefaultSizeWidth(getSuggestedMinimumWidth(), widthMeasureSpec),
                getCustomDefaultSizeHeight(getSuggestedMinimumHeight(), heightMeasureSpec));
    }

    private int getCustomDefaultSizeWidth(int size, int measureSpec) {
        int result = size;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        switch (specMode) {
            case MeasureSpec.UNSPECIFIED:
                result = size;
                break;
            case MeasureSpec.AT_MOST:
                result = (int) (radius * 2) + getPaddingStart() + getPaddingEnd();
                break;
            case MeasureSpec.EXACTLY:
                result = specSize;
                break;
        }
        return result;
    }

    private int getCustomDefaultSizeHeight(int size, int measureSpec) {
        int result = size;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        switch (specMode) {
            case MeasureSpec.UNSPECIFIED:
                result = size;
                break;
            case MeasureSpec.AT_MOST:
                result = (int) (radius * 2) + getPaddingTop() + getPaddingBottom();
                break;
            case MeasureSpec.EXACTLY:
                result = specSize;
                break;
        }
        return result;
    }
}
