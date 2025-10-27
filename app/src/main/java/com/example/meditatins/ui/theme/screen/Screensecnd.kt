package com.example.meditatins.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditatins.R
import com.example.meditatins.ui.theme.MyBaground
import com.example.meditatins.ui.theme.MyBlue
import com.example.meditatins.ui.theme.MyBut
import com.example.meditatins.ui.theme.MyGold
import com.example.meditatins.ui.theme.MyGrey
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun Screensecnd (navController: NavController,
                 modifier: Modifier = Modifier) {
    var isPressed1 by remember { mutableStateOf(false) }
    var isPressed2 by remember { mutableStateOf(false) }
    var isPressed3 by remember { mutableStateOf(false) }
    var isPressed4 by remember { mutableStateOf(false) }
    var isPressed5 by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()) {
        val scrollState = rememberScrollState()



        Image(
            painter = painterResource(R.drawable.slsecond),
            contentDescription = "фон2"
        )

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.height(100.dp))


        Text(
            "Sleep Stories",
            fontSize = 28.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )
        Spacer(Modifier.height(9.dp))
        Text(
            "Soothing bedtime stories to help you fall\n into a deep and natural sleep",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Light
        )
        Spacer(Modifier.height(30.dp))
        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())
                .padding(start = 17.dp)) {
                Column(modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally ) {
                    Button(
                        onClick = {
                            navController.navigate("screenthird")
                        },
                        modifier = Modifier.size(65.dp, 65.dp),
                        colors = ButtonDefaults.buttonColors(MyGrey),
                        shape = RoundedCornerShape(24.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Image(painter = painterResource(R.drawable.fsticon),
                            contentDescription = "иконка",
                            modifier = Modifier.size(28.dp))


                    }
                    Text("All",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 6.dp)

                        )

                }
                Spacer(Modifier.width(15.dp))
                Column(modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.size(65.dp, 65.dp),
                        colors = ButtonDefaults.buttonColors(MyGrey),
                        shape = RoundedCornerShape(24.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Image(painter = painterResource(R.drawable.ic_myfavorite),
                            contentDescription = "иконка",
                            modifier = Modifier.size(28.dp))


                    }
                    Text("My",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 6.dp)

                    )}
                Spacer(Modifier.width(15.dp))
                Column(modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.size(65.dp, 65.dp),
                        colors = ButtonDefaults.buttonColors(MyGrey),
                        shape = RoundedCornerShape(24.dp),
                        contentPadding = PaddingValues(0.dp)

                    ) { Image(painter = painterResource(R.drawable.ic_smile),
                        contentDescription = "иконка",
                        modifier = Modifier.size(28.dp))


                    }
                    Text("Anxious",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 6.dp)

                    )}
                Spacer(Modifier.width(15.dp))
                Column(modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.size(65.dp, 65.dp),
                        colors = ButtonDefaults.buttonColors(MyGrey),
                        shape = RoundedCornerShape(24.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Image(painter = painterResource(R.drawable.ic_moon),
                            contentDescription = "иконка",
                            modifier = Modifier.size(28.dp))


                    }
                    Text("Sleep",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 6.dp)

                    )}
                Spacer(Modifier.width(15.dp))
                Column(modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.size(65.dp, 65.dp),
                        colors = ButtonDefaults.buttonColors(MyGrey),
                        shape = RoundedCornerShape(24.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Image(painter = painterResource(R.drawable.ic_kids),
                            contentDescription = "иконка",
                            modifier = Modifier.size(28.dp))


                    }
                    Text("Kids",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 6.dp)

                    )}

                Spacer(Modifier.width(100.dp))


            }
        Spacer(Modifier.height(20.dp))
        Box(
            Modifier.size(373.dp, 233.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.peysash),
                contentDescription = "пейзаж",
                Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(35.dp))

                Text(
                    "The Ocean Moon",
                    fontSize = 30.sp,
                    color = MyGold

                )
                Spacer(Modifier.height(10.dp))



                Text(
                    "Non stop 8-hourmixes of our\n most popular sleep audio",
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(40.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.size(90.dp, 40.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        "START",
                        fontSize = 18.sp,
                        color = Color.Black
                    )

                }


            }
        }
        Spacer(Modifier.height(20.dp))
        Row() {
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
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 7.dp)
                )

                Text(
                    "45 MIN • SLEEP MUSIC",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 7.dp)
                )
                Spacer(Modifier.height(14.dp))




                Image(
                    painter = painterResource(R.drawable.prc),
                    contentDescription = "пейзаж2",
                    modifier = Modifier
                        .size(177.dp, 122.dp)
                        .clickable { }
                )
                Spacer(Modifier.height(7.dp))
                Text(
                    "Good Night",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 7.dp)
                )

                Text(
                    "45 MIN • SLEEP MUSIC",
                    fontSize = 12.sp,
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
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 7.dp)
                )

                Text(
                    "45 MIN • SLEEP MUSIC",
                    fontSize = 12.sp,
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

                Text(
                    "45 MIN • SLEEP MUSIC",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 7.dp)
                )

            }


        }
        Spacer(Modifier.height(500.dp))

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
                        isPressed2 = false
                        isPressed3 = false
                        isPressed4 = false
                        isPressed5 = false

                        isPressed1 = !isPressed1
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
            Spacer(Modifier.width(15.dp))

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
            Spacer(Modifier.width(15.dp))


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

            Spacer(Modifier.width(15.dp))



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
            Spacer(Modifier.width(15.dp))

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
//private fun ScreenPrev(){
//    Screensecnd({
//
//    })
//
//}

