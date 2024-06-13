package com.example.produckdetailui

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.produckdetailui.ui.theme.ProduckDetailUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProduckDetailUiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun DetailProduct() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Box {
            ProductImage()
        }

        ProductTitle()

    }
}

@Composable
fun ProductImage() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .size(width = 400.dp, height = 232.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.product_image),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductTitle() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .background(Color.White)
    ) {
        Text(
            text = "Tanaman Hias Kaktus Mini",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray

        )

        Spacer(modifier = Modifier.padding(vertical = 4.dp))

        Row(

        ) {
            Text(
                text = "Rp",
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
                color = Color.Red

            )
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Text(
                text = "70.000",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Red

            )
            Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            Text(
                text = "100.000",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray,


            )
        }
        Spacer(modifier = Modifier.padding(vertical = 4.dp))

        Row() {
            Card(
                onClick = { /*TODO*/ }
            ) {
              Text(
                  text = "Terjual 100+",
                  fontSize = 11.sp,
                  modifier = Modifier.padding(6.dp)
              )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProduckDetailUiTheme {
        DetailProduct()
    }
}

@Preview
@Composable
fun ImagePreview() {
    ProductImage()
}