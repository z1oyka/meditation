package com.example.meditatins.Screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditatins.R
import com.example.meditatins.ui.theme.MyBlue


@Composable
fun Screen(
    navController: NavController,
    modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize()){
        Image(painter = painterResource(R.drawable.sleep),
            contentDescription = "фонf")
    }
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally


    ){
        Spacer(Modifier.height(160.dp))

        Text("Welcome to Sleep",
        fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = Color.White
            )
        Spacer(Modifier.height(10.dp))

        Text("Explore the new king of sleep. It uses sound\n and vesualization to create perfect conditions\n for refreshing sleep.",
            fontSize = 18.sp,
            textAlign =  TextAlign.Center,
            color = Color.Gray,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp))

        Spacer(Modifier.height(460.dp))
        Button(onClick = {
            navController.navigate("screensecond")
            

        },
            colors = ButtonDefaults.buttonColors(MyBlue),
            modifier = Modifier.size(374.dp,63.dp)


        ) {
            Text("get started",
                fontSize = 25.sp)
        }



    }
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(Modifier.height(350.dp))

        Image(painter = painterResource(R.drawable.frame),
            contentDescription = "птички",
            modifier = Modifier
                .size(369.dp, 229.dp)
                .align(Alignment.End),
        )
    }


}




//@Preview
//@Composable
//private fun ScreenPrev(){
//    Screen()
//}