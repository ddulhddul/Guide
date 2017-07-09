# [AngularJS](https://angularjs.org/)

## AngularJS Introduction
* AngularJS is a JavaScript Framework
```js
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
```

# [AngularJS 기본 개념과 To-Do 앱 만들기 실습- 앵귤러 강좌](https://www.inflearn.com/course/angular-%EC%95%B5%EA%B7%A4%EB%9F%AC-%EA%B0%95%EC%A2%8C/)

# 0. AngularJS 강좌 소개
사용할 라이브러리 : AngularJS, Bootstrap

# 1. ANGULARJS 의 개념

## 1.1 AngularJS 의 개념들
* [Conceptual Overview](https://docs.angularjs.org/guide/concepts)
* Expression
  ```html
  <p> hello {{ name }}! </p>
  ```
* Controller
* Service

## 1.2 AngularJS 개발 환경 구성
* [Plunker](http://plnkr.co)

# 2. TO-DO 리스트 앱 만들기 - 컨트롤러

## 2.1 Index.html 로 시작하기
* 사용할 내장 디렉티브
  * ng-app
  * ng-init
     ```html
     <body ng-app ng-init="name='Chris'">
     </body>
     ```
* 표현식 - expression
  ```html
  <h1>Hello  World! {{ name }}</h1>
  ```

## 2.2 모듈과 컨트롤러
* scope?
  > controller 와 html 파라미터간의 연결고리

```html
<body ng-app="todoModule" ng-controller="TodoCtrl">
</body>
```
```js
var app = angular.module('todoModule', []); // define module
//app 모듈 내에 controller 정의
app.controller('TodoCtrl', ['$scope', function($scope){
})
```

## 2.3 출력하기
* ng-model : 양방향 binding

# 3. TO-DO 리스트 앱 만들기 - 내장 디렉티브

## 3.1 ngRepeat
* 반복문처럼 사용 가능
* [Bootstrap](http://bootstrapk.com/)

## 3.2 ngFilter
* [date filter](https://docs.angularjs.org/api/ng/filter/date)
```html
<date>{{todo.createdAt | date}}</date>
```

## 3.3 ngClick
```html
<button class="btn btn-danger" type="button" ng-click="remove(todo)">delete</button>
```
```js
$scope.remove = function(todo){

    //find todo index in todos
    var idx = $scope.todos.findIndex(function(item){
        return item.title === todo.title;
    })

    //remove from todos
    if(idx > -1){
        $scope.todos.splice(idx, 1);
    }
}
```

## 3.4 필터 버튼
* [ngRepeat](https://docs.angularjs.org/api/ng/directive/ngRepeat)
```html
//repeat filter
<li ng-repeat="todo in todos | filter:{completed: true}">
//repeat filter variable
<li ng-repeat="todo in todos | filter:statusFilter">

<button class='btn btn-primary' ng-click='statusFilter={completed:true}'>Completed</button>
<button class='btn btn-primary' ng-click='statusFilter={completed:false}'>Active</button>
<button class='btn btn-primary' ng-click='statusFilter={}'>All</button>
```

# 4. TO-DO 리스트 앱 만들기 - 폼 만들기
# 4.1 폼 만들기
```html
<form name='TodoForm' ng-submit='add(newTodoTitle)'>
  <div class="row">
    <div class="col-lg-4">
      <div class="input-group">
        <input class="form-control" type="text" ng-model='newTodoTitle'  placeholder="Input New Todo" autofocus>
        <div class="input-group-btn">
          <button type='submit' class='btn btn-success'>Add</button>
        </div>
      </div>
    </div>
  </div>
</form>
```
```js
$scope.add = function(newTodoTitle){
            
    //create new todo
    var newTodo = {
        title: newTodoTitle,
        completed: false,
        createdAt: Date.now()
    };
    $scope.todos.push(newTodo);

    //empty form
    $scope.newTodoTitle = '';
    
}
```

## 4.2 폼 검증
```html
<div ng-show='TodoForm.$dirty && TodoForm.$invalid'>
  <div class="alert alert-warning" role="alert">input more than 3 charaters</div>
</div>
<!--검증-->
<pre>
  {{ TodoForm | json }}
</pre>
```
```css
.ng-valid .ng-dirty{
    border: solid 1px green;
}

.ng-invalid .ng-dirty{
    border: solid 1px red;
}
```

# 섹션 5. TO-DO 리스트 앱 만들기 - 디렉티브
## 5.1 todoTitle 
```html
<todo-title></todo-title>
```
```js
app.directive('todoTitle', function(){
    return {
        template: '<h1>Todo List</h1>'
    }
});
```

## 5.2 todoItem
> Cross origin requests are only supported for protocol schemes: http, data, chrome, chrome-extension, https, chrome-extension-resource.

* error 발생시
  * npm install http-server -g
  * http-server

* todoItem.tpl.html
```html
<div class="row">
    <div class="col-lg-4">
    <div class="input-group">
        <span class="input-group-addon">
        <input type="checkbox" ng-model='todo.completed'>
        </span>
        <input type="text" class="form-control" ng-model='todo.title'>
        <span class="input-group-btn">
        <button class="btn btn-danger" type="button" ng-click="remove(todo)">delete</button>
        </span>
    </div>
    <date>{{todo.createdAt | date : 'yyyy-MM-dd HH:mm:ss'}}</date>
    </div>
</div>
```
```js
angular.module('todoModule').directive('todoItem', function(){
    return {
        templateUrl: 'todoItem.tpl.html'
    }
});
```

## 5.3 todoFilters
* todoFilters.tpl.html
```html
<button class='btn btn-primary' ng-click='statusFilter={completed:true}'>Completed</button>
<button class='btn btn-primary' ng-click='statusFilter={completed:false}'>Active</button>
<button class='btn btn-primary' ng-click='statusFilter={}'>All</button>
```
```js
angular.module('todoModule').directive('todoFilters', function(){
    return {
        templateUrl: 'todoFilters.tpl.html'
    }
});
```

## 5.4 todoForm
* todoForm.tpl.html
```html
<form name='TodoForm' ng-submit='add(newTodoTitle)'>
    <div class="row">
        <div class="col-lg-4">
        <div class="input-group">
            <input class="form-control" type="text" ng-model='newTodoTitle'  placeholder="Input New Todo" autofocus minlength="3">
            <div class="input-group-btn">
            <button type='submit' class='btn btn-success'>Add</button>
            </div>
        </div>

        <div ng-show='TodoForm.$dirty && TodoForm.$invalid'>
            <div class="alert alert-warning" role="alert">input more than 3 charaters</div>
        </div>
        
        </div>
    </div>
</form>
```
```js
angular.module('todoModule').directive('todoForm', function(){
    return {
        templateUrl: 'todoForm.tpl.html'
    }
});
```

* app.js 와 controllers.js 분리

# 6. TO-DO 리스트 앱 만들기 - 서비스

## 6.1 todoStorage : get()
* service 만드는 3가지
  * service
  * factory
  * provider

```js
angular.module('todoModule').controller('TodoCtrl', function($scope, todoStorage){
    $scope.todos = todoStorage.get();
    ...
```

## 6.2 todoStorage : remove(), add()
```js
$scope.remove = function(todo){
    todoStorage.remove(todo);
}
```
```js
$scope.add = function(newTodoTitle){
    todoStorage.add(newTodoTitle);   
    
    //empty form
    $scope.newTodoTitle = '';
}
```

## 6.3 todoStorage : localStorage
* 개발자도구 - Application - Storage - Local Storage
* cookie 랑 비슷
* domain 별로 생성
* Key, Value 저장소
* localStorage.setItem(key, value)
* localStorage.getItem(key) // value, localStorage[key] 접근 가능
* 입력은 무조건 string 으로 처리됨
* 최대 약 5mb 용량
* 크롬은 SQLite 사용

 > _saveToLocalStorage: function(){},
   _getFromLocalStorage: function(){},<br>_로 시작하는 함수는 private로 생각하면 된다.<br>
   대문자는 상수다.

## 6.4 todoStorage : update()
* checkbox update
```html
<input type="checkbox" ng-model='todo.completed' ng-click='update()'>
```
```js
$scope.update = function(){
    todoStorage.update();
}
```
```js
update: function(){
    storage._saveToLocalStorage(storage.todos);
}
```

* input update
```html
<input type="text" class="form-control" ng-model='todo.title' ng-blur='update()'>
```

## 6.5 service.js
```js
angular.module('todoModule').factory('todoStorage', function(){
    
    var TODO_DATA = '';
    var storage = {

        todos:[],

        _saveToLocalStorage: function(data){
            localStorage.setItem(TODO_DATA, JSON.stringify(data));
        },

        _getFromLocalStorage: function(){
            return JSON.parse(localStorage.getItem(TODO_DATA)) || [];
        },

        get: function(){
            //storage.todos = storage._getFromLocalStorage();
            angular.copy(storage._getFromLocalStorage(), storage.todos);
            return storage.todos;
        },

        remove: function(todo){
            //find todo index in todos
            var idx = storage.todos.findIndex(function(item){
                return item.title === todo.title;
            })

            //remove from todos
            if(idx > -1){
                storage.todos.splice(idx, 1);
                storage._saveToLocalStorage(storage.todos);
            }
        },

        add: function(newTodoTitle){
            //create new todo
            var newTodo = {
                title: newTodoTitle,
                completed: false,
                createdAt: Date.now()
            };
            storage.todos.push(newTodo);
            storage._saveToLocalStorage(storage.todos);
        },

        update: function(){
            storage._saveToLocalStorage(storage.todos);
        }
    }

    return storage;
});
```

# 7. 마무리 정리
* 완료
  * 컨트롤러
  * 내장 디렉티브
  * 폼
  * 디렉티브
  * 서비스

* 남은 것
  * 내장서비스 : $http, $resource, $q
  * 테스트
  * 라우팅(SPA 구현)

* 추천 site
  * [AngularJS Developer Guide](https://docs.angularjs.org/guide)
  * [YEOMAN](http://yeoman.io/)
    * discovering generators - angularjs 검색
      * angular-fullstack 추천