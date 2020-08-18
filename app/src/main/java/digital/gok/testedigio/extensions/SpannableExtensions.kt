package digital.gok.testedigio.extensions

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
import android.text.Spanned.SPAN_EXCLUSIVE_INCLUSIVE
import android.text.style.ForegroundColorSpan
import androidx.core.text.toSpannable
import digital.gok.testedigio.R
import java.security.AccessControlContext

fun String.paintFirstWord(context: Context): Spannable {
    val words = this.split("\\s".toRegex())

    val builder = SpannableStringBuilder()
    builder.append(
        SpannableString(words.first()).apply {
            val color = context.getColor(R.color.blue_digio)
            setSpan(ForegroundColorSpan(color), 0, words.first().length, SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    ).append(" ")

    for (string: String in words.subList(1, words.size)) {
        builder.append(string).append(" ")
    }
    return builder.toSpannable()
}