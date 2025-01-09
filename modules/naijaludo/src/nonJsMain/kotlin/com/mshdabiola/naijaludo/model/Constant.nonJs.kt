package com.mshdabiola.naijaludo.model

import java.util.logging.Logger

actual fun log(msg: String) {
    {
        if (isDebug) {
            Logger.getLogger("Ludo game ").severe(msg)
        }
    }
}
