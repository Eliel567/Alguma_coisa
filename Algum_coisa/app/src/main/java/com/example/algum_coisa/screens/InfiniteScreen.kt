package com.example.algum_coisa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.algum_coisa.R

@Composable
fun InfiniteScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painterResource(R.drawable.logo), "Logo", modifier = Modifier.size(40.dp))
            Text(
                text = "infinite",
                style = TextStyle(
                    fontWeight = FontWeight.Black,
                    fontStyle = FontStyle.Italic,
                    fontSize = 40.sp,
                    color = Color.Black
                )
            )
        }
        Text(
            text = "Simples, flexível e poderoso.\nMantenha tudo em um só lugar.",
            style = MaterialTheme.typography.bodySmall.copy(
                fontSize = 22.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            ),
            lineHeight = 27.sp,
            modifier = Modifier
                .width(344.dp)
                .height(54.dp)
                .padding(start = 8.dp, top = 122.dp),
        )
        Image(painterResource(R.drawable.produtividade_1), "Boneca", modifier = Modifier.size(438.dp))
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
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD9D9D9),
                    contentColor = Color.Black
                )
            ) {
                Text(text = stringResource(id = R.string.log_in))
            }
        }
    }
}

