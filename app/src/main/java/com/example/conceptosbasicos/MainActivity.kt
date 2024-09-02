package com.example.conceptosbasicos

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text2.input.TextFieldCharSequence
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.conceptosbasicos.ui.theme.ConceptosBasicosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConceptosBasicosTheme {
//                app1()
                tareas()
            }
        }
    }
}
//@Preview
@Composable
fun app1(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(painter = painterResource(id = R.drawable.michael_phelps), contentDescription = "imagen", modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(16.dp))
            .padding(top = 20.dp)
            .shadow(
                elevation = 10.dp,
                clip = true
            ),
            contentScale = ContentScale.Crop,
            )
        Text(
            text = "¿Quien es Michael Phelps?",
            color = Color.Blue,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,

            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top=8.dp,
                    end = 16.dp,
                    bottom=8.dp
            ))
        Text(
            text = "Michael Phelps es un exnadador estadounidense, considerado el mejor nadador y uno de los mejores atletas olímpicos de todos los tiempos. Nació el 30 de junio de 1985 en Baltimore, Maryland, Estados Unidos.",
            modifier = Modifier
                .padding(
                    start=16.dp,
                    end=16.dp
                ),
            textAlign = TextAlign.Justify



        )
        Text(
            text = "Phelps ganó un total de 28 medallas olímpicas, de las cuales 23 son de oro, 3 de plata y 2 de bronce, lo que lo convierte en el atleta más condecorado en la historia de los Juegos Olímpicos. Su carrera se destacó por su rendimiento en pruebas de estilo libre y mariposa, y por haber ganado ocho medallas de oro en los Juegos Olímpicos de Pekín 2008, superando el récord anterior de Mark Spitz.",
            modifier = Modifier.padding(
                start = 16.dp,
                top=8.dp,
                end = 16.dp,
                bottom=8.dp
        ),
            textAlign = TextAlign.Justify

        )
        Text(
            text = " «Si quieres ser el mejor, tienes que hacer cosas que otras personas no están dispuestas a hacer»",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                start = 16.dp,
                top=8.dp,
                end = 16.dp,
                bottom=8.dp
            ),
            textAlign = TextAlign.Center

        )
        Text(
            text = " -Michael Phelps",
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Right

        )


    }

}
@Preview
@Composable
fun tareas(){
    Box (
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        //Alineacion vertical y horizontal centrada
        contentAlignment = Alignment.Center

    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Image(painter = painterResource(id = R.drawable.check), contentDescription = "Check", modifier = Modifier
                .size(200.dp)

            )

            Text(
                text = "Terminaste todas tus tareas",
                color = Color(0xFF708C08),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(
                        top = 24.dp,
                        bottom = 8.dp
                    )
            )
            Text(
                text = "Buen trabajo!",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,

            )
        }

    }

}