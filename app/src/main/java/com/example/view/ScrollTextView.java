package com.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * @author 李阳(liyang073)
 * @date 2020/11/23 18:14
 * @desc 滑动TextView
 */
public class ScrollTextView extends androidx.appcompat.widget.AppCompatTextView {

    private Scroller scroller = new Scroller(getContext());

    public ScrollTextView(Context context) {
        super(context);
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void smoothScrollTo(int x, int y) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();

        int deltaX = x - scrollX;
        int deltaY = y - scrollY;

        scroller.startScroll(scrollX, scrollY, deltaX, deltaY, 2000);
        invalidate();
    }

    @Override
    public void computeScroll() {
        /*super.computeScroll();*/
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }
}
