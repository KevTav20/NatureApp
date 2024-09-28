package com.example.natureapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.natureapp.ui.components.CardImage
import com.example.natureapp.ui.models.naturalPlaces
import com.example.natureapp.ui.theme.NatureAppTheme

@Composable
fun HomeScreen(innerPadding: PaddingValues){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color.Black)
            .padding(20.dp)
    ) {
        items(naturalPlaces){ place ->
            CardImage(
                image = place.image,
                title = place.title,
                description = place.description,
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    NatureAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}