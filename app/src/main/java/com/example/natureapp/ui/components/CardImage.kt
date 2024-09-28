package com.example.natureapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.natureapp.R

@Composable
fun CardImage(image: String, title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .placeholder(R.drawable.place0)
                .data(image)
                .build(),
            contentDescription = "CardImage",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .padding(10.dp)
        ){
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = description,
                fontSize = 12.sp,
            )
        }

    }
}

@Preview
@Composable
fun CardImagePreview() {
    CardImage(
        image = "https://toursalgrancanon.com/wp-content/uploads/2019/04/cascadas-gran-canon.jpg",
        title = "Gran Cañon",
        description = "El Gran Cañón es una de las maravillas naturales más impresionantes del mundo, ubicado en Arizona, Estados Unidos."
    )
}