package com.finek.android.taskmanager.features.auth

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun AuthScreen() {
	Text(text = "hello auth screen")
}

@Preview
@Composable
private fun EmptyPreview() {
	AuthScreen()
}