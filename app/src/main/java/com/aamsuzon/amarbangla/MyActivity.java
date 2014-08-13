package com.aamsuzon.amarbangla;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.TextView;
import androidbangladesh.bengali.support.BengaliUnicodeString;
import android.graphics.Typeface;
public class MyActivity extends Activity {
    String text;
    TextView bnview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        bnview = (TextView)findViewById(R.id.textview);
        try{
            text = "নিশীথ রাতের নিশী তারা আমি, আমার ঘুম না আসে।\n" +
                    "লোহিত শিখার দাবানল মাঝে আমার শরীর ভাসে।\n" +
                    "লাল প্রস্তর জ্বলে নিরন্তর আমার বুকের মাঝে।\n" +
                    "আমি ম্রিওমান,চাঁদ আম্লান হাসে আকাশের পাশে।\n" +
                    "\n" +
                    "তুমি আজ সেই চাঁদের আলোয়, হারিয়েছ মোহক্ষণে,\n" +
                    "তাই মোর আজ আসে যতো সব নীল গল্প মনে।\n" +
                    "ঘুমের আভাবে, কিছুটা স্বভাবে, অবুঝ এ বুক আজ নীলা পাথর জ্বালে।\n" +
                    "নীলের শিখাই তবু তুমি এলে সব নিভে যায় জলে।\n" +
                    "\n" +
                    "কষ্টি পাথর ছিলনা বলে সোনারা যায় সব গলে,\n" +
                    "পিতল গ্লাসে তুমি জল খাও, ঘুম যায় তাই চলে।\n" +
                    "পাখিদের ডাকে আমার ঘুম আসে,\n" +
                    "সন্ধ্যা বেলায়, ঘুম ভেঙ্গে যায় সূর্য মামার ডাকে।\n" +
                    "\n" +
                    "অঘুমন্ত রাতের এতো কথা যতই লিখি, শেষ হয়না পাতা।\n" +
                    "বড়ই কষ্ট এসমস্ত অবুঝ মনের ব্যাথা ।";
            BengaliUnicodeString.getBengaliUTF(MyActivity.this,text,bnview);
            char[] t = text.toCharArray();
            for(int i=0;i<text.length();i++){
                Log.d("TEXT",Integer.toHexString(t[i])+"  -> "+t[i]);
            }
        }catch(Exception e){

        }
    }

}

