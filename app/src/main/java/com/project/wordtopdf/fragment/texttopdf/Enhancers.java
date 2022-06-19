package com.project.wordtopdf.fragment.texttopdf;

import android.app.Activity;

import com.project.wordtopdf.interfaces.Enhancer;
import com.project.wordtopdf.pdfModel.TextToPDFOptions;

/**
 * The {@link Enhancers} represent a list of enhancers for the Text-to-PDF feature.
 */
public enum Enhancers {
    FONT_FAMILY {
        @Override
        Enhancer getEnhancer(Activity activity, TextToPdfContract.View view,
                             TextToPDFOptions.Builder builder) {
            return new FontFamilyEnhancer(activity, view, builder);
        }
    };

    /**
     * @param activity The {@link Activity} context.
     * @param view The {@link TextToPdfContract.View} that needs the enhancement.
     * @param builder The builder for {@link TextToPDFOptions}.
     * @return An instance of the {@link Enhancer}.
     */
    abstract Enhancer getEnhancer(Activity activity, TextToPdfContract.View view,
                                  TextToPDFOptions.Builder builder);
}
