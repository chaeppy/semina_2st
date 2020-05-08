# semina_2st

#[기본과제 1]
![1](https://user-images.githubusercontent.com/60434971/81453290-2181e580-91c4-11ea-8c02-766180416f0f.jpg)


![2](https://user-images.githubusercontent.com/60434971/81453292-221a7c00-91c4-11ea-8ba5-0c8dba88f122.jpg)


![3](https://user-images.githubusercontent.com/60434971/81453286-1fb82200-91c4-11ea-9838-fcfde301afcc.jpg)


![4](https://user-images.githubusercontent.com/60434971/81453288-20e94f00-91c4-11ea-9e8c-1455e87bb9ce.jpg)

#[기본과제 2]

1. ItemDecoration

- RecyclerView의 아이템들을 꾸미는 역할
- RecyclerView에 내부에 존재하고있는 추상클래스
- getItemOffsets 함수

: recyclerView안에 있는 아이템간에 간격을 설정해 줄 수 있다.
: 좌우 간격이 필요할 경우 outRect.right = 20, 상하일 경우 top or bottom을 좌우는 left or right 를 사용.

참고-https://heepie.me/367, https://altongmon.tistory.com/792

2. clipToPadding
- RecyclerView 최상단이나 하단에 여백을 두어 다른 뷰와 구분을 주되, 스크롤 공간은 유지할 수 있는 방법
- android:clipToPadding="false"로 설정하면 Padding공간을 Scroll공간으로 사용가능하다.

참고- https://youngest-programming.tistory.com/73
