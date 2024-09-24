package kr.ac.kumoh.ce.s20191091.s24w0201counter

import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kr.ac.kumoh.ce.s20191091.s24w0201counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        //setContentView(R.layout.activity_main)

//        main.btnAdd.setOnClickListener {
//            main.txtCount.text = "증가버튼입니다"
//            main.txtCount.text = "${++count}"
//            //main.txtCount.text = "" + ++count //연산자 오버로딩으로 count도 string으로바뀜
//            //main.txtCount.text = (++count).toString()
//        }
//        main.btnSub.setOnClickListener {
//            main.txtCount.text = "감소버튼입니다."
//            if(count > 0) {
//                main.txtCount.text = "${--count}"
//            }
//        }
//        main.btnReset.setOnClickListener {
//            count = 0;
//            main.txtCount.text = "$count"
//        }
        enableEdgeToEdge()//최근에 나온 핸드폰이 전면 화면이라 그걸 이용하기 위해 사용

    }
    //LinearLayout: 수직vertical(위에서 아래로), 수평horizontal(왼쪽에서 오른쪽으로) 배치
    //컨트롤 스페이스하면 입력할거 자동생성
    //orientation을 통해 방향을 설정
    //XML은 오타내도 실행은 되었다가 꺼지니까 주의
    //이름지을때 언더스코어 쓰느게 좋음
    //inflate: 메모리에 xml를 만들어냄
    //xml은 _로쓰는게 액티비티에서는 대문자로바뀜
    //match_parent: 전체부분을 차지
    //"${}"는 문자열 안에 변수나 표현식을 삽입할 때 사용


    //gravity: 자기 영역에서를 말하는것
    //layout_gravity: 부모와의 영역관계에서 말하는것

    //padding은 내 안의 여백
    //layout_margin은 부모와 나 사이에서의 여백

    //text사이즈는 sp, 거리관련되는 것은 dp
    //색깔영역만 textView
}