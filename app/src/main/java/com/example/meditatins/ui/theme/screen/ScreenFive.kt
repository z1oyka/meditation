package com.example.meditatins.ui.theme.screen

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditatins.R
import kotlinx.coroutines.delay

import kotlin.math.sin


@Composable
fun Screenfve(modifier: Modifier = Modifier,
              navController: NavController
             ) {
    var isPlaying by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(false) }
    val progress = remember { Animatable(0f) }
    LaunchedEffect(isLoading) {
        if (isLoading) {
            progress.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = (5000 * (1 - progress.value)).toInt(),
                    easing = LinearEasing))

            if (isLoading) {
                isLoading = false
                isPlaying = !isPlaying
                progress.snapTo(0f)
            }

        }

    }





    Box(modifier = modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.musicscreen),
            contentDescription = "музыак",
            modifier = Modifier.fillMaxSize())


        Row() {
            Button(onClick = {

            },
                modifier = Modifier
                    .padding(top = 40.dp, start = 10.dp)
                    .size(50.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.run {
                    buttonColors(
                                containerColor = Color.White,
                                contentColor = Color.Black
                            )
                }

            ) {
                Icon(
                    Icons.Filled.Close,
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
                navController.navigate("screenfour")


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
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(Modifier.height(400.dp))
            Text(
                "Night Island",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            modifier = Modifier)
            Spacer(Modifier.height(10.dp))
            Text(
                "SLEEP MUSIC",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Gray
            )
            Spacer(Modifier.height(100.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = {},
                    modifier = Modifier.size(40.dp,40.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(R.drawable.left15),
                        contentDescription = "влево15",
                        modifier = Modifier.size(39.dp, 39.dp)
                    )
                }
                Spacer(Modifier.width(35.dp))


                Button(onClick = {isPlaying = !isPlaying
                    isLoading = !isLoading },
                    modifier = Modifier
                        .wrapContentSize(Alignment.Center)
                        .size(90.dp,90.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    enabled = !isLoading

                ) {
                    if (isPlaying) {
                        Image(
                            painter = painterResource(R.drawable.ic_stop),
                            contentDescription = "стоп",
                            modifier = Modifier.size(20.dp, 25.dp)
                        )

                    }else{
                        Icon(Icons.Filled.PlayArrow,
                            contentDescription = "плей",
                            modifier = Modifier.size(48.dp),
                            tint = Color(0xFF3C3F41)
                            )


                }







            }
                Spacer(Modifier.width(35.dp))

                Button(onClick = {},
                    modifier = Modifier.size(40.dp,40.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)

                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_right15),
                        contentDescription = "право15",
                        modifier = Modifier.size(39.dp, 39.dp)
                    )


                }


        }
            Spacer(modifier = Modifier.height(40.dp))



                LinearProgressIndicator(
                    progress = progress.value,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                        .height(4.dp),
                    color = Color.White,
                    trackColor = Color(0xFF253665)
                )
            Spacer(Modifier.height(7.dp))
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text("1:00",
                    modifier = Modifier
                        .padding(start = 10.dp),
                    fontSize =(16.sp),
                    fontWeight = FontWeight.Medium,
                    color = Color.White)



                Text("32:57",
                    modifier = Modifier
                        .padding(end = 10.dp),
                    fontSize =(16.sp),
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            }



        }


}}



//@Preview
//@Composable
//private fun ScreenFive() {
//    Screenfve()
//
//}
