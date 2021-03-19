플러터는 화면에 표시되는 UI를 위젯이란 개념을 사용하여 나타낸다. 이미지, 텍스트 표시, 사용자와 상호작용하는 버튼, 레이아웃 배치를 위한 속성들도 다 위젯이다.



```dart
void main() {
  runApp(HelloWorld());
}

class HelloWorld extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Flutter App',
      home: new Scaffold(
        appBar: new AppBar(
          title: const Text('Hello World Demo'),
        ),
        body: const Center(
          child: const Text('Hello World'),
        ),
      ),
    );
  }
}
```

runApp()의 파라미터는 위젯이다. 따라서 가장 먼저 화면에 나타날 위젯을 구현해야 한다. 



Helloworld는 StatelessWidget를 상속받았다. (StatelessWidget은 Widget을 상속 받음.) 따라서 HelloWorld는 runApp()의 인자로 사용이 가능하다. StatelessWidget은 화면 표시만을 위한 위젯이다.

build() 메서드를 @override한다. StatelessWidget 상속 시 필수 구현 메서드이다. 리턴 타입이 위젯이다. return MaterialApp() MaterialApp은 머티리얼 디자인 구현을 쉽게 할 수 있도록 도와주는 플러터의 위젯 중 하나다. 다양한 파라미터를 가진다.

title은 앱의 최근 목록에서 표시되는 이름이다.  

home의 파라미터도 위젯 타입이다.  MaterialApp의 자식 위젯이라고 생각하면 된다. Scaffold라는 위젯은 MateriaApp에서 머티리얼 디자인의 뼈대를 구성하는 역할을 한다. Scaffold 역시 다양한 파라미터가 있다. 여기선 appBar와 body를 사용한다.

appBar은 새로운 AppBar위젯을 만들고 AppBar 위젯의 파라미터 중 title이란 파라미터를 사용했다. 앱 바는 앱 위에 있는 바다. 위에 Hello World Demo가 적혀있는곳이다.

body는 정렬과 관련된 위젯인 Center을 사용했다. Center의 파라미터 중 child의 위젯으로 Text라는 걸 사용해 Hello World라는 텍스트를 표시했다. 텍스트가 가운데 정렬된다.



이처럼 플러터 앱의 화면 구성은 위젯으로 시작해서 위젯으로 끝난다. 

