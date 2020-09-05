안드로이드 처음 해봤다. 앱 화면을 코드 작성으로 나타내지 않아도 돼서 편리하다고 생각했다. 오늘은 버튼을 누르면 다른 화면으로 넘어가는 것을 만들었다.



### 화면

![안드 첫 번째 화면](https://user-images.githubusercontent.com/66874658/92303955-bb13a500-efb4-11ea-88ac-2c46f3ce7b9f.JPG)



첫 화면이다. 여기서 여행을 떠나자 버튼을 누르면



![안드 두 번째 화면](https://user-images.githubusercontent.com/66874658/92303970-d8e10a00-efb4-11ea-8e94-e881b70b9597.JPG)



이렇게 넘어간다. 재밌었닿.



### 소스 코드

```java
package com.example.first_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, button_click.class);
        startActivity(intent);
    }
}
```

코드이다. 실제로 작성한 건 

public void onClick(View view) {
        Intent intent = new Intent(this, button_click.class);
        startActivity(intent);

}

이 부분밖에 없다. 윗 부분은 자동 생성되는 것이다. **onClick**은 메소드고 **intent**는 다음 화면을 넘어가게 해준다. (현재는 버튼을 클릭할 때.) **startActivity**는 intent를 실행시켜준다.