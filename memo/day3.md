# 자바 매크로
http://javafactory.tistory.com/963


## 11. Composite 207p
- 그릇과 내용물을 동일시하기
- Recursive 가능(상속하기 때문)
- Composite:Component = 1:*
    > Component 배열

- Tree Structure
- ex) File System, HTML DOM, MVC

![Composite](../st_Composite2/img.PNG)

## 12. Decorator 221p
- 장식과 내용물을 동일시하기
- Recursive 가능(상속하기 때문)
- Decorator:Component = 1:1

![Decorator](../st_Decorator2/img.PNG)

## 13. Visitor 242p
- 데이터 구조를 돌아다니면서 처리하기
- 데이터 구조와 처리를 분리
- 방문하는 수만큼 메소드를 만든다.
- The Open-Closed Principle
    > 기존의 클래스를 수정하지 않고 확장할 수 있도록 하는 것

- ConcreteElement역할의 추가는 곤란
    - 필요시 Adapter 를 이용...

![Visitor](../be_Visitor2/img.PNG)