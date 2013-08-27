# Unity3D AngryBots + baas.io Android Project

Unity3D AngryBots(Demo)의 Android 프로젝트이며, baas.io의 기본설정이 되어 있습니다.

## 실행하려면…

1. 먼저 [baas.io](https://baas.io)에 접속하여 가입합니다.
2. My page > 백엔드앱 목록 > sandbox를 선택하면 baas.io ID라고하는 uuid 형태의 값, Application ID라고 하는 uuid 형태의 값을 기억합니다.
3. 소스코드의 com.kth.baasio.startup위치의 BaasioConfig.java에서 BAASIO_ID와 APPLICATION_ID를 설정합니다.
4. gcm을 이용하려면 Sender ID를 GCM_SENDER_ID에 설정합니다.
5. 실행합니다.

BaasioConfig.java 설정관련 자세한 내용은 아래 링크를 참고바랍니다.

- [기본설정 > BaasioConfig.java](https://github.com/baasio/baas.io-sdk-android/wiki/Getting-Started#step-1-baasioconfigjava-%EC%83%9D%EC%84%B1)

GCM 활성화 관련 자세한 내용은 아래 링크를 참고바랍니다.

- [기본설정 > Push 활성화](https://github.com/baasio/baas.io-sdk-android/wiki/Getting-Started#step-3-push-%EA%B8%B0%EB%8A%A5-%ED%99%9C%EC%84%B1%ED%99%94)
- [Google API Key 발급](https://github.com/baasio/baas.io-sdk-android/wiki/How-to-Get-Google-API-Key)


## 실행하면…

1. sandbox의 greeting 컬랙션에 엔터티를 생성합니다.
2. GCM Sender ID를 정상적으로 설정하고, 포탈을 통해 푸시를 전송할 수 있습니다. 전송된 푸시는 com.kth.baasio.startup.gcm의 GCMIntentService 클래스로 들어옵니다.







