package com.mshdabiola.mainscreen

import android.content.Context

object ShareUtil {
    private const val pref_name = "share_pref"

    fun setLanguage(context: Context, land: Int) {
        context.getSharedPreferences(pref_name, Context.MODE_PRIVATE)
            .edit()
            .putInt("land", land)
            .apply()
    }

    fun getLand(context: Context): String {
//         if(local_lang!=null){
//             return local_lang as String
//         }
        val land = context.getSharedPreferences(pref_name, Context.MODE_PRIVATE)
            .getInt("land", 0)
        val lands =
            context.resources.getStringArray(com.mshdabiola.designsystem.R.array.language_locale)

        //  local_lang=lands[land]
        return lands[land]
    }
}
