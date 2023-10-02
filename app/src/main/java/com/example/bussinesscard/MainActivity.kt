package com.example.bussinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinesCardApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BussinesCardAppPreview() {
    BussinesCardApp()
}


@Composable
fun BussinesCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(200.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image (
                painter = painterResource(R.drawable.business),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )
            Text(text = "Bulat Zigangirov",fontSize = 40.sp, lineHeight = 100.sp)
            Text(text = "My Title", fontSize = 40.sp)
        }
        Spacer(Modifier.height(100.dp))
        Column(
            modifier = Modifier.padding(5.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Row (
                modifier = Modifier.padding(5.dp).width(230.dp),
                verticalAlignment = Alignment.CenterVertically
                ){
                Image(
                    painter = painterResource(R.drawable.business),
                    contentDescription = "",
                    modifier = Modifier.width(30.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "+00 (00) 000 000",fontSize=20.sp)
            }
            Row (
                modifier = Modifier.padding(5.dp).width(230.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.business),
                    contentDescription = "",
                    modifier = Modifier.width(30.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "@socialmediahandle",fontSize=20.sp)
            }
            Row (
                modifier = Modifier.padding(5.dp).width(230.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.business),
                    contentDescription = "",
                    modifier = Modifier.width(30.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "email@mail.com",fontSize=20.sp)
            }
        }
    }
}
