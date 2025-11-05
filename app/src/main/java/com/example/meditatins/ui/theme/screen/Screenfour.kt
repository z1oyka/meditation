package com.example.meditatins.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditatins.R
import com.example.meditatins.ui.theme.MyBaground
import com.example.meditatins.ui.theme.Mypurple

@Composable
fun Screenfour(navController: NavController,
               modifier: Modifier = Modifier) {
    Image(painter = painterResource(R.drawable.sleepmusc),
        contentDescription = "основн",
        modifier = Modifier.fillMaxSize())



    Box(modifier = Modifier.fillMaxSize()) {








        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            ) {
            Image(
                painter = painterResource(R.drawable.praa),
                contentDescription = "пейзаж2",
                modifier = Modifier.size(414.dp,290.dp)
            )
            Spacer(Modifier.height(20.dp))
            Text("Night Island",
                modifier = Modifier
                    .padding(start = 15.dp),
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Spacer(Modifier.height(15.dp))
            Text("45 MIN • SLEEP MUSIC",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color.Gray)
            Spacer(Modifier.height(15.dp))
            Text("Ease the mind into a restful night’s sleep with\nthese deep, amblent tones.",
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color.Gray,
                fontSize = 18.sp,
                fontWeight = FontWeight.Light)
            Spacer(Modifier.height(20.dp))


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp)) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "любимое",
                    modifier = Modifier.size(17.dp,17.dp),
                    Color.White,

                )
                Spacer(Modifier.width(5.dp))
                Text("24.234 favorits",
                    color = Color.White,
                    fontSize = 14.sp)
                Spacer(Modifier.width(30.dp))
                Image(painter = painterResource(R.drawable.ic_headps),
                    contentDescription = "прослушивания",
                    modifier = Modifier.size(17.dp,17.dp))
                Spacer(Modifier.width(5.dp))

                Text("34.234 listening",
                    fontSize = 14.sp,
                    color = Color.White)
            }
            Spacer(Modifier.height(40.dp))


            Text("Related",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 15.dp))
            Spacer(Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center)  {
                Column(modifier = Modifier.width(180.dp)) {
                    Image(
                        painter = painterResource(R.drawable.pra),
                        contentDescription = "пейзаж1",
                        modifier = Modifier.size(177.dp, 122.dp)
                    )
                    Spacer(Modifier.height(7.dp))
                    Text(
                        "Night Island",
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 7.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        "45 MIN • SLEEP MUSIC",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 7.dp)
                    )
                    Spacer(Modifier.height(14.dp))




                    Image(
                        painter = painterResource(R.drawable.prc),
                        contentDescription = "пейзаж2",
                        modifier = Modifier
                            .size(177.dp, 122.dp)
                            .clickable {  }
                    )
                    Spacer(Modifier.height(7.dp))
                    Text(
                        "Good Night",
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 7.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        "45 MIN • SLEEP MUSIC",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 7.dp)
                    )

                }
                Spacer(Modifier.width(10.dp))


                Column(modifier = Modifier.width(180.dp)) {
                    Image(
                        painter = painterResource(R.drawable.prb),
                        contentDescription = "пейзаж3",
                        modifier = Modifier.size(177.dp, 122.dp)
                    )
                    Spacer(Modifier.height(7.dp))
                    Text(
                        "Sweet Sleep",
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 7.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        "45 MIN • SLEEP MUSIC",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 7.dp)
                    )
                    Spacer(Modifier.height(14.dp))



                    Image(
                        painter = painterResource(R.drawable.prg),
                        contentDescription = "пейзаж4",
                        modifier = Modifier.size(177.dp, 122.dp)
                    )
                    Spacer(Modifier.height(7.dp))
                    Text(
                        "Moon Clouds",
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 7.dp),
                        fontWeight = FontWeight.Bold

                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        "45 MIN • SLEEP MUSIC",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 7.dp)
                    )

                }


            }






            Spacer(Modifier.height(500.dp))






        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter


    ) {
        Row (modifier = Modifier.background(MyBaground)
            .height(85.dp)){


            Button(onClick = {navController.navigate("screenfive")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
                    .height(80.dp)
                    .padding(vertical = 10.dp),
                colors = ButtonDefaults.buttonColors(Mypurple)
            ) {
                Text("PLAY",
                    fontSize = 14.sp,
                    color = Color.White,
                )
            }
        }






    }
    Row() {
        Button(onClick = {
            navController.navigate("screenthird")
        },
            modifier = Modifier
                .padding(top = 40.dp, start = 10.dp)
                .size(50.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )

        ) {
            Icon(
                Icons.Filled.ArrowBack,
                contentDescription = "назат",
                modifier = Modifier.size(25.dp))
        }
        Spacer(Modifier.width(220.dp))


        Button(onClick = {

        },
            modifier = Modifier
                .padding(top = 40.dp)
                .size(55.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black.copy(0.5f)
            ),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                Icons.Filled.FavoriteBorder,
                contentDescription = "любимое",
                modifier = Modifier.size(19.dp,19.dp),
                Color.White,

                )
        }
        Spacer(Modifier.width(10.dp))
        Button(onClick = {

        },
            modifier = Modifier
                .padding(top = 40.dp)
                .size(55.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black.copy(0.5f)
            ),
            contentPadding = PaddingValues(0.dp)
        ) {
            Image(painter = painterResource(R.drawable.saved),
                contentDescription = "созранненый",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.size(20.dp))
        }





    }
}
//@Preview
//@Composable
//private fun ScreenPrev() {
//    Screenfour()
//
//}