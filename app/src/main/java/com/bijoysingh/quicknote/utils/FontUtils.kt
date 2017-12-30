package com.bijoysingh.quicknote.utils

import android.graphics.Typeface
import android.content.Context

/**
 * Created by keyurgolani on 12/30/17.
 */

fun getDefaultFont(): String {
    return "com/keyur/quicknote/fonts/PTMono.ttf"
}

fun getFont(fontName: String): String{
    return "com/keyur/quicknote/fonts/" + fontName
}

fun getTypeFace(context: Context, font: String?): Typeface {
    if(font != null) {
        return Typeface.createFromAsset(context.assets, getFont(font!!))
    }
    return Typeface.createFromAsset(context.assets, getDefaultFont())
}