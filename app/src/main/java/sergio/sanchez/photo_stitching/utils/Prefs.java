package sergio.sanchez.photo_stitching.utils;


import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.Size;

import com.orhanobut.hawk.Hawk;

/**
 * Created by sergio on 10/04/2017.
 */
public class Prefs {

    private final static String STACK_HORIZONTALLY_KEY = "stack_horizontally";
    private final static String SCALE_PRIORITY_KEY = "scale_priority";
    private final static String BG_FILL_COLOR_KEY = "bg_fill_color";
    private final static String IMAGE_SPACING_HORIZONTAL = "image_spacing_horizontal";
    private final static String IMAGE_SPACING_VERTICAL = "image_spacing_vertical";

    private Prefs() {
    }

    public static boolean getStackHorizontally() {
        return Hawk.get(STACK_HORIZONTALLY_KEY, true);
    }

    public static void setStackHorizontally(boolean newValue) {
        Hawk.put(STACK_HORIZONTALLY_KEY, newValue);
    }

    public static boolean getScalePriority() {
        return Hawk.get(SCALE_PRIORITY_KEY, true);
    }

    public static void setScalePriority(boolean scalePriority) {
        Hawk.put(SCALE_PRIORITY_KEY, scalePriority);
    }

    @ColorInt
    public static int getBgFillColor() {
        return Hawk.get(BG_FILL_COLOR_KEY, Color.TRANSPARENT);
    }

    public static void setBgFillColor(@ColorInt int newValue) {
        Hawk.put(BG_FILL_COLOR_KEY, newValue);
    }

    @Size(2)
    public static int[] getImageSpacing() {
        return new int[] { Hawk.get(IMAGE_SPACING_HORIZONTAL, 0), Hawk.get(IMAGE_SPACING_VERTICAL, 0) };
    }

    public static void setImageSpacing(int horizontal, int vertical) {
        Hawk.put(IMAGE_SPACING_HORIZONTAL, horizontal);
        Hawk.put(IMAGE_SPACING_VERTICAL, vertical);
    }
}
