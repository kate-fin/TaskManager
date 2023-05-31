package com.finek.android.core.data.exceptions

import java.io.IOException


class ObjectNotFoundException(message: String = "Object is not found") : IOException(message) {
}