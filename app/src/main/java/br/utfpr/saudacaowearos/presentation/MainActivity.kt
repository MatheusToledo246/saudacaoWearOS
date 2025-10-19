/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter to find the
 * most up to date changes to the libraries and their usages.
 */

package br.utfpr.saudacaowearos.presentation

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.tooling.preview.devices.WearDevices
import br.utfpr.saudacaowearos.R
import kotlinx.coroutines.delay
import java.time.LocalTime


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){

            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    1001
                )
            }
        }

        setTheme(android.R.style.Theme_DeviceDefault)

        setContent {
            WearApp()
            WearReminderWater(context = this)
        }
    }
}

fun obterSaudacaoUsuario(time : LocalTime): String{

    return when(time.hour){
        in 0..11 -> "Bom dia flor do dia!"
        in 12..17 -> "Boa tarde"
        else ->  "Boa noite queridinho"
    }

}


@Composable
fun WearApp() {

    var horas by remember { mutableStateOf(LocalTime.now()) }

    LaunchedEffect(Unit) {
        while (true){
            horas = LocalTime.now()
            delay(1000L)
        }
    }


    Box(
        modifier = Modifier.fillMaxSize().padding(8.dp), 
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = obterSaudacaoUsuario(horas),
            style = MaterialTheme.typography.title3
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Agora são",
                style = MaterialTheme.typography.caption2
            )

            Spacer(modifier = Modifier.height(4.dp))

            val displayHour = String.format("%02d:%02d:%02d", horas.hour, horas.minute, horas.second)

            Text(text = displayHour,
                style = MaterialTheme.typography.display3)
        }
    }
}

@Composable
fun WearReminderWater(context: Context){

    var time by remember { mutableStateOf(LocalTime.now())}
    var notified by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {

        val channelId = "water_channel"
        val channerlName = "Water Channel"
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        //Criar um novo canal.
        if (manager.getNotificationChannel(channelId) == null){

            val channel = NotificationChannel(
                channelId, channerlName, NotificationManager.IMPORTANCE_HIGH
            )
            manager.createNotificationChannel(channel)
        }

        val TRIGGER_MINUTE = 59;

        while (true){

            time = LocalTime.now()

            //Enviar a notificação
            if(time.minute == TRIGGER_MINUTE && !notified){

                val notification = NotificationCompat.Builder(context, channelId)
                    .setContentTitle("Hora de se Hidratar !!!")
                    .setContentText("Bora tomar agua! ")
                    .setSmallIcon(R.drawable.splash_icon)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .build()

                manager.notify(1, notification)
                notified = true;
            }

            if(time.minute != TRIGGER_MINUTE){
                notified = false;
            }
            delay(1000L)
        }
    }

}

@Preview(device = WearDevices.SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp()
}