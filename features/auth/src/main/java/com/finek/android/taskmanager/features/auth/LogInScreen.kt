package com.finek.android.taskmanager.features.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.finek.android.core.ui.components.AppButton
import com.finek.android.core.ui.components.AppEditField
import com.finek.android.core.ui.components.AppTextButton

@Composable
internal fun LogInScreen() {
	Column(
		modifier = Modifier.fillMaxSize(),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
	) {

		LoginTextField()
		PasswordTextField()
		AppButton(onClick = { /*TODO check credits*/ }) {
			Text("Log in")
		}
	}
}

@Composable
fun LoginTextField() {
	var login by rememberSaveable { mutableStateOf("") }

	TextField(
		value = login,
		onValueChange = { login = it },
		placeholder = { Text("Enter login") },
	)
}


@Composable
fun PasswordTextField() {
	var password by rememberSaveable { mutableStateOf("") }

	TextField(
		value = password,
		onValueChange = { password = it },
		placeholder = { Text("Enter password") },
		visualTransformation = PasswordVisualTransformation(),
		keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
	)
}

@Preview
@Composable
private fun EmptyPreview() {
	LogInScreen()
}