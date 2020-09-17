package kr.hs.emirim.s2019w18.studytrail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements OnTabItemSelectedListener{

    //activity_main 메인화면 시작

    Fragment1 fragment1;    //gallery 레이아웃의 클래스
    Fragment2 fragment2;    //camera 레이아웃의 클래스
    Fragment3 fragment3;    //graph 레이아웃의 클래스

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();//첫번째 탭(gallery)이 기본 세팅
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tab1: //tab1 아이콘(왼쪽 연필모양) 클릭 시 발생하는 토스트
                        Toast.makeText(getApplicationContext(), "공부의 흔적들을 확인하고 관리하세요.", Toast.LENGTH_LONG).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
                        return true;
                    case R.id.tab2://tab2 아이콘(가운데 픽셀판모양) 클릭 시 발생하는 토스트
                        Toast.makeText(getApplicationContext(), "공부의 흔적을 기록하고 만들어주세요.", Toast.LENGTH_LONG).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
                        return true;
                    case R.id.tab3://tab3 아이콘(오른쪽 설정모양) 클릭 시 발생하는 토스트
                        Toast.makeText(getApplicationContext(), "공부의 수치들을 한번에 확인하세요.", Toast.LENGTH_LONG).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();
                        return true;
                }//end of switch
                return false;
            }//end of BottomNavigationView.OnNavigationItemSelectedListener
        });//end of new
    }//end of onCreate

    @Override
    public void onTabselected(int position) {   //아이콘 선택 시 그에 따라 레이아웃 바뀜
        if (position == 0) {
            bottomNavigation.setSelectedItemId(R.id.tab1);
        } else if (position == 1) {
            bottomNavigation.setSelectedItemId(R.id.tab2);
        } else if (position == 2) {
            bottomNavigation.setSelectedItemId(R.id.tab3);
        }
    }
    //메인화면 끝 // 코드 수정 시 끝이 아닐 수도 있음. 그냥 ctrl+f 키 눌러서 키워드로 찾기 편하라구 적어놓은거야
}//end of class