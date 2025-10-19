# 🌟 SaudacaoWearOS

![Wear OS](https://img.shields.io/badge/Platform-Wear%20OS-brightgreen)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-orange)
![Android](https://img.shields.io/badge/Android%20SDK-36-green)

Um aplicativo simples e elegante para dispositivos Wear OS desenvolvido com **Kotlin** e **Jetpack Compose**. Este projeto demonstra os conceitos fundamentais do desenvolvimento para smartwatches Android.

## 📱 Sobre o Projeto

O **SaudacaoWearOS** é um aplicativo básico que exibe uma saudação na tela do smartwatch. Foi desenvolvido como um projeto educacional para demonstrar:

- Desenvolvimento nativo para Wear OS
- Interface moderna com Jetpack Compose
- Boas práticas de desenvolvimento Android
- Arquitetura simples e eficiente

## ✨ Funcionalidades

- 👋 **Saudação Personalizada**: Exibe "Olá, WearOS!" na tela
- 🎨 **Interface Moderna**: Utiliza Jetpack Compose para UI responsiva
- ⚡ **Performance Otimizada**: Desenvolvido especificamente para dispositivos Wear OS
- 🔄 **Splash Screen**: Tela de carregamento integrada
- 📱 **Compatibilidade**: Suporta dispositivos redondos e quadrados

## 🛠️ Tecnologias Utilizadas

### Linguagem e Framework
- **Kotlin** - Linguagem principal
- **Jetpack Compose** - Framework de UI moderna
- **Wear Compose** - Componentes específicos para Wear OS

### Bibliotecas Principais
- `androidx.activity:activity-compose` - Integração Activity + Compose
- `androidx.wear.compose:compose-material` - Componentes Material para Wear OS
- `androidx.wear.compose:compose-foundation` - Fundamentos do Compose para Wear
- `androidx.core:core-splashscreen` - Splash screen nativa
- `com.google.android.gms:play-services-wearable` - Serviços Google para Wear OS

### Ferramentas de Desenvolvimento
- **Android Studio** - IDE principal
- **Gradle** (Kotlin DSL) - Sistema de build
- **Android SDK 36** - Versão mais recente do SDK

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

## 📁 Estrutura do Projeto

```
saudacaoWearOS/
├── app/
│   ├── src/main/
│   │   ├── java/br/utfpr/saudacaowearos/
│   │   │   └── presentation/
│   │   │       ├── MainActivity.kt          # Activity principal
│   │   │       └── theme/
│   │   │           └── Theme.kt             # Configurações de tema
│   │   ├── res/
│   │   │   ├── values/
│   │   │   │   └── strings.xml              # Strings do app
│   │   │   ├── values-round/
│   │   │   │   └── strings.xml              # Strings para telas redondas
│   │   │   └── mipmap-*/                    # Ícones do app
│   │   └── AndroidManifest.xml              # Configurações do app
│   ├── build.gradle.kts                     # Configurações do módulo app
│   └── proguard-rules.pro                   # Regras de ofuscação
├── gradle/
│   └── libs.versions.toml                   # Catálogo de versões
├── build.gradle.kts                         # Configurações do projeto
├── gradle.properties                        # Propriedades do Gradle
└── README.md                                # Este arquivo
```

## 🎯 Principais Componentes

### MainActivity.kt
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()        // Splash screen
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_DeviceDefault)
        setContent {
            WearApp()               // Composable principal
        }
    }
}
```

### WearApp Composable
```kotlin
@Composable
fun WearApp() {
    Box(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Olá, WearOS!",
            color = Color.White
        )
    }
}
```

## 🔧 Configurações Importantes

### build.gradle.kts (app)
```kotlin
android {
    compileSdk = 36
    defaultConfig {
        minSdk = 35
        targetSdk = 35
    }
    buildFeatures {
        compose = true
    }
}
```

### AndroidManifest.xml
```xml
<uses-feature android:name="android.hardware.type.watch" />
<uses-permission android:name="android.permission.WAKE_LOCK" />

<meta-data
    android:name="com.google.android.wearable.standalone"
    android:value="true" />
```

## 🐛 Resolução de Problemas

### Erro de Compatibilidade SDK
Se encontrar erros relacionados ao SDK:
```bash
# O projeto atualiza automaticamente para SDK 36
# Caso necessário, verifique se o Android SDK está atualizado
```

### Problemas com Compose
```bash
# Limpe o projeto
./gradlew clean
./gradlew build
```

### Emulador não detectado
1. Certifique-se de que o emulador Wear OS está rodando
2. Verifique se o ADB está funcionando: `adb devices`
3. Reinicie o Android Studio se necessário

## 📚 Recursos de Aprendizado

- [Documentação Oficial Wear OS](https://developer.android.com/wear)
- [Jetpack Compose para Wear OS](https://developer.android.com/jetpack/compose/wear)
- [Samples Oficiais](https://github.com/android/wear-os-samples)
- [Codelab Wear OS](https://developer.android.com/codelabs/compose-for-wear-os)

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