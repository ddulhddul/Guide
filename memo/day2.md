# encapsulation ?
> Class의 public한 부분이 최소가 될 수 있도록 (get, set)
1. 전체를 private로
2. 최소의 부분을 interface로
3. validation logic 작성
- Caller가 Callee 가 아닌 Interface에 dependency 를 가져감

## 4. Factory Method 89p
- Iterator, Template Method 디자인패턴이 들어있다.
- 관련 패턴 : Template Method, Singletone, Composite, Iterator

- FactoryMethod 1

![factoryMethod1](../cr_FactoryMethod2/img1.PNG)

- FactoryMethod 2

![factoryMethod2](../cr_FactoryMethod2/img2.PNG)

## 5. Singleton p99
- Singleton 1

![Singleton](../cr_Singleton2/img.PNG)

- Singleton 2

![Singleton2](../cr_Singleton2/img2.PNG)

## 6. Prototype p112
1. 종류가 너무 많아 클래스로 정리되지 않는 경우
2. 클래스로부터 인스턴스 생성이 어려운 경우
3. framework와 생성할 인스턴스를 분리하고 싶은 경우

- java.lang.Cloneable
- 원본의 복제객체를 넘긴다.

![Prototype](../cr_Prototype2/img.PNG)


## 7. Builder p128

![Builder](../cr_Builder2/img.PNG)

