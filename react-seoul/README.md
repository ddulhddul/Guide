## REACT SEOUL (2017.11.04)
- [http://seoul.reactjs.kr/](http://seoul.reactjs.kr/)
- 질문 : 
- http://sli.do
- #U845
- wifi : fbguest
- m0vefast

## Session0. Openning
- facebook developer seoul 이번달 말 ?



## Session1. React로 다른 페이지에 임베드되는 웹앱 개발기
안재하 @카카오
- github.com/eu81273
- 감성 프로그래밍
- daum chart 와 투표 관련된 embeded 웹앱 개발기
- IE8 에서 동작하도록.
- 리액트 + 리덕스 + D3
- IE8 에서 동작하는 React ?
- IE8을 지원하는 마지막 버전 React v0.14.9
- 매우 빠르게 mount/unmount 시, 문제가...
- Webpack v1.15.0 IE8을 지원하는 마지막 버전
- Babel v6.x.x

- babel-polyfill
- babel-plugin-transform-runtime ?
- core-js/es5 폴리필을 여러번 호출되도 오류되지 않는다.
- import 'babel-polyfill'  ->  import 'core-js/es5'
- css파일 모듈화, 구조적을 관리 위해 scss 도입.
- css-in-js //css2js 를 사용해서... javascript 안에 css 포함시킴
	- 브라우저 캐시로 인해 변경된 스타일 반영에 문제가 생김.
	- 급하게 변경이 필요할때 어려움이....
	- -> styled-components 를 사용하면 쉽게 해결 됨. // IE9부터 지원
- 한 화면에 여러개, 각각 독립된 스코프에서 동작해야 한다.
	- redux 를 사용하면 굉장히 쉽게 ...
- husky + lint-staged + prettier 

## Session2. React/Redux for Smart TV UI
이동영 @LG전자


### Embedded 환경의 특성
- App이 device에 저장되어있다.
- CPU, Service 느리다.
- disk write 함부로 하면 안된다. // flash 의 수명을 고려
- 특정 Hardware /OS / 웹 엔진에서만 실행됨.
- 화면 크기, 비율 고정
- polyfill
- Static html 을 미리 만들어 launch 시간 단축
- iLib-js : 국가별 포맷 관리
	- [https://github.com/iLib-js](https://github.com/iLib-js)
- 품질/테스트/디버깅
	- ESLint
	- editor integration, build-tool integration
	- unit test (enzyme, mocha)


## Session3. 리액트 네이티브 어디까지 해봤니?
정주원 @인디개발자

- 최대 시간이 많이 걸리는게, native를 진행할지, reactivenative 에서 지원하는 한에서 구현할지 결정
	- react-native-webview-android
- 성능이슈
	- react native : single root view.....
	- 오로지 virtual dom 에 의해 view 를 계속 다시 그려나간다.
	- react native router flux 에 의존해서... 하면 망하겟지
	- 접미사가 붙는 컴포넌트를 무시해서 이런 결과가.....


## Session4. Storybook Driven Development: Storybook을 통한 React UI Component 및 State 관리하기
진겸 @Foreseer llc.

- [https://storybook.js.org](https://storybook.js.org)
	- Component를 Isolated 된 환경에서 개발.
	- 컴포넌트별 라이브러리 화 해서 브라우징 가능
	- React 의 큰 장점인 재사용 가능 컴포넌트를 만들게 해줌.
- 특정상태의 ui를 수정해야할 때, 그 flow 전체를 따라가지 않아도, 바로 확인하고 수정이 가능.

## Session5. Decorator + HOC + React = Fantastic!!
천민호 @ZOYI Corp.

### 1. ES7의 Decorator
- 선언된 클래스와 프로퍼티들을 디자인 시간에 변경하는 편리한 문법
- 함수 선언 뒤 @ 키워드를 이용해 선언된 함수를 Decorator로 사용
- 클래스, 클래스의 프로퍼티에 적용 가능
- Decorator 는 중첩도 가능.
- 현재는 표준이 아니기 때문에, babel 설정에 한줄 추가해야한다...

### 2. HOC와 HOC를 통해 해결할 수 있는 문제
- higher - order - component
- 리액트 컴포넌트 로직을 재사용할 수 있는 고급 기법
- 리액트 api가 아니라 단순히 아키텍쳐
- 상속이 안되는 React에서 단비와 같은 존재
- ex) 유저인증 또는 에러처리 (전 화면에서 고려해야할 문제들에 쓰이지)


### 3. 개발하다 마주칠 수 있는 문제와 그 해결방법
- 과도한 hoc 중첩으로 인해 디버깅이 힘들 수 있음.
- WRAPPEDCOMPONENT 에 직접적으로 ref 를 달수 없어... 우회적인 방법을 써야함.
- 비동기 작업과 같이 사용하다가 예상치 모산 결과를 만날 수 있음.