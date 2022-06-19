package com.project.wordtopdf.pdfModel;

public class PDFOptions {

    private String mOutFileName;
   private String mPageSize;
   private int mPageColor;

    PDFOptions() {

    }

    PDFOptions(String mFileName, String mPageSize, boolean mPasswordProtected, String mPassword,
               int mBorderWidth, boolean mWatermarkAdded, Watermark mWatermark, int pageColor) {
        this.mOutFileName = mFileName;
        this.mPageSize = mPageSize;
        this.mPageColor = pageColor;
    }

    public String getOutFileName() {
        return mOutFileName;
    }

    public String getPageSize() {
        return mPageSize;
    }

    public void setOutFileName(String mOutFileName) {
        this.mOutFileName = mOutFileName;
    }

    public int getPageColor() {
        return mPageColor;
    }

    public void setPageColor(int pageColor) {
        this.mPageColor = pageColor;
    }
}
