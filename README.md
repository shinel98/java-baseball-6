## 🏄‍ 구현 기능 목록

### ⚙️컴퓨터 랜덤 숫자 생성 기능
- 1~9까지의 랜덤 숫자 세개를 리스트에 저장하기
- 리스트에 중복되는 숫자가 있는지 확인하기 

### ⚙️유저 숫자 입력 기능
- 유저에게 입력받기
  - (예외) 입력값 중 숫자가 아닌게 있는 경우
  - (예외) 입력값 중 숫자가 중복되는 경우
  - (예외) 입력값이 3개가 아닌 경우
  - (예외) 입력값 중에 0이 있는 경우

### ⚙️볼,스트라이크 결과 확인 기능
- 스트라이크 개수를 계산하기
  - 숫자가 같은 index에 있다면 스트라이크 개수 증가
- 볼 개수를 계산하기
  - 같은 index에는 없지만 리스트에 존재한다면 볼 개수 증가 

### ⚙️게임 실행 기능
- 숫자 입력 메시지 출력하기
- 볼,스트라이크,낫싱 여부 출력하기
- 3스트라이크일 경우 종료하기

### ⚙️게임 반복여부 확인 기능
- 재시작 입력 메시지 출력하기
- 유저 입력받기
  - (예외) 1,2 외의 입력값이 들어올 경우
- 게임 재시작 혹은 종료하기
---
## 💁‍♂️ 로직
```
반복
    컴퓨터_숫자 = 랜덤_정수_생성(1, 9)  // 1에서 9까지 중복되지 않은 랜덤한 정수 3개 생성
    반복
        유저_입력 = 입력_받기()  // 1. 유저에게 3자리 정수 입력 받기
        만약 유저_입력이_유효하지_않다면 예외처리 
        
        볼, 스트라이크 = 볼_스트라이크_계산(컴퓨터_숫자, 유저_입력)     // 2. 결과 출력    
        
        만약 볼 > 0 또는 스트라이크 > 0 이라면 결과 출력    // 2.1. 볼과 스트라이크 출력
        아니라면 출력("낫싱")   // 2.2. 볼과 스트라이크에 해당하지 않는 경우
        만약 스트라이크 == 3 이라면 유저_선택 = 입력_받기()     // 2.3. 3개의 숫자를 모두 맞힐 경우
            
        만약 유저_선택 != 1 그리고 유저_선택 != 2 이라면 예외처리   // 예외처리: 유저 선택이 1 또는 2가 아닌 경우
        만약 유저_선택 == 1 이라면 브레이크     // 인풋이 1일 시 게임 재시작        
        만약 유저_선택 == 2 이라면 종료     // 인풋이 2일 시 게임 종료
```              
---
## ✌ 후기
**1. 객체 지향 코드를 구현하려고 하였습니다.**
  * 코드의 재사용성을 고민하여 클래스와 메서드를 구현해보았습니다.
  * 메서드 당 하나의 기능을 담당하도록 설계하였습니다.
  * getter/setter 대신에 상수와 생성자를 사용하였습니다.
  * 재사용성을 위해 하드 코딩 대신 상수화 하였습니다.
**2. 커밋 단위를 기능별로 가져가려고 하였습니다.**
  * README.md 에 적은 기능을 구현할 때마다 커밋을 남겼습니다.
  * 리팩토링이나 클래스 변동 시마다 커밋을 남겼습니다.
**3. 커밋 메시지 컨벤션을 정해 지키려고 하였습니다.**
  * 타입(스코프): 제목(내용) 의 형식으로 작성하였습니다.
  * 변경한 파일이 많을 경우에만 스코프를 생략하였습니다.
**4. 클린 코드를 지키려고 하였습니다.**
  * 자바 코드 컨벤션을 지키면서 프로그래밍 했습니다.
  * 클래스명, 메서드명, 변수명을 직관적으로 작성하려고 하였습니다.
  * 주석을 쓰지 않았습니다.
  * else 예약어를 쓰지 않았습니다.
  * getter/setter 대신 constructor로 구현하였습니다.
  * 메서드의 인자 수를 2개 이하로 구현하였습니다.
  * 메서드가 한가지 기능만 담당하도록 구현하였습니다.

소감: https://messy-passbook-e0b.notion.site/1-d8fa86e25ca6437ab3c991636e46a2e0?pvs=4
