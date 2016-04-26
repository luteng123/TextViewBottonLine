package com.goyo.textviewbottonline;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CustomTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (CustomTextView) findViewById(R.id.main_text);
        textView.setText("1111111111111111111111111111111111111111111111111111222222222222222222222222222222222222222222222222222222222222333333333333333333333333");
        textView.setSpeed(5000);
        textView.setDelayed(500);
        textView.startScroll();


        //下划线设置成功！
//        textView .getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG );

        //设置不同文字颜色和大小
//        SpannableString styledText = new SpannableString(textView.getText().toString());
//        styledText.setSpan(new TextAppearanceSpan(this, R.style.style0), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        styledText.setSpan(new TextAppearanceSpan(this, R.style.style1), 3, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        styledText.setSpan(new TextAppearanceSpan(this, R.style.style2), 5, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        Log.d("","22");
        Log.d("","33");
        Log.d("","44");
//        textView.setText(styledText, TextView.BufferType.SPANNABLE);
    }

    public void btnClick(View view) {
        Toast.makeText(this,"点我我也滚",Toast.LENGTH_SHORT).show();}
}
