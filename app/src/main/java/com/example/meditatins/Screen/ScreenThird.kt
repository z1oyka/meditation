package com.example.meditatins.Screen

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditatins.R
import com.example.meditatins.ui.theme.MyBut

@Composable
fun ScreenThird(modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize()) {




            Image(
                painter = painterResource(R.drawable.sleepmusc),
                contentDescription = "музыка сон",
                modifier = Modifier.fillMaxSize()
            )
            val scrollState = rememberScrollState()
            Box(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {

                Button(
                    onClick = {},
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
                        modifier = Modifier.size(25.dp)


                    )

                }




                Text(
                    "Sleep music",
                    fontSize = 25.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .align(Alignment.TopCenter)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column() {
                        Spacer(Modifier.height(120.dp))
                        Image(
                            painter = painterResource(R.drawable.pra),
                            contentDescription = "пейхаж 1",
                            modifier = Modifier.size(177.dp, 123.dp)
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Night Island",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(5.dp))

                        Text(
                            "45 MIN SLEEP MUSIC",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 7.dp)
                        )

                        Spacer(Modifier.height(14.dp))

                        Image(
                            painter = painterResource(R.drawable.prc),
                            contentDescription = "пейхаж 1",
                            modifier = Modifier.size(177.dp, 123.dp)
                        )
                        Spacer(Modifier.height(7.dp))

                        Text(
                            "Good Night",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(5.dp))

                        Text(
                            "45 MIN SLEEP MUSIC",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 7.dp)
                        )

                        Spacer(Modifier.height(14.dp))

                        Image(
                            painter = painterResource(R.drawable.prc),
                            contentDescription = "пейхаж 1",
                            modifier = Modifier.size(177.dp, 123.dp)
                        )
                        Spacer(Modifier.height(7.dp))

                        Text(
                            "Sweet Sleep",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(5.dp))

                        Text(
                            "80 MIN",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                    }
                    Spacer(Modifier.width(20.dp))
                    Column() {

                        Spacer(Modifier.height(120.dp))
                        Image(
                            painter = painterResource(R.drawable.prb),
                            contentDescription = "пейхаж 1",
                            modifier = Modifier.size(177.dp, 123.dp)
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Sweet Sleep",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(5.dp))

                        Text(
                            "45 MIN SLEEP MUSIC",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 7.dp)
                        )

                        Spacer(Modifier.height(14.dp))

                        Image(
                            painter = painterResource(R.drawable.pra),
                            contentDescription = "пейхаж 1",
                            modifier = Modifier.size(177.dp, 123.dp)
                        )
                        Spacer(Modifier.height(7.dp))

                        Text(
                            "Moon Clouds",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(5.dp))

                        Text(
                            "45 MIN SLEEP MUSIC",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 7.dp)
                        )

                        Spacer(Modifier.height(14.dp))

                        Image(
                            painter = painterResource(R.drawable.prc),
                            contentDescription = "пейхаж 1",
                            modifier = Modifier.size(177.dp, 123.dp)
                        )
                        Spacer(Modifier.height(7.dp))

                        Text(
                            "Sweet Sleep",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(5.dp))

                        Text(
                            "45 MIN SLEEP MUSIC",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                        Spacer(Modifier.height(500.dp))
                    }

                }
            }




    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter


    ) {

        Image(
            painter = painterResource(R.drawable.restangle),
            contentDescription = "панель",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {},
                modifier = Modifier.size(80.dp),
                colors = ButtonDefaults.buttonColors(MyBut),
                shape = RoundedCornerShape(24.dp),
                contentPadding = PaddingValues(0.dp)

            ) {
                Image(painter = painterResource(R.drawable.ic_myhome),
                    contentDescription = "дом",
                    modifier = Modifier.size(28.dp,32.dp))

            }
            Button(
                onClick = {},
                modifier = Modifier.size(80.dp),
                colors = ButtonDefaults.buttonColors(MyBut),
                shape = RoundedCornerShape(24.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.ic_moon),
                    contentDescription = "луна",
                    modifier = Modifier.fillMaxSize()
                )


            }
            Button(
                onClick = {},
                modifier = Modifier.size(80.dp),
                colors = ButtonDefaults.buttonColors(MyBut),
                shape = RoundedCornerShape(24.dp),
                contentPadding = PaddingValues(0.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.ic_mymedit),
                    contentDescription = "луна",
                    modifier = Modifier.size(27.dp,31.dp)
                )

            }
            Button(
                onClick = {},
                modifier = Modifier.size(80.dp),
                colors = ButtonDefaults.buttonColors(MyBut),
                shape = RoundedCornerShape(24.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.ic_mysic),
                    contentDescription = "луна",
                    modifier = Modifier.fillMaxSize()
                )

            }
            Button(
                onClick = {},
                modifier = Modifier.size(80.dp),
                colors = ButtonDefaults.buttonColors(MyBut),
                shape = RoundedCornerShape(24.dp),
                contentPadding = PaddingValues(0.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.ic_avatar),
                    contentDescription = "луна",
                    modifier = Modifier.size(23.dp,27.dp)

                )

            }
        }
    }
}

@Preview
@Composable
private fun ScreenThirdPrev() {
    ScreenThird()
    
}
