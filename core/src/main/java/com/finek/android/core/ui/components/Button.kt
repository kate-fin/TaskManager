package com.finek.android.core.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.finek.android.core.ui.theme.TaskManagerTheme

@Composable
fun AppButton(
	onClick: () -> Unit,
	modifier: Modifier = Modifier,
	enabled: Boolean = true,
	contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
	content: @Composable RowScope.() -> Unit,
) {
	Button(
		onClick = onClick,
		modifier = modifier,
		enabled = enabled,
//		colors = ButtonDefaults.buttonColors(
//			containerColor = MaterialTheme.colorScheme.onBackground,
//		),
		contentPadding = contentPadding,
		content = content,
	)
}

@Composable
fun AppTextButton(
	onClick: () -> Unit,
	modifier: Modifier = Modifier,
	enabled: Boolean = true,
	content: @Composable RowScope.() -> Unit,
) {
	TextButton(
		onClick = onClick,
		modifier = modifier,
		enabled = enabled,
//		colors = ButtonDefaults.textButtonColors(
//			contentColor = MaterialTheme.colorScheme.onBackground,
//		),
		content = content,
	)
}

@Preview(showBackground = true)
@Composable
fun AppButtonPreview() {
	TaskManagerTheme {
		AppButton(onClick = {}) {
			Text(text = "Hello Button")
		}
	}
}

@Preview(showBackground = true)
@Composable
fun AppTextButtonPreview() {
	TaskManagerTheme {
		AppTextButton(onClick = {}) {
			Text(text = "Hello Text Button")
		}
	}
}