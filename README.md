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
- 엘베관리시스템은 일급컬렉션으로 구성해볼까?(엘리베이터의 묶음을 관리하는 클래스)-> 묶음으로부터 하나의 엘베를 선택하도록 하면 되겠다.. -> 하나의 엘베를 고르기 위한 strategy (전략)은 변경 가능성이 농후하므로 전략패턴으로 구성해보자!
- 엘베의 State (상태)는 움직이는 상태, 멈추는 상태정도가 있을듯.. 상태패턴!

## 유저의 흐름
-- FLOW --
1. Client가 외부에서 엘리베이터 호출 버튼을 누름.
2. 엘리베이터가 해당 층에 도착.
3. 탑승하여 엘리베이터 내부의 버튼을 누름.
4. 엘리베이터가 해당 층에 도착.

그렇다면 지금 버튼이라는 클래스를 추가해야겟다!
![image](https://user-images.githubusercontent.com/17541680/114498936-0d5e2800-9c60-11eb-9663-5d0714d9048b.png)

내가 만약 엘리베이터 시스템 설계자라면, 
Building(건물)과 Floor(층)와 Passage(엘베통로)는 이미 건설되어 있다고 판단하여 강결합으로 연결함. (생명주기 같음..)
❓상태패턴은 클래스다이어그램 상 양방향 결합으로 보여지는데 과연 좋은걸까? enum을 써야하나?   -> 이미 상태가 fix된 경우에만 사용하기 적합한걸로 판단된다. 상태가 추가되는 경우 꽤나 클래스를 뜯어고쳐야하는 것 같은데..(ocp 위반아닌가..)   
=> 결론: oop 위반이 아니다. interface를 구현한 클래스에서 해당 클래스에 의존하는 것이므로 양방향 의존관계가 아니다!!

Pressable interface에 press와 release라는 추상 메소드가 각각 존재한다.. 유저는 단지 버튼을 누르는 것만 한다! press 메소드만 남겨보자!
