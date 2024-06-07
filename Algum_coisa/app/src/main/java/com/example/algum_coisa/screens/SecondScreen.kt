package com.example.algum_coisa.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.algum_coisa.R
import com.example.algum_coisa.components.CustomTextField
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.algum_coisa.ui.theme.Algum_coisaTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen(navController: NavController) {
    var emailValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }

    val localContext = LocalContext.current
    val successMessage = stringResource(R.string.message_register_success)
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    val welcomeMessage = stringResource(R.string.message_register_success)

    Scaffold {
        var snackbarHost = {
            SnackbarHost((snackbarHostState))
        }
    }
    CustomTextField(
        label = stringResource((R.string.input_email)),
        value = "",
        onValueChange = { value ->
            var email = value
        },
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painterResource(R.drawable.logo), "Logo", modifier = Modifier.size(40.dp))

        }
        Text(
            text = "Bem-vindo de volta!",
            style = MaterialTheme.typography.bodySmall.copy(
                fontSize = 22.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            ),
            lineHeight = 27.sp,
            modifier = androidx.compose.ui.Modifier
                .width(344.dp)
                .height(54.dp)
                .padding(start = 8.dp, top = 122.dp),
        )
        Row {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD9D9D9),
                    contentColor = Color.Black
                )
            ) {
                Text(text = stringResource(id = R.string.iniciar_sessao))

            }
        }
    }
}@Preview (showBackground = true)
@Composable
fun Secondscreen() {}
