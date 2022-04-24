
1. 게임실행 CarRaceFlowController
2. 입력 기능 CarRaceInputController
3. 출력 기능 CarRaceOutputController
4. 자동차 리스트 Cars
5. 자동차 Car
6. 자동차 진행 상태 CarStatus
7. 자동차 결과 CarResult
8. 자동차 게임 진행 CarRaceFlow
9. 자동차 전후진 생성기 CarPlayGenerator
10. 유효성 검사 함수 추가 ValidUtils

•주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
•각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
•자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
•사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
•전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈
춘다.
•자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
•우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
•사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를
출력 후 그 부분부터 입력을 다시 받는다.
•Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.