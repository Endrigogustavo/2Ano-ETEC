package com.example.introducaojatpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.introducaojatpack.ui.theme.DarkBlue
import com.example.introducaojatpack.ui.theme.DebugButtunColors
import com.example.introducaojatpack.ui.theme.DebugButtunColors
import com.example.introducaojatpack.ui.theme.ErrorButtunColors
import com.example.introducaojatpack.ui.theme.InfoButtunColors
import com.example.introducaojatpack.ui.theme.IntroducaoJatPackTheme
import com.example.introducaojatpack.ui.theme.WarningButtunColors

const val TAG = "Teste Android"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroducaoJatPackTheme {
                // A surface container using the 'background' color from the theme
                app()
            }
        }
    }
}
@Composable
fun app(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Greeting("Android")

            ActionButton(
                text = "Degug",
                buttonColors = DebugButtunColors(),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Log.d(TAG, "App: Clicou em Degub!")
            }
            ActionButton(
                text = "Info",
                buttonColors = InfoButtunColors(),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Log.i(TAG, "App: Clicou em Info!")
            }
            ActionButton(
                text = "Warning",
                buttonColors = WarningButtunColors(),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Log.w(TAG, "App: Clicou em Warning!")
        }
            ActionButton(
                text = "Error",
                buttonColors = ErrorButtunColors(),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Log.e(TAG, "App: Clicou em Error!")
            }

        }

    }

}

@Preview(showBackground = true, widthDp = 150, heightDp = 200)
@Composable
fun appPreview(){
    IntroducaoJatPackTheme {
        app()
    }
}

@Composable
fun ActionButton(
    text: String,
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
    modifier:Modifier = Modifier,
    block: () -> Unit
){
    ElevatedButton(
        onClick = block,
        shape = RoundedCornerShape(5.dp),
        colors = buttonColors,
        modifier = modifier
    ) {
        Text(text = text)
    }
}
@Preview(showBackground = true)
@Composable
fun ActionButtonPreviw(){
    ActionButton(text = "Cadastrar") {

    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntroducaoJatPackTheme {
        Greeting("Android")
    }
}