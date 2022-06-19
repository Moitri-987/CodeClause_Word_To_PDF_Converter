package com.project.wordtopdf.interfaces;

public interface OnPDFCompressedInterface {
    void pdfCompressionStarted();
    void pdfCompressionEnded(String path, Boolean success);
}
