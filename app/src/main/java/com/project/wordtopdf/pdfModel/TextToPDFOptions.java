package com.project.wordtopdf.pdfModel;

import android.content.Context;
import android.net.Uri;

import com.itextpdf.text.Font;

import com.project.wordtopdf.pdfPreferences.TextToPdfPreferences;

public class TextToPDFOptions extends PDFOptions {
    private final Uri mInFileUri;
    private final int mFontSize;
    private final Font.FontFamily mFontFamily;
    private final int mFontColor;

    public TextToPDFOptions(String mFileName, String mPageSize, boolean mPasswordProtected,
                            String mPassword, Uri mInFileUri, int mFontSize, Font.FontFamily mFontFamily, int color,
                            int pageColor) {
        super(mFileName, mPageSize, mPasswordProtected, mPassword, 0, false, null, pageColor);
        this.mInFileUri = mInFileUri;
        this.mFontSize = mFontSize;
        this.mFontFamily = mFontFamily;
        this.mFontColor = color;
    }

    public Uri getInFileUri() {
        return mInFileUri;
    }

    public int getFontSize() {
        return mFontSize;
    }

    public Font.FontFamily getFontFamily() {
        return mFontFamily;
    }

    public int getFontColor() {
        return mFontColor;
    }

    public static class Builder {

        private String mFileName;
        private String mPageSize;
        private boolean mPasswordProtected;
        private String mPassword;
        private int mPageColor;
        private Uri mInFileUri;
        private int mFontSize;
        private Font.FontFamily mFontFamily;
        private int mFontColor;

        public Builder(Context context) {
            final TextToPdfPreferences preferences = new TextToPdfPreferences(context);
            mPageSize = preferences.getPageSize();
            mPasswordProtected = false;
            mFontColor = preferences.getFontColor();
            mFontFamily = Font.FontFamily.valueOf(preferences.getFontFamily());
            mFontSize = preferences.getFontSize();
            mPageColor = preferences.getPageColor();
        }

        public String getFileName() {
            return mFileName;
        }

        public Builder setFileName(String fileName) {
            mFileName = fileName;
            return this;
        }

        public String getPassword() {
            return mPassword;
        }

        public Builder setPassword(String password) {
            mPassword = password;
            return this;
        }

        public Uri getInFileUri() {
            return mInFileUri;
        }

        public Builder setInFileUri(Uri inFileUri) {
            mInFileUri = inFileUri;
            return this;
        }

        public Font.FontFamily getFontFamily() {
            return mFontFamily;
        }

        public Builder setFontFamily(Font.FontFamily fontFamily) {
            mFontFamily = fontFamily;
            return this;
        }

        public TextToPDFOptions build() {
            return new TextToPDFOptions(mFileName, mPageSize, mPasswordProtected,
                    mPassword, mInFileUri, mFontSize, mFontFamily, mFontColor, mPageColor);
        }


    }
}
