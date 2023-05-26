package com.finek.android.taskmanager.features.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.finek.android.core.ui.components.AppTextButton

@Composable
internal fun AuthScreen() {
	Column(
		modifier = Modifier.fillMaxSize().padding(bottom = 25.dp),
		verticalArrangement = Arrangement.Bottom,
		horizontalAlignment = Alignment.CenterHorizontally,
	) {
		AppTextButton(onClick = { /*TODO navigate to registry*/ }) {
			Text("Registry")
		}

		AppTextButton(onClick = { /*TODO navigate to auth*/ }) {
			Text("Log in")
		}
	}
}

@Preview
@Composable
private fun EmptyPreview() {
	AuthScreen()
}