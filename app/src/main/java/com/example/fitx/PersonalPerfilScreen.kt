@file:OptIn(ExperimentalAnimationApi::class)

package com.example.fitx

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PersonalPerfilScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 1.dp
            ),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0XFFFFF7CC)
            )
        ) {
            Row(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Spacer(modifier = Modifier.height(20.dp))
                    Icon(
                        modifier = Modifier.size(200.dp),
                        imageVector = Icons.Default.Person,
                        contentDescription = "test icon",
                        tint = Color(0XFFFFD600)
                    )
                    Column() {
                        Text(
                            text = "Lilian" ?: "",
                            color = Color(0XFF8E99A1),
                            fontSize = 24.sp
                        )
                        Text(
                            text = "Pereira" ?: "",
                            color = Color(0XFF8E99A1),
                            fontSize = 24.sp
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Email",
                            color = Color(0XFF8E99A1),
                            fontSize = 14.sp
                        )
                        Text(
                            text = "email@gmail.com.br",
                            color = Color(0XFF8E99A1),
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Idade",
                            color = Color(0XFF8E99A1),
                            fontSize = 14.sp
                        )
                        Text(
                            text = "22 Anos",
                            color = Color(0XFF8E99A1),
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Endereço",
                            color = Color(0XFF8E99A1),
                            fontSize = 14.sp
                        )
                        Text(
                            text = "Madalena, Recife",
                            color = Color(0XFF8E99A1),
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(bottom = 16.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0XFFFFF7CC)
            )
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Bio",
                    color = Color.Black,
                    fontSize = 20.sp
                )
                Text(
                    text = "Formada Em educação física desde 2020. acredito que todo mundo pode praticar atividades físicas de uma maneira divertida.",
                    color = Color(0XFF8E99A1),
                    fontSize = 18.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(bottom = 16.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0XFFFFF7CC)
            )
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Me encontre também:",
                    color = Color.Black,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        modifier = Modifier.size(40.dp),
                        imageVector = Icons.Default.Send,
                        contentDescription = "test icon",
                        tint = Color(0XFFFFD600)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        modifier = Modifier.size(40.dp),
                        imageVector = Icons.Default.Send,
                        contentDescription = "test icon",
                        tint = Color(0XFFFFD600)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        modifier = Modifier.size(40.dp),
                        imageVector = Icons.Default.Send,
                        contentDescription = "test icon",
                        tint = Color(0XFFFFD600)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        modifier = Modifier.size(40.dp),
                        imageVector = Icons.Default.Send,
                        contentDescription = "test icon",
                        tint = Color(0XFFFFD600)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        modifier = Modifier.size(40.dp),
                        imageVector = Icons.Default.Send,
                        contentDescription = "test icon",
                        tint = Color(0XFFFFD600)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        FinishButton(
            modifier = Modifier.weight(1f)
        ) {
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun FinishButton(
    modifier: Modifier,
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
            visible = true
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0XFFFFD600),
                    contentColor = Color.Black
                ),
                modifier = Modifier.clip(RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
            ) {
                Text(
                    text = "Marcar Aula",
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }
        }
    }
}