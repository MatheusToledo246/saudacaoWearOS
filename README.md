# ⌚ SaudacaoWearOS - Smart Watch Companion

![Wear OS](https://img.shields.io/badge/Platform-Wear%20OS-brightgreen)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-orange)
![Android](https://img.shields.io/badge/Android%20SDK-36-green)
![Version](https://img.shields.io/badge/Version-1.0-red)

Um aplicativo inteligente e funcional para dispositivos Wear OS que combina **saudações contextuais**, **relógio em tempo real** e **lembretes de hidratação**. Desenvolvido com **Kotlin** e **Jetpack Compose** utilizando as mais modernas práticas de desenvolvimento Android.

## 📱 Sobre o Projeto

O **SaudacaoWearOS** é um aplicativo completo para smartwatches que vai além de uma simples saudação. Ele oferece uma experiência personalizada e útil para o usuário, demonstrando conceitos avançados como:

- ⏰ **Relógio em tempo real** com atualização automática
- 🌅 **Saudações contextuais** baseadas no horário do dia
- 💧 **Sistema de lembretes** para hidratação
- 🔔 **Notificações push** inteligentes
- 📱 **Gerenciamento de permissões** moderno

## ✨ Funcionalidades Principais

### 🕐 Relógio Digital Inteligente
- **Display em tempo real**: Mostra horas, minutos e segundos atualizados a cada segundo
- **Formatação elegante**: Interface clara e legível no formato HH:MM:SS
- **Atualização automática**: Usa LaunchedEffect para sincronização contínua

### 🌤️ Saudações Contextuais
- **Bom dia** (00:00 - 11:59): "Bom dia flor do dia!"
- **Boa tarde** (12:00 - 17:59): "Boa tarde"
- **Boa noite** (18:00 - 23:59): "Boa noite sr Matheus"
- **Atualização automática**: Muda conforme o horário

### 💧 Sistema de Lembretes de Hidratação
- **Notificações automáticas**: Lembra de beber água no minuto 24 de cada hora
- **Canal de notificação dedicado**: "Water Channel" para organização
- **Ícone personalizado**: Usa ícone específico para hidratação
- **Controle inteligente**: Evita spam de notificações

### 🔐 Gerenciamento de Permissões
- **Solicitação dinâmica**: Pede permissão POST_NOTIFICATIONS automaticamente
- **Compatibilidade**: Suporta Android 13+ (API 33) e versões anteriores
- **UX otimizada**: Gerenciamento transparente para o usuário

## 🛠️ Tecnologias e Arquitetura

### 🚀 Linguagem e Framework Core
- **Kotlin 2.0.21** - Linguagem principal com recursos mais recentes
- **Jetpack Compose 2024.09.00** - Framework de UI declarativa
- **Wear Compose 1.2.1** - Componentes específicos e otimizados para Wear OS

### 📦 Bibliotecas e Dependências
- `androidx.activity:activity-compose:1.11.0` - Integração moderna Activity + Compose
- `androidx.wear.compose:compose-material:1.2.1` - Material Design para Wear OS
- `androidx.wear.compose:compose-foundation:1.2.1` - Componentes fundamentais Wear
- `androidx.core:core-splashscreen:1.0.1` - Sistema de splash screen nativo
- `com.google.android.gms:play-services-wearable:19.0.0` - APIs Google para Wear OS

### ⚡ Recursos Avançados Utilizados
- **LaunchedEffect** - Para corrotinas e atualizações em tempo real
- **State Management** - `remember` e `mutableStateOf` para gerenciar estados
- **LocalTime API** - Manipulação moderna de tempo (Java 8+ Time API)
- **NotificationCompat** - Sistema moderno de notificações
- **Permission Management** - Gerenciamento dinâmico de permissões Android 13+
- **Coroutines & Delay** - Para operações assíncronas e timing

### 🏗️ Ferramentas de Desenvolvimento
- **Android Studio** (Latest) - IDE principal com suporte completo
- **Gradle 8.10.0** (Kotlin DSL) - Sistema de build otimizado
- **Android SDK 36** - Versão mais recente (compileSdk 36, targetSdk 35)
- **JDK 11** - Java Development Kit para compatibilidade

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter:

- [Android Studio](https://developer.android.com/studio) (versão mais recente)
- **JDK 11** ou superior
- **Android SDK 36** (será baixado automaticamente)
- Dispositivo Wear OS ou emulador configurado

## 🚀 Como Executar

### 1. Clone o Repositório
```bash
git clone https://github.com/MatheusToledo246/saudacaoWearOS.git
cd saudacaoWearOS
```

### 2. Abra no Android Studio
- Abra o Android Studio
- Selecione "Open an existing project"
- Navegue até a pasta do projeto e selecione

### 3. Configure o Emulador Wear OS
- No Android Studio, abra o **AVD Manager**
- Clique em "Create Virtual Device"
- Selecione a categoria **Wear OS**
- Escolha um dispositivo (ex: Wear OS Small Round)
- Baixe e selecione uma system image para Wear OS
- Finalize a criação do emulador

### 4. Execute o Projeto
```bash
# Via terminal (na pasta do projeto)
./gradlew build
./gradlew installDebug

# Ou use o botão "Run" no Android Studio
```

## 📁 Estrutura Detalhada do Projeto

```
saudacaoWearOS/
├── app/
│   ├── src/main/
│   │   ├── java/br/utfpr/saudacaowearos/
│   │   │   └── presentation/
│   │   │       ├── MainActivity.kt          # 🎯 Activity principal + gerenciamento
│   │   │       └── theme/
│   │   │           └── Theme.kt             # 🎨 Configurações de tema Wear OS
│   │   ├── res/
│   │   │   ├── values/
│   │   │   │   └── strings.xml              # 📝 Strings base do aplicativo
│   │   │   ├── values-round/
│   │   │   │   └── strings.xml              # 📝 Strings para dispositivos redondos
│   │   │   ├── drawable/
│   │   │   │   ├── splash_icon.xml          # 💧 Ícone para notificações
│   │   │   │   ├── ic_launcher_background.xml
│   │   │   │   └── ic_launcher_foreground.xml
│   │   │   └── mipmap-*/                    # 🖼️ Ícones do app (todas densidades)
│   │   └── AndroidManifest.xml              # ⚙️ Configurações + permissões
│   ├── build.gradle.kts                     # 🔧 Configurações Gradle (SDK 36)
│   └── proguard-rules.pro                   # 🛡️ Regras de ofuscação/otimização
├── gradle/
│   ├── libs.versions.toml                   # 📦 Catálogo centralizado de versões
│   └── wrapper/
│       ├── gradle-wrapper.jar               # 🎁 Wrapper do Gradle
│       └── gradle-wrapper.properties        # ⚙️ Configurações do wrapper
├── build.gradle.kts                         # 🏗️ Configurações globais do projeto
├── gradle.properties                        # 🔧 Propriedades globais do Gradle
├── LICENSE                                  # 📄 Licença MIT do projeto
└── README.md                                # 📖 Esta documentação
```

### 🎯 Principais Arquivos e Responsabilidades

| Arquivo | Função | Tecnologias |
|---------|--------|-------------|
| `MainActivity.kt` | Gerenciamento central, permissões, UI | Kotlin, Compose, Permissions API |
| `Theme.kt` | Configurações visuais Wear OS | Material Theme, Wear Compose |
| `AndroidManifest.xml` | Permissões, features, configurações | XML, Android Manifest |
| `libs.versions.toml` | Gerenciamento de dependências | Gradle Version Catalog |
| `splash_icon.xml` | Ícone personalizado para notificações | Vector Drawable |

## 🎯 Arquitetura e Componentes Principais

### 📱 MainActivity.kt - Gerenciamento Central
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        
        // 🔐 Gerenciamento de permissões para Android 13+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS), 1001)
            }
        }
        
        setContent {
            WearApp()                    // 🎨 Interface principal
            WearReminderWater(context = this)  // 💧 Sistema de lembretes
        }
    }
}
```

### 🌅 Sistema de Saudações Inteligente
```kotlin
fun obterSaudacaoUsuario(time: LocalTime): String {
    return when(time.hour) {
        in 0..11 -> "Bom dia flor do dia!"      // Manhã
        in 12..17 -> "Boa tarde"                // Tarde  
        else -> "Boa noite sr Matheus"          // Noite
    }
}
```

### ⏰ WearApp Composable - Interface Principal
```kotlin
@Composable
fun WearApp() {
    var horas by remember { mutableStateOf(LocalTime.now()) }
    
    // 🔄 Atualização em tempo real
    LaunchedEffect(Unit) {
        while (true) {
            horas = LocalTime.now()
            delay(1000L)  // Atualiza a cada segundo
        }
    }
    
    Box(modifier = Modifier.fillMaxSize().padding(8.dp),
        contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // 👋 Saudação contextual
            Text(text = obterSaudacaoUsuario(horas),
                 style = MaterialTheme.typography.title3)
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // ⏰ Display do tempo
            Text(text = "Agora são",
                 style = MaterialTheme.typography.caption2)
            
            val displayHour = String.format("%02d:%02d:%02d", 
                horas.hour, horas.minute, horas.second)
            Text(text = displayHour,
                 style = MaterialTheme.typography.display3)
        }
    }
}
```

### 💧 WearReminderWater - Sistema de Notificações
```kotlin
@Composable
fun WearReminderWater(context: Context) {
    var time by remember { mutableStateOf(LocalTime.now()) }
    var notified by remember { mutableStateOf(false) }
    
    LaunchedEffect(Unit) {
        // 📢 Configuração do canal de notificação
        val channelId = "water_channel"
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        
        if (manager.getNotificationChannel(channelId) == null) {
            val channel = NotificationChannel(channelId, "Water Channel", 
                NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(channel)
        }
        
        while (true) {
            time = LocalTime.now()
            
            // 🚰 Trigger no minuto 24 de cada hora
            if (time.minute == 24 && !notified) {
                val notification = NotificationCompat.Builder(context, channelId)
                    .setContentTitle("Hora de se Hidratar !!!")
                    .setContentText("Bora tomar agua!")
                    .setSmallIcon(R.drawable.splash_icon)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .build()
                
                manager.notify(1, notification)
                notified = true
            }
            
            // Reset do flag de notificação
            if (time.minute != 24) {
                notified = false
            }
            delay(1000L)
        }
    }
}
```

## ⚙️ Configurações Técnicas Importantes

### 🔧 build.gradle.kts (app) - Configurações Avançadas
```kotlin
android {
    namespace = "br.utfpr.saudacaowearos"
    compileSdk = 36          // 🚀 SDK mais recente para compatibilidade
    
    defaultConfig {
        applicationId = "br.utfpr.saudacaowearos"
        minSdk = 35          // 📱 Suporte para Wear OS mais recentes
        targetSdk = 35       // 🎯 Otimizado para recursos atuais
        versionCode = 1
        versionName = "1.0"
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11  // ☕ Java 11 para recursos modernos
        targetCompatibility = JavaVersion.VERSION_11
    }
    
    kotlinOptions {
        jvmTarget = "11"     // 🎯 Kotlin compilado para JVM 11
    }
    
    buildFeatures {
        compose = true       // 🎨 Habilita Jetpack Compose
    }
}
```

### 📋 libs.versions.toml - Catálogo de Versões
```toml
[versions]
agp = "8.10.0"                    # 🔧 Android Gradle Plugin mais recente
kotlin = "2.0.21"                 # 🚀 Kotlin com recursos mais novos
composeBom = "2024.09.00"         # 📦 Compose BOM setembro 2024
activityCompose = "1.11.0"        # 🎯 Activity Compose atualizada

[libraries]
activity-compose = { group = "androidx.activity", name = "activity-compose", version.ref = "activityCompose" }
compose-material = { group = "androidx.wear.compose", name = "compose-material", version.ref = "composeMaterial" }
```

### 📱 AndroidManifest.xml - Permissões e Features
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    
    <!-- 🔔 Permissões para notificações e funcionalidades -->
    <uses-permission android:name="android.permission.WAKE_LOCK" />
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS" />
    
    <!-- ⌚ Identificação como aplicativo Wear OS -->
    <uses-feature android:name="android.hardware.type.watch" />
    
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@android:style/Theme.DeviceDefault">
        
        <!-- 📚 Biblioteca Wearable obrigatória -->
        <uses-library
            android:name="com.google.android.wearable"
            android:required="true" />

        <!-- 🚀 App standalone (não precisa de celular) -->
        <meta-data
            android:name="com.google.android.wearable.standalone"
            android:value="true" />

        <activity
            android:name=".presentation.MainActivity"
            android:exported="true"
            android:taskAffinity=""
            android:theme="@style/MainActivityTheme.Starting">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
```

## 🐛 Troubleshooting e Soluções

### ⚠️ Problemas Comuns e Soluções

#### 🔴 Erro de Compatibilidade SDK 36
```bash
# Problema: "requires libraries to compile against version 36"
# Solução: O projeto já está configurado com compileSdk = 36
./gradlew clean
./gradlew build
# O Android Studio baixará automaticamente o SDK 36 se necessário
```

#### 🔴 Problemas com Permissões de Notificação
```kotlin
// Problema: Notificações não aparecem
// Solução: Verifique se a permissão foi concedida
// O app solicita automaticamente no Android 13+
// Para versões anteriores, as notificações funcionam automaticamente
```

#### 🔴 LaunchedEffect não funciona
```kotlin
// Problema: Tempo não atualiza ou notificações não disparam  
// Solução: Certifique-se de que o Compose está configurado corretamente
buildFeatures {
    compose = true
}
```

#### 🔴 Emulador Wear OS não detectado
1. **Verificar emulador**: Certifique-se de que está rodando um emulador Wear OS
2. **Testar ADB**: Execute `adb devices` no terminal
3. **Reiniciar serviços**: 
   ```bash
   adb kill-server
   adb start-server
   ```
4. **Verificar configuração**: AVD deve ser categoria "Wear OS"

#### 🔴 Problemas de Build com Compose
```bash
# Limpar cache do projeto
./gradlew clean
./gradlew cleanBuildCache

# Rebuild completo
./gradlew build --rerun-tasks

# Se persistir, invalidar caches no Android Studio:
# File > Invalidate Caches and Restart
```

#### 🔴 Notificações não aparecem no dispositivo
1. **Verificar canal**: Canal "water_channel" deve ser criado
2. **Testar permissões**: Manualmente em Settings > Apps > SaudacaoWearOS > Permissions
3. **Verificar horário**: Notificações disparam apenas no minuto 24
4. **Debug**: Adicionar logs para verificar execução:
   ```kotlin
   Log.d("WearReminder", "Current time: ${time.minute}")
   ```

### 🔍 Debug e Logs

#### Verificar funcionamento do sistema de tempo:
```kotlin
// Adicionar no WearApp para debug
LaunchedEffect(Unit) {
    while (true) {
        val currentTime = LocalTime.now()
        Log.d("WearApp", "Time updated: ${currentTime}")
        delay(1000L)
    }
}
```

#### Monitorar notificações:
```bash
# Ver logs em tempo real
adb logcat | grep -E "(WearReminder|NotificationManager)"
```

## 📚 Recursos de Aprendizado e Referências

### 🎓 Documentação Oficial
- [🏠 Wear OS Developer Guide](https://developer.android.com/wear) - Guia completo oficial
- [🎨 Jetpack Compose para Wear OS](https://developer.android.com/jetpack/compose/wear) - UI moderna
- [⏰ Time API - LocalTime](https://developer.android.com/reference/java/time/LocalTime) - Manipulação de tempo
- [🔔 Notifications API](https://developer.android.com/develop/ui/views/notifications) - Sistema de notificações

### 📖 Tutoriais e Codelabs
- [🧪 Codelab: Compose for Wear OS](https://developer.android.com/codelabs/compose-for-wear-os) - Prático
- [🎯 Building Apps for Wear OS](https://developer.android.com/training/wearables/apps) - Fundamentos
- [📱 Wear OS by Google Training](https://developers.google.com/wear) - Recursos do Google

### 🔗 Exemplos e Samples
- [📦 Wear OS Samples Oficiais](https://github.com/android/wear-os-samples) - Repositório oficial
- [🚀 Compose Starter](https://github.com/android/wear-os-samples/tree/main/ComposeStarter) - Template base
- [⚡ Advanced Samples](https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced) - Recursos avançados

### 🛠️ Ferramentas e Recursos Técnicos
- [🔧 Gradle Version Catalog](https://docs.gradle.org/current/userguide/platforms.html) - Gerenciamento de dependências
- [📋 Android Permissions Guide](https://developer.android.com/guide/topics/permissions/overview) - Permissões
- [🎨 Material Design for Wear](https://m3.material.io/foundations/adaptive-design/large-screens) - Design guidelines
- [⚡ Kotlin Coroutines Guide](https://kotlinlang.org/docs/coroutines-guide.html) - Programação assíncrona

### 🎥 Vídeos Recomendados
- [📺 Android Developers - Wear OS](https://www.youtube.com/playlist?list=PLWz5rJ2EKKc_HyE1QX9heAgTPdAMqc50z) - Playlist oficial
- [🎬 Compose for Wear OS](https://www.youtube.com/watch?v=2_H5GGwIQE4) - Workshop Google I/O

### 📋 Conceitos Abordados no Projeto
| Conceito | Implementação | Documentação |
|----------|---------------|--------------|
| **LaunchedEffect** | Atualizações em tempo real | [🔗 Side Effects](https://developer.android.com/jetpack/compose/side-effects) |
| **State Management** | `remember` + `mutableStateOf` | [🔗 State in Compose](https://developer.android.com/jetpack/compose/state) |
| **Coroutines** | `delay()` e loops infinitos | [🔗 Coroutines Guide](https://kotlinlang.org/docs/coroutines-guide.html) |
| **Permissions** | Runtime permissions Android 13+ | [🔗 Request Permissions](https://developer.android.com/training/permissions/requesting) |
| **Notifications** | NotificationCompat + Channels | [🔗 Create Notifications](https://developer.android.com/develop/ui/views/notifications/build-notification) |
| **LocalTime** | Java 8 Time API | [🔗 Date Time API](https://developer.android.com/reference/java/time/package-summary) |

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto é educacional e está disponível sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## 👨‍💻 Autor

**Matheus Toledo**
- GitHub: [@MatheusToledo246](https://github.com/MatheusToledo246)
- Instituição: UTFPR (Universidade Tecnológica Federal do Paraná)

## 🏆 Reconhecimentos

- [UTFPR](https://www.utfpr.edu.br/) - Universidade Tecnológica Federal do Paraná
- [Android Team](https://developer.android.com/) - Pela excelente documentação
- [Jetpack Compose Team](https://developer.android.com/jetpack/compose) - Pelo framework incrível

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!

**Desenvolvido com ❤️ para a comunidade Wear OS**