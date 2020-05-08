# semina_2st

#[기본과제 1]
![1](https://user-images.githubusercontent.com/60434971/81429393-b838ad00-9198-11ea-8a23-a1ab62da3ce2.jpg)
![2](https://user-images.githubusercontent.com/60434971/81429428-c686c900-9198-11ea-8fe6-2643bd90f677.jpg)
![3](https://user-images.githubusercontent.com/60434971/81429432-c8508c80-9198-11ea-99c1-64d741ed2c4e.jpg)
![4](https://user-images.githubusercontent.com/60434971/81429436-c981b980-9198-11ea-9f16-7c2f5e064f6f.jpg)

#[기본과제 2]

*ItemDecoration

-RecyclerView의 아이템들을 꾸미는 역할
-RecyclerView에 내부에 존재하고있는 추상클래스
-getItemOffsets 함수 
:recyclerView안에 있는 아이템간에 간격을 설정해 줄 수 있다.
:좌우 간격이 필요할 경우 outRect.right = 20
상하일 경우 top or bottom을 좌우는 left or right 를 사용.

참고-https://heepie.me/367, https://altongmon.tistory.com/792, https://inma.tistory.com/67

*clipToPadding

- android:clipToPadding="false"로 설정하면 Padding공간을 Scroll공간으로 사용가능하다.
참고- https://youngest-programming.tistory.com/73
