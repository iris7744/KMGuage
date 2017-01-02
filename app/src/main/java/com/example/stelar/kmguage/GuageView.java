package com.example.stelar.kmguage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;
import static android.graphics.Paint.Style.STROKE;

/**
 * Created by Stelar on 2017-01-02.
 */

public class GuageView extends View {

    Context context;
    public GuageView(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public GuageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public GuageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        Paint paint = new Paint();
        Path path = new Path();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(width * 3.0f/4.0f,width * 1.0f/4.0f);
        //원점
        path.lineTo(width * 3.0f/4.0f,width * 3.0f/4.0f);
        path.lineTo(width * 1.0f/4.0f,width * 3.0f/4.0f);
        canvas.drawPath(path,paint);
    }

    public void initView(){

    }

    public static int DPToPX(Context context, int dp ) {
        Resources resources = context.getResources( );
        DisplayMetrics metrics = resources.getDisplayMetrics( );
        float px = dp * ( metrics.densityDpi / 160f );
        return ( int ) px;
    }
}
