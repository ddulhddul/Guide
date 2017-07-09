# [Ionic 2 개발을 위한 Typescript 기본](https://www.youtube.com/playlist?list=PL_sanVl1UIb3ZDNpSiHidJmUK6ipQPEia)

## Ionic 2 강좌 - 섹션 1. 1강 '앱 개발을 위한 준비'
* IDE / Editor
    * visual studio
* ndoejs, npm 설치
    * [https://nodejs.org/ko](https://nodejs.org/ko)
* installing cordova / ionic
    * npm install -g cordova ionic 
* done. start!
    * start an app
        > ionic start --v2 myApp tabs

* Run!
    * Run you app
        * cd myApp
        * ionic serve -c -l

## Ionic 2 강좌 - orientation
* ionic 2 framework 란 ?

## Ionic 2 강좌 - 섹션 1. 2강 "프로젝트의 구성"
* src
* config ile

## Ionic 2 강좌 - 섹션 1. 3강 "src/ 폴더의 구성"
> component 들은 html+ts+scss 가 합쳐져서 만들어진다.

* src - index.html
    * ion-app : ionic이 시작
* src - assets
    * 자주 사용하지 않는 icon
* src - theme
    * design
    * variable.css - scss변수들을 디자인
* src - app
    * html - 구조
    * scss - 디자인
    * ts - javascript와 같은
    * main.dev.ts / main.prod.ts
        * 둘 중 하나만 사용. (개발용 / 운영용)
* src - pages
    > tabs 에서 about, contact, home을 보는 구조

    * about
    * contact
    * home
    * tabs

## Ionic 2 강좌 - 섹션 1. 4강 "cordova란? Ionic framework의 구성"
* apache cordova
    * node_modules : javascript 라이브러리 설치 되는 장소
    * plugins : cordova plugin 이 설치되는 장소
* mobile apps with html, css & js
* ionic > cordova, angularJS, gulp
* native 기능 사용할 수 있도록 지원해줌

## Ionic 2 강좌 - 섹션 1. 5강 "angular js 2와 typescript"
* angularJS2
    * client 단 개발에 필요도구
    * 기능들을 모듈화해 개발하는 것을 지향
    * @Component 와 같은 decorator를 사용해 metadata 사용
* Typescript
    * Javascript that scales
    * 스케일 가능한 javascript
    * javascript, 타일을 가지고 있는 superset
    * javascript 에서 기능이 확장된 것
    * Type, OOP, Scalability
        * Type - 에러를 쉽게 찾을수 있음
        * OOP - 확장성이 좋음
* ts vs js
```ts
class Greeter {
    greeting: string,
    constructor (message: string){
        this.greeting - message;
    }
    greet(){
        return "hello, "+this.greeting;
    }
}
```
```js
class Greeter = (function(){
    function Greeter(message){
        this.greeting = message;
    }
    Greeter.prototype.greet = function(){
        return "hello, "+ this.greeting;
    }
    return Greeter;
})();
```
* type이 들어있는 ES6 js이다! 정도로 해석 가능

## Ionic 2 강좌 - 섹션 2. 1강 "Intro to Typescript"
* Javascript that scales
    * classes
    * modules
    * interfaces
    * generics
    * static typing(optional)
* Setting
    > npm install -g typescript

    * tsc -v
    * tsc main.ts
        * main.ts파일을 main.js로 변환
* typescript test?
    * 필요한 파일들을 만들고, web browser에서 직접 확인
        * terminal / cmd에서 console확인
    * typescript/javascript playground 에서 직접 확인
        * web browser 에서 console 확인
        * [playground](https://www.typescriptlang.org/play/)

## Ionic 2 강좌 - 섹션 2. 2강 "변수"
* Variable concept
* 변할 수 있는 값, 변수
    * variable = scpae + name
    * 값을 저장하는 공간, 값을 이름 지을 수 있다. (역할을 준다, 의미를 부여한다.)
* typescript variables
    * boolean
    * number
    * string
    * any : 어떤 타입인지 확신할 수 없으때,
```ts
var isdone: boolean = false;
var age: number = 42;
var myName: string = 'Anders';
var notSure: any = true;
notSure = 23;
notSure = 'aaa';
```

* null vs undefined
```ts
//null
var emptyVariable = null;
console.log(emptyVariable);
//undefined
var Variable = undefined;
console.log(Variable);
```

* collection
```ts
var list: number[] = [1,2,3];
var list2: Array<number> = [1,2,3];
```

## Ionic 2 강좌 - 섹션 2. 3강 "함수"
* function concept
    * function = action
    * 해야할 일을 적어놓고 (definition)
    * 그 일을 수행 (call)
* 가장 쉬운 함수 형태
```ts
function sayHello(){
    alert('hello');
}
sayHello();
```
* 함수의 입력/출력
```ts
function sayHello(name: string){
    alert(name);
}
```
* 변수 <- 함수
```ts
var f1 = function(i:number):number {return i*i;}
var f2 = function(i:number) {return i*i;}
var f3 = (i:number):number => {return i*i;}
var f4 = (i:number) => {return i*i;}
var f5 = (i:number) => i*i;
```

## Ionic 2 강좌 - 섹션 2. 4강 "조건문"
* 특정 조건이 맞을 때만 일을 수행
* ~하면, if
```ts
var homeworkDonw: boolean = true;
if(homeworkDonw){
    alert(1);
}
```
* switch
```ts
var score = 'C';
switch(score){
    case 'A':
        console.log(score);
        break;
    case 'C':
        console.log(score);
        break;
    default:
        console.log('show me');
        break;
}
```

## Ionic 2 강좌 - 섹션 2. 5강 "반복문"
* 비슷한 일을 여러번 수행
* e.g. 반 학생의 이름을 한명씩 부르기
```ts
var myArray: string[] = ['a','b','c'];
for(var i= 0; i< myArray.length; i++){
    console.log(myArray[i]);
}

var i = 10; 
while(i>0){
    console.log(i, ' left');
    i--;
    if(i == 0) break;
}
```

## Ionic 2 강좌 - 섹션 2. 6강 "오브젝트"
* OOP에서 다루는 오브젝트랑 JS/TS에서의 오브젝트는 살짝 다른 개념. 오히려 python dict, java의 map과 유사
* 여러 변수(혹은 함수)가 하나의 구조화된 형태
* 안에 있는 변수 하나하나를 member 혹은 property라고 한다.
```ts
var emptyObject = {};
var personObject = {
    firstName: 'john',
    lastName: 'smith'
}
personObject['salary'] = 14000;

for (var member in personObject){
    if(personObjet.hasOwnproperty(member)){
        console.log(member, ' : ', personObject[member]);
    }
}
```

## Ionic 2 강좌 - 섹션 2. 7강 "인터페이스"
* Interface = Object에 대한 타입
* 여러 개의 함수와 여러 개의 변수 등이 구조적으로 어떻게 결합되어야 하는지에 대한 약속
* 하나의 함수가 가져야 할 구조에 대한 약속
```ts
interface Person{
    name: string;
    age?: number; //optional
    move(): void;
}
var person: Person{
    name: 'john',
    move: () => {}
}
var person2: Person{
    name: 'john',
    age: 42,
    move: () => {}
}
var person3: Person{
    name: 'john',
    age: true
    // error 1.move함수없음 2.age타입다름
}
```
```ts
interface SearchFunc{
    (source: string, substring: string): boolean;
}
var mySearch: SearchFunc;
mySearch = function(src: string, sub:string){
    return src.search(sub) != -1;
}
```

## Ionic 2 강좌 - 섹션 2. 8강 "클래스"
* class - 실제 세계의 물체를 표현하는 데 사용
    * 정보(변수) 와 행동(함수) 
* 인터페이스와 차이점
    * constructor
    * 함수의 내용을 꼭 써야함.
```ts
class Point{
    x: number;
    constructor(x:number, public y:number = 0){
        this.x = x;
    }
    dist(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    static origin = new Point(0,0);
}
var point1 = new Point(10,20);
var point2 = new Point(25);
```

## Ionic 2 강좌 - 섹션 2. 9강 "콜백과 팝업"
* callback
    * 넘길 수 있는 실행가능한 코드조각
    * 원하는 시간이나 조건에 그 코드 조각이 실행되기 원할 때
```ts
var callback = function(){
    alert(111);
}
setTimeout(callback, 5000);
```
* popup
    * alert(1);
    * prompt(1);
    * confirm(1);
```ts
console.log(prompt('your name'));
if(confirm('haha?')){
    console.log('hoho');
}
```