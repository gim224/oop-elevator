# oop-elevator

## [연습] 빌딩의 엘리베이터 시스템을 객제지향적으로 설계해보기!

### 📍 객체지향의 객자도 모름.. 관심만 많음.. (역할/책임/협력)

### 📍 그 어떤 내용도 지적바람.


## [의식의 흐름]

- 전제조건 => 해당 건물은 지하 5층부터 지상 16층까지 존재함 / 총 5개의 엘레베이터가 운행 중임. / 각 층에는 엘베를 호출할 수 있는 UP, DOWN 버튼 세트가 2개씩 존재함 / 지하로 갈 수 있는 엘베는 하나뿐임. 나머지는 1층부터 16층까지밖에 움직일 수 없음. / 층에서 호출 시 가장 가까이에 있는 엘베가 배정됨? / 과적불가?
- 
- 해당 엘레베이터가 설치될 건물이 총 몇 층일지는 예측할 수 없으나, 엘베는 처음 만들 때 최저층부터 최고층까지의 버튼(number)을 구성한다.
- 건물에 0층은 없다.
- 버튼을 누르면 엘베는 해당 층으로 이동해야한다. 
(엘베가 이동하는 것은 엘베 자신의 책임일까? 도르레..?) ✅ 엘베관리시스템을 만들어서 엘베를 움직이는 것을 위임해보자!
(Client는 엘베 버튼을 누름으로써 '엘베를 움직여!'라는 메시지를 주고 받는다? 이것이 인터페이스인가?..) ✅ 엘베는 단지 유저의 메시지를 엘베관리시스템에 전달할 뿐이다!
