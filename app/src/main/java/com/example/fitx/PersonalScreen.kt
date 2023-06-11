package com.example.fitx

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalScreen(
    navController: NavHostController
) {
    var text by remember {
        mutableStateOf("")
    }

    var active by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            SearchBar(
                query = text,
                onQueryChange = {
                    text = it
                },
                onSearch = {
                    active = false
                },
                placeholder = {
                    Text(text = "Procurar")
                },
                active = active,
                onActiveChange = {
                    active = it
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon"
                    )
                },
                colors = SearchBarDefaults.colors(
                    containerColor = Color(0XFFFFF7CC)
                )
            ) {

            }
            Spacer(modifier = Modifier.height(20.dp))
            LazyColumn {
                var personalList = listOf<PersonalInfo>(
                    PersonalInfo("Susan Storm", "32 anos", "4 anos de experiência", "Disponível: 07am ás 08pm", "(81) 99999-9999)"),
                    PersonalInfo("Gamora Rambeau", "20 anos", "2 anos de experiência", "Disponível: 07am ás 08pm", "(81) 99999-9999)"),
                    PersonalInfo("Jennifer Walters", "36 anos", "8 anos de experiência", "Disponível: 07am ás 08pm", "(81) 99999-9999)"),
                    PersonalInfo("Maria Rambeau", "48 anos", "6 anos de experiência", "Disponível: 07am ás 08pm", "(81) 99999-9999)"),
                    PersonalInfo("Mônica Ramirez", "25 anos", "12 anos de experiência", "Disponível: 07am ás 08pm", "(81) 99999-9999)")
                )
                items(personalList) { personal ->
                    AllCardsInfo(cardInfo = personal, navController)
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AllCardsInfo(cardInfo: PersonalInfo, navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .clickable {
                navController.popBackStack()
                navController.navigate(Graph.PERSONAL_PROFILE_SCREEN)
            },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0XFFFFF7CC)
        )
    ) {
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Column(Modifier.padding(start = 50.dp)) {
                    Text(
                        text = cardInfo.name ?: "",
                        color = Color.Black
                    )
                    Text(
                        text = cardInfo.age ?: "",
                        color = Color(0XFF8E99A1)
                    )
                    Text(
                        text = cardInfo.experience ?: "",
                        color = Color(0XFF8E99A1)
                    )
                    Text(
                        text = cardInfo.hour ?: "",
                        color = Color(0XFF8E99A1)
                    )
                    Text(
                        text = cardInfo.phone ?: "",
                        color = Color(0XFF8E99A1)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Icon(
                    modifier = Modifier.size(100.dp),
                    imageVector = Icons.Default.Person,
                    contentDescription = "test icon",
                    tint = Color(0XFFFFD600)
                )
            }
        }
    }
}