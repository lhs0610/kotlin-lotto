### 기능 요구사항 정의서
* * *
#### 입력 인터페이스(InputView)를 가진다.
- [ ] CLI 입력을 받는 함수를 제공한다.
  - [ ] 입력 데이터에 대한 검증 작업을 가진다.
  - [ ] 입력 데이터에 대한 변환 작업을 가진다.
  - [ ] 구입 금액을 입력받는다.
  - [ ] 지난 주 당첨 번호를 입력받는다.
#### 출력 인터페이스(ResultView)를 가진다.
- [ ] 구입한 로또 개수를 출력하는 함수를 제공한다. 
- [ ] 당첨 통계를 출력하는 함수를 제공한다.
  - [ ] (3/4/5/6) 일치한 숫자별 당첨 개수를 출력한다.
  - [ ] 총 수익률을 계산해 출력한다.
#### 로또 컨트롤러를 가진다.
- [ ] 로또 구입 API를 제공한다.
#### 로또 서비스를 가진다.
- [ ] 로또 구입 기능을 제공한다.
#### 로또 객체를 가진다.
- [ ] 사이즈6의 정수 리스트 프로퍼티를 가진다.
- [ ] 생성시 각 리스트의 정수 요소를 무작위 정수 값으로 초기화한다.
#### 무작위 정수를 생성하는 제네레이터 객체를 가진다.
- [x] 제네레이트 함수를 제공한다.
  - [x] 파라미터로 시작과 끝 범위에 해당하는 정수값을 받는다.
  - [x] 입력받은 범위에 해당하는 무작위 정수를 반환한다.
#### 로또 팩토리 객체를 가진다.
- [ ] 로또 생성 함수를 제공한다. 
  - [ ] 입력받은 수 만큼의 로또 객체들을 포함한 리스트를 반환한다.
#### 문자열 분리기 객체를 가진다.
- [ ] 입력받은 문자열을 특정 기호로 분리한 리스트를 반환하는 함수를 제공한다. 
  - [ ] 콤마(,) 를 기본 분리 기호로 사용한다.
#### 결과 정산기 객체를 가진다.
- [ ] 수익률 계산 함수를 제공한다.
  - [ ] 파라미터로 로또 리스트와 당첨 번호를 받는다.
#### 당첨금 정책 열거 타입을 가진다.
- [ ] 프로퍼티로 정수형 일치 카운트 속성을 가진다.
- [ ] 프로퍼티로 일치 개수에 해당하는 정수형 당첨금을 가진다.