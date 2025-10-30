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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditatins.R
import com.example.meditatins.ui.theme.MyBaground
import com.example.meditatins.ui.theme.MyBlue
import com.example.meditatins.ui.theme.MyBut

@Composable
fun ScreenThird(navController: NavController,
    modifier: Modifier = Modifier) {
    var isPressed1 by remember { mutableStateOf(false) }
    var isPressed2 by remember { mutableStateOf(false) }
    var isPressed3 by remember { mutableStateOf(false) }
    var isPressed4 by remember { mutableStateOf(false) }
    var isPressed5 by remember { mutableStateOf(false) }

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
                    onClick = {
                        navController.navigate("screensecond")

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
                        modifier = Modifier.size(25.dp)


                    )

                }






                Text(
                    "Sleep music",
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .align(Alignment.TopCenter),
                    fontWeight = FontWeight.Bold
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
                                .clickable {
                                    navController.navigate("screenfour")
                                }
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Night Island",
                            color = Color.White,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 7.dp),
                            fontWeight = FontWeight.Bold
                        )


                        Text(
                            "45 MIN • SLEEP MUSIC",
                            fontSize = 11.sp,
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
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 7.dp),
                            fontWeight = FontWeight.Bold
                        )


                        Text(
                            "45 MIN • SLEEP MUSIC",
                            fontSize = 11.sp,
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
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 7.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            "45 MIN • SLEEP MUSIC",
                            fontSize = 11.sp,
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
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 7.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            "45 MIN • SLEEP MUSIC",
                            fontSize = 11.sp,
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
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 7.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            "45 MIN • SLEEP MUSIC",
                            fontSize = 11.sp,
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
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 7.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            "45 MIN • SLEEP MUSIC",
                            fontSize = 11.sp,
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


        Row(modifier = Modifier.fillMaxWidth()
            .height(90.dp)
            .background(MyBaground),

            horizontalArrangement = Arrangement.Center) {

//        Image(
//            painter = painterResource(R.drawable.restangle),
//            contentDescription = "панель",
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(150.dp)
//        )

//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 12.dp),
//            horizontalArrangement = Arrangement.Center
//        ) {
            Column(modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Button(
                    onClick = {
                        isPressed1 = !isPressed1
                        isPressed2 = false
                        isPressed3 = false
                        isPressed4 = false
                        isPressed5 = false
                    },
                    modifier = Modifier.size(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isPressed1) MyBlue else MyBut
                    ),
                    shape = RoundedCornerShape(14.dp),
                    contentPadding = PaddingValues(10.dp)

                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_myhome),
                        contentDescription = "дом",
                        modifier = Modifier.size(28.dp, 32.dp),
                        colorFilter = if (isPressed1) ColorFilter.tint(Color.White) else ColorFilter.tint(
                            Color.Gray)
                    )
                }
                Text("Home",
                    fontSize = 14.sp,
                    color = if (isPressed1) Color.White else Color.Gray)
            }
            Spacer(Modifier.width(25.dp))

            Column(modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(Modifier.height(3.dp))
                Button(
                    onClick = {
                        isPressed2 = !isPressed2
                        isPressed1 = false
                        isPressed3 = false
                        isPressed4 = false
                        isPressed5 = false
                    },
                    modifier = Modifier.size(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isPressed2) MyBlue else MyBut
                    ),
                    shape = RoundedCornerShape(14.dp),
                    contentPadding = PaddingValues(10.dp)

                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_moon),
                        contentDescription = "луна",
                        modifier = Modifier.fillMaxSize(),
                        colorFilter = if (isPressed2) ColorFilter.tint(Color.White) else ColorFilter.tint(
                            Color.Gray)
                    )


                }
                Text("Sleep",
                    fontSize = 14.sp,
                    color = if (isPressed2) Color.White else Color.Gray)
            }
            Spacer(Modifier.width(25.dp))


            Column(modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    onClick = {
                        isPressed3 = !isPressed3
                        isPressed2 = false
                        isPressed1 = false
                        isPressed4 = false
                        isPressed5 = false
                    },
                    modifier = Modifier.size(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isPressed3) MyBlue else MyBut
                    ),
                    shape = RoundedCornerShape(14.dp),
                    contentPadding = PaddingValues(10.dp)

                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_mymedit),
                        contentDescription = "луна",
                        modifier = Modifier.size(27.dp, 31.dp),
                        colorFilter = if (isPressed3) ColorFilter.tint(Color.White) else ColorFilter.tint(
                            Color.Gray)
                    )

                }
                Text("Meditate",
                    fontSize = 14.sp,
                    color = if (isPressed3) Color.White else Color.Gray)
            }

            Spacer(Modifier.width(25.dp))



            Column(modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    onClick = {
                        isPressed4 = !isPressed4
                        isPressed2 = false
                        isPressed3 = false
                        isPressed1 = false
                        isPressed5 = false
                    },
                    modifier = Modifier.size(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isPressed4) MyBlue else MyBut
                    ),
                    shape = RoundedCornerShape(14.dp),
                    contentPadding = PaddingValues(10.dp)

                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_mysic),
                        contentDescription = "луна",
                        modifier = Modifier.fillMaxSize(),
                        colorFilter = if (isPressed4) ColorFilter.tint(Color.White) else ColorFilter.tint(
                            Color.Gray)
                    )

                }
                Text("Music",
                    fontSize = 14.sp,
                    color = if (isPressed4) Color.White else Color.Gray)
            }
            Spacer(Modifier.width(25.dp))

            Column(modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    onClick = {
                        isPressed5 = !isPressed5
                        isPressed2 = false
                        isPressed3 = false
                        isPressed4 = false
                        isPressed1 = false
                    },
                    modifier = Modifier.size(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isPressed5) MyBlue else MyBut
                    ),
                    shape = RoundedCornerShape(14.dp),
                    contentPadding = PaddingValues(10.dp)

                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_avatar),
                        contentDescription = "луна",
                        modifier = Modifier.size(23.dp, 27.dp),
                        colorFilter = if (isPressed5) ColorFilter.tint(Color.White) else ColorFilter.tint(
                            Color.Gray)

                    )

                }
                Text("Afsar",
                    fontSize = 14.sp,
                    color = if (isPressed5) Color.White else Color.Gray)
            }
        }
    }
}

//@Preview
//@Composable
//private fun ScreenThirdPrev() {
//    ScreenThird({})
//
//}
