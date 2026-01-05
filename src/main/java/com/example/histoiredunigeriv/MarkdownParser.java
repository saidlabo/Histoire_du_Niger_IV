package com.example.histoiredunigeriv;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.graphics.Color;

public class MarkdownParser {

    public static Spannable parseMarkdown(String text) {
        SpannableStringBuilder builder = new SpannableStringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {
            SpannableString spannableLine = new SpannableString(line + "\n");

            // Titres (#)
            if (line.startsWith("# ")) {
                spannableLine = new SpannableString(line.substring(2) + "\n");
                spannableLine.setSpan(new StyleSpan(android.graphics.Typeface.BOLD),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableLine.setSpan(new RelativeSizeSpan(1.5f),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableLine.setSpan(new ForegroundColorSpan(Color.parseColor("#1A237E")),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            // Sous-titres (##)
            else if (line.startsWith("## ")) {
                spannableLine = new SpannableString(line.substring(3) + "\n");
                spannableLine.setSpan(new StyleSpan(android.graphics.Typeface.BOLD),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableLine.setSpan(new RelativeSizeSpan(1.3f),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableLine.setSpan(new ForegroundColorSpan(Color.parseColor("#303F9F")),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            // Liste (-)
            else if (line.startsWith("- ")) {
                spannableLine = new SpannableString("• " + line.substring(2) + "\n");
                spannableLine.setSpan(new ForegroundColorSpan(Color.parseColor("#424242")),
                        0, spannableLine.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }

            builder.append(spannableLine);
        }

        return builder;
    }
}

