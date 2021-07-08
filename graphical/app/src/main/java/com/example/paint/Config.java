package com.example.paint;

import android.app.Activity;

public final class Config extends Activity {

    protected enum Shape {
        CIRCLE,
        LINE,
        POLYGON,
        TEXT
    }
    protected enum PenType {
        DRAW,
        ERASE,
        SHAPE_STROKE,
        SHAPE_FILL

    }

    public static int height;
    public static int width;
    public static int offset;

}
