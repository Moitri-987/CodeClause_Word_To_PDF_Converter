package com.project.wordtopdf.pdfModel;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

public class Watermark {
    private BaseColor mTextColor;
    private int mTextSize;
    private Font.FontFamily mFontFamily;

    public BaseColor getTextColor() {
        return mTextColor;
    }

    public void setTextColor(BaseColor textColor) {
        this.mTextColor = textColor;
    }

    public int getTextSize() {
        return mTextSize;
    }

    public void setTextSize(int textSize) {
        this.mTextSize = textSize;
    }

    public Font.FontFamily getFontFamily() {
        return mFontFamily;
    }

    public void setFontFamily(Font.FontFamily fontFamily) {
        this.mFontFamily = fontFamily;
    }

}
