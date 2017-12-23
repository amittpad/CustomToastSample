package com.example.amittpad.customtoastsample;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Amit TPAD on 12/23/2017.
 */
public class CustomToast {
    public static void show(Context context, String text, boolean isLong) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View layout = inflater.inflate(R.layout.custom_toast_layout, null);

        ImageView image = (ImageView) layout.findViewById(R.id.toast_image);
        image.setImageResource(R.drawable.ic_error_outline_black_24dp);

        TextView textV = (TextView) layout.findViewById(R.id.toast_text);
        textV.setText(text);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 120);
        toast.setDuration((isLong) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
